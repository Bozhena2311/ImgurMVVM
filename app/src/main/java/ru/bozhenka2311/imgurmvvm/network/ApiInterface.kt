package ru.bozhenka2311.imgurmvvm.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import ru.bozhenka2311.imgurmvvm.models.ImageResponse
import ru.bozhenka2311.imgurmvvm.models.ImagesModel.ImagesModel
import ru.bozhenka2311.imgurmvvm.models.SingleImageWithInfo

interface ApiInterface {

    /**
     * Запрос получения списка популярных картинок
     *
     * @param page  номер страницы
     * @return      список картинок
     */
    @GET("gallery/top/top/all/{page}?showViral=true&album_previews=true")
    @Headers("Autorization: Client-ID $CLIENT_ID")
    fun getImages(@Path("page") page: Int) : Response<ImagesModel>

    /**
     * Запрос получения списка комментариев конкретной картинки
     *
     * @param imageId   id картинки
     * @return          список комментариев
     */
    @GET("gallery/{image_id}/comments/best")
    @Headers("Authorization: Client-ID $CLIENT_ID")
    fun getCommentsList(@Path(value="image_id") imageId: String) : Response<SingleImageWithInfo>

    /**
     * Запрос получения информации о конкретной картинки
     *
     * @param imageId   id картинки
     * @return          информация о картинке
     */
    @GET("gallery/{image_id}")
    @Headers("Authorization: Client-ID $CLIENT_ID")
    fun getImageInfo(@Path(value="image_id") imageId: String) : Response<ImageResponse>


}