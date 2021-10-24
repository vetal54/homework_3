package com.example.homework_3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.ViewModel.UserFullInfoViewModel
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: UserFullInfoViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun viewModel(){
        viewModel = ViewModelProvider(this).get(UserFullInfoViewModel::class.java)

        val user1: LinearLayout = findViewById(R.id.layout1)
        val user2: LinearLayout = findViewById(R.id.layout2)
        val user3: LinearLayout = findViewById(R.id.layout3)
        val user4: LinearLayout = findViewById(R.id.layout4)
        val user5: LinearLayout = findViewById(R.id.layout5)
        val user6: LinearLayout = findViewById(R.id.layout6)
        val user7: LinearLayout = findViewById(R.id.layout7)

        val userName1: TextView = findViewById(R.id.userName1)
        val userName2: TextView = findViewById(R.id.userName2)
        val userName3: TextView = findViewById(R.id.userName3)
        val userName4: TextView = findViewById(R.id.userName4)
        val userName5: TextView = findViewById(R.id.userName5)
        val userName6: TextView = findViewById(R.id.userName6)
        val userName7: TextView = findViewById(R.id.userName7)

        val lastSeen1: TextView = findViewById(R.id.lastSeen1)
        val lastSeen2: TextView = findViewById(R.id.lastSeen2)
        val lastSeen3: TextView = findViewById(R.id.lastSeen3)
        val lastSeen4: TextView = findViewById(R.id.lastSeen4)
        val lastSeen5: TextView = findViewById(R.id.lastSeen5)
        val lastSeen6: TextView = findViewById(R.id.lastSeen6)
        val lastSeen7: TextView = findViewById(R.id.lastSeen7)

        val userPhoto1: CircleImageView = findViewById(R.id.profile_image)
        val userPhoto2: CircleImageView = findViewById(R.id.profile_image1)
        val userPhoto3: CircleImageView = findViewById(R.id.profile_image3)
        val userPhoto4: CircleImageView = findViewById(R.id.profile_image4)
        val userPhoto5: CircleImageView = findViewById(R.id.profile_image5)
        val userPhoto6: CircleImageView = findViewById(R.id.profile_image6)
        val userPhoto7: CircleImageView = findViewById(R.id.profile_image7)
        viewModel.loadUserData()
        viewModel.userLiveData.observe(this, Observer {

            userName1.text = it.usersArrayList[0].name
            lastSeen1.text = it.usersArrayList[0].wasOnline
            userPhoto1.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[0].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user1.setOnClickListener{ onClick(0) }

            userName2.text = it.usersArrayList[1].name
            lastSeen2.text = it.usersArrayList[1].wasOnline
            userPhoto2.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[1].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user2.setOnClickListener{ onClick(1) }

            userName3.text = it.usersArrayList[2].name
            lastSeen3.text = it.usersArrayList[2].wasOnline
            userPhoto3.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[2].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user3.setOnClickListener{ onClick(2) }

            userName4.text = it.usersArrayList[3].name
            lastSeen4.text = it.usersArrayList[3].wasOnline
            userPhoto4.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[3].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user4.setOnClickListener{ onClick(3) }

            userName5.text = it.usersArrayList[4].name
            lastSeen5.text = it.usersArrayList[4].wasOnline
            userPhoto5.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[4].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user5.setOnClickListener{ onClick(4) }

            userName6.text = it.usersArrayList[5].name
            lastSeen6.text = it.usersArrayList[5].wasOnline
            userPhoto6.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[5].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user6.setOnClickListener{ onClick(5) }

            userName7.text = it.usersArrayList[6].name
            lastSeen7.text = it.usersArrayList[6].wasOnline
            userPhoto7.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it.usersArrayList[6].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user7.setOnClickListener{ onClick(6) }
        })
    }

    private fun onClick(index:Int) {
        val intent = Intent(this, UserFullInfoActivity::class.java)
        intent.putExtra("id", index)
        startActivity(intent)
    }
}


