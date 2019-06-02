package com.github.satoshun.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.android.synthetic.main.flex_box_act.*

class RecyclerViewFlexboxActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.flex_box_act)

    recycler.layoutManager = FlexboxLayoutManager(this)
    recycler.adapter = FlexboxAdapter()
  }
}

data class Item(
  private val name: String
)

internal class FlexboxAdapter : ListAdapter<Item, MyViewHolder>(DIFF) {
  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): MyViewHolder {
    return MyViewHolder(
      LayoutInflater.from(parent.context).inflate(
        R.layout.flex_box_item,
        parent,
        false
      )
    )
  }

  override fun onBindViewHolder(
    holder: MyViewHolder,
    position: Int
  ) {
  }
}

internal class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

val DIFF = object : DiffUtil.ItemCallback<Item>() {
  override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
    return oldItem == newItem
  }

  override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
    return oldItem == newItem
  }
}
