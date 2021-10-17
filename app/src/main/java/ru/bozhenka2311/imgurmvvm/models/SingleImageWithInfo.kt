package ru.bozhenka2311.imgurmvvm.models

import com.google.gson.annotations.SerializedName

data class SingleImageWithInfo(

    val data: List<SingleImageWithInfo.DataItem?>? = null,

    val success: Boolean? = null,

    val status: Int? = null
) {
    data class ChildrenItem(

        val id: Int? = null,
        val downs: Int? = null,
        val author: String? = null,
        @SerializedName("has_adming_badge")
        val hasAdminBadge: Boolean? = null,
        @SerializedName("album_cover")
        val albumCover: Any? = null,
        val platform: String? = null,
        val points: Int? = null,
        val datetime: Int? = null,
        val deleted: Boolean? = null,
        val children: List<Any?>? = null,
        @SerializedName("parent_id")
        val parentId: Int? = null,
        val ups: Int? = null,
        val comment: String? = null,
        @SerializedName("on_album")
        val onAlbum: Boolean? = null,
        @SerializedName("image_id")
        val imageId: String? = null,
        @SerializedName("author_id")
        val authorId: Int? = null,
        val vote: Any? = null,
    )

    data class DataItem(
        val id: Int? = null,
        val downs: Int? = null,
        val author: String? = null,
        @SerializedName("has_admin_badge")
        val hasAdminBadge: Boolean? = null,
        @SerializedName("album_cover")
        val albumCover: Any? = null,
        val platform: String? = null,
        val points: Int? = null,
        val datetime: Int? = null,
        val deleted: Boolean? = null,
        val children: List<ChildrenItem?>? = null,
        @SerializedName("parent_id")
        val parentId: Int? = null,
        val ups: Int? = null,
        val comment: String? = null,
        val onAlbum: Boolean? = null,
        @SerializedName("image_id")
        val imageId: String? = null,
        @SerializedName("author_id")
        val authorId: Int? = null,
        val vote: Any? = null
    )

}



