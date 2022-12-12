package com.example.arasinav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class icindekilerMenusu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icindekiler_menusu)
        var gecencorba=findViewById<TextView>(R.id.textView3)
        var edittext=findViewById<EditText>(R.id.editTextTextPersonName3)
        var tuz="Tuzsuz"
        var aci="Acisiz"
        var alinansey=intent.getStringExtra("aktarilacaksey")
        gecencorba.text="$alinansey Çorbası"
        var kitir=findViewById<Switch>(R.id.switch20)
        var limon=findViewById<Switch>(R.id.switch21)
        var yag=findViewById<Switch>(R.id.switch22)
        var nane=findViewById<Switch>(R.id.switch23)
        var beyin=findViewById<Switch>(R.id.switch24)
        var sarimsak=findViewById<Switch>(R.id.switch27)
        var krema=findViewById<Switch>(R.id.switch25)
        var tozbiber=findViewById<Switch>(R.id.switch26)
        var kasar=findViewById<Switch>(R.id.switch28)
        var terbiye=findViewById<Switch>(R.id.switch29)
        var sirke=findViewById<Switch>(R.id.switch30)
        var dil=findViewById<Switch>(R.id.switch31)
        var siparisver=findViewById<Button>(R.id.button2)
        var seek1=findViewById<SeekBar>(R.id.seekBar)
        var seek2=findViewById<SeekBar>(R.id.seekBar2)
        var istekler=findViewById<TextView>(R.id.textView18)

        var nanesw=""
        var yagsw = ""
        var limonsw = ""
        var kitirsw = ""
        var beyinsw = ""
        var sarimsaksw = ""
        var kremasw = ""
        var tozbibersw = ""
        var kasarsw = ""
        var terbiyesw = ""
        var sirkesw = ""
        var dilsw = ""





        kitir.visibility= View.INVISIBLE
        limon.visibility= View.INVISIBLE
        yag.visibility= View.INVISIBLE
        nane.visibility= View.INVISIBLE
        beyin.visibility= View.INVISIBLE
        sarimsak.visibility= View.INVISIBLE
        krema.visibility= View.INVISIBLE
        tozbiber.visibility= View.INVISIBLE
        kasar.visibility= View.INVISIBLE
        terbiye.visibility= View.INVISIBLE
        sirke.visibility= View.INVISIBLE
        dil.visibility= View.INVISIBLE
        istekler.setText(alinansey)

        if(istekler.text.toString() == "ezogelin"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
        }

        if(istekler.text.toString() == "düğün"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE

        }
        if(istekler.text.toString()=="mercimek"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE

        }
        if(istekler.text.toString() == "brokoli"){
            krema.visibility = View.VISIBLE
        }

        if(istekler.text.toString()=="kelle-paça"){
            sarimsak.visibility = View.VISIBLE
            dil.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }

        if(istekler.text.toString()=="yayla"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
        }
        if (istekler.text.toString() == "şehriye"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }

        if(istekler.text.toString() == "domates"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
        }
        if(istekler.text.toString() == "tarhana"){
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
        }

        if(istekler.text.toString()=="mantar"){
            krema.visibility = View.VISIBLE
        }

        if(istekler.text.toString() == "işkembe"){
            yag.visibility = View.VISIBLE
            tozbiber.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            sarimsak.visibility = View.VISIBLE
        }
        if(istekler.text.toString()=="tavuk"){
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }
        siparisver.setOnClickListener{
            var istek=edittext.text.toString()
            val uyari= AlertDialog.Builder(this)
            uyari.setTitle("Siparişinizin Durumu")
            uyari.setMessage("Siparişiniz hazırlanacak. Devam etmek istiyor musunuz?")
            uyari.setIcon(R.drawable.oc)
            uyari.setCancelable(false)
            uyari.setPositiveButton("Evet"){DialogInterface,i->
                Handler().postDelayed({
                    if(nane.isChecked){
                        nanesw="nane,"
                    }
                    if(yag.isChecked){
                        yagsw="yağ,"
                    }
                    if(limon.isChecked){
                        limonsw="limon,"
                    }
                    if(krema.isChecked){
                        kremasw="krema,"
                    }
                    if(tozbiber.isChecked){
                       tozbibersw="tozbiber,"
                    }
                    if(sirke.isChecked){
                        sirkesw="sirke,"
                    }
                    if(sarimsak.isChecked){
                       sarimsaksw="sarımsak,"
                    }
                    if(kitir.isChecked){
                        kitirsw="kıtır,"
                    }
                    if(kasar.isChecked){
                        kasarsw="kaşar,"
                    }
                    if(beyin.isChecked){
                        beyinsw="beyin,"
                    }
                    if(dil.isChecked){
                        dilsw="dil,"
                    }
                    if(terbiye.isChecked){
                        terbiyesw="terbiye,"
                    }
                    var gec= Intent(this, SiparisHazirlaniyor::class.java)
                    gec.putExtra("aktarilacaksey",alinansey)
                    gec.putExtra("aktarilacakekstra",istek)
                    gec.putExtra("aktarilacakSey",tuz)
                    gec.putExtra("aktarilacakaci",aci)
                    gec.putExtra("aktarilacakswitch1",nanesw)
                    gec.putExtra("aktarilacakswitch2",beyinsw)
                    gec.putExtra("aktarilacakswitch3",kitirsw)
                    gec.putExtra("aktarilacakswitch4",limonsw)
                    gec.putExtra("aktarilacakswitch5",dilsw)
                    gec.putExtra("aktarilacakswitch6",terbiyesw)
                    gec.putExtra("aktarilacakswitch7",kasarsw)
                    gec.putExtra("aktarilacakswitch8",sarimsaksw)
                    gec.putExtra("aktarilacakswitch9",yagsw)
                    gec.putExtra("aktarilacakswitch10",kremasw)
                    gec.putExtra("aktarilacakswitch11",sirkesw)
                    gec.putExtra("aktarilacakswitch12",tozbibersw)
                    startActivity(gec)
                },2000)


            }
            uyari.setNeutralButton("Tekrar kontrol etmek istiyorum"){DialogInterface,i->

            }
            uyari.create().show()



        }
        seek1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (seek1.progress==0){
                    tuz="Tuzsuz"
                }
                if(seek1.progress==1){
                    tuz="Orta Tuzlu"
                }
                if(seek1.progress==2){
                    tuz="Bol Tuzlu"
                    val uyari=AlertDialog.Builder(this@icindekilerMenusu)
                    uyari.setTitle("Uyari !")
                    uyari.setMessage("bu kadar tuz istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.tuz)
                    uyari.setCancelable(false)
                    uyari.setPositiveButton("Evet"){DialogInterface,i->
                        Toast.makeText(applicationContext,"Bol tuzlu çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNeutralButton("Hayır"){DialogInterface,i->
                       seek1.progress=1
                    }
                    uyari.create().show()
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })
        seek2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (seek2.progress==0){
                    aci="Acısız"
                }
                if(seek2.progress==1){
                    aci="Orta Acılı"
                }
                if(seek2.progress==2){
                    aci="Bol Acılı"
                    val uyari=AlertDialog.Builder(this@icindekilerMenusu)
                    uyari.setTitle("Uyari !")
                    uyari.setMessage("bu kadar acı istediğinize emin misiniz?")
                    uyari.setIcon(R.drawable.biber)
                    uyari.setCancelable(false)
                    uyari.setPositiveButton("Evet"){DialogInterface,i->
                        Toast.makeText(applicationContext,"Bol acılı çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNeutralButton("Hayır"){DialogInterface,i->
                        seek2.progress=1
                    }
                    uyari.create().show()

                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })
    }
}