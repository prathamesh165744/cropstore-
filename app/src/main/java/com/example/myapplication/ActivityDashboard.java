package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityDashboard extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ImageView b=findViewById(R.id.imageView);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(ActivityDashboard.this,ActivityProfile.class);
        startActivity(i);
    }
}