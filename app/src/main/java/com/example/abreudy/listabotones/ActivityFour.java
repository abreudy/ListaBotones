package com.example.abreudy.listabotones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        if(getIntent().hasExtra("com.example.abreudy.listabotones.Mensaje4")){
            String text= getIntent().getExtras().getString("com.example.abreudy.listabotones.Mensaje4");

            TextView txtInfo= findViewById(R.id.txtInfo);
            txtInfo.setText(text);

        }
    }
}
