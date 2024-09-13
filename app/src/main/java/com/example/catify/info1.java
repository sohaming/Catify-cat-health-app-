package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;

public class info1 extends AppCompatActivity {
        Button button1;
        String[] breed={"BobTail","ShortHir","Persian","Egiptian"};
    String[] type={"DOG","CAT","RABBIT","TURTLE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info1);
        ImageView imageView = findViewById(R.id.img);
        Glide.with(this)
                .load(R.drawable.happy3)
                .into(imageView);

        button1 = findViewById(R.id.btn4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(info1.this, MainActivity3.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }
        });
        Spinner s=(Spinner) findViewById(R.id.sp);
        ArrayAdapter<String>   a = new ArrayAdapter<>(info1.this, android.R.layout.simple_spinner_dropdown_item,type);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(a);

        Spinner s1=(Spinner) findViewById(R.id.sp);
        ArrayAdapter<String>   a1 = new ArrayAdapter<>(info1.this, android.R.layout.simple_spinner_dropdown_item,breed);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(a1);


    }
}