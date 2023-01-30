package com.fhxh.horseracelamp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.fhxh.horseracelamp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.btConfirm.setOnClickListener {
          val textContent = binding.textContent.text.trim().toString()
            if (textContent!=""){
                val intent=Intent(this,MarqueeActivity::class.java)
                intent.putExtra("content",textContent)
                val textSize = binding.textSize.text.trim().toString()
                intent.putExtra("size",textSize.toInt())
                startActivity(intent)

            }

        }


    }
}