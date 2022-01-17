package com.chicken2039.trackfromtarkov.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chicken2039.trackfromtarkov.R

class taskAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    //data

    private val sampledata = "쇼어라인에서 준내 떄리기"
    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){

        var listRecyclerView: RecyclerView

        init {
            listRecyclerView = itemView.findViewById(R.id.main_recycler)

        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_task_recycler,viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}