package dgg.cynthia.com.navegacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*importaciones*/
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class division extends AppCompatActivity {

    EditText numero1, numero2;
    Button btnRealizarOperacion;
    Operaciones operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        numero1=(EditText)findViewById(R.id.IDtxtDivision);
        numero2=(EditText)findViewById(R.id.IDtxtDivision2);
        btnRealizarOperacion=(Button)findViewById(R.id.IDbtnDivision);
        operacion=new Operaciones();

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
                //operacion.resta();
                Toast.makeText(division.this, operacion.division().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
