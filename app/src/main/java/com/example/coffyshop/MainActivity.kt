package com.example.coffyshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Tarjeta>()
        items.add(Tarjeta(R.string.antico_caffe,R.string.italy_rome,R.mipmap.ic_antico_foreground))
        items.add(Tarjeta(R.string.coffee_room, R.string.germany_berlin,R.mipmap.ic_coffee_room_foreground))
        items.add(Tarjeta(R.string.coffee_ibiza, R.string.colon_madrid, R.mipmap.ic_coffee_ibiza_foreground))
        items.add(Tarjeta(R.string.pudding_coffee, R.string.diagonal_barcelona, R.mipmap.ic_pudding_foreground))
        items.add(Tarjeta(R.string.l_expres, R.string.picadilly_circus, R.mipmap.ic_express_foreground))
        items.add(Tarjeta(R.string.coffee_corner, R.string.angel_gimera, R.mipmap.ic_corner_foreground))
        items.add(Tarjeta(R.string.sweet_cup, R.string.kinkerstraat, R.mipmap.ic_sweet_cup_foreground))
        val recView = findViewById<RecyclerView>(R.id.recyclerView)

        recView.setHasFixedSize(true)

        val adaptador = CardsAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}