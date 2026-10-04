package com.example.deallflow360

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DealDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_deal_details)

        val company = intent.getStringExtra("company")
        val dealId = intent.getStringExtra("dealId")
        val value = intent.getStringExtra("value")
        val status = intent.getStringExtra("status")
        val risk = intent.getStringExtra("risk")

        val tvCompany = findViewById<TextView>(R.id.tvCompany)
        val tvDealId = findViewById<TextView>(R.id.tvDealId)
        val tvValue = findViewById<TextView>(R.id.tvValue)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val tvRisk = findViewById<TextView>(R.id.tvRisk)

        if (company != null) tvCompany.text = company
        if (dealId != null) tvDealId.text = "Deal ID: $dealId"
        if (value != null) tvValue.text = value
        if (status != null) tvStatus.text = status
        if (risk != null) tvRisk.text = risk

        val btnRisk = findViewById<Button>(R.id.btnRisk)
        val btnApproval = findViewById<Button>(R.id.btnApproval)
        val btnNegotiation = findViewById<Button>(R.id.btnNegotiation)

        btnRisk.setOnClickListener {
            startActivity(Intent(this, RiskActivity::class.java))
        }

        btnApproval.setOnClickListener {
            startActivity(Intent(this, ApprovalActivity::class.java))
        }

        btnNegotiation.setOnClickListener {
            startActivity(Intent(this, NegotiationActivity::class.java))
        }
    }
}
