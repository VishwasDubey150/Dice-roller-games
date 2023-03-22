package com.example.multiplayerdiceroller

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class naming : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naming)
        supportActionBar?.hide()
        var bundle :Bundle ?=intent.extras
        var message = bundle!!.getString("value")
        var nop: String = intent.getStringExtra("value").toString()
        var p1=findViewById<CardView>(R.id.p1)
        var p2=findViewById<CardView>(R.id.p2)
        var p3=findViewById<CardView>(R.id.p3)
        var p4=findViewById<CardView>(R.id.p4)
        var noofpeople:Int=nop.toInt()
        if(noofpeople==2)
        {
            p3.visibility = View.GONE
            p4.visibility = View.GONE
        }

        if(noofpeople==3)
        {
            p4.visibility = View.GONE
        }
    }
    fun Start(view: View) {
        var targett=findViewById<EditText>(R.id.target)
        var name1=findViewById<EditText>(R.id.name1)
        var name_1=name1.text.toString()
        var name2=findViewById<EditText>(R.id.name2)
        var name_2=name2.text.toString()
        var name3=findViewById<EditText>(R.id.name3)
        var name_3=name3.text.toString()
        var name4=findViewById<EditText>(R.id.name4)
        var name_4=name4.text.toString()
        var target=targett.text.toString()
        if(targett.text.isEmpty())
        {
            Toast.makeText(this,"Enter target for game",Toast.LENGTH_LONG).show()
        }
        else
        {
            var bundle :Bundle ?=intent.extras
            var message = bundle!!.getString("value")
            var nop: String = intent.getStringExtra("value").toString()
            val intent = Intent(this, gaming::class.java)
            intent.putExtra("nop", nop)
            intent.putExtra("target",target)
            intent.putExtra("name1",name_1)
            intent.putExtra("name2",name_2)
            intent.putExtra("name3",name_3)
            intent.putExtra("name4",name_4)

            startActivity(intent)
            finish()
        }
    }

    fun back(view: View) {
        startActivity(Intent(this@naming,MainActivity::class.java))
    }
}


