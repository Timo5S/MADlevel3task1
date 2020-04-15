package com.example.madlevel3task1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.androidcourse.userprofilekotlin.R


@SuppressLint("Registered")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(
                Intent(
                    this@SplashActivity,
                    CreateProfileActivity::class.java
                )
            )
            finish()
        }, 1000)
    }
}