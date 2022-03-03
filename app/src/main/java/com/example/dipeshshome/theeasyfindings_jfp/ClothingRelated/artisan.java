package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class artisan extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artisan);
        t=(TextView)findViewById(R.id.showdata);
        t.setText("Shop ID: GA-27\n" +
                "Type: Men's wear\n" +
                "Floor Name : Ground Floor Floor \n" +
                "ZONE A ( West Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" + "Phone : 02-9823213\n" +
                "Ratings:4.0 out of 5\n" +
                "Google Reviews: 65");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.artisanoutfitters.com"));
        startActivity(i);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/artisan+Jamuna+future+park/data=!4m5!4m4!1m0!1m2!1m1!1s0x3755c64daf4ff149:0x5939e12c061a8704?sa=X&ved=2ahUKEwj5hr-TruDbAhWBNo8KHSpvBRQQ9RcwAHoECAEQFA"));
        startActivity(i);
    }
}
