package com.example.pixaranimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<AnimationClass>(
            AnimationClass(
                R.drawable.pixar_1,
                animationname = "Inside Out",
                animationdate = "Release Date: \nAugust 19, 2015 (Indonesia)",
                animationdirector = "Director: \nPete Docter",
                animationrate = "Rating: (4,5)",
                ratingbar = 4.5,
                animationdesc = "Synopsis: \nEleven-year-old Riley moves to San Francisco, leaving behind her life in Minnesota. She and her five core emotions, Fear, Anger, Joy, Disgust and Sadness, struggle to cope with her new life."
            ),

            AnimationClass(
                R.drawable.pixer_2,
                animationname = "Monster, Inc",
                animationdate = "Release Date: \nNovember 2, 2001 (USA)",
                animationdirector = "Director: \nPete Docter",
                animationrate = "Rating: (4,8)",
                ratingbar = 4.8,
                animationdesc = "Synopsis: \nIn Monstropolis, best friends Sulley and Mike are the top scarers working at the Monsters, Inc. However, their lives are hugely disrupted when a human girl enters their world."
            ),

            AnimationClass(
                R.drawable.pixar_3,
                animationname = "Toy Story",
                animationdate = "Release Date: \nNovember 19, 1995",
                animationdirector = "Director: \nJohn Lasseter, Josh Cooley, Lee Unkrich",
                animationrate = "Rating: (4,3)",
                ratingbar = 4.3,
                animationdesc = "Synopsis: \nToy Story is a 1995 American computer-animated comedy film directed by John Lasseter (in his feature directorial debut), produced by Pixar Animation Studios and released by Walt Disney Pictures."
            ),

            AnimationClass(
                R.drawable.pixar_4,
                animationname = "Toy Story 2",
                animationdate = "Release Date: \nNovember 24, 1999 (USA)",
                animationdirector = "Director: \nJohn Lasseter",
                animationrate = "Rating: (4,7)",
                ratingbar = 4.7,
                animationdesc = "Synopsis: \nWhen Woody is kidnapped by a greedy toy collector and is nowhere to be found, Buzz and his friends set out to rescue him. However, Woody gets tempted by the idea of becoming immortal in a museum."
            ),

            AnimationClass(
                R.drawable.pixar_5,
                animationname = "Toy Story 3",
                animationdate = "Release Date: \nJune 18, 2010 (Indonesia)",
                animationdirector = "Director: \nLee Unkrich",
                animationrate = "Rating: (4,2)",
                ratingbar = 4.2,
                animationdesc = "Synopsis: \nBefore Andy leaves for college, his toys are mistakenly delivered to a day care centre. Woody convinces the other toys that they were not dumped and leads them on an expedition back home."
            ),

            AnimationClass(
                R.drawable.pixar_6,
                animationname = "Coco",
                animationdate = "Release Date: \nNovember 22, 2017 (Indonesia)",
                animationdirector = "Directors: \nAdrian Molina, Lee Unkrich",
                animationrate = "Rating: (5)",
                ratingbar = 4.9,
                animationdesc = "Synopsis: \nMiguel pursues his love for singing in spite of his family's ban on music. He stumbles into the Land of the Dead, where he learns about his great-great-grandfather who was a legendary singer."
            ),

            AnimationClass(
                R.drawable.pixar_7,
                animationname = "Finding Nemo",
                animationdate = "Release Date: \nMay 30, 2003 (USA)",
                animationdirector = "Director: \nAndrew Stanton",
                animationrate = "Rating: (4,5)",
                ratingbar = 4.5,
                animationdesc = "Synopsis: \nEleven-year-old Riley moves to San Francisco, leaving behind her life in Minnesota. She and her five core emotions, Fear, Anger, Joy, Disgust and Sadness, struggle to cope with her new life."
            ),

            AnimationClass(
                R.drawable.pixar_8,
                animationname = "Ratatouille",
                animationdate = "Release Date: \nJune 28, 2007 (Indonesia)",
                animationdirector = "Director: \nBrad Bird",
                animationrate = "Rating: (4,9)",
                ratingbar = 4.9,
                animationdesc = "Synopsis: \nRemy, a rat, aspires to become a renowned French chef. However, he fails to realise that people despise rodents and will never enjoy a meal cooked by him.."
            ),

            AnimationClass(
                R.drawable.pixar_9,
                animationname = "Soul",
                animationdate = "Release Date: \nOctober 11, 2020",
                animationdirector = "Director: \nPete Docter",
                animationrate = "Rating: (5)",
                ratingbar = 4.9,
                animationdesc = "Synopsis: \nJoe is a middle-school band teacher whose life hasn't quite gone the way he expected. His true passion is jazz -- and he's good. But when he travels to another realm to help someone find their passion, he soon discovers what it means to have soul."
            ),

            AnimationClass(
                R.drawable.pixar_10,
                animationname = "Luca",
                animationdate = "Release Date: \nJune 13, 2021",
                animationdirector = "Director: \nEnrico Casarosa",
                animationrate = "Rating: (4)",
                ratingbar = 4.1,
                animationdesc = "Synopsis: \nLuca, a sea monster, befriends Alberto, another one of his kind who takes him on a land adventure. He experiences an exciting summer while keeping his parents in the dark."
            ),

            AnimationClass(
                R.drawable.pixar_11,
                animationname = "Brave",
                animationdate = "Release Date: \nJune 22, 2012 (Indonesia)",
                animationdirector = "Director: \nBrenda Chapman, Mark Andrews",
                animationrate = "Rating: (4,5)",
                ratingbar = 4.5,
                animationdesc = "Synopsis: \nMerida, an independent archer, disobeys an ancient custom which unleashes a dark force. After meeting an elderly witch, as she journeys to reverse the curse, she discovers the real meaning of bravery."
            ),

            AnimationClass(
                R.drawable.pixar_12,
                animationname = "Cars",
                animationdate = "Release Date: \nJune 9, 2006 (USA)",
                animationdirector = "Director: \nJohn Lasseter",
                animationrate = "Rating: (4,5)",
                ratingbar = 4.5,
                animationdesc = "Synopsis: \nLightning McQueen, a racing car, learns a hard lesson in life when he damages a lot of property in Radiator Springs. His task is to repair the damage done before he can get back on the road."
            ),

            AnimationClass(
                R.drawable.pixar_13,
                animationname = "Cars 2",
                animationdate = "Release Date: \nOctober 12, 2011 (Indonesia)",
                animationdirector = "Director: \nJohn Lasseter",
                animationrate = "Rating: (4,7)",
                ratingbar = 4.7,
                animationdesc = "Synopsis: \nStar racecar Lightning McQueen and his friend Mater journey abroad to participate in a Grand Prix race. The path to the championship becomes troublesome when Mater gets involved in espionage."
            ),

            AnimationClass(
                R.drawable.pixar_14,
                animationname = "Cars 3",
                animationdate = "Release Date: \nAugust 16, 2017 (Indonesia)",
                animationdirector = "Director: \nBrian Fee",
                animationrate = "Rating: (4,5)",
                ratingbar = 4.5,
                animationdesc = "Synopsis: \nLighting McQueen, a legendary racer, is overcome by new generation racers. He sets out to prove that he is the best racer in the world with the help of Cruz Ramirez."
            ),

            AnimationClass(
                R.drawable.pixar_15,
                animationname = "The Incredible",
                animationdate = "Release Date: \nOctober 24, 2004 (USA)",
                animationdirector = "Director: \nBrad Bird",
                animationrate = "Rating: (4,6)",
                ratingbar = 4.6,
                animationdesc = "Synopsis: \nForced to adopt a civilian identity and stuck in a white-collar job, Mr Incredible itches to get back into action. When he is lured into a trap by the evil Syndrome, his family contrives to save him."
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AnimationAdapter(this, animeList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}