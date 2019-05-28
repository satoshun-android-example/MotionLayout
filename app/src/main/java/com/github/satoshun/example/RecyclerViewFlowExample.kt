package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import kotlinx.android.synthetic.main.recycler_act.*

private val labels = listOf("1", "a", "bb", "gaag", "gaglgg", "gmlmagna", "gagaga")

class RecyclerViewFlowExample : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.recycler_act)

    labels.forEach {
      val chip = Chip(this)
      chip.text = it

      motion.addView(chip)
      flow.addView(chip)
    }
  }
}
