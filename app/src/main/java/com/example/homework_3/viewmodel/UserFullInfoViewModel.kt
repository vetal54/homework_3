package com.example.homework_3.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homework_3.UserData
import com.example.homework_3.UserInfo
import com.example.homework_3.database.UserDatabase

class UserFullInfoViewModel(application: Application) : AndroidViewModel(application) {
    private var usersData: UserData = UserData()

    private val _userLiveData = MutableLiveData<List<UserInfo>>()
    val userLiveData: LiveData<List<UserInfo>> = _userLiveData

    private val database = UserDatabase.getInstance(application).userDatabaseDao

    fun fillUpDatabase() {
        if (database.isEmpty() == null) {
            for (user in usersData.usersList.value!!) {
                database.insert(user)
            }
        }
    }

    fun loadUsersData() {
        _userLiveData.value = database.getAll()
    }

    fun updateUserInfo(user: UserInfo) {
        database.update(user)
    }
}