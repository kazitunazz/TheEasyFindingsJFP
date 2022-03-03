package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodCourt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_court);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Jamuna+Future+Park+Food+Court,+Jamuna+Future+Park,+Dhaka/@23.8133921,90.4217257,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c64da9bbffe1:0xd129d77aae8a5f24!2m2!1d90.4239144!2d23.8133921"));
        startActivity(i);
    }
}
