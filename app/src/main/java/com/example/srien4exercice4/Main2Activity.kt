package com.example.srien4exercice4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var nom = intent.extras?.get("nom")
        supportActionBar?.title = nom.toString()
        textViewnom.text = nom.toString()

        var det = intent.extras?.get("det")
        textViewdetails.text = det.toString()
        textViewdetails.setOnClickListener {
            var profintent = Intent(this, ProfActivity::class.java)
            startActivity(profintent)
        }
    }
}
