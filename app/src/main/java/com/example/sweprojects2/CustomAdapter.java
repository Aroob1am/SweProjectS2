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

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
