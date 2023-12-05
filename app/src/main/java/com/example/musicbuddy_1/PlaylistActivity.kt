package com.example.musicbuddy_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlaylistActivity : AppCompatActivity() {

    private lateinit var playlistRecyclerView: RecyclerView
    private lateinit var playlistAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

        // Assuming you have a reference to the playlist in your main activity
        //val playlist: List<Data> =

        //    playlistRecyclerView = findViewById(R.id.playlistRecyclerView)
       //laylistAdapter = MyAdapter(this, playlist)
        playlistRecyclerView.layoutManager = LinearLayoutManager(this)
        playlistRecyclerView.adapter = playlistAdapter
    }
}