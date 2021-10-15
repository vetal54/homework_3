package com.example.homework_3

class UserData {
    companion object{
        const val AVATAR_0 = "@drawable/avatar"
        const val AVATAR_1 = "@drawable/avatar1"
        const val AVATAR_2 = "@drawable/avatar2"
        const val AVATAR_3 = "@drawable/avatar3"
        const val AVATAR_4 = "@drawable/avatar4"
        const val AVATAR_5 = "@drawable/avatar5"
        const val AVATAR_6 = "@drawable/avatar6"
    }

    var usersArrayList : ArrayList<UserInfo> = ArrayList()
    init{
        usersArrayList.add(
            UserInfo(
                "Adam", AVATAR_0, "12 min ago", "My name is Adam. I`m 25 and I am from USA. I love programing!)", "450" , "55", "15", "0.9K", "1.1M", "11"
            )
        )

        usersArrayList.add(
            UserInfo(
                "Frank", AVATAR_1, "online", "My name is Frank. I`m 35 and I am from France. I love football!)", "550" , "102", "11", "1.9K", "1.4M", "21"
            )
        )

        usersArrayList.add(
            UserInfo(
                "Tommy", AVATAR_2, "30 min ago", "My name is Tommy. I`m 28 and I am from Ukraine. I love basketball!)", "1450" , "15", "15", "2.9K", "3.8M", "31"
            )
        )
        usersArrayList.add(
            UserInfo(
                "Elizabeth", AVATAR_3, "1 hour ago", "My name is Elizabeth. I`m 20 and I am from USA. I love dancing!)", "340" , "95", "25", "0.6K", "2.1M", "41"
            )
        )

        usersArrayList.add(
            UserInfo(
                "Emily", AVATAR_4, "recently", "My name is Emily. I`m 25 and I am from Brazil. I love reading!)", "150" , "155", "45", "1.9K", "0.1M", "11"
            )
        )

        usersArrayList.add(
            UserInfo(
                "Harry", AVATAR_5, "yesterday", "My name is harry. I`m 25 and I am from USA. I love writing!)", "450" , "55", "15", "0.9K", "1.1M", "16"
            )
        )

        usersArrayList.add(
            UserInfo(
                "Dave", AVATAR_6, "5 hour ago", "My name is Dave. I`m 25 and I am from Italy. I love running!)", "750" , "955", "95", "0.6K", "5.1M", "51"
            )
        )

    }
}