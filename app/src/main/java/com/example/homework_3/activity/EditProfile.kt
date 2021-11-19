package com.example.homework_3.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.R
import com.example.homework_3.UserInfo
import com.example.homework_3.viewmodel.UserFullInfoViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import de.hdodenhof.circleimageview.CircleImageView

class EditProfile : AppCompatActivity() {
    private lateinit var viewModel: UserFullInfoViewModel
    private var index : Int = -1

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        findViewById<FloatingActionButton>(R.id.floatingActionButton5).setOnClickListener(){ saveEdit() }
        viewModel = ViewModelProvider(this)[UserFullInfoViewModel::class.java]

        val userName: EditText = findViewById(R.id.userName)
        val userAva: CircleImageView = findViewById(R.id.profile_image)
        val userInfo: EditText = findViewById(R.id.userInfo)
        val following: EditText = findViewById(R.id.followingText)
        val followers: EditText = findViewById(R.id.followerText)
        val socialScore: EditText = findViewById(R.id.socialScoreText)
        val posts: EditText = findViewById(R.id.postsText)
        val reach: EditText = findViewById(R.id.reachText)
        val sharemeter: EditText = findViewById(R.id.sharemeterText)

        val arguments = intent.extras
        index = arguments?.getInt("id")!!
        viewModel.loadUsersData()

        viewModel.userLiveData.observe(this, Observer {
            userName.setText(it[index!!].name)
            userAva.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[index].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            userInfo.setText(it[index].aboutUser)
            following.setText(it[index].following)
            followers.setText(it[index].followers)
            socialScore.setText(it[index].socialScore)
            posts.setText(it[index].posts)
            reach.setText(it[index].reach)
            sharemeter.setText(it[index].sharemeter)
        })
    }

    private fun saveEdit () {
        val userName = findViewById<EditText>(R.id.userName).text.toString()
        val userInfo = findViewById<EditText>(R.id.userInfo).text.toString()
        val following  = findViewById<EditText>(R.id.followingText).text.toString()
        val followers = findViewById<EditText>(R.id.followerText).text.toString()
        val socialScore = findViewById<EditText>(R.id.socialScoreText).text.toString()
        val posts = findViewById<EditText>(R.id.postsText).text.toString()
        val reach = findViewById<EditText>(R.id.reachText).text.toString()
        val sharemeter = findViewById<EditText>(R.id.sharemeterText).text.toString()
        val saveEdit = UserInfo(
            index,
            userName,
            viewModel.userLiveData.value!!.get(index).avaPhoto,
            viewModel.userLiveData.value!!.get(index).wasOnline ,
            userInfo,
            followers,
            following,
            socialScore,
            posts,
            reach,
            sharemeter
        )
        viewModel.updateUserInfo(saveEdit)
        val intent = Intent(this, MainActivity::class.java)
        this.finish()
        startActivity(intent)
    }
}