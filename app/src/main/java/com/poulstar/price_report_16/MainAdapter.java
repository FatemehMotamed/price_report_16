package com.poulstar.price_report_16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {
    ArrayList<Item> array_item;
    Context context;
    public MainAdapter(ArrayList<Item> array_item, Context context){
        this.array_item = array_item;
        this.context = context;
    }


    @Override
    public MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.MainHolder holder, int position) {
        Item current_item = array_item.get(position);
        holder.v_name.setText(current_item.getName());
        holder.v_price.setText(current_item.getPrice());
        holder.v_base.setText(current_item.getBase());
        holder.v_date.setText(current_item.getDate());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MainHolder extends RecyclerView.ViewHolder{
        TextView v_name;
        TextView v_price;
        TextView v_base;
        TextView v_date;

        public MainHolder( View itemView) {
            super(itemView);
            v_name = itemView.findViewById(R.id.name);
            v_price = itemView.findViewById(R.id.price);
            v_base = itemView.findViewById(R.id.base);
            v_date = itemView.findViewById(R.id.last_refresh);
        }
    }
}
