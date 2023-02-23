package com.example.practicalw2g124

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.RollBtn)
        rollBtn.setOnClickListener {rollDice()}

        diceImage = findViewById(R.id.DiceImage)
    }
    private fun rollDice(){
        val randomInt = (1..6).random()
        val numberTxt: TextView = findViewById(R.id.NumberTxt)
        Toast.makeText(this,"Dice is rolled", Toast.LENGTH_SHORT).show()
        numberTxt.text = randomInt.toString()

        val drawableRes = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableRes)
        numberTxt.text = randomInt.toString()
  }
}