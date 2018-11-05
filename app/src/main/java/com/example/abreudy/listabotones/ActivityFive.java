package com.example.abreudy.listabotones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        if(getIntent().hasExtra("com.example.abreudy.listabotones.Mensaje5")){
            String text= getIntent().getExtras().getString("com.example.abreudy.listabotones.Mensaje5");

            TextView txtInfo= (TextView) findViewById(R.id.txtInfo);
            txtInfo.setText(text);

        }

        Button btnToast= (Button) findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMessage= Toast.makeText(getApplicationContext(),"Toast Actividad\nNúmero Cinco", Toast.LENGTH_SHORT);
                tMessage.show();
            }
        });
    }
}
