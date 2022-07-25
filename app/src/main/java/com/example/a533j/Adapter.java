package com.example.a533j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<ItemChats> items;

    public Adapter(ArrayList<ItemChats> items, Context context){
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MessageViewHolder(view);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemChats chat = items.get(position);

        if(holder instanceof  MessageViewHolder){
            ImageView imageView = ((MessageViewHolder)holder).iv_profile;
            imageView.setImageResource(chat.theme);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_profile;
        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_profile = itemView.findViewById(R.id.image);
        }
    }
}
