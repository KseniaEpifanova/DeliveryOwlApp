package ru.ksuta.deliveryowlapp

import androidx.multidex.MultiDexApplication
import com.facebook.drawee.backends.pipeline.Fresco

class App : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        Fresco.initialize(this)

    }
}