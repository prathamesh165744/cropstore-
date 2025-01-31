package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button b=(Button)findViewById(R.id.button3);
        b.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i=new Intent(ActivityLogin.this,ActivityMain.class);
        startActivity(i);
    }
}