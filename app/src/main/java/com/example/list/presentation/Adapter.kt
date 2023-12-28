package com.example.list.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.list.domain.Item

class ItemAdapter: RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    val list = listOf<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view)
}