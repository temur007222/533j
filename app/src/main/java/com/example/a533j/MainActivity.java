package com.example.a533j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAllChats();
    }

    void getAllChats(){

        ArrayList<ItemChats> chat = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        chat.add(new ItemChats(R.drawable.nissan));
        chat.add(new ItemChats(R.drawable.volkswagen));
        chat.add(new ItemChats(R.drawable.nissan));
        chat.add(new ItemChats(R.drawable.volkswagen));
        chat.add(new ItemChats(R.drawable.nissan));
        chat.add(new ItemChats(R.drawable.volkswagen));

        Adapter adapter = new Adapter(chat, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }
}