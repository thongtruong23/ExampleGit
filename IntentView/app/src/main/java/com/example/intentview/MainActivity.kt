package com.example.intentview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_intent.setOnClickListener {
            val intent : Intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("data", "Trương Văn Thông") //truyen chuoi
//            intent.putExtra("data", 2019)
//            val mangSo : IntArray = intArrayOf(123,456,789)
            var hocsinh : DataHocSinh =  DataHocSinh("TruongVanThong",22,"Hue")
            intent.putExtra("data", hocsinh)
            startActivity(intent)
        }

    }
}