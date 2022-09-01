package com.kzuferdy.ingameapps.game.content

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import com.kzuferdy.ingameapps.game.closing.ClosingActivity
import kotlinx.android.synthetic.main.activity_introduction1.*

class Content3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content3)

        tv_lanjut.setOnClickListener {
            var intent = Intent(this@Content3Activity, ClosingActivity::class.java)
            startActivity(intent)
        }

    }
}