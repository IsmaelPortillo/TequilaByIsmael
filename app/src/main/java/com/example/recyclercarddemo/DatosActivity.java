package com.example.recyclercarddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "¡Exitoso!";
        int duration =Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 80,300);
        toast.show();
    }
}