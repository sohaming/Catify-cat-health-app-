package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class signin extends AppCompatActivity {

        Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ImageView imageView = findViewById(R.id.img);
        Glide.with(this)
                .load(R.drawable.catwellcome)
                .into(imageView);
        button1=findViewById(R.id.btn6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(signin.this,splash.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }

        });


    }
}