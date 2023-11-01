package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customViewPagerAdapter = CustomViewPagerAdapter(this)
        binding.myViewPager.adapter = customViewPagerAdapter

        //tablayuotni viewPagerga boglab quyamiz
        TabLayoutMediator(binding.tabLayout,binding.myViewPager){tab,position->
            tab.text = "Title $position"
        }.attach()
    }
}