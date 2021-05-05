
package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

public class MyAdapter(private var context: Context?,private  var Avatars: List<Avatar>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var layoutInflater: LayoutInflater = LayoutInflater.from(context)
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var avatar: ImageView = itemView!!.findViewById(R.id.iconGioiThieu)
        var name: TextView = itemView!!.findViewById(R.id.TenIconGioiThieu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       return MyViewHolder(layoutInflater.inflate(R.layout.icon_gioi_thieu,parent,false))
    }

    override fun getItemCount():Int {
        return Avatars!!.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MyViewHolder).avatar.setImageResource(Avatars!!.get(position).avatar)
        (holder as MyViewHolder).name.setText(Avatars!!.get(position).name)
        (holder as MyViewHolder).itemView.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, Avatars!!.get(position).name, Toast.LENGTH_SHORT).show()
        })
    }

}