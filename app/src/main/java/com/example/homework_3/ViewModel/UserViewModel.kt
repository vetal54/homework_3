package com.example.homework_3.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homework_3.UserData

class UserViewModel : ViewModel() {

    val userData: UserData = UserData()

    var userLiveData = MutableLiveData<UserData>()

    fun loadUserData(){
        userLiveData.value = userData
    }
}