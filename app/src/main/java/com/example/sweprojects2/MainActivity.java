package com.example.sweprojects2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;

    DBHelper myDB;
    ArrayList<String> ClientID, ServiceName, Date, Time, Price;
    CustomAdapter customAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

    myDB = new DBHelper(MainActivity.this);
        ClientID = new ArrayList<>();
        ServiceName = new ArrayList<>();
        Date = new ArrayList<>();
        Time = new ArrayList<>();
        Price = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(MainActivity.this,ClientID, ServiceName, Date, Time, Price);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(this, "There is no appointments yet!", Toast.LENGTH_SHORT).show();
        }else {
            while(cursor.moveToNext()){
                ClientID.add(cursor.getString(0));
                ServiceName.add(cursor.getString(1));
                Date.add(cursor.getString(2));
                Time.add(cursor.getString(3));
                Price.add(cursor.getString(4));
            }
        }

    }
}