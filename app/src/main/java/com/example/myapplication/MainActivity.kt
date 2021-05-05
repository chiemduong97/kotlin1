package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView:RecyclerView=findViewById(R.id.recycleview)
        var list:List<Avatar> = arrayListOf(
                Avatar(R.drawable.avt1,"S1"),
                Avatar(R.drawable.avt2,"S2"),
                Avatar(R.drawable.avt3,"S3"),
                Avatar(R.drawable.avt4,"S4"),
                Avatar(R.drawable.avt5,"S5"),
                Avatar(R.drawable.avt6,"S6"),
                Avatar(R.drawable.avt7,"S7"),
                Avatar(R.drawable.avt8,"S8"),
                Avatar(R.drawable.avt9,"S9"),
                Avatar(R.drawable.avt10,"S10"),
                Avatar(R.drawable.avt11,"S11"),
                Avatar(R.drawable.avt12,"S12"),
                Avatar(R.drawable.avt13,"S13"),
                Avatar(R.drawable.avt14,"S14"),
                Avatar(R.drawable.avt15,"S15"))
        val myAdapter=MyAdapter(this,list)
        recyclerView.layoutManager=GridLayoutManager(this,
                2,
                GridLayoutManager.HORIZONTAL,
                false
        );
        recyclerView.adapter=myAdapter
        val numbers = arrayListOf(15, -5, 11, -39)

        val nonNegativeNumbers = numbers.filter { it >= 0 }

        println(nonNegativeNumbers)
    }

}