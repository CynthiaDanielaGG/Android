package dgg.cynthia.com.navegacion;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*IMPORTACION DE COMPONENTES*/

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    /*Creacion de los objetos*/

    Button btnSuma, btnResta, btnMultiplicacion, btnDivision, btnSalir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSuma = (Button)findViewById(R.id.IDsuma);
        btnResta = (Button)findViewById(R.id.IDresta);
        btnMultiplicacion = (Button)findViewById(R.id.IDmultiplicacion);
        btnDivision = (Button)findViewById(R.id.IDdivision);
        btnSalir = (Button)findViewById(R.id.IDsalir);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Suma.class);
                startActivity(intent);
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, resta.class);
                startActivity(intent);
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, multiplicacion.class);
                startActivity(intent);
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, division.class);
                startActivity(intent);
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(0);
            }
        });


    }
}
