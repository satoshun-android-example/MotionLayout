package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.main_act.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    Glide.with(this)
      .load("https://pbs.twimg.com/profile_images/1108958487801786368/wwk-3ysJ_400x400.jpg")
      .into(left)

    Glide.with(this)
      .load("https://pbs.twimg.com/profile_images/1108958487801786368/wwk-3ysJ_400x400.jpg")
      .into(right)
  }
}
