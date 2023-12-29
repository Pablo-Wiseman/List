package com.example.list.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.list.App
import com.example.list.data.RepositoryImpl
import com.example.list.domain.GetItemListUseCase

class MainViewModel(app: Application): AndroidViewModel(app) {

    private val dao = (app as App).db.itemDao()
    private val getItemListUseCase = GetItemListUseCase(RepositoryImpl(dao))
    
    val liveData = getItemListUseCase.getItemList()
}