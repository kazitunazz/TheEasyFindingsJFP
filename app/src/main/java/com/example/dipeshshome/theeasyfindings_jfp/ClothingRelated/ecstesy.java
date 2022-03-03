package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class ecstesy extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecstesy);
        t=(TextView) findViewById(R.id.showdata);
        t.setText("Shop ID: 1C-015 to 017\n" +
                "Type: Men's wear\n" +
                "Floor Name : First Floor \n" +
                "ZONE C ( South Court)\\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" +
                "Phone: 01933-355333\n" +
                "Ratings:4.6 out of 5\n" +
                "Google Reviews: 65\n");

    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ecstasybd.com"));
        startActivity(i);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/ecstasy+jamuna+future+park/@23.8133787,90.3544913,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c64c55c6d8bb:0x111163287ec38a3a!2m2!1d90.4245317!2d23.8133945"));
        startActivity(i);
    }
}
