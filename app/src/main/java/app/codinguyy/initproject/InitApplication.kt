package app.codinguyy.initproject

import android.app.Application
import org.koin.core.context.startKoin

class InitApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{

        }
    }
}