package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.core.view.doOnLayout
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.main_act3.*

class MainActivity3 : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act3)

    Glide.with(this)
      .load("https://pbs.twimg.com/profile_images/1125348342676897792/14E24iP9_400x400.jpg")
      .into(left)

    Glide.with(this)
      .load("https://pbs.twimg.com/profile_images/1125348342676897792/14E24iP9_400x400.jpg")
      .into(right)

    root.doOnLayout {
      root.setTransitionListener(object : MotionLayout.TransitionListener {
        private var b: Boolean = false

        override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
        }

        override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
        }

        override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
        }

        override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
          if (!b) {
//            root.progress = 0f

            root.setTransition(R.id.scene4_icon_begin, R.id.scene4_icon_end)
            root.setTransitionDuration(1000)
//
//            icon.visibility = View.VISIBLE
//
            root.transitionToEnd()
          }
          b = true
        }

        override fun allowsTransition(p0: MotionScene.Transition?): Boolean {
          return true
        }
      })

      root.transitionToEnd()
    }
  }
}
