package com.example.arasinav

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class corbasecimekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menusecimi)
        var ezogelin=findViewById<RadioButton>(R.id.radioButton)
        var dugun=findViewById<RadioButton>(R.id.radioButton2)
        var mercimek=findViewById<RadioButton>(R.id.radioButton3)
        var brokoli=findViewById<RadioButton>(R.id.radioButton4)
        var kellepaca=findViewById<RadioButton>(R.id.radioButton5)
        var yayla=findViewById<RadioButton>(R.id.radioButton6)
        var sehriye=findViewById<RadioButton>(R.id.radioButton7)
        var domates=findViewById<RadioButton>(R.id.radioButton8)
        var tarhana=findViewById<RadioButton>(R.id.radioButton9)
        var mantar=findViewById<RadioButton>(R.id.radioButton10)
        var iskembe=findViewById<RadioButton>(R.id.radioButton11)
        var tavuk=findViewById<RadioButton>(R.id.radioButton12)
        var devambutonu=findViewById<Button>(R.id.button)
        var corbabutonu=findViewById<CheckBox>(R.id.checkBox)
        var progress=findViewById<ProgressBar>(R.id.progressBar2)

        ezogelin.visibility=View.INVISIBLE
        dugun.visibility=View.INVISIBLE
        mercimek.visibility=View.INVISIBLE
        brokoli.visibility=View.INVISIBLE
        kellepaca.visibility=View.INVISIBLE
        yayla.visibility=View.INVISIBLE
        sehriye.visibility=View.INVISIBLE
        domates.visibility=View.INVISIBLE
        tarhana.visibility=View.INVISIBLE
        mantar.visibility=View.INVISIBLE
        iskembe.visibility=View.INVISIBLE
        tavuk.visibility=View.INVISIBLE
        devambutonu.visibility=View.INVISIBLE
        progress.visibility=View.INVISIBLE


        corbabutonu.setOnClickListener{
            ezogelin.visibility=View.VISIBLE
            dugun.visibility=View.VISIBLE
            mercimek.visibility=View.VISIBLE
            brokoli.visibility=View.VISIBLE
            kellepaca.visibility=View.VISIBLE
            yayla.visibility=View.VISIBLE
            sehriye.visibility=View.VISIBLE
            domates.visibility=View.VISIBLE
            tarhana.visibility=View.VISIBLE
            mantar.visibility=View.VISIBLE
            iskembe.visibility=View.VISIBLE
            tavuk.visibility=View.VISIBLE
            devambutonu.visibility=View.VISIBLE
        }
        ezogelin.setOnClickListener{
            devambutonu.setOnClickListener{

                Toast.makeText(applicationContext,"ezogelin çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="ezogelin"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        dugun.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"düğün çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="düğün"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        mercimek.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"mercimek çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="mercimek"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        brokoli.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"brokoli çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="brokoli"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        kellepaca.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"kelle paça çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="kelle-paça"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        yayla.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"yayla çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="yayla"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        sehriye.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"şehriye çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="şehriye"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        domates.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"domates çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="domates"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        tarhana.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"tarhana çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="tarhana"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        mantar.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"mantar çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="mantar"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        iskembe.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"işkembe çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="işkembe"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        tavuk.setOnClickListener{
            devambutonu.setOnClickListener{
                Toast.makeText(applicationContext,"tavuk çorbası güzel seçim lütfen bekleyiniz", Toast.LENGTH_SHORT).show()
                progress.visibility=View.VISIBLE
                Handler().postDelayed({
                    var name="tavuk"
                    var gec= Intent(this, icindekilerMenusu::class.java)
                    gec.putExtra("aktarilacaksey",name)
                    startActivity(gec)
                },2000)
            }
        }
        devambutonu.setOnClickListener{
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Uyarı!!")
            alert.setMessage("Lutfen Bir Secim Yapiniz.")
            alert.setIcon(R.drawable.oc)
            alert.setCancelable(false)
            alert.setNeutralButton("Tekrar Dene"){DialogInterface,i ->

            }
            alert.create().show()
        }

    }
}