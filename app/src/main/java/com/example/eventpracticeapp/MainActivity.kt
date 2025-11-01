package com.example.eventpracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.eventpracticeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val name = binding.nameEditText.text.toString().trim()
            val ageString = binding.ageEditText.text.toString().trim()

            if (name.isEmpty() || ageString.isEmpty()) {
                Toast.makeText(this, getString(R.string.empty_fields_error), Toast.LENGTH_SHORT).show()
            } else {
                try {
                    val age = ageString.toInt()
                    if (age <= 0) {
                        Toast.makeText(this, getString(R.string.invalid_age_error), Toast.LENGTH_SHORT).show()
                    } else {
                        val outputMessage = getString(R.string.output_message_success, name, age)
                        binding.outputTextView.text = outputMessage
                    }
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, getString(R.string.invalid_age_error), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}