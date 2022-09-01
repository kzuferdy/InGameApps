package com.kzuferdy.ingameapps.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.kzuferdy.ingameapps.OnboardingActivity
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.alarm.AlarmActivity
import com.kzuferdy.ingameapps.game.GameOnboardingScreenActivity
import com.kzuferdy.ingameapps.kegiatan.KegiatanActivity
import com.kzuferdy.ingameapps.kuisioner.MainKuisionerActivity
import kotlinx.android.synthetic.main.activity_game_onboarding_screen.*
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        iv_alarm.setOnClickListener {
            var intent = Intent(this@HomeActivity, AlarmActivity::class.java)
            startActivity(intent)
        }
        iv_kegiatan.setOnClickListener {
            var intent = Intent(this@HomeActivity, KegiatanActivity::class.java)
            startActivity(intent)
        }
       iv_game_edu.setOnClickListener {
           var intent = Intent(this@HomeActivity, GameOnboardingScreenActivity::class.java)
           startActivity(intent)
       }
        iv_kuiz.setOnClickListener {
           var intent = Intent(this@HomeActivity, MainKuisionerActivity::class.java)
           startActivity(intent)
       }

    }
}