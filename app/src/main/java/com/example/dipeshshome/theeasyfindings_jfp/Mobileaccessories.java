package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mobileaccessories extends AppCompatActivity {
 TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobileaccessories);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("1.\n" +
                "iHome\n" +
                "4.0  out of 5\n" +
                "5 Google reviews\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: Level 4, Block C, Shop 12B (4C-12B), Jamuna Future Park, 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone: 01671-074810\n" +
                "website:https://www.ihome-bd.com/\n" +
                "\n" +
                "2.\n" +
                "Take & Talk BD\n" +
                "5.0  out of 5\n" +
                "1 Google review\n" +
                "Cell phone store in Dhaka, Bangladesh\n" +
                "Address: Showroom- 4D-014, Jamuna Future Park, Dhaka 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone: 01758-298679\n" +
                "\n" +
                "3.\n" +
                "Vision Emporium\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: Jamuna future park, Lower Ground, Shop UA-018, 1212\n" +
                "Phone: 01992-658373\n" +
                "website:http://www.rfleshop.com/\n" +
                "\n" +
                "4.Camera World\n" +
                "3.9\n" +
                "15 Google reviews\n" +
                "Camera store in Dhaka, Bangladesh\n" +
                "Address: Jamuna Future Park, Dhaka\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone: 01941-731742\n" +
                "https://www.facebook.com/TheCameraWorldMohsin/\n" +
                "\n" +
                "5.\n" +
                "Gadget and Gear\n" +
                "5.0\n" +
                "1 Google review\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: Upper Basement, Shop no UA-006, Jamuna Futura Park, Dhaka 1229\n" +
                "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                "Phone: 01823-055876\n" +
                "http://www.Gadget&gear.com/\n" +
                "\n" +
                "6.\n" +
                "ASUS Zenfone Exclusive Store\n" +
                "4.6  out of 5\n" +
                "9 Google reviews\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: shop 21B block D level 4 jamuna future park 1229, Dhaka\n" +
                "Hours: Open ⋅ Closes 10PM\n" +
                "Phone: 01706-310980\n" +
                "\n" +
                "7.\n" +
                "Walton Smart Zone\n" +
                "3.9  out of 5\n" +
                "16 Google reviews\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: Ka-244, Jamuna Future park, Shop no. 005, Block D, Pragati Avenue, Dhaka 1207\n" +
                "Hours: Closed ⋅ Opens 10AM Sat\n" +
                "Phone: 01628-170039\n" +
                "http://www.waltonbd.com/\n" +
                "\n" +
                "8.\n" +
                "Take & Talk BD\n" +
                "3.9  out of 5\n" +
                "17 Google reviews\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: Shop-29, Level-4, Block-C Jamuna Future Park, Kuril Pragati Avenue, Dhaka 1229\n" +
                "Hours: Closed ⋅ Opens 11AM Sat\n" +
                "Phone: 01842-131288\n" +
                "http://www.takeandtalkbd.com/\n" +
                "\n" +
                "9.\n" +
                "GSMplus\n" +
                "4.7  out of 5\n" +
                "6 Google reviews\n" +
                "Electronics store in Dhaka, Bangladesh\n" +
                "Address: Shop#10,Block-C,Level-4 Jamuna Future Park, Bashundhara Rd, Dhaka 1229\n" +
                "Hours: Open ⋅ Closes 10PM\n" +
                "Phone: 01712-388256\n" +
                "https://www.facebook.com/gsmplusbd");
    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7637738,90.4066443/IHome+JFP/@23.793049,90.3767632,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d049bb2f3:0x9e9ad4c87c13cdc1!2m2!1d90.423972!2d23.812672"));
        startActivity(i);

    }

    public void Open1(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//take+and+talk+bd+JFP/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c64dac13de49:0x91c64598d896cd90?sa=X&ved=2ahUKEwidrofp0-ndAhULsI8KHd60CtYQ9RcwAHoECAEQCQ"));
        startActivity(i);
    }

    public void Open2(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//vision+emporium+jfp/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c7c3777a7703:0xa74432ad9c9c1b57?sa=X&ved=2ahUKEwiskfqo1OndAhXBqI8KHctaAu4Q9RcwAHoECAEQCQ"));
        startActivity(i);
    }

    public void Open3(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//gadget+and+gear+JFP/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c7608e935f2d:0x6085e532c2f4e855?sa=X&ved=2ahUKEwjXhuGT1endAhWMNo8KHV0sAO0Q9RcwAHoECAEQCQ"));
        startActivity(i);
    }

    public void Open4(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//camera+world+JFP/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c64c54b71ccf:0x4c77c0be0c207b31?sa=X&ved=2ahUKEwjB1tW21endAhUJRY8KHdKkAZwQ9RcwAHoECAEQCQ"));
        startActivity(i);
    }

    public void Open5(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//ASUS+Zenfone+Exclusive+Store,+shop+21B+block+D+level+4+jamuna+future+park+1229,+Dhaka/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c64cff342523:0xd3993c1c2446fd1e?sa=X&ved=0ahUKEwjTkrXS1endAhWMsI8KHeCECwwQ48ADCDQwAA"));
        startActivity(i);
    }

    public void Open6(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7637738,90.4066443/walton+JFP/@23.793049,90.3766734,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64da8824fa1:0xb18bf77b19f9335e!2m2!1d90.4243911!2d23.8134098"));
        startActivity(i);
    }
}
