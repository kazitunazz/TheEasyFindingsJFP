package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class JBL extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jbl);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Shop ID: 1C-06\n" +
                "ype: Bank\n" +
                "Floor Name : First Floor \n" +
                "ZONE C ( South Court)\n" +
                "Hours: Closes:9pm-Opens 11AM \\nTue Close\n" +
                "Phone: 02-9824051\n" +
                "Ratings:4.2 out of 5\n" +
                "Google Reviews: 165\n");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jb.com.bd"));
        startActivity(i);

    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Union+Bank+Limited+%7C+Jamuna+Future+Park+Branch,+Level+%232,+Zone+%23A,+Jamuna+Future+Park+Complex,+Kuril,+progati+Sharani,+Vatara,+Dhaka,+1229/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c64da77b03bb:0x4c89e1cef0ae5fed?sa=X&ved=0ahUKEwjMo-OlyYLdAhXHo48KHc64B7wQ48ADCEQwAg"));
        startActivity(i);
    }
}
