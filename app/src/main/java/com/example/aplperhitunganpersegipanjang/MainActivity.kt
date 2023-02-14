package com.example.aplperhitunganpersegipanjang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var  input1 : EditText
    private lateinit var  input2 :EditText
    private lateinit var  rbluas : RadioButton
    private lateinit var  rbkeliling : RadioButton
    private lateinit var  btnHASIL : Button
    private lateinit var  hasile :TextView

    private var PersegiPanjang : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.panjang)
        input2 = findViewById(R.id.lebar)
        rbluas = findViewById(R.id.RBluas)
        rbkeliling = findViewById(R.id.RBkeliling)
        btnHASIL = findViewById(R.id.buttonhHSL)
        hasile = findViewById(R.id.txthsl)

        btnHASIL.setOnClickListener{

            var panjang = input1.text.toString().toInt()
            var lebar = input2.text.toString().toInt()

            if (rbluas.isChecked){
                PersegiPanjang = panjang * lebar
                hasile.setText(PersegiPanjang.toString())

            } else{
                 PersegiPanjang = 2 * (panjang+lebar)
                 hasile.setText(PersegiPanjang.toString())
            }
        }
    }
}