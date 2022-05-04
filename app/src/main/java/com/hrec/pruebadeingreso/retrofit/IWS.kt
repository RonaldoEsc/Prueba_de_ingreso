package com.hrec.pruebadeingreso.retrofit

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import okhttp3.JavaNetCookieJar
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.concurrent.TimeUnit

interface IWS {
    @GET("users")
    fun getUsers(): Call<JsonArray>
    @GET("posts")
    fun getPosts(): Call<JsonArray>
    @GET("posts")
    fun getPosts(@Query("userId") userId: Int): Call<JsonArray>

    companion object {
        private const val url = "https://jsonplaceholder.typicode.com"

        fun create(): IWS {
            val logginInterceptor = HttpLoggingInterceptor()
            logginInterceptor.level = HttpLoggingInterceptor.Level.HEADERS

            val cookieManager = CookieManager()
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)

            val okHttpClient = OkHttpClient.Builder()
                .cookieJar(JavaNetCookieJar(cookieManager))
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(logginInterceptor)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
            return retrofit.create(IWS::class.java)
        }
    }
}