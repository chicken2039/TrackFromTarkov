package com.chicken2039.trackfromtarkov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chicken2039.trackfromtarkov.databinding.ActivityMainBinding
import com.chicken2039.trackfromtarkov.presentation.TaskAdapter

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null
    private var layoutManager:RecyclerView.LayoutManager? = null
    private lateinit var mAdapter: RecyclerView.Adapter<TaskAdapter.ViewHolder>
    private lateinit var mRecyclerView : RecyclerView
    private lateinit var mTaskItem : ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView  = findViewById(R.id.main_recycler)
        mAdapter = TaskAdapter()

        mRecyclerView.adapter = mAdapter
        mRecyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        mAdapter.notifyDataSetChanged()



    }
}