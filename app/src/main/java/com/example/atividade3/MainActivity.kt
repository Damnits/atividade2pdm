package com.example.atividade3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.calendarView = findViewById(R.id.tvCalendary)
        this.calendarView.setOnDateChangeListener(DateChange())
    }
    inner class DateChange: CalendarView.OnDateChangeListener{
        private lateinit var textViewMsg: TextView

        override fun onSelectedDayChange(
            view: CalendarView,
            year: Int,
            month: Int,
            dayOfMonth: Int
        ) {
            this.textViewMsg = findViewById(R.id.textView)
            this.textViewMsg.text = "${dayOfMonth}/${month}/${year}"
        }
    }
}