package com.example.deallflow360

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DealsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_deals)

        val deal1 = findViewById<LinearLayout>(R.id.deal1)
        val deal2 = findViewById<LinearLayout>(R.id.deal2)
        val deal3 = findViewById<LinearLayout>(R.id.deal3)

        deal1.setOnClickListener {
            openDealDetails(
                "ABC Corporation",
                "DL001",
                "₹12,50,000",
                "Pending Approval",
                "Medium"
            )
        }

        deal2.setOnClickListener {
            openDealDetails(
                "XYZ Industries",
                "DL002",
                "₹8,40,000",
                "Negotiation",
                "Low"
            )
        }

        deal3.setOnClickListener {
            openDealDetails(
                "TechNova Ltd",
                "DL003",
                "₹15,20,000",
                "Approved",
                "Low"
            )
        }
    }

    private fun openDealDetails(
        company: String,
        dealId: String,
        value: String,
        status: String,
        risk: String
    ) {

        val intent = Intent(this, DealDetailsActivity::class.java)

        intent.putExtra("company", company)
        intent.putExtra("dealId", dealId)
        intent.putExtra("value", value)
        intent.putExtra("status", status)
        intent.putExtra("risk", risk)

        startActivity(intent)
    }
}