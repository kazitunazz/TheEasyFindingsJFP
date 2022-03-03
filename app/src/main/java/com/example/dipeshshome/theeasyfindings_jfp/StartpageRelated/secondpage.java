package com.example.dipeshshome.theeasyfindings_jfp.StartpageRelated;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.dipeshshome.theeasyfindings_jfp.BabyandKids;
import com.example.dipeshshome.theeasyfindings_jfp.BankandATM.atmservice;
import com.example.dipeshshome.theeasyfindings_jfp.Cinemas;
import com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.MenandWomen;
import com.example.dipeshshome.theeasyfindings_jfp.DatabaseRelated.DatabaseMain;
import com.example.dipeshshome.theeasyfindings_jfp.FoodCourt;
import com.example.dipeshshome.theeasyfindings_jfp.Handicrafts;
import com.example.dipeshshome.theeasyfindings_jfp.Homedecor;
import com.example.dipeshshome.theeasyfindings_jfp.Mobileaccessories;
import com.example.dipeshshome.theeasyfindings_jfp.R;
import com.example.dipeshshome.theeasyfindings_jfp.caccessories;
import com.example.dipeshshome.theeasyfindings_jfp.jwellery;
import com.example.dipeshshome.theeasyfindings_jfp.themepark;

public class secondpage extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,admin;
    Button myplan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        b1=(ImageButton)findViewById(R.id.button1);
        b2=(ImageButton)findViewById(R.id.button6);
        b3=(ImageButton)findViewById(R.id.button2);
        b4=(ImageButton)findViewById(R.id.button3);
        b5=(ImageButton)findViewById(R.id.button4);
        b6=(ImageButton)findViewById(R.id.button12);
        b7=(ImageButton)findViewById(R.id.button7);
        b8=(ImageButton)findViewById(R.id.button8);
        b9=(ImageButton)findViewById(R.id.button9);
        b10=(ImageButton)findViewById(R.id.button10);
        b11=(ImageButton)findViewById(R.id.button11);
        admin=(ImageButton)findViewById(R.id.admin);
        myplan=(Button)findViewById(R.id.myplan);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Clothing", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this, MenandWomen.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Bank and ATM", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,atmservice.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Baby and Kids", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,BabyandKids.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Cinemas", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this, Cinemas.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked FoodCourt", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,FoodCourt.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked HomeDecor", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,Homedecor.class);
                startActivity(i);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Jwellery", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,jwellery.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Mobile accessories", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,Mobileaccessories.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Theme Park", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,themepark.class);
                startActivity(i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Computer Accessories", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,caccessories.class);
                startActivity(i);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Handicrafts", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,Handicrafts.class);
                startActivity(i);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Admin Login", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,login.class);
                startActivity(i);
            }
        });
        myplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked My Plan", Toast.LENGTH_LONG).show();
                Intent i = new Intent(secondpage.this,DatabaseMain.class);
                startActivity(i);
            }
        });


    }
}
