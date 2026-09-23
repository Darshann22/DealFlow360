package com.example.deallflow360

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DealDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deal_details)

        val tvCompany = findViewById<TextView>(R.id.tvCompany)
        val tvDealId = findViewById<TextView>(R.id.tvDealId)
        val tvValue = findViewById<TextView>(R.id.tvValue)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val tvRisk = findViewById<TextView>(R.id.tvRisk)

        val company = intent.getStringExtra("company")
        val dealId = intent.getStringExtra("dealId")
        val value = intent.getStringExtra("value")
        val status = intent.getStringExtra("status")
        val risk = intent.getStringExtra("risk")

        if (company != null) tvCompany.text = company
        if (dealId != null) tvDealId.text = "Deal ID: $dealId"
        if (value != null) tvValue.text = value
        if (status != null) tvStatus.text = status
        if (risk != null) tvRisk.text = risk
    }
}
