package com.kzuferdy.ingameapps.kegiatan.api

import com.kzuferdy.ingameapps.kegiatan.model.PostResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {
    @FormUrlEncoded
    @POST("exec")
    fun postData(
        @Field("nama") nama: String,
        @Field("kegiatan") kegiatan: String,
    ): Call<PostResponse>
}