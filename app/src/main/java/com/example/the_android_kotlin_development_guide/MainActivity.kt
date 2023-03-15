package com.example.the_android_kotlin_development_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import  kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buGetAge.setOnClickListener( View.OnClickListener {
        val userDOB:String=etDOB.text.toString()
        val year:Int=Calendar.getInstance().get(Calendar.YEAR)
        val myAge=year - userDOB.toInt()
        tvShowAge.setText("Your age is "+ myAge)
        })

    }


}
