package com.mokelab.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val f = supportFragmentManager.findFragmentByTag("first")
        if (f == null) {
            val transaction = supportFragmentManager.beginTransaction()

            transaction.add(R.id.container, FirstFragment.newInstance(), "first")

            transaction.commit()
        }
    }
}
