package org.adhi.firstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvText:TextView=findViewById(R.id.tvText)
        val btFontSize:Button=findViewById(R.id.btFonSize)
        val btFontColor:Button=findViewById(R.id.btFontColor)
        val btBgColor:Button=findViewById(R.id.btBgColor)
        val linearLayout:LinearLayout=findViewById(R.id.linearlayout)
        var fontSize:Float=5f
        var fontColor:Int=0
        var bgColor:Int=0
        btFontSize.setOnClickListener {
            tvText.setTextSize(fontSize)
            fontSize=(fontSize+5)%50
        }
        btFontColor.setOnClickListener {
            when(fontColor%3) {
             0 ->tvText.setTextColor(Color.RED)
                1 ->  tvText.setTextColor(Color.GREEN)
                2 -> tvText.setTextColor(Color.BLUE)
            }
            fontColor++
        }
        btBgColor.setOnClickListener {

            when(bgColor%3){
                0 ->linearLayout.setBackgroundColor(Color.RED)
                1 ->  linearLayout.setBackgroundColor(Color.GREEN)
                2 -> linearLayout.setBackgroundColor(Color.BLUE)

            }
            bgColor++
        }
    }
}