package com.example.srien4exercice4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seances = ArrayList<data>()
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        seances.add(data("TD ASI","H HAROUN - 2H",R.drawable.male_user))
        myrecview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adptr = CustomAdapter(seances)
        myrecview.adapter = adptr
    }
}
