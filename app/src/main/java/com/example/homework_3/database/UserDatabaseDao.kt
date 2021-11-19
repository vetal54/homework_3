package com.example.homework_3.database

import androidx.room.*
import com.example.homework_3.UserInfo

@Dao
interface UserDatabaseDao {
    @Insert
    fun insert(user: UserInfo)

    @Update
    fun update(user: UserInfo)

    @Query("SELECT * from users_full_info WHERE id = :key")
    fun get(key: Int): UserInfo?

    @Query("SELECT * from users_full_info")
    fun getAll(): List<UserInfo>

    @Query("SELECT * from users_full_info LIMIT 1")
    fun isEmpty(): UserInfo?

    @Delete
    fun delete(user: UserInfo)
}