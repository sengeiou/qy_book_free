package com.wy.adbook.mvp.contranct

import com.wy.adbook.app.base.QYModel
import com.wy.adbook.app.base.QYView
import com.wy.adbook.mvp.model.entity.NetFriendPage
import com.wy.adbook.view.status.IStatusCoverView
import io.reactivex.Observable

/**
 * Created by leafye on 2019-05-29.
 */
interface MyFriendContract {

    interface View : QYView {
        fun changeStatus(status: IStatusCoverView.Status)
        fun setRefresh(isRefresh: Boolean)
    }

    interface Model : QYModel {
        fun friendPage(
            cuid: Int,
            pageNo: Int,
            pageSize: Int
        ): Observable<NetFriendPage>
    }

}