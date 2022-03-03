package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class easternbl extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easternbl);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Shop ID: GC-15\n" +
                "Type: Bank\n" +
                "Floor Name : Fifth Floor\n " +
                "ZONE C ( South Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" +
                "Phone: 02-9824051\n" +
                "Ratings:4.2 out of 5\n" +
                "Google Reviews: 165\n");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ebl.com.bd"));
        startActivity(i);

    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Eastern+Bank+Limited+%7C+ATM+Booth,+Jamuna+Future+Park,+Dhaka/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c64cfd7dc053:0x63a337b064a18dfd?sa=X&ved=0ahUKEwid3ob-woLdAhWMpo8KHXwxDiAQ48ADCB0wAA"));
        startActivity(i);
    }
}
