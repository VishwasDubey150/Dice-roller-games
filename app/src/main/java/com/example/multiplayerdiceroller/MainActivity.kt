package com.example.multiplayerdiceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var i:Int=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var nop=findViewById<TextView>(R.id.nop)
        var myNewInt: Int = nop.text.toString().toInt()
            var left=findViewById<ImageView>(R.id.left)
            left.visibility = View.INVISIBLE
    }

    fun left(view: View) {
        var nop=findViewById<TextView>(R.id.nop)
        var myNewInt: Int = nop.text.toString().toInt()
        myNewInt=myNewInt-1
        var f=myNewInt.toString()
        nop.setText(f)
        var right=findViewById<ImageView>(R.id.right)
        right.visibility = View.VISIBLE

        if(nop.text.toString().toInt()==2)
        {
            var left=findViewById<ImageView>(R.id.left)
            left.visibility = View.INVISIBLE
        }

    }
    fun right(view: View) {
        var nop=findViewById<TextView>(R.id.nop)
        var myNewInt: Int = nop.text.toString().toInt()
        myNewInt=myNewInt+1
        var f=myNewInt.toString()
        nop.setText(f)
        var left=findViewById<ImageView>(R.id.left)
        left.visibility = View.VISIBLE

        if(nop.text.toString().toInt()==4)
        {
            var right=findViewById<ImageView>(R.id.right)
            right.visibility = View.INVISIBLE
        }
    }

    fun next(view: View) {
        var nop=findViewById<TextView>(R.id.nop)
        val value: String = nop.text.toString() // or just your string
        val intent = Intent(this, naming::class.java)
        intent.putExtra("value", value)
        startActivity(intent)
        finish()
    }
}