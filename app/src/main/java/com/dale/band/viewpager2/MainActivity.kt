package com.dale.band.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dale.band.data.dummy.DummyColorAndTitleDataSet
import com.dale.band.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val adapter by lazy {
        ViewPagerAdapter(DummyColorAndTitleDataSet.getDummyData())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter.setHasStableIds(true)

        binding.viewpager.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}