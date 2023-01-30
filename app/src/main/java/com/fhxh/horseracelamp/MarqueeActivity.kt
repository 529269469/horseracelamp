package com.fhxh.horseracelamp

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fhxh.horseracelamp.databinding.ActivityMarqueeBinding

/**
 * 跑马灯
 */
class MarqueeActivity : AppCompatActivity() {

    lateinit var binding: ActivityMarqueeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_marquee)


        val content = intent.getStringExtra("content")
        val size = intent.getIntExtra("size",0)

        binding.marqueeContent.setTextColor(Color.RED)
        binding.marqueeContent.text=content
        binding.marqueeContent.textSize= size.toFloat()
        binding.marqueeContent.requestFocus()


        binding.marqueeContent.setOnClickListener {


        }

    }
}