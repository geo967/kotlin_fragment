package com.example.fragment_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity(),Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentOne=FragmentOne()
        supportFragmentManager.beginTransaction()
                .replace(R.id.relative_layout, fragmentOne)
                .commit()
        
    }

    override fun passData(editTextInput: String) {
        val bundle=Bundle()
        bundle.putString("inputText", editTextInput)
        val transaction=this@MainActivity.supportFragmentManager.beginTransaction()

        val fragmentTwo=FragmentTwo()
        fragmentTwo.arguments=bundle
        transaction.replace(R.id.relative_layout, fragmentTwo)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }
}