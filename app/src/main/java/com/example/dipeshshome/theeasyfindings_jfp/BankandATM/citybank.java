package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class citybank extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citybank);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Shop ID: 1D-5-7\n" +
                "Type: Bank\n" +
                "Floor Name : First Floor\n" +
                "ZONE D ( East Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" +
                "Phone: 02-9824051\n" +
                "Ratings:4.2 out of 5\n" +
                "Google Reviews: 165\n");
    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thecitybank.com"));
        startActivity(i);
    }

    public void openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7637738,90.4066443/The+City+Bank+Limited,+Jamuna+Future+Park+Branch.,+H-335+Bashundhara+Rd,+Dhaka/@23.793049,90.3766731,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d01ffad83:0x590d2cb8015d90fa!2m2!1d90.4243854!2d23.8134114"));
        startActivity(i);
    }
}
