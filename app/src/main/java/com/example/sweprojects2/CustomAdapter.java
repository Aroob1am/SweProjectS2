package com.example.sweprojects2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    private Context context;
    private ArrayList ClientID, ServiceName, Date, Time, Price;
    CustomAdapter(Context context,ArrayList ClientID,ArrayList ServiceName,ArrayList Date,ArrayList Time,ArrayList Price){
        this.context=context;
        this.ClientID=ClientID;
        this.ServiceName=ServiceName;
        this.Date=Date;
        this.Time=Time;
        this.Price=Price;



    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_appointment_f, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.service_value.setText(String.valueOf(ServiceName.get(position)));
        holder.date_value.setText(String.valueOf(Date.get(position)));
        holder.time_value.setText(String.valueOf(Time.get(position)));
        holder.price_value.setText(String.valueOf(Price.get(position)));
    }

    @Override
    public int getItemCount() {
        return ClientID.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

       TextView service_value, date_value, time_value, price_value;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            service_value = itemView.findViewById(R.id.service_value);
            date_value = itemView.findViewById(R.id.date_value);
            time_value = itemView.findViewById(R.id.time_value);
            price_value = itemView.findViewById(R.id.price_value);
        }
    }


}
