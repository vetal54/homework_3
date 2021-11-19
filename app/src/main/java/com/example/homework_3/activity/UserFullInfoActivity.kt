package com.example.homework_3.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.R
import com.example.homework_3.viewmodel.UserFullInfoViewModel
import de.hdodenhof.circleimageview.CircleImageView


class UserFullInfoActivity : AppCompatActivity() {

    private lateinit var viewModel: UserFullInfoViewModel

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_full_info)

        viewModel = ViewModelProvider(this)[UserFullInfoViewModel::class.java]

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
        viewModel.loadUsersData()

        viewModel.userLiveData.observe(this, Observer {
            userName.text = it[index!!].name
            userAva.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[index].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            userInfo.text = it[index].aboutUser
            following.text = it[index].following
            followers.text = it[index].followers
            socialScore.text = it[index].socialScore
            posts.text = it[index].posts
            reach.text = it[index].reach
            sharemeter.text = it[index].sharemeter
        })
    }
}