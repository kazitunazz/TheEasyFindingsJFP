package com.example.dipeshshome.theeasyfindings_jfp.StartpageRelated;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dipeshshome.theeasyfindings_jfp.R;
import com.example.dipeshshome.theeasyfindings_jfp.update;

public class login extends AppCompatActivity {
 private EditText name,password;
 private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });


    }
    private  void validate(String username,String userpass)
    {
        if(((username.equals("Dipesh"))&&(userpass.equals("1234")))||((username.equals("Tuna"))&&(userpass.equals("4567"))))
        {
            Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG).show();
            Intent i = new Intent(login.this,update.class);
            startActivity(i);
        }
        else
            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();

    }

}
