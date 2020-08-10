package com.sd.tst.aop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sd.tst.aop.databinding.ActivityMainBinding
import com.sd.tst.ui.UiActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            val intent = Intent(this, UiActivity::class.java)
            startActivity(intent)
        }
    }
}