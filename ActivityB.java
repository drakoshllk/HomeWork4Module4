package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button buttonActС = findViewById(R.id.opActivityС);
        buttonActС.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityB.this, ActivityC.class);
            startActivity(intent);
        });
    }
}