package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button a_button;
    Button two_button;
    Button three_button;
    Button four_button;
    Button five_button;
    Button six_button;
    Button seven_button;
    Button eight_button;
    Button nine_button;
    Button ten_button;
    Button j_button;
    Button q_button;
    Button k_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        a_button = findViewById(R.id.buttonA);
        a_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,AActivity.class);

                startActivity(intent);
                finish();
            }
        });

        two_button = findViewById(R.id.button2);
        two_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity2.class);

                startActivity(intent);
                finish();
            }
        });

        three_button = findViewById(R.id.button3);
        three_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity3.class);

                startActivity(intent);
                finish();
            }
        });

        four_button = findViewById(R.id.button4);
        four_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity4.class);
                startActivity(intent);
                finish();
            }
        });

        five_button = findViewById(R.id.button5);
        five_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity5.class);
                startActivity(intent);
                finish();
            }
        });

        six_button = findViewById(R.id.button6);
        six_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity6.class);
                startActivity(intent);
                finish();
            }
        });

        seven_button = findViewById(R.id.button7);
        seven_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity7.class);
                startActivity(intent);
                finish();
            }
        });

        eight_button = findViewById(R.id.button8);
        eight_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity8.class);
                startActivity(intent);
                finish();
            }
        });

        nine_button = findViewById(R.id.button9);
        nine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity9.class);
                startActivity(intent);
                finish();
            }
        });

        ten_button = findViewById(R.id.button10);
        ten_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Activity10.class);
                startActivity(intent);
                finish();
            }
        });

        j_button = findViewById(R.id.buttonJ);
        j_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,JActivity.class);
                startActivity(intent);
                finish();
            }
        });

        q_button = findViewById(R.id.buttonQ);
        q_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,QActivity.class);
                startActivity(intent);
                finish();
            }
        });

        k_button = findViewById(R.id.buttonK);
        k_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,KActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}