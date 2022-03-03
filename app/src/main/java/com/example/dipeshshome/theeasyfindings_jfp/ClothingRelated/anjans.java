package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class anjans extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anjans);
        t=(TextView)findViewById(R.id.showdata);
        t.setText("Shop ID: Shop No # GC-15,16,\n" +
                "Type: Men's Wear \n" +
                " Floor Name : Ground Floor \n" +
                "ZONE C ( South Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" + "phone: 01678-644169\nRatings:4.2 out of 5\nGoogle Reviews: 65");

    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.anjans.com"));
        startActivity(i);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Anjan's,+Shop+No+%23+GC-15,16,+Ka-244,+Jamuna+Future+Park,+Pragati+Ave,+Dhaka/@23.7806171,90.3721183,13z/data=!4m16!1m6!3m5!1s0x3755c64dae59f28b:0xcdfda9f9e2b22e24!2sAnjan's!8m2!3d23.8138543!4d90.4239003!4m8!1m0!1m5!1m1!1s0x3755c64dae59f28b:0xcdfda9f9e2b22e24!2m2!1d90.4239003!2d23.8138543!3e2"));
        startActivity(i);
    }
}
