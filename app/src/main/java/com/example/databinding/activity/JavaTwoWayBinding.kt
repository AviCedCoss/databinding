package com.example.databinding.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.databinding.BR
import com.example.databinding.R
import com.example.databinding.model.MyModel

class JavaTwoWayBinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val binding =
            DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_java_two_way_binding)
        val myModel = MyModel("Test")
        binding.setVariable(BR.viewModel, myModel)
        binding.executePendingBindings()
    }
}