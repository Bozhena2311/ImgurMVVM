package ru.bozhenka2311.imgurmvvm.models.ImagesModel

import com.google.gson.annotations.SerializedName

data class ImagesModel(

    val data: List<Data?>? = null,

    val success: Boolean? = null,

    val status: Int? = null
)
{
    data class Data(

        val id: String? = null,
        val link: String? = null,
        val width: Int? = null,
        val height: Int? = null,
        /*
        val title: String? = null,
        val description: String? = null,
        val coverWidth: Int? = null,
        val coverHeight: Int? = null,
        val inMostViral: Boolean? = null,
        val section: String? = null,
        val type: String? = null,*/
        val images: List<ImagesItem?>? = null,
    )

    data class ImagesItem(

        /**
         * id картинки
         */
        val id: String? = null,
        /**
         * Тип картинки
         */
        val type: String? = null,
        /**
         * Ширина картинки
         */
        val width: Int? = null,
        /**
         * Высота картинки
         */
        val height: Int? = null,
        /**
         * Ссылка на картинку
         */
        val link: String? = null,
    )

    val imageList: List<ImagesItem> by lazy {
        getNewImageList()
    }

    private fun getNewImageList(): List<ImagesItem> {
        val newList = ArrayList<ImagesItem>()
        data?.filter {
            it?.link?.endsWith(".jpg") == true || it?.images?.getOrNull(0)?.link?.endsWith(".jpg") == true
            it?.link?.endsWith(".png") == true || it?.images?.getOrNull(0)?.link?.endsWith(".png") == true
        }?.forEach { data ->

            var link: String = ""
            if(data?.link?.endsWith(".jpg") == true) {
                data.id?.let { link = it }
            } else {
                data?.images?.getOrNull(0)?.id?.let { link = it }
            }
            newList.add(ImagesItem(id = data?.id, width = data?.width, height = data?.height, link = link))
        }

        return newList
    }
}