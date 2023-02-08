package com.example.life_cycle_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CallOnPauseOnlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_on_pause_only);
    }
}