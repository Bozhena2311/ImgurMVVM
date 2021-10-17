package ru.bozhenka2311.imgurmvvm.models

import com.google.gson.annotations.SerializedName
import ru.bozhenka2311.imgurmvvm.models.ImagesModel.ImagesModel

data class ImageResponse(

    val data: ImagesModel.ImagesItem? = null,
    val success: Boolean? = null,
    val status: Int? = null
)
