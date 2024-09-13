package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class rateing extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rateing);
        ImageView imageView = findViewById(R.id.pls);
        Glide.with(this)
                .load(R.drawable.cat8)
                .into(imageView);

        btn1 = findViewById(R.id.sub1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rateing.this, splash.class);
                startActivity(i);
            }
        });

    }
}