package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class clothing extends AppCompatActivity {
  Button aarong,anjan,artisan,ecstesy,illiyeen,easy,infinity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);
        aarong=(Button)findViewById(R.id.arong);
        anjan=(Button)findViewById(R.id.anjans);
        artisan=(Button)findViewById(R.id.artisan);
        ecstesy=(Button)findViewById(R.id.ecstesy);
        illiyeen=(Button)findViewById(R.id.illiyeen);
        easy=(Button)findViewById(R.id.easy);
        infinity=(Button)findViewById(R.id.infinity);

        infinity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clothing.this, com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.infinity.class);
                startActivity(i);
            }

        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clothing.this, com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.easy.class);
                startActivity(i);
                }

        });
        illiyeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clothing.this, com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.illiyeen.class);
                startActivity(i);
            }


        });
        ecstesy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clothing.this, com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.ecstesy.class);
                startActivity(i);
            }


        });
        artisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clothing.this, com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.artisan.class);
                startActivity(i);
            }


        });
        anjan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(clothing.this, anjans.class);
                startActivity(i);
            }


        });

        aarong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Aarong", Toast.LENGTH_LONG).show();
                Intent i = new Intent(clothing.this, com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated.aarong.class);
                startActivity(i);
            }


        });

    }

    }

