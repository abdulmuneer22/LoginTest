package com.madnum.muneer.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Variables


    EditText username,pwd;
    Button btCheckButton;
    TextView result_tv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Declare Methods Here




        username = (EditText) findViewById(R.id.editText1);
        pwd = (EditText) findViewById(R.id.editText2);
        btCheckButton = (Button) findViewById(R.id.btCheckButton);
        result_tv = (TextView) findViewById(R.id.result_tv);

        final String  text1,text2;





        btCheckButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                final String Password_1 = username.getText().toString();
                final String Password_2 = pwd.getText().toString();


               // result_tv.setText("Password is "+Password_1);

                CheckPasswords ch1 = new CheckPasswords();
                ch1.PasswordCheck(Password_1, Password_2, result_tv);
            }
        });















    }

    }





