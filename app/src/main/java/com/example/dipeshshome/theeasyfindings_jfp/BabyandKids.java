package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BabyandKids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyand_kids);
    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kidsparadisebd.com"));
        startActivity(i);
    }
    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Shop-026-031,+Kids+Paradise,+Jamuna+Future+Park,+Block-B,+North+Court,+Dhaka+1229/@23.8268623,90.3504695,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c64daf4e0aeb:0xf02343fc6956136d!2m2!1d90.4245145!2d23.8142368"));
        startActivity(i);
    }
}
