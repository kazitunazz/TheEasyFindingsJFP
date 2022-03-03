package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class brack extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brack);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Shop ID: GC-30\nType: ATM\nFloor Name : Ground Floor \nZONE C ( South Court)\nHours: Closes:9pm-Opens 11AM \nTue Close Phone: 02-9824051\nRatings:4.2 out of 5\nGoogle Reviews: 165");


    }
//OPENING A LAYOUT OF WEBSITE PAGE CODE//
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bracbank.com/home.php"));
        startActivity(i);
    }
    //OPENING A LAYOUT OF Google MAP CODE//
    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//BRAC+Bank+Limited+%7C+ATM+Booth,+Pragati+Ave,+Dhaka/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c6521d9d5b0b:0xc92ccb1bda4f9853?sa=X&ved=0ahUKEwi_6oOpwYLdAhVMuo8KHXPoBcsQ48ADCDwwAQ"));
        startActivity(i);

    }
}
