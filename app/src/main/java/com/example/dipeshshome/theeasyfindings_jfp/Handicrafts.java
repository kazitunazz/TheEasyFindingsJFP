package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Handicrafts extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handicrafts);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("1.Sachatan Handicrafts\n" +
                "4.0  out of 5\n" +
                "5 Google reviews\n" +
                "Shop id: GA-047"+
                "Handicrafts store in Dhaka, Bangladesh\n" +
                "Address: Level Ground, Block A, Jamuna Future Park, 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone:  02-9357331\n" +
                "http://www.sachatanhandicraftbd.org/export.html\n" +
                "\n" +

                "2.KayKraft\n" +
                "4.0  out of 5\n" +
                "5 Google reviews\n" +
                "Shop id: 4C-06-07"+
                "Handicrafts store in Dhaka, Bangladesh\n" +
                "Address: Level Ground, Block C, Jamuna Future Park, 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone:  01922-117433\n" +
                "http://Kaykrafts.com\n" +
                "\n" +

                "3.Infinity\n" +
                "4.0  out of 5\n" +
                "5 Google reviews\n" +
                "Shop id: GC-022"+
                "Handicrafts Accessories store in Dhaka, Bangladesh\n" +
                "Address: Level Ground, Block C, Jamuna Future Park, 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone:  01678-649014\n" +
                "http://infinitymegamall.com\n" +
                "\n" +

                "4.Exotic Gallery\n" +
                "4.0  out of 5\n" +
                "5 Google reviews\n" +
                "Shop id: GC-016"+
                "Computer Accessories store in Dhaka, Bangladesh\n" +
                "Address: Level Ground, Block C, Jamuna Future Park, 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone:  01792-527598\n" +
                "\n");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7782392,90.3977394/sachatan+handicrafts+JFP/@23.8002812,90.3930913,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64da32a9a31:0xb43bc3629f396ff0!2m2!1d90.423272!2d23.8140138"));
        startActivity(i);

    }

    public void Open1(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://www.google.com/maps/dir/23.7782392,90.3977394/kaykraft+JFP/@23.8002812,90.3940596,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d0213cfbf:0xc3de67121c581fda!2m2!1d90.4242533!2d23.8128301"));
        startActivity(i);
    }

    public void Open2(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7782392,90.3977394/infinity+JFP/@23.8002812,90.3940596,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d0bd16ec7:0xdb120cdff3bc60f7!2m2!1d90.4233931!2d23.8130642"));
        startActivity(i);
    }

    public void Open3(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://wego.here.com/directions/mix//Exotic-Gallery-JFP-BD,-Ka-244,-Kuril,Progati-Sarani,-1229-Dhaka:e-eyJuYW1lIjoiRXhvdGljIEdhbGxlcnkgSkZQIEJEIiwiYWRkcmVzcyI6IkthLTI0NCwgS3VyaWwsUHJvZ2F0aSBTYXJhbmksIERoYWthLCBCYW5nbGFkZXNoIiwibGF0aXR1ZGUiOjIzLjcsImxvbmdpdHVkZSI6OTAuMzc1LCJwcm92aWRlck5hbWUiOiJmYWNlYm9vayIsInByb3ZpZGVySWQiOjE1MzcyMjQzMDY1NTU1Njd9?map=23.7,90.375,15,normal&fb_locale=en_US"));
        startActivity(i);
    }

}
