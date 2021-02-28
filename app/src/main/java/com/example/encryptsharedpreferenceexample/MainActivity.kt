package com.example.encryptsharedpreferenceexample

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yenen.ahmet.basecorelibrary.base.local.SharedPreferencesHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // şifreli
        val sharedPreferencesHelper = SharedPreferencesHelper(this)
        sharedPreferencesHelper.addToken("asdasdasdasd")
        sharedPreferencesHelper.addUserId("10001")

        // Şifresiz

        val sharedPreferences = getSharedPreferences("sifresiz", Context.MODE_PRIVATE)
        val editor =sharedPreferences.edit()
        editor.putString("TOKEN","Token")
        editor.putInt("USER_ID",10001)
        editor.apply()


    }
}