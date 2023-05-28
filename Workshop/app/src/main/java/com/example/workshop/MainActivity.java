package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSlider();
    }

    private void initSlider() {//used for the image carousel
        ImageCarousel carousel = findViewById(R.id.carousel);
        carousel.registerLifecycle(getLifecycle());
        List<CarouselItem> list = new ArrayList<>();//array for image carousel
        list.add(new CarouselItem(R.drawable.caro1));//adding items to the list to be displayed
        list.add(new CarouselItem(R.drawable.caro2));
        list.add(new CarouselItem(R.drawable.caro3));
        carousel.setData(list);
    }

    public void welding(View view) {//opens the second activity welding
        Log.d(LOG_TAG, "Welding karo");
        Intent intent = new Intent(this, Welding.class);
        startActivity(intent);
    }

    public void machine(View view) {//opens the second activity Machine
        Log.d(LOG_TAG, "Machining karo");
        Intent intent = new Intent(this, Machine.class);
        startActivity(intent);
    }

    public void fitting(View view) {//opens the second activity Fitting
        Log.d(LOG_TAG, "Fitting karo");
        Intent intent = new Intent(this, Fitting.class);
        startActivity(intent);
    }

    public void foundry(View view) {//opens the second activity Foundry
        Log.d(LOG_TAG, "Foundry karo");
        Intent intent = new Intent(this, Foundry.class);
        startActivity(intent);
    }
}