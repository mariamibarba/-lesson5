package com.example.marvelcharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView=findViewById(R.id.recyclerview)

        val products= ArrayList<products>()

        products.add(products(id = 1,R.drawable.android_avatar14))
        products.add(products(id = 2,R.drawable.android_avatar))
        products.add(products(id = 1,R.drawable.android_avatar2))
        products.add(products(id = 1,R.drawable.android_avatar3))
        products.add(products(id = 1,R.drawable.android_avatar4))
        products.add(products(id = 1,R.drawable.android_avatar5))
        products.add(products(id = 1,R.drawable.android_avatar6))
        products.add(products(id = 1,R.drawable.android_avatar7))
        products.add(products(id = 1,R.drawable.android_avatar8))
        products.add(products(id = 1,R.drawable.android_avatar9))
        products.add(products(id = 1,R.drawable.android_avatar10))
        products.add(products(id = 1,R.drawable.android_avatar11))
        products.add(products(id = 1,R.drawable.android_avatar12))


        val adapter=ProductAdapter(products)

        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=adapter

    }

}