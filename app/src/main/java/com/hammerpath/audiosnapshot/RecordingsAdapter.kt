package com.hammerpath.audiosnapshot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecordingsAdapter(private val recordings: List<Recording>): RecyclerView.Adapter<RecordingsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTextView = itemView.findViewById<TextView>(R.id.recording_name)
        val playButton = itemView.findViewById<Button>(R.id.play_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordingsAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val recordingView = inflater.inflate(R.layout.item_recording, parent, false)
        return ViewHolder(recordingView)
    }

    override fun onBindViewHolder(holder: RecordingsAdapter.ViewHolder, position: Int) {
        val recording : Recording = recordings.get(position)

        val textView = holder.nameTextView
        textView.setText(recording.name)

        val button = holder.playButton
    }

    override fun getItemCount(): Int {
        return recordings.size
    }
}