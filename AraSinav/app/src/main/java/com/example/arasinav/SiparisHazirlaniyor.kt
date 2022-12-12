package com.example.arasinav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.BaseTransientBottomBar.AnimationMode
import kotlinx.coroutines.newFixedThreadPoolContext
import org.w3c.dom.Text
import pl.droidsonroids.gif.GifImageButton
import pl.droidsonroids.gif.GifImageView
import kotlin.system.exitProcess

class SiparisHazirlaniyor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siparis_hazirlaniyor)
        var corbayazisi=findViewById<TextView>(R.id.textView7)
        var gecenekstra=findViewById<TextView>(R.id.textView4)
        var siparis=findViewById<GifImageButton>(R.id.siparis)
        var close=findViewById<ImageView>(R.id.imageView5)
        var gecenswitchyazisi=findViewById<TextView>(R.id.textView19)
        var atilantuz=intent.getStringExtra("aktarilacakSey")
        var atilanaci=intent.getStringExtra("aktarilacakaci")
        var gecenistek=intent.getStringExtra("aktarilacakekstra")
        var alinancorba=intent.getStringExtra("aktarilacaksey")
        var switch1=intent.getStringExtra("aktarilacakswitch1")
        var switch2=intent.getStringExtra("aktarilacakswitch2")
        var switch3=intent.getStringExtra("aktarilacakswitch3")
        var switch4=intent.getStringExtra("aktarilacakswitch4")
        var switch5=intent.getStringExtra("aktarilacakswitch5")
        var switch6=intent.getStringExtra("aktarilacakswitch6")
        var switch7=intent.getStringExtra("aktarilacakswitch7")
        var switch8=intent.getStringExtra("aktarilacakswitch8")
        var switch9=intent.getStringExtra("aktarilacakswitch9")
        var switch10=intent.getStringExtra("aktarilacakswitch10")
        var switch11=intent.getStringExtra("aktarilacakswitch11")
        var switch12=intent.getStringExtra("aktarilacakswitch12")
        corbayazisi.text="Bir $alinancorba Çorbası Çeeek $atilantuz ve $atilanaci Olsun"
        gecenekstra.text="Ekstra İstek:$gecenistek"
        gecenswitchyazisi.text="$switch1 $switch2 $switch3 $switch4 $switch5 $switch6 $switch7 $switch8 $switch9 $switch10 $switch11 $switch12"
      siparis.setOnClickListener{
            Handler().postDelayed({
                var gec= Intent(this, corbasecimekrani::class.java)
                startActivity(gec)
            },1000)
        }
        close.setOnClickListener{
            moveTaskToBack(true);
            exitProcess(-1)
        }
    }
}