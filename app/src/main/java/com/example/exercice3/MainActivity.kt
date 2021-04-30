package com.example.exercice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user1:Person=Person(getString(R.string.user1_name),getString(R.string.user1_description),R.drawable.user1)
        val user2:Person=Person(getString(R.string.user2_name),getString(R.string.user2_description),R.drawable.user2)
        val user3:Person=Person(getString(R.string.user3_name),getString(R.string.user3_description),R.drawable.user3)
        var userList:List<Person> = listOf(user1,user2,user3)
        var profile:Person
        var alea :Int
        val random = Random()
        fun rand(from: Int,to:Int):Int{return random.nextInt(to - from)+from}
        alea=rand(1,4)
        profile= userList[alea-1]
        imageView.setImageResource(profile.image)
        profileName.text=profile.name
        profileDescript.text=profile.description
    }
}