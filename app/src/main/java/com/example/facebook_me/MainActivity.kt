package com.example.facebook_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllFeeds())
    }

    fun refreshAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerView!!.adapter = adapter
    }

    fun getAllFeeds(): ArrayList<Feed> {
        val stories: ArrayList<Story> = ArrayList<Story>()
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))
        stories.add(Story(R.drawable.me, "Mirzayev Shaxzod"))


        val feeds: ArrayList<Feed> = ArrayList<Feed>()
        //Head
        feeds.add(Feed())
        //Story
        feeds.add(Feed(stories))
        //Post
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))
        feeds.add(Feed(Post(R.drawable.me, "Shaxzod", R.drawable.me)))

        return feeds
    }
}