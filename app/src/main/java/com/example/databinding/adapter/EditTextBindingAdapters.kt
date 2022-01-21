package com.example.databinding.adapter

import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter

object EditTextBindingAdapters {
    @BindingAdapter("textChangedListener")
    fun bindTextWatcher(editText: EditText, textWatcher: TextWatcher?) {
        editText.addTextChangedListener(textWatcher)
    }
}