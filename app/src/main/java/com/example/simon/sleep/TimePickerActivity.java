package com.example.simon.sleep;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        //timePicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);
    }
    public void onSave(View v){

        TimePicker timePicker;
        timePicker = (TimePicker) findViewById(R.id.timePicker1);
        timePicker.setIs24HourView(false);

        int hours = timePicker.getCurrentHour();
        int minutes = timePicker.getCurrentMinute();

        Log.d("logHours","" + hours);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("hours", "" + hours);
        intent.putExtra("minutes", "" + minutes);
        startActivity(intent);
    }
}
