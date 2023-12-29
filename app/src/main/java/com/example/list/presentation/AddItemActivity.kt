package com.example.list.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.list.App
import com.example.list.R
import com.example.list.data.ItemDao
import com.example.list.databinding.ActivityAddItemBinding
import com.example.list.domain.Item
import kotlinx.coroutines.launch

class AddItemActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityAddItemBinding
    private lateinit var viewModel: AddItemViewModel
    private lateinit var dao: ItemDao
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        dao = (application as App).db.itemDao()
        
        binding.btnSaveItem.setOnClickListener {
            lifecycleScope.launch {
                dao.addItem(
                    Item(
                        name = binding.etName.text.toString(),
                        count = binding.etCount.text.toString().toInt(),
                        enable = true
                    )
                )
            }
        }
    }
}