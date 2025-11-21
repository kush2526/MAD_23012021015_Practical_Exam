package com.example.mad_practical_exam


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnPause: ImageButton
    private lateinit var btnVolume: ImageButton
    private lateinit var btnAll: Button
    private lateinit var btnKeynote: Button
    private lateinit var btnWorkshop: Button
    private lateinit var btnNetworking: Button
    private lateinit var btnBuyTickets: Button
    private lateinit var btnCalendar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPause = findViewById(R.id.btnPause)
        btnVolume = findViewById(R.id.btnVolume)

        btnAll = findViewById(R.id.btnAll)
        btnKeynote = findViewById(R.id.btnKeynote)
        btnWorkshop = findViewById(R.id.btnWorkshop)
        btnNetworking = findViewById(R.id.btnNetworking)

        btnBuyTickets = findViewById(R.id.btnBuyTickets)
        btnCalendar = findViewById(R.id.btnCalendar)

        btnPause.setOnClickListener {
            Toast.makeText(this, "Pause clicked", Toast.LENGTH_SHORT).show()
        }

        btnVolume.setOnClickListener {
            Toast.makeText(this, "Volume clicked", Toast.LENGTH_SHORT).show()
        }

        // Filter button click handlers
        val filterButtons = listOf(btnAll, btnKeynote, btnWorkshop, btnNetworking)
        filterButtons.forEach { button ->
            button.setOnClickListener {
                updateFilterButtons(button)
                Toast.makeText(this, "Filter: ${button.text}", Toast.LENGTH_SHORT).show()
            }
        }

        btnBuyTickets.setOnClickListener {
            Toast.makeText(this, "Buy Tickets clicked", Toast.LENGTH_SHORT).show()
        }

        btnCalendar.setOnClickListener {
            Toast.makeText(this, "Calendar clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateFilterButtons(selected: Button) {
        val buttons = listOf(btnAll, btnKeynote, btnWorkshop, btnNetworking)
        buttons.forEach {
            if (it == selected) {
                it.setBackgroundResource(R.drawable.btn_selected_bg)
                it.setTextColor(resources.getColor(android.R.color.black))
            } else {
                it.setBackgroundResource(R.drawable.btn_unselected_bg)
                it.setTextColor(resources.getColor(android.R.color.darker_gray))
            }
        }
    }
}