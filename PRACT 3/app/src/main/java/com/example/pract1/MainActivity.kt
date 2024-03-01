package com.example.pract1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "ON - CREATE", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "ON - START ", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "ON - RESUME ", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "ON - PAUSE", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "ON - STOP", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "ON - RESTART", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "ON - DESTROY", Toast.LENGTH_SHORT).show()
    }
}