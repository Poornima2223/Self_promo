package com.example.selfpromoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val messageTextView : TextView = findViewById(R.id.text_view_message)
        val detailsTextView : TextView = findViewById(R.id.text_view_details)

        messageTextView.text.toString()

         val contactName = intent.getStringExtra("Contact Name")
        val contactNumber = intent.getStringExtra("Contact Number")
        val displayName = intent.getStringExtra("Display Name")
        val includeJunior = intent.getStringExtra("Include Junior")
        val intermediateStart = intent.getStringExtra("Intermediate start")
        val jobInfo = intent.getStringExtra("Job Info")
        val startDate = intent.getStringExtra("Start date")

        val testString = "$contactName \n $contactNumber\n $displayName\n $includeJunior\n $intermediateStart\n $jobInfo\n $startDate"

        detailsTextView.text = testString
    }
}