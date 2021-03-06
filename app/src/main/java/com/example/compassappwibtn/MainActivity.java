package com.example.compassappwibtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btmOpenCompass;
    Intent compassActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmOpenCompass = findViewById(R.id.btnOpenCompassView);
        btmOpenCompass.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOpenCompassView:
                compassActivity = new Intent(this, CompassActivity.class);
                startActivity(compassActivity);
                break;
            default:
                break;
        }
    }
}