package com.example.homework_3.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.R
import com.example.homework_3.viewmodel.UserFullInfoViewModel
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: UserFullInfoViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @SuppressLint("CutPasteId")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.edit_profile_menu) {
            val arr = arrayListOf<View>(
                findViewById(R.id.button0),
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
                findViewById(R.id.button5),
                findViewById(R.id.button6)
            )
            for (btn in arr) {
                btn.setOnClickListener { onClickEdit(arr.indexOf(btn)) }
                btn.visibility = View.VISIBLE
            }
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun viewModel() {
        viewModel = ViewModelProvider(this)[UserFullInfoViewModel::class.java]

        val user0: LinearLayout = findViewById(R.id.layout0)
        val user1: LinearLayout = findViewById(R.id.layout1)
        val user2: LinearLayout = findViewById(R.id.layout2)
        val user3: LinearLayout = findViewById(R.id.layout3)
        val user4: LinearLayout = findViewById(R.id.layout4)
        val user5: LinearLayout = findViewById(R.id.layout5)
        val user6: LinearLayout = findViewById(R.id.layout6)

        val userName0: TextView = findViewById(R.id.userName0)
        val userName1: TextView = findViewById(R.id.userName1)
        val userName2: TextView = findViewById(R.id.userName2)
        val userName3: TextView = findViewById(R.id.userName3)
        val userName4: TextView = findViewById(R.id.userName4)
        val userName5: TextView = findViewById(R.id.userName5)
        val userName6: TextView = findViewById(R.id.userName6)

        val lastSeen0: TextView = findViewById(R.id.lastSeen0)
        val lastSeen1: TextView = findViewById(R.id.lastSeen1)
        val lastSeen2: TextView = findViewById(R.id.lastSeen2)
        val lastSeen3: TextView = findViewById(R.id.lastSeen3)
        val lastSeen4: TextView = findViewById(R.id.lastSeen4)
        val lastSeen5: TextView = findViewById(R.id.lastSeen5)
        val lastSeen6: TextView = findViewById(R.id.lastSeen6)

        val userPhoto0: CircleImageView = findViewById(R.id.profile_image0)
        val userPhoto1: CircleImageView = findViewById(R.id.profile_image1)
        val userPhoto2: CircleImageView = findViewById(R.id.profile_image2)
        val userPhoto3: CircleImageView = findViewById(R.id.profile_image3)
        val userPhoto4: CircleImageView = findViewById(R.id.profile_image4)
        val userPhoto5: CircleImageView = findViewById(R.id.profile_image5)
        val userPhoto6: CircleImageView = findViewById(R.id.profile_image6)


        viewModel.fillUpDatabase()
        viewModel.loadUsersData()
        viewModel.userLiveData.observe(this, Observer {

            userName0.text = it[0].name
            lastSeen0.text = it[0].wasOnline
            userPhoto0.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[0].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user0.setOnClickListener { onClick(0) }

            userName1.text = it[1].name
            lastSeen1.text = it[1].wasOnline
            userPhoto1.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[1].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user1.setOnClickListener { onClick(1) }

            userName2.text = it[2].name
            lastSeen2.text = it[2].wasOnline
            userPhoto2.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[2].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user2.setOnClickListener { onClick(2) }

            userName3.text = it[3].name
            lastSeen3.text = it[3].wasOnline
            userPhoto3.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[3].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user3.setOnClickListener { onClick(3) }

            userName4.text = it[4].name
            lastSeen4.text = it[4].wasOnline
            userPhoto4.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[4].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user4.setOnClickListener { onClick(4) }

            userName5.text = it[5].name
            lastSeen5.text = it[5].wasOnline
            userPhoto5.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[5].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user5.setOnClickListener { onClick(5) }

            userName6.text = it[6].name
            lastSeen6.text = it[6].wasOnline
            userPhoto6.setImageDrawable(
                getDrawable(
                    resources.getIdentifier(
                        it[6].avaPhoto,
                        null,
                        packageName
                    )
                )
            )
            user6.setOnClickListener { onClick(6) }
        })
    }

    private fun onClick(index: Int) {
        val intent = Intent(this, UserFullInfoActivity::class.java)
        intent.putExtra("id", index)
        startActivity(intent)

    }

    private fun onClickEdit(index: Int) {
        val intent = Intent(this, EditProfile::class.java)
        intent.putExtra("id", index)
        startActivity(intent)
    }
}


