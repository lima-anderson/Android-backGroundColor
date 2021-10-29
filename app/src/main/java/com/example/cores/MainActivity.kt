package com.example.cores

import android.graphics.Color
import android.graphics.ColorMatrix
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var tvNomeDaCor: TextView
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvNomeDaCor = findViewById(R.id.tvNomeDaCor)
        this.layout = findViewById(R.id.layout)


        this.layout.setOnClickListener{
            var vermelho = Cores().r()
            var verde = Cores().g()
            var azul = Cores().b()

            layout.setBackgroundColor(Color.rgb(vermelho, verde, azul))
            this.tvNomeDaCor.text = "rgb(" + vermelho.toString() + ", " + verde.toString() + ", " +  azul.toString() + ")"
        }
    }

    inner class Cores {
        fun r(): Int {
            return Random.nextInt(1,256);
        }
        fun g(): Int {
            return Random.nextInt(1,256);
        }
        fun b (): Int {
            return Random.nextInt(1,256);
        }
    }
}