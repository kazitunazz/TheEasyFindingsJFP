package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class atmservice extends AppCompatActivity {

    Button brac,city,mtb,ucb,east,jbank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atmservice);
        brac=(Button)findViewById(R.id.bl);
        city=(Button)findViewById(R.id.tcb);
        mtb=(Button)findViewById(R.id.mtbl);
        ucb=(Button)findViewById(R.id.ucbl);
        east=(Button)findViewById(R.id.ebl);
        jbank=(Button)findViewById(R.id.jbl);

      //CLICKING A BUTTON  NEW LAYOUT SHOW CODE//
        brac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked Brac", Toast.LENGTH_LONG).show();
                Intent i = new Intent(atmservice.this, brack.class);
                startActivity(i);
            }


        });
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked City Bank", Toast.LENGTH_LONG).show();
                Intent i = new Intent(atmservice.this, citybank.class);
                startActivity(i);
            }
        });
        mtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked City Mutual Trust Bank", Toast.LENGTH_LONG).show();
                Intent i = new Intent(atmservice.this, MTB.class);
                startActivity(i);
            }
        });
        ucb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked City UC bank Limited", Toast.LENGTH_LONG).show();
                Intent i = new Intent(atmservice.this, UCBL.class);
                startActivity(i);
            }
        });
        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked City Eastern Bank Limited", Toast.LENGTH_LONG).show();
                Intent i = new Intent(atmservice.this, easternbl.class);
                startActivity(i);
            }
        });
        jbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Clicked City Janata Bank", Toast.LENGTH_LONG).show();
                Intent i = new Intent(atmservice.this, JBL.class);
                startActivity(i);
            }
        });


    }

}
