package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView b=findViewById(R.id.imageView4);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(ActivityMain.this,ActivityDashboard.class);
        startActivity(i);
    }
}