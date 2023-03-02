package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var clubs: MutableList<ClubData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        clubs = mutableListOf()
        clubs.add(ClubData(R.drawable.img, "BaseBall", "Derby Baseball Club is a defunct professional baseball club from Derby England, formed as Ley's Recreation Club by Francis Ley in 1890 and dissolved in the same year."))
        clubs.add(ClubData(R.drawable.img_3, "Badminton", " Find a club with our online resources & other realted topics. ... Discover Badminton. Find Badminton Opportunities Near You. Clubs Coaches."))
        clubs.add( ClubData(R.drawable.img_1, "Football", "A football team is a group of players selected to play together in the various team sports known as football."))

        var adapter = Club_Adapter(clubs)
        binding.rv.adapter=adapter
    }
}