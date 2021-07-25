package com.example.listviewadvanced

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomeAdapter(var context: Context, var mangmonan: ArrayList<MonAn>) :
    BaseAdapter() {

    class ViewHolder(row: View) {
        var textviewmonan: TextView
        var imgmonan: ImageView

        init {
            textviewmonan = row.findViewById(R.id.txt_monan) as TextView
            imgmonan = row.findViewById(R.id.im_monan) as ImageView
        }
    }

    override fun getCount(): Int {
        return mangmonan.size
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewholder: ViewHolder
        if (convertView == null) {
            var layoutinflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.dong_mon_an, null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        } else {
            view = convertView
            viewholder = convertView.tag as ViewHolder
        }
        var monan: MonAn = getItem(position) as MonAn
        viewholder.textviewmonan.text = monan.ten
        viewholder.imgmonan.setImageResource(monan.hinhanh)
        return view as View

    }
}