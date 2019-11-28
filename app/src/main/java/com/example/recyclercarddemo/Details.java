package com.example.recyclercarddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView textTitle;
    TextView texDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        textTitle = findViewById(R.id.detailTitle);
        textTitle.setText(title);

        Intent s = getIntent();
        String autor = i.getStringExtra("autor");
        texDesc = findViewById(R.id.detailAutor);
        texDesc.setText(title);


        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DatosActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
