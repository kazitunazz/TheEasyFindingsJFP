package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Homedecor extends AppCompatActivity {
 TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homedecor);
        t=(TextView)findViewById(R.id.showdata);
        t.setText("1.\n" +
                "INTERNATIONAL HOMEWARE\n" +
                "4.3\n" +
                "4 Google reviews\n" +
                "Home goods store in Dhaka, Bangladesh\n" +
                "Address: ua007,west court, jamuna future park, Dhaka\n" +
                "Hours: Closes soon: 9PM \n ⋅ Opens 11AM Sat\n" +
                "Phone: 01708-168000\n" +
                "\n" +
                "2.\n" +
                "Classical Hometex - Jamuna Future Park\n" +
                "4.3\n" +
                "16 Google reviews\n" +
                "Store in Dhaka, Bangladesh\n" +
                "Floor Name : Fifth Floor \\nZONE B ( North Court)\n" +
                "Hours: Closes soon: 9PM \n⋅ Opens 10AM Sat\n" +
                "\n" +
                "3.\n" +
                "BanglaShoppers Jamuna Future Park\n" +
                "3.9\n" +
                "13 Google reviews\n" +
                "Cosmetics store in Dhaka, Bangladesh\n" +
                "Floor Name : Ground Floor \\nZONE C ( South Court)\n" +
                "Hours: Closes soon: 9PM\n ⋅ Opens 11AM Sat\n" +
                "Phone: 01912-131211");


    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/international+homeware+jamuna+future+park/@23.8136149,90.3536796,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c64daf966ec3:0xb96435c167862994!2m2!1d90.42372!2d23.8136307"));
        startActivity(i);
    }

    public void Open1(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://www.google.com/maps/dir/''/Classical+Hometex+-+Jamuna+Future+Park,+Jamuna+Future+Park,+Pragati+Ave,+Dhaka/@23.8118823,90.3538381,12z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3755c64c4d6c9eab:0xb506c82ebb9172b7!2m2!1d90.4238785!2d23.8118981"));
        startActivity(i);
    }

    public void Open2(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://www.banglashoppers.com"));
        startActivity(i);
    }
}
