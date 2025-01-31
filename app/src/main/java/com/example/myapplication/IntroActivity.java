package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button, button2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button:
            {
                Toast.makeText(this,"LogIn",Toast.LENGTH_LONG).show();
                Intent i=new Intent(IntroActivity.this,ActivityLogin.class);
                startActivity(i);
                break;
            }
            case R.id.button2:
            {
                Toast.makeText(this,"SignUp",Toast.LENGTH_LONG).show();
                Intent i=new Intent(IntroActivity.this,ActivitySignup.class);
                startActivity(i);
                break;
            }
        }
    }
}