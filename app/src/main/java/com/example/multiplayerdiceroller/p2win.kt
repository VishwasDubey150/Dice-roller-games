package com.example.multiplayerdiceroller

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class p2win : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p2win)
        supportActionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        var bundle: Bundle? = intent.extras
        var message = bundle!!.getString("winner")
        var winner: String = intent.getStringExtra("winner").toString()


        var player=findViewById<TextView>(R.id.nameb)

        player.setText(winner)
    }

    fun replay(view: View) {
        startActivity(Intent(this@p2win,MainActivity::class.java))
    }
}