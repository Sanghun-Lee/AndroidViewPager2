package com.dale.band.viewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dale.band.data.ColorAndTitleData
import com.dale.band.viewpager2.databinding.ItemColorAndTitleBinding

class ViewPagerAdapter(
    private val items: List<ColorAndTitleData>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {

    inner class ViewPagerHolder(
        private val binding: ItemColorAndTitleBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ColorAndTitleData) {
            binding.container.setBackgroundColor(item.color)
            binding.title.text = item.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding =
            ItemColorAndTitleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long = items[position].title.hashCode().toLong()
}