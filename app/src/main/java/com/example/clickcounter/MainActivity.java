package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plus;
    private Button minus;
    private TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(counter.getText().toString()) + 1;
                counter.setText(num);
                changeColour(num);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(counter.getText().toString()) - 1;
                counter.setText(num);
                changeColour(num);
            }
        });
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.setText(0);
                changeColour(0);
            }
        });
    }

    private void changeColour(int num) {
        if (num == 0) {
            int colour = Color.rgb(0, 0, 255);
            counter.setTextColor(colour);
        } else if (num > 0) {
            int colour = Color.rgb(0, 255, 0);
            counter.setTextColor(colour);
        } else if (num < 0) {
            int colour = Color.rgb(255, 0, 0);
            counter.setTextColor(colour);
        }
    }

    private void init() {
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        counter = findViewById(R.id.counter);
    }
}