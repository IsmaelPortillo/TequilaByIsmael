package com.example.recyclercarddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText Us,Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Us = findViewById(R.id.Matricula);
        Pass = findViewById(R.id.Matricula);


    }




    public void ingresar (View v)
    {
        String usu = Us.getText().toString();
        String pass = Pass.getText().toString();


        if (usu.equals("123")&&pass.equals("123"))
        {
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    }
}
