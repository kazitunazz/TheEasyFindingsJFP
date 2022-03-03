package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cinemas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
    }

    public void OpenToday(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blockbusterbd.com/schedule.php"));
        startActivity(i);
    }
    public void OpenTomorrow(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blockbusterbd.com/schedule.php?request=2018-06-10"));
        startActivity(i);
    }
    public void NextFew(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blockbusterbd.com/schedule.php"));
        startActivity(i);
    }
    public void Ticket(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blockbusterbd.com/ticket_price.php"));
        startActivity(i);
    }

}
