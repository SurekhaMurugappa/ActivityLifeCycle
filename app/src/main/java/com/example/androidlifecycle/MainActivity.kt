package com.example.androidlifecycle

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.androidlifecycle.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val TAG : String = "MainActivity"
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toast = Toast.makeText(this,"I am onCreate",Toast.LENGTH_LONG)
        toast. show()
        Log.d(TAG,"I am onCreate")
    }
    override fun onStart() {
        super.onStart()
        binding.main.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
        val toast = Toast.makeText(this,"I onStart",Toast.LENGTH_LONG)
        toast. show()
        Log.d(TAG,"I onStart")
    }

    override fun onRestart() {
        super.onRestart()
        binding.main.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
        val toast = Toast.makeText(this,"I onRestart",Toast.LENGTH_LONG)
        toast. show()
        Log.d(TAG,"I onRestart")
    }
    override fun onResume() {
        super.onResume()
        binding.main.setBackgroundColor(ContextCompat.getColor(this,R.color.sky_blue))
        val toast = Toast.makeText(this,"I onResume",Toast.LENGTH_LONG)
        toast.show()
        Log.d(TAG,"I onResume")    }

    override fun onPause() {
        super.onPause()
        binding.main.setBackgroundColor(ContextCompat.getColor(this,R.color.green))
        val toast = Toast.makeText(this,"I onPause",Toast.LENGTH_LONG)
        toast. show()
        Log.d(TAG,"I onPause")    }

    override fun onStop() {
        super.onStop()
        binding.main.setBackgroundColor(ContextCompat.getColor(this,R.color.purple))
        val toast : Toast = Toast.makeText(this,"I onStop",Toast.LENGTH_LONG)
        toast. show()
        Log.d(TAG,"I onStop")    }

    override fun onDestroy() {
        super.onDestroy()
        binding.main.setBackgroundColor(ContextCompat.getColor(this,R.color.orange))
        val toast = Toast.makeText(this,"I onDestroy",Toast.LENGTH_LONG)
        toast. show()
        Log.d(TAG,"I onDestroy")    }
}