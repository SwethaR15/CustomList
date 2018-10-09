package com.example.admin.customlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String[] arr = {"Gmail", "Facebok"};
    String[] arr1 = {"For Documents", "For Chatting"};
    String[] info = {"you are in Gmail", "you are in facebook"};
    int[] images = {R.drawable.gmail, R.drawable.fb};
    ArrayAdapter<String> adapter;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        customAdapter = new CustomAdapter(this, arr, images,arr1);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,info[i], Toast.LENGTH_SHORT).show();
            }
        });
    }}