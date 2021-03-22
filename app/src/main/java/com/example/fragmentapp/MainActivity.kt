package com.example.fragmentapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rateMe:TextView= findViewById(R.id.rateMeTextView)

        rateMe.setOnClickListener{
            var dailog= CustomDialogFragment()
            dailog.show(supportFragmentManager, "customDialog")
        }


        val homeBtn: Button = findViewById(R.id.homeBtn)
        val profileBtn: Button = findViewById(R.id.profileBtn)
        val settingBtn: Button = findViewById(R.id.settingBtn)

        val textInput: EditText = findViewById(R.id.enterName)
        val sendToProfileBtn: Button = findViewById(R.id.sendNameToProfileBtn)

        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
        val settingFragment = SettingFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.bodyFragment, homeFragment)
            commit()
        }





        homeBtn.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.bodyFragment, homeFragment)
                commit()
            }
        }

        profileBtn.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.bodyFragment, profileFragment)
                commit()
            }
        }

        settingBtn.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.bodyFragment, settingFragment)
                commit()
            }
        }

        sendToProfileBtn.setOnClickListener {
            val inputName: String = textInput.editableText.toString()
            val args = Bundle()
            args.putString("name", inputName)
            profileFragment.arguments = args

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.bodyFragment, profileFragment)
                commit()
            }
        }


    }

}