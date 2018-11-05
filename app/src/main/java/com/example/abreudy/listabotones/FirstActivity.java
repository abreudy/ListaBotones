package com.example.abreudy.listabotones;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Actividad Uno\nConstraint Layout", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if(getIntent().hasExtra("com.example.abreudy.listabotones.Mensaje1")){

            TextView txtInfo= (TextView) findViewById(R.id.txtInfo);

            //Creo una variable String que coge el valor de lo que sea que pasé
            String text= getIntent().getExtras().getString("com.example.abreudy.listabotones.Mensaje1");
            txtInfo.setText(text);
        }
    }

}
