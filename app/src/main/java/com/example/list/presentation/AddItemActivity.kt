package com.example.list.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.list.R
import com.example.list.databinding.ActivityAddItemBinding

class AddItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddItemBinding
    private lateinit var viewModel: AddItemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}