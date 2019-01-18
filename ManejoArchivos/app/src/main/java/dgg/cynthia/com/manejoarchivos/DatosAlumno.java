package dgg.cynthia.com.manejoarchivos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*importacion de componentes*/
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class DatosAlumno extends AppCompatActivity {
    Button btnAgregar;
    EditText txtnombreA, txtNumControl, txtCalificacion;
    Archivo file;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_alumno);
        btnAgregar=(Button)findViewById(R.id.IDbtnAgregarAlumno);
        txtnombreA=(EditText)findViewById(R.id.IDtxtNombreAlumno);
        txtNumControl=(EditText)findViewById(R.id.IDtxtNumControl);
        txtCalificacion=(EditText)findViewById(R.id.IDtxtCalificacion);

    }

}
