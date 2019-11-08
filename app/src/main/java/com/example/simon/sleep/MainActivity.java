package com.example.simon.sleep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String hours;
    String minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        hours = intent.getStringExtra("hours");
        minutes = intent.getStringExtra("minutes");

        Button hhmmButton;
        hhmmButton =(Button)findViewById(R.id.hhmmButton);

        if(hours == null|| minutes == null){
           hhmmButton.setText("HH:MM");
        }else{
            hhmmButton.setText(hours + ":" + minutes);
        }


    }
    public void onClick(View v){
        Intent intent = new Intent(this, TimePickerActivity.class);
        startActivity(intent);
    }

}
