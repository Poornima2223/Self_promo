package com.example.selfpromoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private var contactNameEditText: TextInputEditText? = null
    private var contactNumberEditText: TextInputEditText? = null
    private var displayNameEditText: TextInputEditText? = null
    private var juniorCheckBox: CheckBox? = null
    private var intermediateStartCheckBox: CheckBox? = null
    private var jobInfoSpinner: Spinner? = null
    private var startDate: TextInputEditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactNameEditText = findViewById(R.id.edit_text_contact_name)
        contactNumberEditText = findViewById(R.id.edit_text_contact_number)
        displayNameEditText = findViewById(R.id.edit_text_display_name)
        juniorCheckBox = findViewById(R.id.checkbox_include_junior)
        intermediateStartCheckBox = findViewById(R.id.checkbox_immediate_start)
        jobInfoSpinner = findViewById(R.id.spinner_item1)
        startDate = findViewById(R.id.edit_text_available_date)

        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {
            onPreviewClicked()
        }
        val spinnerValues: Array<String> = arrayOf("title1", "title2", "title3")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        val jobInfo : String  = jobInfoSpinner?.onItemSelectedListener.toString()
        jobInfoSpinner.adapter = spinnerAdapter



    }

    private fun onPreviewClicked() {
        val previewIntent: Intent = Intent(this, PreviewActivity::class.java)

        previewIntent.putExtra("Contact Name", contactNameEditText?.text.toString())
        previewIntent.putExtra("Contact Number", contactNumberEditText?.text.toString())
        previewIntent.putExtra("Display Name", displayNameEditText?.text.toString())
        previewIntent.putExtra("Include Junior", juniorCheckBox?.text.toString())
        previewIntent.putExtra("Immediate start", intermediateStartCheckBox?.text.toString())
        previewIntent.putExtra("Job Info", jobInfoSpinner?.onItemSelectedListener.toString())
        previewIntent.putExtra("Start date", startDate?.text.toString())





        startActivity(previewIntent)

    }


}