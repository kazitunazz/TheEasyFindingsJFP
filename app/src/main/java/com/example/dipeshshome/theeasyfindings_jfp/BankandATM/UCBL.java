package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class UCBL extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucbl);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Shop ID: 1D-008\n" +
                "Type: Bank\n" +
                "Floor Name : First Floor\n" +
                "ZONE D ( East Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ucb.com.bd"));
        startActivity(i);

    }

    public void openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/ucbl++jamuna+future+park+branch/data=!4m5!4m4!1m0!1m2!1m1!1s0x3755c64c831699b7:0x57228e15822b6d0f?sa=X&ved=2ahUKEwi0po-zyoLdAhWBOI8KHVfEAEIQ9RcwAHoECAEQCQ"));
        startActivity(i);

    }


}
