package com.example.dolphy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Log.d("sigup","signup called");
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void signin(View view) {
        Intent intent = new Intent(this, signin.class);
        startActivity(intent);
    }
}