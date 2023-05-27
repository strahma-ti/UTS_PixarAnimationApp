package com.example.pixaranimation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val animation = intent.getParcelableExtra<AnimationClass>(MainActivity.INTENT_PARCELABLE)

        val animationimg = findViewById<ImageView>(R.id.image)
        val animationname = findViewById<TextView>(R.id.tv_name)
        val animationdate = findViewById<TextView>(R.id.tv_date)
        val animationdirector = findViewById<TextView>(R.id.tv_director)
        val animationrate = findViewById<TextView>(R.id.tv_rating)
        val ratingbar = findViewById<RatingBar>(R.id.ratingbar)
        val animationdesc = findViewById<TextView>(R.id.tv_description)

        animationimg.setImageResource(animation?.animationimg!!)
        animationname.text = animation.animationname
        animationdate.text = animation.animationdate
        animationdirector.text = animation.animationdirector
        animationrate.text = animation.animationrate
        ratingbar.rating = animation.ratingbar.toFloat()
        animationdesc.text = animation.animationdesc

        val buttonOpenLink = findViewById<Button>(R.id.buttonOpenLink)
        buttonOpenLink.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLz79ul6rz7RvjrkLaEnb2VH8yy7AlogEE"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}