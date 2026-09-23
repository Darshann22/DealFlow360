package com.example.deallflow360

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)

        val dealsSection = findViewById<LinearLayout>(R.id.dealsSection)
        dealsSection?.setOnClickListener {
            startActivity(Intent(this, DealsActivity::class.java))
        }
    }
}
