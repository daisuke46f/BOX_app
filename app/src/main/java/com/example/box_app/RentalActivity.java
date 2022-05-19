package com.example.box_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RentalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental);
        Button backButton = findViewById(R.id.back_from_rental);
        backButton.setOnClickListener(new RentalActivity.OnClickListener2());
    }
    class OnClickListener2 implements View.OnClickListener{
            @Override
            public void onClick(View v) {
                finish();
            }
        }
}