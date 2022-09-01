package com.kzuferdy.ingameapps.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.game.introduction.Introduction1Activity
import kotlinx.android.synthetic.main.activity_game_onboarding_screen.*

class GameOnboardingScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_onboarding_screen)

        btn_start.setOnClickListener {
            var intent = Intent(this@GameOnboardingScreenActivity,Introduction1Activity::class.java)
            startActivity(intent)
        }

    }
}