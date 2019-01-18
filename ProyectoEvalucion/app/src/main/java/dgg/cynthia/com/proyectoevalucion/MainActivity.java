/*
******************************************
* INSTITUTO TECNOLOGICO DE CHILPANCINGO  *
* INGENIERIA EN SISTEMAS COMPUTACIONALES *
* FUNDAMENTOS DE COMPUTO MÓVIL           *
* DR. WILFRIDO CAMPOS FRANCISCO          *
* AUTORA: CYNTHIA DANIELA GARCIA GONZALEZ*
* ****************************************
*/
package dgg.cynthia.com.proyectoevalucion;

import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*importacion de componentes*/
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    /*Creacion de los objetos*/
    Button botonPar, botonPrimo;
    EditText textNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instanciacion de los objetos
        textNum=(EditText)findViewById(R.id.IDtxt);
        botonPrimo=(Button)findViewById(R.id.btnPrimo);
        botonPar=(Button)findViewById(R.id.btnPar);

        //Evento del boton, para calcular el numero primo
        botonPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtenemos lo que contiene el EditText
                String obtenerNumero=textNum.getText().toString();
                //Convertimos lo que se obtiene en entero
                int conversion=Integer.parseInt(obtenerNumero);
                //declaramos una la variable a, que nos funcionara como acumulador
                int a=0;
                //Hacemos n inteciones hasta el i<= numero que ingresamos
                for (int i=1; i<=conversion; i++) {
                    //si el residuo de la division del numero que ingresamos entre el valor de actual de i es igual a 0
                    if (conversion % i == 0){
                        //Incrementamos el valor de a
                        a = a + 1;
                    }//fin del if
                }//fin del for
                //Al terminar la iteracion del ciclo si a= 2
                if (a<=2){
                    //Mandamos un mensaje de que es un numero primo
                    Toast.makeText(MainActivity.this, " El numero "+conversion+ " es primo", Toast.LENGTH_SHORT).show();
                    //de caso contrario
                } else {
                    //Mandamos un mensaje de que es un numero no primo
                    Toast.makeText(MainActivity.this, " El numero "+conversion+" no es primo", Toast.LENGTH_SHORT).show();
                }//fin del else
            }
        });
        //Evento del boton para saber si el numero es par o no
        botonPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtenemos lo que contiene el EditText
                String obtenerNumero=textNum.getText().toString();
                //convetimos lo que se obtuvo
                int conversion=Integer.parseInt(obtenerNumero);
                //si el residuo de la division del numero que ingresamos entre 2 es igual a 0
                if(conversion%2==0){
                    //mandamos un mensaje de que el numero es par
                    Toast.makeText(MainActivity.this, conversion+" es par", Toast.LENGTH_SHORT).show();
                    //de caso contrario
                }else{
                    //mandamos un mensaje de que el numero es impar
                    Toast.makeText(MainActivity.this, conversion+ " es impar", Toast.LENGTH_LONG).show();
                }//fin del else
            }
        });
    }


}
