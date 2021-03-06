package com.wy.adbook.mvp.model

import com.wy.adbook.app.base.BaseEntity
import com.wy.adbook.mvp.contranct.ClassificationDetailContract
import com.wy.adbook.mvp.model.entity.book.Book
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by leafye on 2019/5/5.
 */
@ActivityScope
class ClassificationDetailModel
@Inject
constructor(
    repositoryManager:
    IRepositoryManager
) : BaseModel(repositoryManager),
    ClassificationDetailContract.Model {
    override fun categoryBookList(): Observable<BaseEntity<MutableList<Book>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}