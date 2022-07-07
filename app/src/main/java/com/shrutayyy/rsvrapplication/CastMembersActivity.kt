package com.shrutayyy.rsvrapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CastMembersActivity : AppCompatActivity() {

    lateinit var recyclerViewLayout: RecyclerView

    lateinit var linearLayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        recyclerViewLayout=findViewById(R.id.recycler_View)

        linearLayoutManager=LinearLayoutManager(CastMembersActivity)

        setContentView(R.layout.activity_cast_members)

    }
}