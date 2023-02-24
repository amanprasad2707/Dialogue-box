package com.example.dialoguebox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btn1.setOnClickListener {
        val builder1 = AlertDialog.Builder(this)
        builder1.setTitle("Are you sure?")
        builder1.setMessage("Do you want to close the app?")
        builder1.setIcon(R.drawable.baseline_exit_to_app_24)
        builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
            // what action is performed when yes is clicked?
            finish()
        })
        builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            // what action should be performed when no is clicked?
            finish()
        })
        builder1.show()
    }
        binding.btn2.setOnClickListener {
            val language = arrayOf("Python","C","C++","Java","Kotlin","Ruby","JavaScript")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("In which language are you comfortable?")
            builder2.setSingleChoiceItems(language,0,DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option
                Toast.makeText(this, "You clicked on ${language[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action is performed when yes is clicked?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when no is clicked?
                finish()
            })
            builder2.show()
        }
        binding.btn3.setOnClickListener {
            val language = arrayOf("Python","C","C++","Java","Kotlin","Ruby","JavaScript")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("In which language are you comfortable?")
            builder2.setMultiChoiceItems(language, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, which, isChecked ->
                Toast.makeText(this, "You clicked on ${language[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action is performed when yes is clicked?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when no is clicked?
                finish()
            })
            builder2.show()
        }

    }
}