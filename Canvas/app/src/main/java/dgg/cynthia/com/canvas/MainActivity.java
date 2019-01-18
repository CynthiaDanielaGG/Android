package dgg.cynthia.com.canvas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*importaciones para el canvas*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*declaracion de objetos*/
        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
    }

}
