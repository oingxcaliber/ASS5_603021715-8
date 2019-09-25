package com.example.lab5_603021715_8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab5intent.R
import com.example.lab5intent.SecondActivity
import com.example.lab5intent.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(view:View){
        val intent = Intent( this,SecondActivity::class.java)
        intent.putExtra("stdData",
            Student(IdEDT.text.toString(),nameEDT.text.toString(),ageEDT.text.toString().toInt())
        )
        startActivity(intent)
    }
}
