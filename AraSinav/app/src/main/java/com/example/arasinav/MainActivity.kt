package com.example.arasinav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var oharfi = findViewById<TextView>(R.id.textView8)
        var kharfi = findViewById<TextView>(R.id.textView9)
        var tharfi = findViewById<TextView>(R.id.textView10)
        var aharfi = findViewById<TextView>(R.id.textView11)
        var yharfi = findViewById<TextView>(R.id.textView12)


        var birincimage = findViewById<ImageView>(R.id.imageView17)
        var ikincimage = findViewById<ImageView>(R.id.imageView18)
        var ucuncuimage = findViewById<ImageView>(R.id.imageView19)
        var dorduncuimage = findViewById<ImageView>(R.id.imageView20)
        var besincimage = findViewById<ImageView>(R.id.imageView21)
        var progress = findViewById<ProgressBar>(R.id.progressBar)

        progress.visibility = View.INVISIBLE
        birincimage.visibility = View.INVISIBLE
        ikincimage.visibility = View.INVISIBLE
        ucuncuimage.visibility = View.INVISIBLE
        dorduncuimage.visibility = View.INVISIBLE
        besincimage.visibility = View.INVISIBLE

        oharfi.setOnClickListener{
            birincimage.visibility = View.VISIBLE
            kharfi.setOnClickListener{
                ikincimage.visibility = View.VISIBLE
                tharfi.setOnClickListener{
                    ucuncuimage.visibility = View.VISIBLE
                    aharfi.setOnClickListener{
                        dorduncuimage.visibility = View.VISIBLE
                        yharfi.setOnClickListener{
                            besincimage.visibility = View.VISIBLE
                            progress.visibility=View.VISIBLE
                            Handler().postDelayed({
                                var corbamenusunegecis=Intent(applicationContext, corbasecimekrani::class.java)
                                startActivity(corbamenusunegecis)
                            },2000)
                        }
                    }
                }
            }
        }

    }
}



