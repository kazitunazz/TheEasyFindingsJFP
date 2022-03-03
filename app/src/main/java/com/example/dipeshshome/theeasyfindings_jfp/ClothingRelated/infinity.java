package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dipeshshome.theeasyfindings_jfp.R;

public class infinity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinity);
        t=(TextView)findViewById(R.id.showdata);
        t.setText("Shop ID: 20-22\n" +
                "Type: Varities and handicrafts\n" +
                " Floor Name : Ground Floor\n" +
                "Zone : C\n" +
                "Court : \n" +
                "West Court\n" +
                "Hours: Closes:9pm-Opens 11AM \n" +
                "Tue Close \n" +
                " Phone: 02-9824051\n" +
                "Ratings:4.2 out of 5\n" +
                "Google Reviews: 165");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://infinitymegamall.com"));
        startActivity(i);
    }
}
