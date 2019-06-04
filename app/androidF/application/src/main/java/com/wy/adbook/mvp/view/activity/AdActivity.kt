package com.wy.adbook.mvp.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.freebookqy.application.R
import com.wy.adbook.app.manager.ADManager
import com.wy.adbook.app.base.QYBaseActivity
import com.wy.adbook.di.component.DaggerAdComponent
import com.wy.adbook.di.module.AdModule
import com.wy.adbook.mvp.presenter.AdPresenter
import com.wy.adbook.mvp.contranct.AdContract
import com.jess.arms.di.component.AppComponent
import kotlinx.android.synthetic.main.activity_ad.*
import org.jetbrains.anko.toast

/**
 * Created by leafye on 2019-05-16.
 */
class AdActivity : QYBaseActivity<AdPresenter>(), AdContract.View {

    companion object {

        @JvmStatic
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, AdActivity::class.java))
        }
    }

    override fun setupActivityComponent(appComponent: AppComponent) {
        DaggerAdComponent.builder()
            .appComponent(appComponent)
            .adModule(AdModule((this@AdActivity)))
            .build()
            .inject(this@AdActivity)
    }

    override fun initView(savedInstanceState: Bundle?): Int = R.layout.activity_ad

    override fun initData(savedInstanceState: Bundle?) {
//        ADManager.displayNativeExpressAD(
//            this@AdActivity,
//            video_ad_container,
//            ADManager.POSID_READ,
//            object:ADManager.NativeADListener{
//                override fun onADClosed() {
//                    toast("广告已关闭")
//                }
//
//                override fun onNoAD() {
//                    toast("没有获取到广告")
//                }
//            }
//        )

        ADManager.displayVideoAD(
            this@AdActivity,
            video_ad_container,
            ADManager.POSID_VIDOE,
            object : ADManager.NativeADListener {
                override fun onADClosed() {
                    toast("广告已关闭")
                }

                override fun onNoAD() {
                    toast("没有获取到广告")
                }

            }
        )
    }
}