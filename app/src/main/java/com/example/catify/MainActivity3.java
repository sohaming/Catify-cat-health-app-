package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView imageView = findViewById(R.id.png);
        Glide.with(this)
                .load(R.drawable.heart1)
                .into(imageView);
        Thread t = new Thread(){
            public void run() {
            try {
                sleep(3500);
                Intent i = new Intent(MainActivity3.this, splash.class);
                startActivity(i);
                finish();

            }catch (Exception e){
                e.printStackTrace();
            }
            }
        };
        t.start();
    }
}