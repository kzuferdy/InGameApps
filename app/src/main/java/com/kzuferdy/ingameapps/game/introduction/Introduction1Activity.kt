package com.kzuferdy.ingameapps.game.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import kotlinx.android.synthetic.main.activity_introduction1.*

class Introduction1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction1)

        tv_lanjut.setOnClickListener {
            var intent = Intent(this@Introduction1Activity, Introduction2Activity::class.java)
            startActivity(intent)
        }
        iv_start.setOnClickListener {
            var intent = Intent(this@Introduction1Activity, Introduction2Activity::class.java)
            startActivity(intent)
        }

    }
}