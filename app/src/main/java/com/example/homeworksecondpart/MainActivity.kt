package com.example.homeworksecondpart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvFirstPlayer:TextView = findViewById(R.id.tvFirstPlayer)
        val tvSecondPlayer:TextView = findViewById(R.id.tvSecondPlayer)
        val tvFirstScore:TextView = findViewById(R.id.tvFirstScore)
        val tvSecondScore:TextView = findViewById(R.id.tvSecondScore)
        val tvTotalScore:TextView = findViewById(R.id.tvTotalScore)
        val ivFirstDice:ImageView = findViewById(R.id.ivFirstDice)
        val ivSecondDice:ImageView = findViewById(R.id.ivSecondDice)
        val btnFirstRoll:Button = findViewById(R.id.btnFirstRoll)
        val btnSecondRoll:Button = findViewById(R.id.btnSecondRoll)
        val ivResultImage:ImageView = findViewById(R.id.ivResultImage)
        val tvResult:TextView = findViewById(R.id.tvResult)
        val randomSecondDiceNumber = Random.nextInt(1,7)
        tvResult.isVisible = false

        btnFirstRoll.setOnClickListener {
            val randomFirstDiceNumber = Random.nextInt(1,7)
            when
            {
                randomFirstDiceNumber == 1 -> ivFirstDice.setImageResource(R.drawable.ic_one_dice)
                randomFirstDiceNumber == 2 -> ivFirstDice.setImageResource(R.drawable.ic_two_dice)
                randomFirstDiceNumber == 3 -> ivFirstDice.setImageResource(R.drawable.ic_three_dice)
                randomFirstDiceNumber == 4 -> ivFirstDice.setImageResource(R.drawable.ic_four_dice)
                randomFirstDiceNumber == 5 -> ivFirstDice.setImageResource(R.drawable.ic_five_dice)
                randomFirstDiceNumber == 6 -> ivFirstDice.setImageResource(R.drawable.ic_six_dice)

            }
            val sumOfScore  = randomFirstDiceNumber + randomSecondDiceNumber
            val firstScore = ("$tvFirstScore  $randomFirstDiceNumber")

            if ( sumOfScore >= 111)
            {
                val text = "Player1 won the game!"
                val imageWin = ivResultImage.setImageResource(R.drawable.ic_bowl)
                tvResult.setText(text)
                setOf(imageWin)
                tvResult.isVisible = true
            }
            else if (randomFirstDiceNumber == 5 && randomSecondDiceNumber == 6)
                {
                    val text = "Zzanzibar Player1 won the game!"
                    val imageWin = ivResultImage.setImageResource(R.drawable.ic_bowl)
                    tvResult.setText(text)
                    setOf(imageWin)
                    tvResult.isVisible = true
                }
            else if (randomFirstDiceNumber == 6 && randomSecondDiceNumber == 5)
                {
                val text = "Zzanzibar Player2 won the game!"
                val imageWin = ivResultImage.setImageResource(R.drawable.ic_bowl)
                tvResult.setText(text)
                setOf(imageWin)
                tvResult.isVisible = true
                }
            else
            {
                val imageBell = ivResultImage.setImageResource(R.drawable.ic_bell)
                setOf(imageBell)
            }

        }

        btnSecondRoll.setOnClickListener {

            when
            {
                randomSecondDiceNumber == 1 -> ivSecondDice.setImageResource(R.drawable.ic_one_dice)
                randomSecondDiceNumber == 2 -> ivSecondDice.setImageResource(R.drawable.ic_two_dice)
                randomSecondDiceNumber == 3 -> ivSecondDice.setImageResource(R.drawable.ic_three_dice)
                randomSecondDiceNumber == 4 -> ivSecondDice.setImageResource(R.drawable.ic_four_dice)
                randomSecondDiceNumber == 5 -> ivSecondDice.setImageResource(R.drawable.ic_five_dice)
                randomSecondDiceNumber == 6 -> ivSecondDice.setImageResource(R.drawable.ic_six_dice)

            }
        }


    }

    private fun rollingDiceScore(firstDice:Int, secondDice:Int)
    {
      var totalScore = firstDice + secondDice
      if (firstDice == secondDice)
      {
         totalScore *= 2
      }
        else {totalScore}

    }
}


