package com.example.box_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rentalButton = findViewById(R.id.rental);
        rentalButton.setOnClickListener(new OnClickListener1());
        Button washButton = findViewById(R.id.wash);
        washButton.setOnClickListener(new OnClickListener3());
        Button returnButton = findViewById(R.id.return_goods);
        returnButton.setOnClickListener(new OnClickListener5());
    }
        class OnClickListener1 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),RentalActivity.class);
                startActivity(intent);
            }
        }
        class OnClickListener3 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),WashActivity.class);
                startActivity(intent);
            }
        }
        class OnClickListener5 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),ReturnActivity.class);
                startActivity(intent);
            }
        }
}

