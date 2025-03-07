package com.example.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.fragment.R
import com.example.fragment.databinding.ActivityMainBinding
import com.example.fragment.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
  private lateinit var binding:FragmentBlankBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }


    companion object {


    }
}