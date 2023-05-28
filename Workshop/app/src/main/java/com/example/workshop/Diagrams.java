package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Diagrams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrams);
        Intent intent = getIntent();
        ImageView ig1 = (ImageView) (findViewById(R.id.img1));//finding the image views where the iem needs top be displayed
        ImageView ig2 = (ImageView) (findViewById(R.id.img2));
        ImageView ig3 = (ImageView) (findViewById(R.id.img3));
        ImageView ig4 = (ImageView) (findViewById(R.id.img4));
        //the if condition checks from where the activity has been launched to open the content for that activity
        if (intent.getStringExtra("EXTRA_REPLY1") != null) {//sets the content for machine shop if the extra is not null
            ig1.setImageResource(R.drawable.machine1);
            ig2.setImageResource(R.drawable.machine2);
            ig3.setImageResource(R.drawable.machine3);
            ig4.setImageResource(R.drawable.machine4);
        } else if (intent.getStringExtra("EXTRA_REPLY2") != null) {//sets the content for welding shop if the extra is not null
            ig1.setImageResource(R.drawable.welding1);
            ig2.setImageResource(R.drawable.welding2);
            ig3.setImageResource(R.drawable.welding3);
            ig4.setImageResource(R.drawable.welding4);
        } else if (intent.getStringExtra("EXTRA_REPLY3") != null) {//sets the content for welding shop if the extra is not null
            ig1.setImageResource(R.drawable.foundry1);
            ig2.setImageResource(R.drawable.foundry2);
            ig3.setImageResource(R.drawable.foundry3);
            ig4.setImageResource(R.drawable.foundry4);
        } else if (intent.getStringExtra("EXTRA_REPLY4") != null) {//sets the content for welding shop if the extra is not null
            ig1.setImageResource(R.drawable.fitting1);
            ig2.setImageResource(R.drawable.fitting2);
            ig3.setImageResource(R.drawable.fitting3);
            ig4.setImageResource(R.drawable.fitting4);
        } else {
            Log.d("Message", "error");
        }
    }
}