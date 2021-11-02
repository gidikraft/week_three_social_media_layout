package com.example.weekthreemedialayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //condition statement to check the current theme
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.Theme_WeekThreeMediaLayout) //when dark mode is enabled, we use the dark theme
        } else {
            setTheme(R.style.Theme_WeekThreeMediaLayout)  //default app theme
        }

        var switch : Switch = findViewById(R.id.theme_switch)
        switch.setOnCheckedChangeListener { _, isChecked -> //set onCheckListener to listen for when the switch button is pressed
            if (isChecked) {                              //a check if the switch is on
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }


}