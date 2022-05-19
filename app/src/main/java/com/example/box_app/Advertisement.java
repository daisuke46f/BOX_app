package com.example.box_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Advertisement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);
        ImageButton adButton = findViewById(R.id.AdButton);
        adButton.setOnClickListener(new Advertisement.OnClickListener7());
    }
    class OnClickListener7 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplication(),MainActivity.class);
            startActivity(intent);
        }
    }
}