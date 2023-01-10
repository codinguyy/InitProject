package app.codinguyy.initproject.services.interceptor

import app.codinguyy.initproject.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class HeadersInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()

        request = request.newBuilder()
            .header("User-Agent", "A-${BuildConfig.VERSION_CODE}")
            .build()

        return chain.proceed(request)
    }
}
