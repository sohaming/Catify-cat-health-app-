package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {


    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.img);
        Glide.with(this)
                .load(R.drawable.happy)
                .into(imageView);
        ImageView imageV = findViewById(R.id.imgg);
        Glide.with(this)
                .load(R.drawable.heartlove)
                .into(imageV);
      button1=findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity2.this,info1.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }

        });
        button1=findViewById(R.id.btn5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity2.this,signin.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }

        });


       /* button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity2.this,MainActivity3.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);
            }
        });
*/


    }
}