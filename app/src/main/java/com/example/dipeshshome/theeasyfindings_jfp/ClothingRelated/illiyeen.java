
package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class illiyeen extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illiyeen);
        t=(TextView)findViewById(R.id.showdata);
        t.setText("Shop ID: GA-21,GA-22,GA-23 \n" +
                "Type: Men's wear\n" +
                "Floor Name : Ground Floor \n" +
                "ZONE A ( East Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" +
                "Phone: 09666-774577\n" +
                        "Ratings:4.3 out of 5\n" +
                        "Google Reviews: 65\n");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ilyn.global"));
        startActivity(i);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/illiyeen+jamuna+future+park/@23.8128073,90.3535498,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c7c9f1baac0f:0xf438deb13d0c0da8!2m2!1d90.4235902!2d23.8128231"));
        startActivity(i);
    }
}
