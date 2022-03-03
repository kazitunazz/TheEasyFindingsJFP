package com.example.dipeshshome.theeasyfindings_jfp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class caccessories extends AppCompatActivity {
    TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caccessories);
        v=(TextView)findViewById(R.id.showdata);
        v.setText("1.Computer Service\n" +
                        "4.0  out of 5\n" +
                        "5 Google reviews\n" +
                        "Shop id: 4B-05"+
                        "Computer Accessories store in Dhaka, Bangladesh\n" +
                        "Address: Level 4, Block B, Jamuna Future Park, 1229\n" +
                        "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                        "Phone: 01556-996666\n" +
                        "http://computerservicesltd.com\n" +
                        "\n" +

                "2.Logitech Computers\n" +
                        "4.0  out of 5\n" +
                        "5 Google reviews\n" +
                        "Shop id: 4A-044"+
                        "Computer Accessories store in Dhaka, Bangladesh\n" +
                        "Address: Level 4, Block A, Jamuna Future Park, 1229\n" +
                        "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                        "Phone:  01862-269919\n" +
                        "http://logitechcomputers.com\n" +
                        "\n" +

                "3.Sony Rangs Computers\n" +
                        "4.0  out of 5\n" +
                        "5 Google reviews\n" +
                        "Shop id: 4B-026"+
                        "Computer Accessories store in Dhaka, Bangladesh\n" +
                        "Address: Level 4, Block B, Jamuna Future Park, 1229\n" +
                        "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                        "Phone:  01730-013550\n" +
                        "http://www.rangs.com.bd\n" +
                        "\n" +

                "4.Tech Valley\n" +
                        "4.0  out of 5\n" +
                        "5 Google reviews\n" +
                        "Shop id: 4A-016"+
                        "Computer Accessories store in Dhaka, Bangladesh\n" +
                        "Address: Level 4, Block A, Jamuna Future Park, 1229\n" +
                        "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                        "Phone:  02-8900480\n" +
                        "http://www.tvsl-bd.com\n" +
                        "\n" +

                "5.HP Pavilion\n" +
                        "4.0  out of 5\n" +
                        "5 Google reviews\n" +
                        "Shop id: 4A-053"+
                        "Computer Accessories store in Dhaka, Bangladesh\n" +
                        "Address: Level 4, Block A, Jamuna Future Park, 1229\n" +
                        "Hours: Closes soon: 9PM ⋅ Opens 11AM Sat\n" +
                        "Phone:  01760-500800\n" +
                        "http://www.hppavilion.com.bd\n" +
                        "\n");
    }
    public void Open(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7566345,90.4121836/computer+services+ltd+in+JFP/@23.7891515,90.3770422,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64c586065af:0x1267650c1748b0ce!2m2!1d90.4250305!2d23.813362"));
        startActivity(i);

    }

    public void Open1(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7566345,90.4121836/logitech+computers+in+JFP/@23.7891515,90.3770422,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64da5e3cb63:0x53be6cb0518080e6!2m2!1d90.4236217!2d23.8133764"));
        startActivity(i);
    }

    public void Open2(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7566345,90.4121836/Rangs+electronics+jamuna+future+park/@23.7891515,90.3770422,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64c4f80597f:0x84d8f723c43950e3!2m2!1d90.4240044!2d23.8135432"));
        startActivity(i);
    }

    public void Open3(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7566345,90.4121836/tech+valley+systems+ltd+in+JFP/@23.7914596,90.3723958,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c65e714cb73b:0xec3e97105405f2e1!2m2!1d90.4169345!2d23.8321927"));
        startActivity(i);
    }

    public void Open4(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/23.7566345,90.4121836/computer+accessories+store+in+JFP/@23.7891515,90.3770422,13z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c64c5691d58f:0xe2a323d2a8e992f6!2m2!1d90.4246427!2d23.8135064"));
        startActivity(i);
    }
}
