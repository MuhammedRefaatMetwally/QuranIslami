package com.route.isalmic38online.ui.surah_details_screen

import android.os.Build
import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.route.isalmic38online.databinding.ItemVerseBinding

class SurahDetailsAdapter(var versesList: List<String>) : Adapter<SurahDetailsAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : ItemVerseBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val   binding = ItemVerseBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.verseTv.text =Html.fromHtml("<h3> ${versesList?.get(position)?:""} <h3>",Html.FROM_HTML_MODE_COMPACT)

    }



    override fun getItemCount(): Int = versesList?.size ?: 0

}