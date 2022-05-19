package com.example.box_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReturnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return);
        Button washbackButton = findViewById(R.id.back_from_return);
        washbackButton.setOnClickListener(new ReturnActivity.OnClickListener6());
    }
    class OnClickListener6 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            finish();
        }
    }
}