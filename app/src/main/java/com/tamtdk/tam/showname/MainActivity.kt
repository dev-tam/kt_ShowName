package com.tamtdk.tam.showname

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() { // MainActivity extends AppCompactActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var enteredText = enterNameEdt.text // get data from text input field and store in enteredText
        showNameButton.setOnClickListener { resultId.text = enteredText }
    }
}
