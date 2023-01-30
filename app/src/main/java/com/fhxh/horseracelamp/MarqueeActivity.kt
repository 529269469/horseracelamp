package com.fhxh.horseracelamp

import android.app.Activity
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fhxh.horseracelamp.databinding.ActivityMarqueeBinding

/**
 * 跑马灯
 */
class MarqueeActivity : AppCompatActivity() {

    lateinit var binding: ActivityMarqueeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setNavigationBarVisible(this, true)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_marquee)


        val content = intent.getStringExtra("content")
        val size = intent.getIntExtra("size", 0)

        binding.marqueeContent.setTextColor(Color.RED)
        binding.marqueeContent.text = content
        binding.marqueeContent.textSize = size.toFloat()
        binding.marqueeContent.requestFocus()


        binding.ivFinish.setOnClickListener {
            finish()
        }

    }

    /**
     * 隐藏或显示 导航栏
     *
     * @param activity
     */
    fun setNavigationBarVisible(activity: Activity, isHide: Boolean) {
        if (isHide) {
            val decorView = activity.window.decorView
            val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_FULLSCREEN)
            decorView.systemUiVisibility = uiOptions
        } else {
            val decorView = activity.window.decorView
            val uiOptions = View.SYSTEM_UI_FLAG_VISIBLE
            decorView.systemUiVisibility = uiOptions
        }
    }
}