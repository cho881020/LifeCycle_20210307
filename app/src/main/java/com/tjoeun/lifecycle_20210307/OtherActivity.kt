package com.tjoeun.lifecycle_20210307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        Log.d("다른화면", "onCreate실행됨")
    }


}