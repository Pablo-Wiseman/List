package com.example.list.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.list.App
import com.example.list.data.ItemDao
import com.example.list.data.ItemDatabase
import com.example.list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.btnAddItem.setOnClickListener {
            val intent = Intent(this, AddItemActivity::class.java)
            startActivity(intent)
        }
        
        val adapter = ItemAdapter()
        binding.rvList.adapter = adapter
        
        viewModel.liveData.observe(this) {
            adapter.setData(it)
        }
    }
}