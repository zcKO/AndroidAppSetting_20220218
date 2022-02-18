package com.jc.androidappsetting_20220218

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        화면 이동 ~ 로딩화면 종료를, 2.5초 후에 실행시키고 싶다.
//        UI 동작을 담당하는 Thread 에게, 2.5초 후에 이동하는 코드를 실행시켜 달라고 등록.
//        등록 해주는 클래스 - Handler
        val myHandler = Handler(Looper.getMainLooper()) // Main Thread 와 통신하는 Handler 생성
        myHandler.postDelayed({
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

//        화면을 이동하고 나면, 로딩화면을 유지할 필요가 없다.
            finish()
        }, 2500)


    }
}