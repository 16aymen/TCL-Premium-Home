package com.aymen.tclpremiumhome

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(0xFF121212.toInt())
            setPadding(50, 50, 50, 50)
        }

        val title = TextView(this).apply {
            text = "TCL Premium Home"
            textSize = 36f
            setTextColor(0xFFFFFFFF.toInt())
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 20)
        }

        val subtitle = TextView(this).apply {
            text = "Android TV Launcher - القصرين، تونس"
            textSize = 20f
            setTextColor(0xFFAAAAAA.toInt())
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 40)
        }

        val timeFormat = SimpleDateFormat("HH:mm:ss - dd/MM/yyyy", Locale.getDefault())
        val currentTime = timeFormat.format(Date())

        val clockView = TextView(this).apply {
            text = "التوقيت: $currentTime"
            textSize = 24f
            setTextColor(0xFFFFD700.toInt())
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(clockView)

        setContentView(layout)
    }
}
