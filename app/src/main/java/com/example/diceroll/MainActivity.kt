package com.example.diceroll

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: AppCompatButton = findViewById(R.id.button_roll)
        val diceView1=findViewById<ImageView>(R.id.dice_view)
        val diceView2=findViewById<ImageView>(R.id.dice_view_2)
        rollButton.setOnClickListener(){
            val randInt:Int=(1..6).random()
            val diceResourceDrawable1 = when (randInt){
                1-> R.drawable.dice1
                2-> R.drawable.dice2
                3-> R.drawable.dice3
                4->R.drawable.dice4
                5->R.drawable.dice5
                6->R.drawable.dice6
                else-> R.drawable.dice6
            }
            diceView1.setImageResource(diceResourceDrawable1)

            val randInt2:Int=(1..6).random()
            val diceResourceDrawable2=when(randInt2){
                1-> R.drawable.dice1
                2-> R.drawable.dice2
                3-> R.drawable.dice3
                4->R.drawable.dice4
                5->R.drawable.dice5
                6->R.drawable.dice6
                else-> R.drawable.dice6
            }
            diceView2.setImageResource(diceResourceDrawable2)




        }
    }
}