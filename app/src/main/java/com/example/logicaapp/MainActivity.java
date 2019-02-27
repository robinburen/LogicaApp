package com.example.logicaapp;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input2;
    private EditText input3;
    private EditText input4;
    private EditText input5;

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input2 = findViewById(R.id.textInput2);
        input3 = findViewById(R.id.textInput3);
        input4 = findViewById(R.id.textInput4);
        input5 = findViewById(R.id.textInput5);
        button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });
    }

    public void check() {
        if (!input2.getText().toString().equals("T")) {
            Toast.makeText(this, "One or more wrong answers", Toast.LENGTH_SHORT).show();
        } else if (!input3.getText().toString().equals("F")) {
            Toast.makeText(this, "One or more wrong answers", Toast.LENGTH_SHORT).show();
        } else if (!input4.getText().toString().equals("F")) {
            Toast.makeText(this, "One or more wrong answers", Toast.LENGTH_SHORT).show();
        } else if (!input5.getText().toString().equals("F")) {
            Toast.makeText(this, "One or more wrong answers", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Great job!", Toast.LENGTH_SHORT).show();
        }

    }
}
