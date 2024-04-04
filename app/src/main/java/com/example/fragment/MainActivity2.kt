package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
   private lateinit var rvAdapter: RvAdapter
   private lateinit var datalist : ArrayList<RvModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))
        datalist.add(RvModel(R.drawable.anju,"Aryan","ECE"))

        rvAdapter = RvAdapter(datalist,this)
        binding.Rv.layoutManager = LinearLayoutManager(this) // yaha recyclerview ki id access ni kar pa rahe

    }
}