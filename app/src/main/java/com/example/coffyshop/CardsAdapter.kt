package com.example.coffyshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardsAdapter(private var items: ArrayList<Tarjeta>) : RecyclerView.Adapter<CardsAdapter.TarjViewHolder>() {

    class TarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var titulo: TextView = itemView.findViewById(R.id.textView)
        private var calle: TextView = itemView.findViewById(R.id.textView3)
        private var imager: ImageView = itemView.findViewById(R.id.imageView)
        var puntuacion: TextView = itemView.findViewById(R.id.textView2)
        var ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)

        fun bindTarjeta(t: Tarjeta) = with(itemView) {
            titulo.setText(t.titulo)
            calle.setText(t.calle)
            imager.setImageResource(t.imagen)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_item, viewGroup, false)
        return TarjViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: TarjViewHolder, pos: Int) {
        val item = items[pos]
        viewHolder.bindTarjeta(item)
        viewHolder.ratingBar.setOnRatingBarChangeListener { ratingBar, _, _ ->
            viewHolder.puntuacion.text = ratingBar.rating.toString()
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}