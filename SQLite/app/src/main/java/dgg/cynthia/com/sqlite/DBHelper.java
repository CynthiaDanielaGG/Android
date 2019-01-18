package dgg.cynthia.com.sqlite;

import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Cynthia on 30/03/2017.
 */

public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "escuela.sqlite";
    private static final int DB_SCHEME_VERSION = 1;

    public DBHelper(Context context) {
        super(context,DB_NAME, null,DB_SCHEME_VERSION);
    }


    public void onCreate(SQLiteDatabase db){

        db.execSQL(DataBaseProfesores.CREATE_TABLE);

  }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
