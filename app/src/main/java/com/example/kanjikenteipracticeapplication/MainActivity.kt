package com.example.kanjikenteipracticeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kanjikenteipracticeapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.topButtonLeading.setOnClickListener {
            val intent = Intent(application, LeadingPracticeActivity::class.java)
            startActivity(intent)
        }

        binding.topButtonWriting.setOnClickListener {
            val intent = Intent(application, WritingPracticeActivity::class.java)
            startActivity(intent)
        }

        binding.topButtonOther.setOnClickListener {
            val intent = Intent(application, OtherPracticeActivity::class.java)
            startActivity(intent)
        }

        binding.topButtonConfig.setOnClickListener {
            val intent = Intent(application, WritingPracticeActivity::class.java)
            startActivity(intent)
        }

    }
}