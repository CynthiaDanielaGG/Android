package dgg.cynthia.com.navegacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*importaciones*/
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class Suma extends AppCompatActivity {
    Button btnRealizarOperacion;
    EditText numero1, numero2;
    Operaciones operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        numero1=(EditText)findViewById(R.id.IDsumatxt);
        numero2=(EditText)findViewById(R.id.IDsumatxt2);
        btnRealizarOperacion=(Button)findViewById(R.id.IDrealizarSuma);
        operacion = new Operaciones();


       btnRealizarOperacion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String obtenerNumero=numero1.getText().toString();
               //Convertimos lo que se obtiene en entero
               Double conversion=Double.parseDouble(obtenerNumero);
               //Convertimos lo que se obtiene en entero
               String obtenerNumero2=numero2.getText().toString();
               Double conversion2=Double.parseDouble(obtenerNumero2);
               operacion.setNum1(conversion);
               operacion.setNum2(conversion2);
               Double resultado= operacion.suma();
               Toast.makeText(Suma.this, resultado.toString(), Toast.LENGTH_SHORT).show();

           }
       });

    }


}
