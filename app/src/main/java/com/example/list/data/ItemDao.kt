package com.example.list.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.list.domain.Item

@Dao
interface ItemDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addItem(item: Item)
    
    @Delete
    suspend fun deleteItem(item: Item)
    
    @Query("SELECT * FROM item_table")
    fun getItemList(): LiveData<List<Item>>
    
    @Query("SELECT * FROM item_table WHERE id = :itemId")
    fun getItem(itemId: Int): Item
    
}