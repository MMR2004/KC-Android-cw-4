package com.example.mohammadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Text1 = findViewById(R.id.firstnumber);
        EditText Text2 = findViewById(R.id.secondnumber);
        Button calculate = findViewById(R.id.buttoncalculate);
        TextView Text3 = findViewById(R.id.textViewtotal);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(Text1.getText().toString());
                int b = Integer.parseInt(Text2.getText().toString());
                int x = b+a;
                Text3.setText("Total: "+Integer.toString(x));
            }
        });

    }
}