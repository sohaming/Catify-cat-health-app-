package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class splash extends AppCompatActivity {


    ImageView b1, img, rate, todo,iv;
    Animation a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView imageView = findViewById(R.id.cathealth);
        Glide.with(this)
                .load(R.drawable.healthcat)
                .into(imageView);
        ImageView imageView1 = findViewById(R.id.hungrycat);
        Glide.with(this)
                .load(R.drawable.hungry)
                .into(imageView1);
        b1=findViewById(R.id.img11);
        img=findViewById(R.id.img3);
        rate=findViewById(R.id.rate);
        todo=findViewById(R.id.icon3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(splash.this,catinfo.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(splash.this,rateing.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }
        });
        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(splash.this,calender.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("https://gmail.com/"));
                String[] m ={"sohaming1650@gmail.com","burningbunny1650@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,m);
                i.putExtra(Intent.EXTRA_SUBJECT,"Enter Subject Here");
                i.putExtra(Intent.EXTRA_TEXT,"Enter Discription here");
                i.setType("message/rfc822");
                Intent s = Intent.createChooser(i,"Start Email");
                startActivity(s);
            }
        });
        iv=findViewById(R.id.c1);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ani1);
                iv.startAnimation(a);
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