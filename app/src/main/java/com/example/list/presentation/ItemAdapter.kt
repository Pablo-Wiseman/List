package com.example.list.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.list.databinding.ItemDisabledBinding
import com.example.list.databinding.ItemEnabledBinding
import com.example.list.domain.Item

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    
    var list = listOf<Item>()
    
    fun setData(data: List<Item>) {
        list = data
        notifyDataSetChanged()
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return when (viewType) {
            TYPE_ENABLED -> {
                ItemEnabledViewHolder(ItemEnabledBinding.inflate(LayoutInflater.from(parent.context)))
            }
            
            TYPE_DISABLED -> {
                ItemDisabledViewHolder(ItemDisabledBinding.inflate(LayoutInflater.from(parent.context)))
            }
            
            else -> throw IllegalStateException()
        }
    }
    
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }
    
    override fun getItemCount() = list.size
    
    override fun getItemViewType(position: Int): Int {
        return if (list[position].enable) TYPE_ENABLED else TYPE_DISABLED
    }
    
    abstract class ItemViewHolder(binding: ViewBinding): RecyclerView.ViewHolder(binding.root){
        abstract fun bind(item: Item)
    }
    class ItemDisabledViewHolder(private val binding: ItemDisabledBinding) : ItemViewHolder(binding) {
        override fun bind(item: Item) {
            binding.tvName.text = item.name
            binding.tvCount.text = item.count.toString()
        }
    }
    
    class ItemEnabledViewHolder(private val binding: ItemEnabledBinding) : ItemViewHolder(binding) {
        override fun bind(item: Item) {
            binding.tvName.text = item.name
            binding.tvCount.text = item.count.toString()
        }
    }
    
    companion object {
        private const val TYPE_ENABLED = 100
        private const val TYPE_DISABLED = 101
    }
}