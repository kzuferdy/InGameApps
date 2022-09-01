package com.kzuferdy.ingameapps.game.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.game.content.Content1Activity
import kotlinx.android.synthetic.main.activity_introduction1.*

class Introduction3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction3)

        tv_lanjut.setOnClickListener {
            var intent = Intent(this@Introduction3Activity, Content1Activity::class.java)
            startActivity(intent)
        }
        iv_start.setOnClickListener {
            var intent = Intent(this@Introduction3Activity, Content1Activity::class.java)
            startActivity(intent)
        }
    }
}