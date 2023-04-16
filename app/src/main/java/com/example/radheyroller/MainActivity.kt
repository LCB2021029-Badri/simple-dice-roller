package com.example.radheyroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val aceroller:Button = findViewById(R.id.button_button)

        aceroller.setOnClickListener {
            Toast.makeText(this,"Unveiled",Toast.LENGTH_SHORT).show()
            clickhuatohkyahua()
        }

    }

    private fun clickhuatohkyahua() {
        val randomint = (1..10).random()
        val imagenumberwhenrolled = when(randomint){
            1 -> R.drawable.i1
            2 -> R.drawable.i2
            3 -> R.drawable.i3
            4 -> R.drawable.i4
            5 -> R.drawable.i5
            6 -> R.drawable.i6
            7 -> R.drawable.i7
            8 -> R.drawable.i8
            9 -> R.drawable.i9
            else -> {R.drawable.i10}
        }
        val textwhenrolled = when(randomint){
            1 -> "Denji"
            2 -> "Itachi"
            3 -> "Salim bhai"
            4 -> "Levi"
            5 -> "Goku"
            6 -> "Eren"
            7 -> "Naruto"
            8 -> "Gojo"
            9 -> "Luffy"
            else -> "GigaChad"
        }

        val imagedisplay:ImageView= findViewById(R.id.Imagetobedisplayed)
        imagedisplay.setImageResource(imagenumberwhenrolled)

        val name = findViewById<TextView>(R.id.Namtobedisplayed)
        name.setText(textwhenrolled)

    }
}