package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.fragment.Fragment.BlankFragment
import com.example.fragment.Fragment.BlankFragment2
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var manager = supportFragmentManager
        var tr = manager.beginTransaction()
        tr.replace(R.id.frame,BlankFragment())
        tr.commit()

       binding.buttona.setOnClickListener{
            var manager = supportFragmentManager
            var tr = manager.beginTransaction()
            tr.replace(R.id.frame,BlankFragment())
            tr.commit()
        }

        binding.buttonb.setOnClickListener{
            var manager = supportFragmentManager
            var tr = manager.beginTransaction()
            tr.replace(R.id.frame,BlankFragment2())
            tr.commit()
        }

    }
}