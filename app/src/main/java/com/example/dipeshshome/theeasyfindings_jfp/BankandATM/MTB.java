package com.example.dipeshshome.theeasyfindings_jfp.BankandATM;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class MTB extends AppCompatActivity {
TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtb);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("Shop ID: GD-07\n" +
                "Type: ATM\n" +
                "Floor Name : Ground Floor \n" +
                "ZONE D ( East Court)\n" +
                "nHours: Closes:9pm-Opens 11AM \n" +
                "Tue Close\n" +
                "Phone: 02-9824051\n" +
                "Ratings:4.2 out of 5\n" +
                "Google Reviews: 165\n");
    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mutualtrustbank.com"));
        startActivity(i);

    }

    public void openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(\"http://www.mutualtrustbank.com\"));\n" +
                "        startActivity(i);"));
        startActivity(i);

    }
}
