package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button1);
        Button button3 = findViewById(R.id.button2);

        TextView textField = findViewById(R.id.textfield);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            textField.setText(button1.getText());}
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(button2.getText());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(button3.getText());
            }
        });

    }

}