package com.example.abreudy.listabotones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creando las referencias a los botones del diseño
        Button btnUno= (Button) findViewById(R.id.btnUno);
        Button btnDos= (Button) findViewById(R.id.btnDos);
        Button btnTres= (Button) findViewById(R.id.btnTres);
        Button btnCuatro= (Button) findViewById(R.id.btnCuatro);
        Button btnCinco= (Button) findViewById(R.id.btnCinco);

        //Asignando un OnClickListener a cada botón

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí se crea un Intent que tiene como función pasarnos a la actividad asignada
                Intent intentFirstActivity= new Intent(getApplicationContext(), FirstActivity.class);


                //Aquí le paso un mensaje desde el MainActivity hacia FirstActivity, se usa esa estandar para
                //establecer el id de referncia (los paquetes com.example.etc) y luego el valor en ese caso Actividad Uno
                intentFirstActivity.putExtra("com.example.abreudy.listabotones.Mensaje1", "Actividad Uno");

                //Se inicia la actividad previamente instanciada
                startActivity(intentFirstActivity);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSecondActivity= new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intentSecondActivity);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentThirdActivy= new Intent(getApplicationContext(), ThirdActivity.class);

                startActivity(intentThirdActivy);
                //Esta tiene un CoordinatorLayout
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivityFour= new Intent(getApplicationContext(), ActivityFour.class);
                intentActivityFour.putExtra("com.example.abreudy.listabotones.Mensaje4", "Actividad Cuatro \nFrame Layout");

                startActivity(intentActivityFour);
                //Esta tiene un FrameLayout
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivityFive= new Intent(getApplicationContext(), ActivityFive.class);
                intentActivityFive.putExtra("com.example.abreudy.listabotones.Mensaje5", "Actividad Cinco \nConstraint Layout");

                startActivity(intentActivityFive);
                //Esta tiene un ConstraintLayout
            }
        });
    }
}
