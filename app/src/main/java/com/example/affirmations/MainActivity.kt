package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val affirmationNum: TextView = findViewById(R.id.num_affirmations)
        val ds = DataSource()
        ds.loadAffirmations()
        affirmationNum.text = ds.loadAffirmations().size.toString()
    }
}