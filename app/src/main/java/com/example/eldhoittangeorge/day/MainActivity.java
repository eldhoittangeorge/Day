package com.example.eldhoittangeorge.day;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        //identify where the text is entered
        EditText UsrnameEditText = (EditText) findViewById(R.id.UsrName);
        EditText passwordEditText = (EditText) findViewById(R.id.password);
        //retrive the entered data
        String uname = UsrnameEditText.getText().toString();
        String passw = passwordEditText.getText().toString();



        if (uname.equals("eldho")&&passw.equals("12345"))
            Toast.makeText(MainActivity.this, "Username is "+ uname +"and password is "+ passw, Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(MainActivity.this, "incorrect password or username", Toast.LENGTH_SHORT).show();
    }
}
