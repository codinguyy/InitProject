package app.codinguyy.initproject.services

import app.codinguyy.initproject.services.interceptor.HeadersInterceptor
import app.codinguyy.initproject.services.interceptor.LoggingInterceptor
import app.codinguyy.initproject.util.CertificatePinnerUtil
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitBuilder {

    fun provideRetrofitApi(): FooApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("")
            .client(getOkHttpClient())
            .build()
            .create(FooApi::class.java)
    }

    private fun getOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(LoggingInterceptor.getLoggingInterceptor())
            .addInterceptor(HeadersInterceptor())
            .certificatePinner(CertificatePinnerUtil.getCertificatePinner())
            .build()
}
