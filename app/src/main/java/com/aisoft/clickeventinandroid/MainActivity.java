package com.aisoft.clickeventinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  // Variable
    TextView tvDisplay;
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // find variable

        tvDisplay = findViewById(R.id.tvDisplay);
        clickButton = findViewById(R.id.clickButton);


        //OnClickListener  clickButton

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDisplay.setText("Thank You..!");
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        //OnClickListener  tvDisplay

        tvDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickButton.setText("Change Button Text");
                Toast.makeText(MainActivity.this, "Change Button Text", Toast.LENGTH_SHORT).show();
            }
        });





    }
}