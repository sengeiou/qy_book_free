package com.wy.adbook.mvp.model.entity

import com.wy.adbook.app.base.BaseEntity
import com.wy.adbook.mvp.model.entity.book.Book
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by leafye on 2019-05-14.
 */
class NetSearchResult : BaseEntity<SearchResult>()

class SearchResult : Serializable {

    @SerializedName("data")
    var searchResult: MutableList<Book>? = null

    @SerializedName("count")
    var count: Int = 0

    @SerializedName("otherData")
    var otherData: MutableList<Book>? = null

    @SerializedName("pageNo")
    var pageNo:Int = 0

    @SerializedName("pageSize")
    var pageSize:Int = 0

    @SerializedName("pages")
    var pages:Int = 0

}