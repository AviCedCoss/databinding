package com.example.databinding

import android.content.Context
import android.content.Intent
import com.example.databinding.activity.DataBindFragmentActivity

class Test {

    private fun test(context: Context, i: Int) {
        var intent: Intent? = null
        when (i) {
            1 -> {
                intent = Intent(context, MainActivity::class.java)
                intent = Intent(context, DataBindFragmentActivity::class.java)
                intent = null
            }
            2 -> {
                intent = Intent(context, DataBindFragmentActivity::class.java)
                intent = null
            }
            3 -> {
                intent = null
            }
            else -> intent = null
        }
        if (intent != null) {
            context.startActivity(intent)
        }
    }
}