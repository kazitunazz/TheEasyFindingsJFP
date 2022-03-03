package com.example.dipeshshome.theeasyfindings_jfp.ClothingRelated;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dipeshshome.theeasyfindings_jfp.R;

import java.awt.font.TextAttribute;

public class aarong extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarong);


    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aarong.com"));
        startActivity(i);
    }

    public void Openmap(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/''/aarong+jamuna+future+park/data=!4m5!4m4!1m0!1m2!1m1!1s0x3755c64d00018475:0x76a1a9984e640453?sa=X&ved=0ahUKEwjWuqTGjtXbAhWXfCsKHXYcBuYQ9RcIuAEwDw"));
        startActivity(i);
    }
}
