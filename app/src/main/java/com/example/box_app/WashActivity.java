package com.example.box_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wash);
        Button washbackButton = findViewById(R.id.back_from_wash);
        washbackButton.setOnClickListener(new WashActivity.OnClickListener4());
    }
    class OnClickListener4 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
            finish();
        }
    }
}