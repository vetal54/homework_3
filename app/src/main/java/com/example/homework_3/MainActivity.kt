package com.example.homework_3

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.ViewModel.UserViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        val user1: LinearLayout = findViewById(R.id.layout1)
        val user2: LinearLayout = findViewById(R.id.layout2)
        val user3: LinearLayout = findViewById(R.id.layout3)
        val user4: LinearLayout = findViewById(R.id.layout4)
        val user5: LinearLayout = findViewById(R.id.layout5)
        val user6: LinearLayout = findViewById(R.id.layout6)
        val user7: LinearLayout = findViewById(R.id.layout7)

        viewModel.loadUserData()

        user1.setOnClickListener{ onClick(0) }
        user2.setOnClickListener{ onClick(1) }
        user3.setOnClickListener{ onClick(2) }
        user4.setOnClickListener{ onClick(3) }
        user5.setOnClickListener{ onClick(4) }
        user6.setOnClickListener{ onClick(5) }
        user7.setOnClickListener{ onClick(6) }


    }

    private fun onClick(index:Int) {
        val intent = Intent(this, UserFullInfo::class.java)
        intent.putExtra("id", index)
        startActivity(intent)
    }
}


