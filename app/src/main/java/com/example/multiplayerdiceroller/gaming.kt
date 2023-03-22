package com.example.multiplayerdiceroller

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

class gaming : AppCompatActivity() {
    var i: Int = 0
    var j: Int = 0
    var k: Int = 0
    var l: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming)
        supportActionBar?.hide()

        var quit_card = findViewById<CardView>(R.id.quit_card)
        quit_card.visibility=View.GONE
        var bundl1: Bundle? = intent.extras
        var messag1 = bundl1!!.getString("nop")
        var nop: String = intent.getStringExtra("nop").toString()


        var bundle: Bundle? = intent.extras
        var message = bundle!!.getString("target")
        var target: String = intent.getStringExtra("target").toString()
        var t=target.toInt()

        var bundle2: Bundle? = intent.extras
        var message2 = bundle2!!.getString("target")
        var name1: String = intent.getStringExtra("name1").toString()
        var name_1=name1.toString()


        var bundle3: Bundle? = intent.extras
        var message3 = bundle3!!.getString("target")
        var name2: String = intent.getStringExtra("name2").toString()
        var name_2=name2.toString()


        var bundle4: Bundle? = intent.extras
        var message4 = bundle4!!.getString("target")
        var name3: String = intent.getStringExtra("name3").toString()
        var name_3=name3.toString()


        var bundle5: Bundle? = intent.extras
        var message5 = bundle5!!.getString("target")
        var name4: String = intent.getStringExtra("name4").toString()
        var name_4=name4.toString()
        var i_nop = nop.toInt()

        var btn1 = findViewById<Button>(R.id.btn_1)
        var btn2 = findViewById<Button>(R.id.btn_2)
        var btn3 = findViewById<Button>(R.id.btn_3)
        var btn4 = findViewById<Button>(R.id.btn_4)

        var c1 = findViewById<CardView>(R.id.c1)
        var c2 = findViewById<CardView>(R.id.c2)
        var c3 = findViewById<CardView>(R.id.c3)
        var c4 = findViewById<CardView>(R.id.c4)


        var player1 = findViewById<TextView>(R.id.p1)
        var player2 = findViewById<TextView>(R.id.p2)
        var player3 = findViewById<TextView>(R.id.p3)
        var player4 = findViewById<TextView>(R.id.p4)



        player1.setText(name_1)
        player2.setText(name_2)
        player3.setText(name_3)
        player4.setText(name_4)

        btn2.visibility = View.INVISIBLE
        btn3.visibility = View.INVISIBLE
        btn4.visibility = View.INVISIBLE




        if (i_nop == 2) {
            c3.visibility = View.INVISIBLE
            c4.visibility = View.INVISIBLE

            var btn1 = findViewById<Button>(R.id.btn_1)
            var btn2 = findViewById<Button>(R.id.btn_2)
            var btn3 = findViewById<Button>(R.id.btn_3)
            var btn4 = findViewById<Button>(R.id.btn_4)
            var image = findViewById<ImageView>(R.id.imageView)
            var s1 = findViewById<TextView>(R.id.s1)
            var s2 = findViewById<TextView>(R.id.s2)
            var s3 = findViewById<TextView>(R.id.s3)
            var s4 = findViewById<TextView>(R.id.s4)

            btn1.setOnClickListener {


                var dice = Dice(6)
                val sides = dice.diceRoll()
                btn1.visibility = View.INVISIBLE
                btn2.visibility = View.VISIBLE
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                i += sides
                image.setImageResource(dr)
                var s = i.toString()
                s1.setText(s)

                if (i>=t)
                {
                    val winner: String = player1.text.toString() // or just your string
                    val intent = Intent(this,p1win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }

            btn2.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                btn2.visibility = View.GONE
                btn1.visibility = View.VISIBLE

                j += sides
                image.setImageResource(dr)
                var s = j.toString()
                s2.setText(s)

                if (j>=t)
                {
                    val winner: String = player2.text.toString() // or just your string
                    val intent = Intent(this,p2win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }
        }

        if (i_nop == 3) {
            c4.visibility = View.INVISIBLE

            var btn1 = findViewById<Button>(R.id.btn_1)
            var btn2 = findViewById<Button>(R.id.btn_2)
            var btn3 = findViewById<Button>(R.id.btn_3)
            var btn4 = findViewById<Button>(R.id.btn_4)
            var image = findViewById<ImageView>(R.id.imageView)
            var s1 = findViewById<TextView>(R.id.s1)
            var s2 = findViewById<TextView>(R.id.s2)
            var s3 = findViewById<TextView>(R.id.s3)
            var s4 = findViewById<TextView>(R.id.s4)

            btn1.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                btn1.visibility = View.INVISIBLE
                btn2.visibility = View.VISIBLE
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                i += sides
                image.setImageResource(dr)
                var s = i.toString()
                s1.setText(s)

                if (i>=t)
                {
                    val winner: String = player1.text.toString() // or just your string
                    val intent = Intent(this,p1win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }

            btn2.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                btn2.visibility = View.GONE
                btn3.visibility = View.VISIBLE

                j += sides
                image.setImageResource(dr)
                var s = j.toString()
                s2.setText(s)

                if (j>=t)
                {
                    val winner: String = player2.text.toString() // or just your string
                    val intent = Intent(this,p2win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }

            btn3.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                btn3.visibility = View.GONE
                btn1.visibility = View.VISIBLE

                k += sides
                image.setImageResource(dr)
                var s = k.toString()
                s3.setText(s)

                if (k>=t)
                {
                    val winner: String = player3.text.toString() // or just your string
                    val intent = Intent(this,p3win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }
        }

        if (i_nop == 4) {
            var btn1 = findViewById<Button>(R.id.btn_1)
            var btn2 = findViewById<Button>(R.id.btn_2)
            var btn3 = findViewById<Button>(R.id.btn_3)
            var btn4 = findViewById<Button>(R.id.btn_4)
            var image = findViewById<ImageView>(R.id.imageView)
            var s1 = findViewById<TextView>(R.id.s1)
            var s2 = findViewById<TextView>(R.id.s2)
            var s3 = findViewById<TextView>(R.id.s3)
            var s4 = findViewById<TextView>(R.id.s4)

            btn1.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                btn1.visibility = View.INVISIBLE
                btn2.visibility = View.VISIBLE
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                i += sides
                image.setImageResource(dr)
                var s = i.toString()
                s1.setText(s)

                if (i>=t)
                {
                    val winner: String = player1.text.toString() // or just your string
                    val intent = Intent(this,p1win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }

            btn2.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                btn2.visibility = View.GONE
                btn3.visibility = View.VISIBLE

                j += sides
                image.setImageResource(dr)
                var s = j.toString()
                s2.setText(s)

                if (j>=t)
                {
                    val winner: String = player2.text.toString() // or just your string
                    val intent = Intent(this,p2win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }

            btn3.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                btn3.visibility = View.GONE
                btn4.visibility = View.VISIBLE

                k += sides
                image.setImageResource(dr)
                var s = k.toString()
                s3.setText(s)

                if (k>=t)
                {
                    val winner: String = player3.text.toString() // or just your string
                    val intent = Intent(this,p3win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }

            btn4.setOnClickListener {
                var dice = Dice(6)
                val sides = dice.diceRoll()
                val dr = when (sides) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> {
                        R.drawable.six
                    }
                }
                btn4.visibility = View.GONE
                btn1.visibility = View.VISIBLE

                l += sides
                image.setImageResource(dr)
                var s = l.toString()
                s4.setText(s)

                if (l>=t)
                {
                    val winner: String = player4.text.toString() // or just your string
                    val intent = Intent(this,p4win::class.java)
                    intent.putExtra("winner", winner)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
    override fun onBackPressed() {

        var quit_card = findViewById<CardView>(R.id.quit_card)
        quit_card.visibility=View.VISIBLE
    }


    fun no_quit(view: View) {
        var quit_card = findViewById<CardView>(R.id.quit_card)
        quit_card.visibility=View.GONE
    }

    fun quit(view: View) {
        startActivity(Intent(this@gaming,MainActivity::class.java))
    }


    fun cross(view: View) {
        var quit_card = findViewById<CardView>(R.id.quit_card)
        quit_card.visibility=View.VISIBLE
    }
}

class Dice(private val numSides:Int)
{
    fun diceRoll():Int
    {
        return (1..numSides).random()
    }
}