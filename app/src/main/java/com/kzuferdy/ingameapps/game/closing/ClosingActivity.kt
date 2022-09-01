package com.kzuferdy.ingameapps.game.closing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.game.content.Content3Activity
import com.kzuferdy.ingameapps.home.HomeActivity
import kotlinx.android.synthetic.main.activity_introduction1.*

class ClosingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_closing)
        tv_lanjut.setOnClickListener {
            var intent = Intent(this@ClosingActivity, HomeActivity::class.java)
            startActivity(intent)
        }
        iv_start.setOnClickListener {
            var intent = Intent(this@ClosingActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}