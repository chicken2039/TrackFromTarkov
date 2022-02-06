package com.chicken2039.trackfromtarkov.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chicken2039.trackfromtarkov.R

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.ViewHolder>() {
    //data
    private val taskTitles = arrayOf("Debut","Stirrup","Shortage")
    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){

        //val itemList: RecyclerView
        val itemTask: TextView

        init {
            //itemList = itemView.findViewById(R.id.main_recycler)
            itemTask = itemView.findViewById(R.id.tasktitle_textview)
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_task_recycler,viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTask.text=taskTitles[position]
    }

    override fun getItemCount(): Int {
        return taskTitles.size

    }




}