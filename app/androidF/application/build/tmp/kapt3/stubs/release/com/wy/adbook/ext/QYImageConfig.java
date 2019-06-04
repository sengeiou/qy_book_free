package com.wy.adbook.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010%\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\'\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010)\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001a\u0010,\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u00067"}, d2 = {"Lcom/wy/adbook/ext/QYImageConfig;", "Lcom/jess/arms/http/imageloader/ImageConfig;", "builder", "Lcom/wy/adbook/ext/QYImageConfig$Builder;", "(Lcom/wy/adbook/ext/QYImageConfig$Builder;)V", "blurValue", "", "getBlurValue", "()I", "setBlurValue", "(I)V", "cacheStrategy", "getCacheStrategy", "setCacheStrategy", "fallback", "getFallback", "setFallback", "imageRadius", "getImageRadius", "setImageRadius", "imageViews", "", "Landroid/widget/ImageView;", "getImageViews", "()[Landroid/widget/ImageView;", "setImageViews", "([Landroid/widget/ImageView;)V", "[Landroid/widget/ImageView;", "isCenterCrop", "", "()Z", "setCenterCrop", "(Z)V", "isCircle", "setCircle", "isClearDiskCache", "setClearDiskCache", "isClearMemory", "setClearMemory", "isCrossFade", "setCrossFade", "resizeX", "getResizeX", "setResizeX", "resizeY", "getResizeY", "setResizeY", "transformation", "Lcom/bumptech/glide/load/Transformation;", "Landroid/graphics/Bitmap;", "getTransformation", "()Lcom/bumptech/glide/load/Transformation;", "setTransformation", "(Lcom/bumptech/glide/load/Transformation;)V", "Builder", "application_release"})
public final class QYImageConfig extends com.jess.arms.http.imageloader.ImageConfig {
    private int cacheStrategy;
    private int fallback;
    private int imageRadius;
    private int blurValue;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView[] imageViews;
    private boolean isCrossFade;
    private boolean isCenterCrop;
    private boolean isCircle;
    private boolean isClearMemory;
    private boolean isClearDiskCache;
    private int resizeX;
    private int resizeY;
    @org.jetbrains.annotations.Nullable()
    private com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation;
    
    public final int getCacheStrategy() {
        return 0;
    }
    
    public final void setCacheStrategy(int p0) {
    }
    
    public final int getFallback() {
        return 0;
    }
    
    public final void setFallback(int p0) {
    }
    
    public final int getImageRadius() {
        return 0;
    }
    
    public final void setImageRadius(int p0) {
    }
    
    public final int getBlurValue() {
        return 0;
    }
    
    public final void setBlurValue(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView[] getImageViews() {
        return null;
    }
    
    public final void setImageViews(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView[] p0) {
    }
    
    public final boolean isCrossFade() {
        return false;
    }
    
    public final void setCrossFade(boolean p0) {
    }
    
    public final boolean isCenterCrop() {
        return false;
    }
    
    public final void setCenterCrop(boolean p0) {
    }
    
    public final boolean isCircle() {
        return false;
    }
    
    public final void setCircle(boolean p0) {
    }
    
    public final boolean isClearMemory() {
        return false;
    }
    
    public final void setClearMemory(boolean p0) {
    }
    
    public final boolean isClearDiskCache() {
        return false;
    }
    
    public final void setClearDiskCache(boolean p0) {
    }
    
    public final int getResizeX() {
        return 0;
    }
    
    public final void setResizeX(int p0) {
    }
    
    public final int getResizeY() {
        return 0;
    }
    
    public final void setResizeY(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> getTransformation() {
        return null;
    }
    
    public final void setTransformation(@org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.Transformation<android.graphics.Bitmap> p0) {
    }
    
    private QYImageConfig(com.wy.adbook.ext.QYImageConfig.Builder builder) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010E\u001a\u00020\u00002\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010F\u001a\u00020GJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u001b\u0010\u001b\u001a\u00020\u00002\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001c\u00a2\u0006\u0002\u0010HJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020#J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020#J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020#J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020#J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004J\u0016\u0010I\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001a\u0010)\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010+\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\"\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u00a8\u0006J"}, d2 = {"Lcom/wy/adbook/ext/QYImageConfig$Builder;", "", "()V", "blurValue", "", "getBlurValue", "()I", "setBlurValue", "(I)V", "cacheStrategy", "getCacheStrategy", "setCacheStrategy", "errorPic", "getErrorPic", "setErrorPic", "fallback", "getFallback", "setFallback", "imageRadius", "getImageRadius", "setImageRadius", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "imageViews", "", "getImageViews", "()[Landroid/widget/ImageView;", "setImageViews", "([Landroid/widget/ImageView;)V", "[Landroid/widget/ImageView;", "isCenterCrop", "", "()Z", "setCenterCrop", "(Z)V", "isCircle", "setCircle", "isClearDiskCache", "setClearDiskCache", "isClearMemory", "setClearMemory", "isCrossFade", "setCrossFade", "placeholder", "getPlaceholder", "setPlaceholder", "resizeX", "getResizeX", "setResizeX", "resizeY", "getResizeY", "setResizeY", "transformation", "Lcom/bumptech/glide/load/Transformation;", "Landroid/graphics/Bitmap;", "getTransformation", "()Lcom/bumptech/glide/load/Transformation;", "setTransformation", "(Lcom/bumptech/glide/load/Transformation;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "bitmapTransformation", "build", "Lcom/wy/adbook/ext/QYImageConfig;", "([Landroid/widget/ImageView;)Lcom/wy/adbook/ext/QYImageConfig$Builder;", "resize", "application_release"})
    public static final class Builder {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String url;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView imageView;
        private int placeholder;
        private int errorPic;
        private int fallback;
        private int cacheStrategy;
        private int imageRadius;
        private int blurValue;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView[] imageViews;
        private boolean isCrossFade;
        private boolean isCenterCrop;
        private boolean isCircle;
        private boolean isClearMemory;
        private boolean isClearDiskCache;
        private int resizeX;
        private int resizeY;
        @org.jetbrains.annotations.Nullable()
        private com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getImageView() {
            return null;
        }
        
        public final void setImageView(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        public final int getPlaceholder() {
            return 0;
        }
        
        public final void setPlaceholder(int p0) {
        }
        
        public final int getErrorPic() {
            return 0;
        }
        
        public final void setErrorPic(int p0) {
        }
        
        public final int getFallback() {
            return 0;
        }
        
        public final void setFallback(int p0) {
        }
        
        public final int getCacheStrategy() {
            return 0;
        }
        
        public final void setCacheStrategy(int p0) {
        }
        
        public final int getImageRadius() {
            return 0;
        }
        
        public final void setImageRadius(int p0) {
        }
        
        public final int getBlurValue() {
            return 0;
        }
        
        public final void setBlurValue(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView[] getImageViews() {
            return null;
        }
        
        public final void setImageViews(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView[] p0) {
        }
        
        public final boolean isCrossFade() {
            return false;
        }
        
        public final void setCrossFade(boolean p0) {
        }
        
        public final boolean isCenterCrop() {
            return false;
        }
        
        public final void setCenterCrop(boolean p0) {
        }
        
        public final boolean isCircle() {
            return false;
        }
        
        public final void setCircle(boolean p0) {
        }
        
        public final boolean isClearMemory() {
            return false;
        }
        
        public final void setClearMemory(boolean p0) {
        }
        
        public final boolean isClearDiskCache() {
            return false;
        }
        
        public final void setClearDiskCache(boolean p0) {
        }
        
        public final int getResizeX() {
            return 0;
        }
        
        public final void setResizeX(int p0) {
        }
        
        public final int getResizeY() {
            return 0;
        }
        
        public final void setResizeY(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> getTransformation() {
            return null;
        }
        
        public final void setTransformation(@org.jetbrains.annotations.Nullable()
        com.bumptech.glide.load.Transformation<android.graphics.Bitmap> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder url(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder placeholder(int placeholder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder errorPic(int errorPic) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder fallback(int fallback) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder imageView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder cacheStrategy(int cacheStrategy) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder imageRadius(int imageRadius) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder blurValue(int blurValue) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder imageViews(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView[] imageViews) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder isCrossFade(boolean isCrossFade) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder isCenterCrop(boolean isCenterCrop) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder isCircle(boolean isCircle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder isClearMemory(boolean isClearMemory) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder isClearDiskCache(boolean isClearDiskCache) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder bitmapTransformation(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig.Builder resize(int resizeX, int resizeY) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.ext.QYImageConfig build() {
            return null;
        }
        
        public Builder() {
            super();
        }
    }
}