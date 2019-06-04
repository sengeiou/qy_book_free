package com.wy.adbook.mvp.view.web.act

import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import javax.inject.Inject

/**
 * Created by leafye on 2019-05-23.
 */
@ActivityScope
class WebModel
@Inject
constructor(
    repositoryManager:
    IRepositoryManager
) : BaseModel(repositoryManager),
    WebContract.Model {



}