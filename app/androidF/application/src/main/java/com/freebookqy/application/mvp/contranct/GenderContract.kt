package com.freebookqy.application.mvp.contranct

import com.freebookqy.application.app.base.BaseEntity
import com.freebookqy.application.app.base.QYView
import com.freebookqy.application.mvp.model.entity.SetGender
import com.jess.arms.mvp.IModel
import io.reactivex.Observable

/**
 * Created by leafye on 2019/4/29.
 */
interface GenderContract {

    interface View : QYView {
        /**
         * 获取现在的性别
         */
        fun getGender(): Int
    }

    interface Model : IModel {
        fun setGender(gender: Int): Observable<BaseEntity<SetGender>>
    }

}