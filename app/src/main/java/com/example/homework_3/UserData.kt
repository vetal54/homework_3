package com.example.homework_3

import androidx.lifecycle.MutableLiveData

class UserData {
    companion object {
        const val AVATAR_0 = "@drawable/avatar"
        const val AVATAR_1 = "@drawable/avatar1"
        const val AVATAR_2 = "@drawable/avatar2"
        const val AVATAR_3 = "@drawable/avatar3"
        const val AVATAR_4 = "@drawable/avatar4"
        const val AVATAR_5 = "@drawable/avatar5"
        const val AVATAR_6 = "@drawable/avatar6"
    }

    private var _usersList = MutableLiveData<ArrayList<UserInfo>>().apply {value = ArrayList()
        value!!.add(
            UserInfo(0,
                "Adam",
                AVATAR_0,
                "12 min ago",
                "My name is Adam. I`m 25 and I am from USA. I love programing!)",
                "450",
                "55",
                "15",
                "0.9K",
                "1.1M",
                "11"))
        value!!.add(
            UserInfo(
                1,
                "Frank",
                AVATAR_1,
                "online",
                "My name is Frank. I`m 35 and I am from France. I love football!)",
                "550",
                "102",
                "11",
                "1.9K",
                "1.4M",
                "21"
            ))

        value!!.add(
            UserInfo(
                2,
                "Tommy",
                AVATAR_2,
                "30 min ago",
                "My name is Tommy. I`m 28 and I am from Ukraine. I love basketball!)",
                "1450",
                "15",
                "15",
                "2.9K",
                "3.8M",
                "31"
            ))
        value!!.add(
            UserInfo(
                3,
                "Elizabeth",
                AVATAR_3,
                "1 hour ago",
                "My name is Elizabeth. I`m 20 and I am from USA. I love dancing!)",
                "340",
                "95",
                "25",
                "0.6K",
                "2.1M",
                "41"
            ))

        value!!.add(
            UserInfo(
                4,
                "Emily",
                AVATAR_4,
                "recently",
                "My name is Emily. I`m 25 and I am from Brazil. I love reading!)",
                "150",
                "155",
                "45",
                "1.9K",
                "0.1M",
                "11"
            ))

        value!!.add(
            UserInfo(
                5,
                "Harry",
                AVATAR_5,
                "yesterday",
                "My name is harry. I`m 25 and I am from USA. I love writing!)",
                "450",
                "55",
                "15",
                "0.9K",
                "1.1M",
                "16"
            ))

        value!!.add(
            UserInfo(
                6,
                "Dave",
                AVATAR_6,
                "5 hour ago",
                "My name is Dave. I`m 25 and I am from Italy. I love running!)",
                "750",
                "955",
                "95",
                "0.6K",
                "5.1M",
                "51"
            )
        )
    }
    var usersList = _usersList
    /* var usersList =  listOf(
             UserInfo(0,
                 "Adam",
                 AVATAR_0,
                 "12 min ago",
                 "My name is Adam. I`m 25 and I am from USA. I love programing!)",
                 "450",
                 "55",
                 "15",
                 "0.9K",
                 "1.1M",
                 "11"),

             UserInfo(
                 1,
                 "Frank",
                 AVATAR_1,
                 "online",
                 "My name is Frank. I`m 35 and I am from France. I love football!)",
                 "550",
                 "102",
                 "11",
                 "1.9K",
                 "1.4M",
                 "21"
             ),


             UserInfo(
                 2,
                 "Tommy",
                 AVATAR_2,
                 "30 min ago",
                 "My name is Tommy. I`m 28 and I am from Ukraine. I love basketball!)",
                 "1450",
                 "15",
                 "15",
                 "2.9K",
                 "3.8M",
                 "31"
             ),

             UserInfo(
                 3,
                 "Elizabeth",
                 AVATAR_3,
                 "1 hour ago",
                 "My name is Elizabeth. I`m 20 and I am from USA. I love dancing!)",
                 "340",
                 "95",
                 "25",
                 "0.6K",
                 "2.1M",
                 "41"
             ),


             UserInfo(
                 4,
                 "Emily",
                 AVATAR_4,
                 "recently",
                 "My name is Emily. I`m 25 and I am from Brazil. I love reading!)",
                 "150",
                 "155",
                 "45",
                 "1.9K",
                 "0.1M",
                 "11"
             ),


             UserInfo(
                 5,
                 "Harry",
                 AVATAR_5,
                 "yesterday",
                 "My name is harry. I`m 25 and I am from USA. I love writing!)",
                 "450",
                 "55",
                 "15",
                 "0.9K",
                 "1.1M",
                 "16"
             ),

             UserInfo(
                 6,
                 "Dave",
                 AVATAR_6,
                 "5 hour ago",
                 "My name is Dave. I`m 25 and I am from Italy. I love running!)",
                 "750",
                 "955",
                 "95",
                 "0.6K",
                 "5.1M",
                 "51"
             )
         )*/
}