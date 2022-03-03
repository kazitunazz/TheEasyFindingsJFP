package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class easy extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        t=(TextView)findViewById(R.id.showdata);
        t.setText("Shop ID: GC-15\n" +
                "Type: Bowling Club\n" +
                "Floor Name : Fifth Floor \n" +
                "ZONE C ( South Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" +
                "Phone: 0841-3762\nRatings:4.2 out of 5\nGoogle Reviews: 65");

    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.easy.com.bd"));
        startActivity(i);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jamuna+Future+Park/@23.8135746,90.4222233,17z/data=!4m8!1m2!2m1!1seasy+jamuna+future+park!3m4!1s0x3755c64d7ecaeb5f:0xd912585bbda6d9c2!8m2!3d23.8135673!4d90.4243402"));
        startActivity(i);
    }
}
