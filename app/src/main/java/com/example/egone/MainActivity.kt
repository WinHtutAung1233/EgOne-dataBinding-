package com.example.egone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.egone.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.btn1.setOnClickListener {
            var ed_txt1: String = binding.edTxt1.text.toString()
            var ed_txt2: String = binding.edTxt2.text.toString()
            var people: People = People("$ed_txt1", "$ed_txt2")
            binding.people = people

        }
    }

}
