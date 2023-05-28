package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Machine extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);
    }

    public void docu(View view) {//used to open the document page
        Intent intent = new Intent(this, Document.class);
        String message = "1";
        intent.putExtra("EXTRA_REPLY1", message);//extra is passed to check which data to be displayed in document activity
        startActivity(intent);
    }

    public void diag(View view) {//used to open the diagrams page
        Intent intent = new Intent(this, Diagrams.class);
        String message = "1";
        intent.putExtra("EXTRA_REPLY1", message);//extra is passed to check which data to be displayed in diagrams activity
        startActivity(intent);
    }

    public void youtube1(View view) {//used to open the youtube link upon clicking the imageview
        Uri link = Uri.parse("https://youtu.be/vm82yl5dT2g");//parses the youtube link
        Intent intent = new Intent(Intent.ACTION_VIEW, link);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.google.android.youtube");//setting the package to youtube
        startActivity(intent);//start the activity youtube
    }

    public void youtube2(View view) {
        Uri link = Uri.parse("https://youtu.be/mfffDtrSnMo");
        Intent intent = new Intent(Intent.ACTION_VIEW, link);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}