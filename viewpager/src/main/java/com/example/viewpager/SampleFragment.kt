package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager.databinding.SampleFragmentLayoutBinding

class SampleFragment():Fragment() {

    private var _binding:SampleFragmentLayoutBinding? = null
    private val binding get() = _binding!!

    //eng muhim lifecycle chunki buyerda viewni create qilamiz
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SampleFragmentLayoutBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    //CustomViewPagerAdapterdagi argument positionini shu ovolishimiz kere
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = arguments?.let {
            it.getString("key")
        }
    }

    //biz onDestroyda bindingni nullga tenglab quyishimiz kere
    //chunki har doim onCreateViewga keladi va yangi yasaydi
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}