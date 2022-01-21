package com.example.databinding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.databinding.R
import com.example.databinding.fragment.DataBindFragment

class DataBindFragmentActivity : AppCompatActivity() {
    companion object {
        val flag = true
        val app_name: String = if (flag) "Avinash" else "Srivastava"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_bind_fragment)
        supportFragmentManager.beginTransaction().add(R.id.frag_container, DataBindFragment())
            .commit()

    }
}