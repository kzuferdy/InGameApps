package com.kzuferdy.ingameapps.kegiatan.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private const val BASE_URL = "https://script.google.com/macros/s/AKfycbygkNu69-nEwvcsiMHvC5lvWt26b3nPVGIsl-A7p55Fa3NPu0KotDR599SdkaKTY1Rb/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val instance = retrofit.create(Api::class.java)
}