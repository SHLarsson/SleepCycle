package com.example.simon.sleep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public String hours;
    public String minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        hours = intent.getStringExtra("hours");
        minutes = intent.getStringExtra("minutes");

        TextView resultText;
        resultText =(TextView)findViewById(R.id.resultText);
        resultText.setText(hours + ":" + minutes);


    }

    void calculate(){
        int h =  Integer.parseInt(hours);
        int m =  Integer.parseInt(minutes);

        //3:00 4:30 6:00 7:30

        for(int i = 0;i <= 6; i++){
            h = h + 3 + i;

            m = m + 30;

            if(m > 60){
                h = h + 1;
                m = m - 60;
            }
        }
    }
}
