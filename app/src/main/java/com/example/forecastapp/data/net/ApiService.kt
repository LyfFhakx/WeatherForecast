package com.example.forecastapp.data.net

import com.example.forecastapp.data.response.CurrentWeatherResponse
import com.example.forecastapp.util.Constants.Companion.ACCESS_KEY
import com.example.forecastapp.util.Constants.Companion.BASE_URL
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current")
    suspend fun getCurrentWeather(
        @Query("query") location:String,
        @Query("lang") languageCode:String="en"
    ):Response<CurrentWeatherResponse>

    companion object{
        operator fun invoke():ApiService{
            val requestInterceptor =Interceptor{chain ->
                val url=chain.request()
                    .url
                    .newBuilder()
                    .addQueryParameter("access_key",ACCESS_KEY)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()
                return@Interceptor chain.proceed(request)
            }

            val okHttpClient=OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
    }
}