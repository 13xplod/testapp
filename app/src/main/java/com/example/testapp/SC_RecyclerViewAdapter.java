package com.example.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SC_RecyclerViewAdapter extends RecyclerView.Adapter<SC_RecyclerViewAdapter.MyViewHolder>{
    Context context;
    ArrayList<CityModel> cityModels;
    public SC_RecyclerViewAdapter(Context context, ArrayList<CityModel> cityModels){
    this.context = context;
    this.cityModels = cityModels;
    }
    @NonNull
    @Override
    public SC_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recylcer_view_row, parent, false);

        return new SC_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SC_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvName.setText(cityModels.get(position).getCityName());
        holder.tvRegNumber.setText(cityModels.get(position).getRegNumber());
        holder.imageView.setImageResource(cityModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return cityModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvName, tvRegNumber;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.cityName);
            tvRegNumber = itemView.findViewById(R.id.regNumber);
        }
    }
}
