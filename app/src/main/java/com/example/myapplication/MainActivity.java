package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.num1);
        ed2 = findViewById(R.id.num2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = Integer.parseInt(ed1.getText().toString());
                int y = Integer.parseInt(ed2.getText().toString());
                int z = x+y;

                Toast.makeText(MainActivity.this, "The result is " + z, Toast.LENGTH_SHORT).show();
            }
        });



    }
}