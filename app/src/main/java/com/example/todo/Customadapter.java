package com.example.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Customadapter extends  RecyclerView.Adapter<Customadapter.Taskview>{
    private Context context;
    private List<Todo> taskList;
    public Customadapter(Context context , List<Todo> taskList)
    {
        this.context = context;
        this.taskList = taskList;
    }
    @NonNull
    @Override
    public Taskview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_custome_view,parent,false);
        return new Taskview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Taskview holder, int position) {

        holder.titletextview.setText(taskList.get(position).getTitle());
        holder.descriptiontextview.setText(taskList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public class Taskview extends RecyclerView.ViewHolder
    {
        TextView titletextview , descriptiontextview;
        public Taskview(@NonNull View itemView) {
            super(itemView);
            titletextview = itemView.findViewById(R.id.titletextview);
            descriptiontextview = itemView.findViewById(R.id.descriptiontextview);
        }
    }
}
