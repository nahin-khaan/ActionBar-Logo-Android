package com.example.actionbarlogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        //Showing action bar logo

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.action);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        //Showing tittle bar 

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Action Bar");

        setContentView(R.layout.activity_main);
    }
}