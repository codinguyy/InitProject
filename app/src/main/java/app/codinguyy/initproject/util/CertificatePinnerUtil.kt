package app.codinguyy.initproject.util

import okhttp3.CertificatePinner
import org.koin.android.BuildConfig

object CertificatePinnerUtil {
    fun getCertificatePinner(): CertificatePinner = if (BuildConfig.DEBUG) {
        CertificatePinner.Builder().build()
    } else {
        CertificatePinner.Builder()
            .add("xx", "yy")
            .build()
    }
}
