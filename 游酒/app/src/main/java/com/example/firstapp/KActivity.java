package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KActivity extends AppCompatActivity {

    Button k__button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k);

        k__button = findViewById(R.id.button__k);
        k__button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}