package com.example.arasinav

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity

class BeklemeEkrani:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beklemeekrani)

        object : CountDownTimer(800,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                var gecis= Intent(applicationContext, MainActivity::class.java)
                startActivity(gecis)
                finish()
            }

        }.start()

        /*Handler().postDelayed({
            var gecis=Intent(this, MainActivity::class.java)
            startActivity(gecis)
            finish()
        },5000)*/
    }
}