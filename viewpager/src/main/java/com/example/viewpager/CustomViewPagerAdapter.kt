package com.example.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomViewPagerAdapter(activity:FragmentActivity):FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return 10  //10ta fragment yasamoqchisiz
    }

    override fun createFragment(position: Int): Fragment {
        //bu yerda fragmentni create qiladi
        //avval fragment yasab olish kere boladi
        //bu yerda endi 1chi 2chi degan argument yuborishimiz kere
        val sample = SampleFragment().apply {
            arguments = Bundle().apply {
                putString("key",position.toString())
            }
        }
        //shu sampleFragmentni qaytarib quyamiz
        return sample

    }
}