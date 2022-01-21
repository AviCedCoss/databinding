package com.example.databinding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.databinding.R
import com.example.databinding.databinding.FragmentDataBindBinding
import com.example.databinding.model.DataBindingKotlinModel

class DataBindFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDataBindBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_data_bind,
                container, false
            )
        val myView: View = binding.root


        // setting values to model
        val user = DataBindingKotlinModel("Avinash", "Srivastava")
        binding.model = user

        return myView
    }
}