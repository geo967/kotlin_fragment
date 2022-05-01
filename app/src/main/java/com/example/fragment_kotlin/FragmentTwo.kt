package com.example.fragment_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment_kotlin.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    var inputText:String=""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentTwoBinding= FragmentTwoBinding.inflate(inflater,container,false)

        inputText=arguments?.getString("inputText").toString()
        binding.outPutTextId.text=inputText

        return binding.root
    }

}