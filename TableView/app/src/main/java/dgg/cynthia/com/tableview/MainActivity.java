package dgg.cynthia.com.tableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnAgregar, btnModificar, btnEliminar;
    EditText texto;
    ListView lista;
    ArrayAdapter<String> adapter;
    ArrayList<String> arraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAgregar=(Button)findViewById(R.id.IDbtnAgregar);
        btnModificar=(Button)findViewById(R.id.IDModificar);
        btnEliminar=(Button)findViewById(R.id.IDbtnEliminar);
        lista=(ListView)findViewById(R.id.IDLista);
        arraylist=new ArrayList<String>();
        adapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arraylist);
        lista.setAdapter(adapter);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arraylist.add(texto.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

    }
}
