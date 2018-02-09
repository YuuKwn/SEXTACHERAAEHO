package com.dsclp.yuukwn.sextacheraaeho

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao.setOnClickListener {
            val geradorNumero = Random()
            label.text = geradorNumero.nextInt(10231).toString()
        }
    }
}
