package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class MenandWomen extends AppCompatActivity {
  ImageButton men,women;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menand_women);
        men=(ImageButton)findViewById(R.id.buttonmen);
        women=(ImageButton)findViewById(R.id.buttonwomen);
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Men dress and Lifestyles", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MenandWomen.this, clothing.class);
                startActivity(i);
            }


        });

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Women dress and Lifestyles", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MenandWomen.this, womenclothing.class);
                startActivity(i);
            }


        });
    }
}
