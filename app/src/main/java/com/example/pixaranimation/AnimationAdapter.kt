package com.example.pixaranimation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimationAdapter (private val context: Context, private val Animation: List<AnimationClass>, val listener: (AnimationClass) -> Unit)
    : RecyclerView.Adapter<AnimationAdapter.AnimationViewHolder>(){
    class AnimationViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val animationimg = view.findViewById<ImageView>(R.id.image)
        val animationname = view.findViewById<TextView>(R.id.tv_name)
        val animationdate = view.findViewById<TextView>(R.id.tv_date)
        val animationdirector = view.findViewById<TextView>(R.id.tv_director)
        val animationrate = view.findViewById<TextView>(R.id.tv_rating)
        val ratingbar = view.findViewById<RatingBar>(R.id.ratingbar)

        fun bindView(animation: AnimationClass, listener: (AnimationClass) -> Unit){
            animationimg.setImageResource(animation.animationimg)
            animationname.text = animation.animationname
            animationdate.text = animation.animationdate
            animationdirector.text = animation.animationdirector
            animationrate.text = animation.animationrate
            ratingbar.rating = animation.ratingbar.toFloat()
            itemView.setOnClickListener{
                (listener(animation))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimationViewHolder {
        return AnimationViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimationViewHolder, position: Int) {
        holder.bindView(Animation[position], listener)
    }

    override fun getItemCount(): Int = Animation.size

}
