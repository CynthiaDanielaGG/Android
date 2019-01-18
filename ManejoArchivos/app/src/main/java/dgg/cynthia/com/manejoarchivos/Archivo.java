package dgg.cynthia.com.manejoarchivos;
import android.content.Context;
import android.util.Log;


import java.io.ObjectOutput;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Cynthia on 09/03/2017.
 */

public class Archivo {
    String nombre, numControl;
    int calificacion;
    ArrayList<String> alumno;

    /*constructor vacio*/
    public Archivo() {
        alumno = new ArrayList<String>();
    }


    /*metodos set's*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumcontrol(String numcontrol) {
        this.numControl = numcontrol;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;

    }
    /*Metodos get's*/

    public String getNombre() {
        return nombre;
    }

    public String getNumcontrol() {
        return numControl;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Archivo(String nombreAlumno, String numeroControl, int calificacionAlumno) {
        nombreAlumno = nombre;
        numeroControl = numControl;
        calificacionAlumno = calificacion;
    }

    /*Agregar un alumno al archivo*/
    public void agregarAlumnoArchivo() {
        String texto = getNombre() + "," + getNumcontrol() + "," + getCalificacion();
        try {
            OutputStreamWriter abrir = new OutputStreamWriter(openFileOutput("alumnos.txt", Context.MODE_PRIVATE));
            alumno.add(texto);



            fout.close();
        } catch (Exception ex) {
            Log.e("Archivos", "Error al escribir archivo a memoria interna");
        }
    }


}