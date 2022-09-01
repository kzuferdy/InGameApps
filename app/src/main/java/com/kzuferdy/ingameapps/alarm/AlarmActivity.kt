package com.kzuferdy.ingameapps.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kzuferdy.ingameapps.R
import kotlinx.android.synthetic.main.activity_alarm.*

class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        btn_set.setOnClickListener {
            var sec = editTextNumber.text.toString().toInt()
            var i = Intent(applicationContext, MyBroadcastReceiver::class.java)
            var pi = PendingIntent.getBroadcast(applicationContext,111,i,0)
            var am : AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (sec*1000),pi)
            Toast.makeText(applicationContext,"Alarm Is For set $sec Seconds",Toast.LENGTH_LONG).show()

        }
    }
}