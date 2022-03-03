package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jwellery extends AppCompatActivity {
 TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jwellery);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Fancy Jewellers\n" +
                "Ratings :5.0 out of 5\n" +
                "1 Google review\n" +
                "Jewelry store in Dhaka, Bangladesh\n" +
                "Address: 2B-002A, KA-244, Jamuna Future Park, Progoti Sharani, Baridhara, Dhaka 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone: 02-9823433");
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/fancy+jewellers/@23.8137053,90.354271,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3755c64da4fe17cf:0x1f3b315512e75a8f!2m2!1d90.424484!2d23.8137212"));
        startActivity(i);
    }
}
