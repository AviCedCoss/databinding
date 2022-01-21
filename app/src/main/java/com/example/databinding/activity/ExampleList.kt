package com.example.databinding.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.databinding.MainActivity
import com.example.databinding.R
import kotlinx.android.synthetic.main.activity_exmaple_list.*

class ExampleList : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        //TODO("not implemented")
        val intent: Intent?
        when (p2) {
            0 -> {
                intent = Intent(this, MainActivity::class.java)
            }
            1 -> {
                intent = Intent(this, DataBindFragmentActivity::class.java)
            }
            2 -> {
                intent = Intent(this, JavaTwoWayBinding::class.java)
            }

            else -> intent = null
        }

        if (intent != null) {
            startActivity(intent)
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exmaple_list)

        lv_sample.onItemClickListener = this
    }
}