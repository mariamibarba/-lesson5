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

        products.add(products(id = 1,R.drawable.nature1))
        products.add(products(id = 2,R.drawable.nature2))
        products.add(products(id = 3,R.drawable.nature3))
        products.add(products(id = 4,R.drawable.nature4))
        products.add(products(id = 5,R.drawable.nature5))
        products.add(products(id = 1,R.drawable.nature1))
        products.add(products(id = 2,R.drawable.nature2))
        products.add(products(id = 3,R.drawable.nature3))
        products.add(products(id = 4,R.drawable.nature4))
        products.add(products(id = 5,R.drawable.nature5))





        val adapter=ProductAdapter(products)

        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=adapter

    }

}