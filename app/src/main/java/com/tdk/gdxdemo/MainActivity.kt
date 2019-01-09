package com.tdk.gdxdemo

import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplication

class MainActivity : AndroidApplication() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize(FirstGame())
    }
}
