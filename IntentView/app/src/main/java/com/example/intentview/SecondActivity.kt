package com.example.intentview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //nhan du lieu truyen tu intent
        val intent = intent
//        val hoten: String? = intent.getStringExtra("data")
//        val nam : Int = intent.getIntExtra("data",1234)
//        val mangso : IntArray? = intent.getIntArrayExtra("data")
        var hocsinh: DataHocSinh = intent.getSerializableExtra("data") as DataHocSinh
        txt_second.text = hocsinh.hoten + "-" + hocsinh.diachi + "-" + hocsinh.namwsinh
    }
}