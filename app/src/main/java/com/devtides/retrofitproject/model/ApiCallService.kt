package com.devtides.retrofitproject.model

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiCallService {

    private val BASE_URL = "https://us-central1-apis2-e78c3.cloudfunctions.net/"

    val okhttp2Client = OkHttpClient.Builder()

    init {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        okhttp2Client.addInterceptor(logging)
    }

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okhttp2Client.build())
        .build()
        .create(ApiCall::class.java)

    fun call() =
//      api.callGet()
//      api.callPost()
//      api.callQueryStatic()
//      api.callQueryDynamic(null, 27)
//      api.callUrlBypass()
//      api.callUrlDynamic("https://example.com")
      api.callUrlPath("apiCall")



}