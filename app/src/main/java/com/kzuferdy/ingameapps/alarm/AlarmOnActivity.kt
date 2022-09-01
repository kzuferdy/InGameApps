package com.kzuferdy.ingameapps.alarm

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kzuferdy.ingameapps.R
import kotlinx.android.synthetic.main.activity_alarm_on.*

class AlarmOnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_on)
        var mp = MediaPlayer.create(applicationContext, R.raw.best_alarm)
        mp.start()
        btn_set_off.setOnClickListener {
            mp.stop()
        }
    }
}