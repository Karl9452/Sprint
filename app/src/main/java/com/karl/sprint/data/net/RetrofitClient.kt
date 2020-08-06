package com.karl.sprint.data.net

import com.karl.sprint.BuildConfig
import com.karl.sprint.data.net.interceptor.CommonInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient private constructor() {

    private var retrofit: Retrofit

    companion object {
        val instance: RetrofitClient by lazy { RetrofitClient() }
    }

    init {
        retrofit = Retrofit.Builder()
            .client(initClient())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.SERVICE_API_URL)
            .build()
    }

    private fun initClient(): OkHttpClient {

        return OkHttpClient.Builder()
            .addInterceptor(initLogInterceptor())
            .addInterceptor(CommonInterceptor())
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()
    }

    private fun initLogInterceptor(): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }


}