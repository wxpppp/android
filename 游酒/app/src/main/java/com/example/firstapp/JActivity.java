package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JActivity extends AppCompatActivity {

    Button j__button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j);

        j__button = findViewById(R.id.button__j);
        j__button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}