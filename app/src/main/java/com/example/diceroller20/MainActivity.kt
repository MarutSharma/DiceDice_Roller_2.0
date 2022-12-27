package com.example.diceroller20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.imageView)
        val rollButton:Button = findViewById(R.id.rollButton)
        textView = findViewById(R.id.textView)

        rollButton.setOnClickListener {rollDice()}
    }
    fun rollDice(){
        val num = (1..6).random()
        textView.text = num.toString()
        val image = when(num){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage.setImageResource(image)
    }


}
