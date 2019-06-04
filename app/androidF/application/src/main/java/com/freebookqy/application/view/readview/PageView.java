//package com.freebookqy.application.view.readview;
//
//import android.app.Activity;
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.Canvas;
//import android.graphics.RectF;
//import android.util.AttributeSet;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.ViewConfiguration;
//import com.freebookqy.application.view.animation.*;
//import com.freebookqy.application.view.readview.read.PageLoaderDraw;
//import com.freebookqy.application.view.readview.read.loader.NetPageLoader;
//import com.freebookqy.application.view.readview.read.loader.PageLoader;
//import com.freebookqy.utilslib.ScreenUtils;
//import com.jess.arms.integration.AppManager;
//
///**
// * 绘制页面显示内容的类
// */
//public class PageView extends View implements IPageView {
//
//    public int mViewWidth = 0; // 当前View的宽
//    public int mViewHeight = 0; // 当前View的高
//
//    private int mStartX = 0;
//    private int mStartY = 0;
//    private boolean isMove = false;
//    //初始化参数
//    private int mBgColor = 0xFFCEC29C;
//    public int mPageMode = PAGE_MODE_SIMULATION;
//
//    //是否允许点击
//    private boolean canTouch = true;
//    //是否允许阅读
//    private boolean canRead = true;
//    //判断是否初始化完成
//    private boolean isPrepare = false;
//    //唤醒菜单的区域
//    private RectF mCenterRect = null;
//
//    //动画类
//    private PageAnimation mPageAnim;
//
//    //动画监听类
//    private PageAnimation.OnPageChangeListener mPageAnimListener
//            = new PageAnimation.OnPageChangeListener() {
//        @Override
//        public boolean hasPrev() {
//            return PageView.this.hasPrev();
//        }
//
//        @Override
//        public boolean hasNext() {
//
//            return PageView.this.hasNext();
//        }
//
//        @Override
//        public void pageCancel() {
//            mPageLoader.pageCancel();
//        }
//    };
//
//    //点击监听
//    private PageViewTouchListener mTouchListener;
//    //内容加载器
//    private NetPageLoader mPageLoader = new NetPageLoader(this);
//
//    public PageView(Context context) {
//        this(context, null);
//    }
//
//    public PageView(Context context, AttributeSet attrs) {
//        this(context, attrs, 0);
//    }
//
//    public PageView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        init();
//    }
//
//    private void init() {
//        mViewWidth = ScreenUtils.getScreenWidth();
//        try {
//            initScreenHeight();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        setPageMode(mPageMode);
//    }
//
//    private void initScreenHeight() {
//        Activity topActivity = AppManager.getAppManager().getTopActivity();
//        if (topActivity != null) {
//            mViewHeight = ScreenUtils.getRealScreenHeight(topActivity);
//        } else {
//            mViewHeight = ScreenUtils.getScreenHeight();
//        }
//    }
//
//    @Override
//    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//        super.onSizeChanged(w, h, oldw, oldh);
//        //重置图片的大小,由于w,h可能比原始的Bitmap更大，所以如果使用Bitmap.setWidth/Height()是会报错的。
//        //所以最终还是创建Bitmap的方式。这种方式比较消耗性能，暂时没有找到更好的方法。
//        //        setPageMode(mPageMode);
//        //        //重置页面加载器的页面
//        if (!isPrepare) {
//            mPageLoader.setDisplaySize(w, h);
//            //初始化完成
//            isPrepare = true;
//        }
//    }
//
//    //设置翻页的模式
//    public void setPageMode(int pageMode) {
//        mPageMode = pageMode;
//        //视图未初始化的时候，禁止调用
//        if (mViewWidth == 0) return;
//        if (mViewHeight == 0) {
//            try {
//                initScreenHeight();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        if (mViewHeight == 0) return;
//
//        switch (pageMode) {
//            case PAGE_MODE_SIMULATION:
//                mPageAnim =
//                        new SimulationPageAnim(mViewWidth, mViewHeight, this, mPageAnimListener);
//                break;
//            case PAGE_MODE_COVER:
//                mPageAnim =
//                        new CoverPageAnim(mViewWidth, mViewHeight, this, mPageAnimListener);
//                break;
//            case PAGE_MODE_SLIDE:
//                mPageAnim =
//                        new SlidePageAnim(mViewWidth, mViewHeight, this, mPageAnimListener);
//                break;
//            case PAGE_MODE_NONE:
//                mPageAnim =
//                        new NonePageAnim(mViewWidth, mViewHeight, this, mPageAnimListener);
//                break;
//            case PAGE_MODE_SCROLL:
//                mPageAnim =
//                        new ScrollPageAnim(mViewWidth, mViewHeight, 0,
//                        ScreenUtils.dpToPx(PageLoaderDraw.DEFAULT_MARGIN_HEIGHT), this, mPageAnimListener);
//                break;
//            default:
//                mPageAnim = new SimulationPageAnim(mViewWidth, mViewHeight, this, mPageAnimListener);
//        }
//    }
//
//    public Bitmap getNextPage() {
//        if (mPageAnim == null) return null;
//        return mPageAnim.getNextBitmap();
//    }
//
//
//    public void setBgColor(int color) {
//        mBgColor = color;
//    }
//
//    public void canTouchable(boolean touchable) {
//        canTouch = touchable;
//    }
//
//    public void canReadable(boolean enable) {
//        canRead = enable;
//        //        if (!canRead && mPageAnim != null) {
//        //            mPageAnim.resetView();
//        //        }
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        //绘制背景
//        canvas.drawColor(mBgColor);
//        //绘制动画
//        mPageAnim.draw(canvas);
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        super.onTouchEvent(event);
//        if (!canTouch && event.getAction() != MotionEvent.ACTION_DOWN) return true;
//        int x = (int) event.getX();
//        int y = (int) event.getY();
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                mStartX = x;
//                mStartY = y;
//                isMove = false;
//                if (canRead) {
//                    mPageAnim.onTouchEvent(event);
//                }
//                break;
//            case MotionEvent.ACTION_MOVE:
//                //判断是否大于最小滑动值。
//                int slop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
//                if (!isMove) {
//                    isMove = Math.abs(mStartX - event.getX()) > slop || Math.abs(mStartY - event.getY()) > slop;
//                }
//                //如果滑动了，则进行翻页。
//                if (isMove) {
//                    if (canRead) {
//                        mPageAnim.onTouchEvent(event);
//                    }
//                }
//                break;
//            case MotionEvent.ACTION_UP:
//                if (!isMove) {
//                    //设置中间区域范围
//                    if (mCenterRect == null) {
//                        mCenterRect = new RectF(mViewWidth / 4, 0,
//                                mViewWidth * 3 / 4, mViewHeight);
//                    }
//                    //是否点击了中间
//                    if (mCenterRect.contains(x, y)) {
//                        if (mTouchListener != null) {
//                            mTouchListener.center();
//                        }
//                        return true;
//                    }
//                }
//                if (canRead) {
//                    mPageAnim.onTouchEvent(event);
//                }
//                break;
//        }
//        return true;
//    }
//
//    //判断是否下一页存在
//    private boolean hasNext() {
//        boolean hasNext = false;
//        if (mTouchListener != null) {
//            hasNext = mTouchListener.nextPage();
//            //加载下一页
//            if (hasNext) {
//                hasNext = mPageLoader.next();
//            }
//        }
//        return hasNext;
//    }
//
//    //判断是否存在上一页
//    private boolean hasPrev() {
//        Boolean hasPrev = false;
//        if (mTouchListener != null) {
//            hasPrev = mTouchListener.prePage();
//            //加载下一页
//            if (hasPrev) {
//                hasPrev = mPageLoader.prev();
//            }
//        }
//        return hasPrev;
//    }
//
//    @Override
//    public void computeScroll() {
//        //进行滑动
//        mPageAnim.scrollAnim();
//        super.computeScroll();
//    }
//
//    //如果滑动状态没有停止就取消状态，重新设置Anim的触碰点
//    public void abortAnimation() {
//        mPageAnim.abortAnim();
//    }
//
//    public boolean isPrepare() {
//        return isPrepare;
//    }
//
//    public boolean isRunning() {
//        return mPageAnim.isRunning();
//    }
//
//    public void setTouchListener(PageViewTouchListener mTouchListener) {
//        this.mTouchListener = mTouchListener;
//    }
//
//    public void drawNextPage() {
//        if (mPageAnim instanceof HorizonPageAnim) {
//            ((HorizonPageAnim) mPageAnim).changePage();
//        }
//        mPageLoader.onDraw(getNextPage());
//    }
//
//
//    /**
//     * 刷新当前页(主要是为了ScrollAnimation)
//     */
//    public void refreshPage() {
//        if (mPageAnim instanceof ScrollPageAnim) {
//            ((ScrollPageAnim) mPageAnim).refreshBitmap();
//        }
//        drawCurPage();
//    }
//
//    //refreshPage和drawCurPage容易造成歧义,后面需要修改
//
//    /**
//     * 绘制当前页。
//     */
//    public void drawCurPage() {
//        mPageLoader.onDraw(getNextPage());
//    }
//
//    //获取PageLoader
//    public PageLoader getPageLoader() {
//        if (mPageLoader == null) {
//            //            if (boolean isLocal =false) {
//            //暂时用同一个loader
//            //                mPageLoader = new LocalPageLoader(this);
//            //            } else {
//            mPageLoader = new NetPageLoader(this);
//            //     }
//        }
//        return mPageLoader;
//    }
//
//    public interface PageViewTouchListener {
//        void center();
//
//        boolean prePage();
//
//        boolean nextPage();
//
//    }
//}
