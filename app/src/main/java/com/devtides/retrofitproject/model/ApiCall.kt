package com.devtides.retrofitproject.model

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiCall {

    /**
     *  @GET call examples
     */

    @GET("apiCall")
    fun callGet(): Call<ApiCallResponse>

    // call with params
    @GET("apiCall?name=Alex&Age=24")
    fun callQueryStatic(): Call<ApiCallResponse>

    // call dynamic params
    @GET("apiCall")
    fun callQueryDynamic(
        @Query("name")
        n: String?,
        @Query("age")
        a: Int?
    ): Call<ApiCallResponse>

    // Call multiple params
    @GET("apiCall")
    fun callQueryMultiple (
        @QueryMap params: Map<String, String>
    ): Call<ApiCallResponse>

    // URL Call
    @GET("https://example.com/")
    fun callUrlBypass(): Call<ApiCallResponse>

    // Dynamic URL Call
    @GET
    fun callUrlDynamic(@Url  url: String): Call<ApiCallResponse>

    // Replacement Blocks
    @GET("{info}")
    fun callUrlPath(@Path("info") info: String): Call<ApiCallResponse>


    /**
     *  @POST call examples
     */

    @POST("apiCall")
    fun callPost(): Call<ApiCallResponse>

}