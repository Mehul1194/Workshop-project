package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Document extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);
        Intent intent = getIntent();
        TextView textview = findViewById(R.id.description);//finding the textview where the iem needs top be displayed
        //the if condition checks from where the activity has been launched to open the content for that activity
        if (intent.getStringExtra("EXTRA_REPLY1") != null) {//sets the content for machine shop if the extra is not null
            textview.setText(R.string.machined);
        } else if (intent.getStringExtra("EXTRA_REPLY2") != null) {//sets the content for welding shop if the extra is not null
            textview.setText(R.string.weldingd);
        } else if (intent.getStringExtra("EXTRA_REPLY3") != null) {//sets the content for welding shop if the extra is not null
            textview.setText(R.string.foundryd);
        } else if (intent.getStringExtra("EXTRA_REPLY4") != null) {//sets the content for welding shop if the extra is not null
            textview.setText(R.string.fittingd);
        } else {
            Log.d("Message", "error");
        }
    }
}