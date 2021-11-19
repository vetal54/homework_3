package com.example.homework_3

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users_full_info")
data class UserInfo(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "avatar") val avaPhoto: String,
    @ColumnInfo(name = "wasOnline") val wasOnline: String,
    @ColumnInfo(name = "aboutUser") val aboutUser: String,
    @ColumnInfo(name = "followers") val followers: String,
    @ColumnInfo(name = "following") val following: String,
    @ColumnInfo(name = "socialScore") val socialScore: String,
    @ColumnInfo(name = "posts") val posts: String,
    @ColumnInfo(name = "reach") val reach: String,
    @ColumnInfo(name = "sharemeter") val sharemeter: String
)