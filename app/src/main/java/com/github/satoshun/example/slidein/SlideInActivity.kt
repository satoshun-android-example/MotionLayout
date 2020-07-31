package com.github.satoshun.example.slidein

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.R
import kotlinx.android.synthetic.main.slide_in_act.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SlideInActivity : AppCompatActivity(R.layout.slide_in_act) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val motionLayout = motion

    lifecycleScope.launch {
      delay(2000)
      motionLayout.transitionToEnd()
    }
  }
}
