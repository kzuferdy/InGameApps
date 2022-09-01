package com.kzuferdy.ingameapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.home.HomeActivity
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        btn_start.setOnClickListener {
            var intent = Intent(this@OnboardingActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}