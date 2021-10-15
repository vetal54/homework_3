package com.example.homework_3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.ViewModel.UserViewModel
import de.hdodenhof.circleimageview.CircleImageView


class UserFullInfo : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_full_info)

        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        val userName: TextView = findViewById(R.id.userName)
        val userAva : CircleImageView = findViewById(R.id.profile_image)
        val userInfo: TextView = findViewById(R.id.userInfo)
        val following: TextView = findViewById(R.id.followingText)
        val followers: TextView = findViewById(R.id.followerText)
        val socialScore: TextView = findViewById(R.id.socialScoreText)
        val posts: TextView = findViewById(R.id.postsText)
        val reach: TextView = findViewById(R.id.reachText)
        val sharemeter: TextView = findViewById(R.id.sharemeterText)

        val arguments = intent.extras
        val index = arguments?.getInt("id")
        viewModel.loadUserData()

        viewModel.userLiveData.observe(this, Observer {
            userName.text = it.usersArrayList[index!!].name
            userAva.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[index].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            userInfo.text = it.usersArrayList[index].aboutUser
            following.text = it.usersArrayList[index].following
            followers.text = it.usersArrayList[index].followers
            socialScore.text = it.usersArrayList[index].socialScore
            posts.text = it.usersArrayList[index].posts
            reach.text = it.usersArrayList[index].reach
            sharemeter.text = it.usersArrayList[index].sharemeter
        })
    }
}