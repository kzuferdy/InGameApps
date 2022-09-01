package com.kzuferdy.ingameapps.game.content

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.game.introduction.Introduction3Activity
import kotlinx.android.synthetic.main.activity_introduction1.*

class Content1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content1)

        tv_lanjut.setOnClickListener {
            var intent = Intent(this@Content1Activity, Content2Activity::class.java)
            startActivity(intent)
        }
        iv_start.setOnClickListener {
            var intent = Intent(this@Content1Activity, Content2Activity::class.java)
            startActivity(intent)
        }
    }
}