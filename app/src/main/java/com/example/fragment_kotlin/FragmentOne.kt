package com.example.fragment_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fragment_kotlin.databinding.FragmentOneBinding



class FragmentOne : Fragment() {

    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val rootView:FragmentOneBinding = FragmentOneBinding.inflate(inflater, container, false)
        communicator=activity as Communicator
        rootView.sendButtonId.setOnClickListener {
            communicator.passData(rootView.editTextId.text.toString())

        }
        return rootView.root
    }


}