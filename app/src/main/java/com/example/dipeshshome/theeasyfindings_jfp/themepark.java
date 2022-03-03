package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class themepark extends AppCompatActivity {
    TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_themepark);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("1.Jamuna Amunsement Park\n" +
                "\n" +
                "Type:Entertainmment \n" +
                "Floor Name: Entarnce \n" +
                "Zone: Ground Floor\\n\n" +
                "Hours: Closes: 9pm - Opens:11am \n" +
                "Tue Close \n" +
                "Phone no:02-8413761 \n" +
                "Ratings: 4.3 out of 5 \n" +
                "Google review:165 \n" +
                "\n" +
                "\n" +
                "2.Jamuna Convention Center\n" +
                "\n" +
                "Type:Entertainmment \n" +
                "Floor Name: North Court, Level 1 \n" +
                "ZOne:B \\n\n" +
                "Hours: Closes: 9pm - Opens:11am \n" +
                "Tue Close \\n\n" +
                "Phone no:031-626364 \n" +
                "Ratings: 4.3 out of 5 \n" +
                "Google review:165 \n" +
                "\n" +
                "\n" +
                "3.Bowling Valley\n" +
                "\n" +
                "Players Club \n" +
                "Type:Entertainmment \n" +
                "Floor Name: Level:5 \n" +
                "ZOne:C\n" +
                "Hours: Closes: 9pm - Opens:11am \n" +
                "Tue Close \n" +
                "Phone no: 0841-3762 \n" +
                "Ratings: 4.3 out of 5 \n" +
                "Google review:165 \n" +
                "\n" +
                "\n" +
                "4.Health and Gym\n" +
                "\n" +
                "Future Fitness GYM\n"+
                "Type:Entertainmment \n" +
                "Floor Name: Level:5 \n" +
                "ZOne:B\\n\n" +
                "Hours: Closes: 9pm - Opens:11am \n" +
                "Tue Close \\n\n" +
                "Phone no: 01670-114394\n" +
                "Ratings: 4.3 out of 5 \n" +
                "Google review:165 \n" +
                "\n" +
                "\n" +
                "\n");
    }

    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7782392,90.3977394/amusement+park+jfp/@23.8002812,90.3940596,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d82f2aff5:0x4064dbf4ade56307!2m2!1d90.422237!2d23.8130141"));
        startActivity(i);
    }

    public void Open1(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7782392,90.3977394/convention+centerin+JFP/@23.8002812,90.3939701,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d09b236db:0xe6ea07e4b28327b7!2m2!1d90.4243864!2d23.8134058"));
        startActivity(i);
    }

    public void Open2(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7782392,90.3977394/bowling+valley+jfp/@23.8002812,90.3939698,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64d0f66efb9:0x71bd66fba544d8fe!2m2!1d90.4243838!2d23.813408"));
        startActivity(i);
    }

    public void Open3(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//health+and+gym+jfp/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x3755c64c4fe4f8e1:0xee7461cc049c1161?sa=X&ved=2ahUKEwjS0cWauYveAhXOTX0KHYjpCWMQ9RcwAHoECAEQCQ"));
        startActivity(i);
    }
}
