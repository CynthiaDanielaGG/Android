package dgg.cynthia.com.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Cynthia on 30/03/2017.
 */

public class DataBaseProfesores {
    public static String TABLE_NAME = "profesores";

    public static final String NUMERO_EMPLEADO = "numEmpleado";
    public static final String NOMBRE_EMPLEADO = "nombreEmpleado";
    public static final String SALARIO_EMPLEADO = "salarioEmpleado";


    public static final String CREATE_TABLE = "create table "+ TABLE_NAME + " ("
            + NUMERO_EMPLEADO + " integer primary key autoincrement,"
            +NOMBRE_EMPLEADO + " text not null,"
            +SALARIO_EMPLEADO + " integer);";

    private DBHelper helper;
    private SQLiteDatabase db;

    public DataBaseProfesores(Context context) {
         helper = new DBHelper(context);
         db = helper.getWritableDatabase();


    }
    public ContentValues generarContentValues(String nombre, String sueldo){
        ContentValues valores = new ContentValues();
        valores.put(NOMBRE_EMPLEADO,nombre);
        valores.put(SALARIO_EMPLEADO, sueldo);

        return  valores;
    }

    public void insertar (String nombre, String sueldo){

        db.insert(TABLE_NAME,null,generarContentValues(nombre,sueldo));
    }
    public void eliminar(String nombre){

    }

    public void modificar(String nombre, String salario){

    }
}

