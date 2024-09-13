package com.example.catify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class catinfo extends AppCompatActivity {


    Button button1;
    ImageView im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catinfo);
        button1=findViewById(R.id.btn3);
        im1=(ImageView)findViewById(R.id.back);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://cats.com/cat-breeds/american-bobtail");
                Intent in = new Intent(Intent.ACTION_VIEW,uri);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);

            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(catinfo.this,splash.class);
                startActivity(i);

            }
        });

       /* button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity2.this,MainActivity3.class);
                //Intent in = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in);
                ---------------------------------
                h
            }
        });
*/


    }
}