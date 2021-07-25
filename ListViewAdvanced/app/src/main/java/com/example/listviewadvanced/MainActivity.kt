package com.example.listviewadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arraymonan: ArrayList<MonAn> = ArrayList()
        arraymonan.add(MonAn("Bánh cuốn", R.drawable.banhcuon))
        arraymonan.add(MonAn("Bánh mì", R.drawable.banhmi))
        arraymonan.add(MonAn("Bánh xèo", R.drawable.banhxeeo))
        arraymonan.add(MonAn("Bún đậu", R.drawable.bundau))
        arraymonan.add(MonAn("Cơm", R.drawable.com))
        arraymonan.add(MonAn("Nem rán", R.drawable.nemran))
        arraymonan.add(MonAn("Phở", R.drawable.pho))

        list_item.adapter = CustomeAdapter(this, arraymonan)

    }
}