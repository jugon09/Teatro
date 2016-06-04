package com.example.camiloandrescastro.teatro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.SimpleDateFormat;

public class GestorDb {
    private TeatroDb tdb;
    public GestorDb(Context context) {
        tdb = new TeatroDb(context);
    }

    public void insertarUsuario(Usuario u) {
        SQLiteDatabase db = tdb.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TablaUsuario.COLUMN_NAME_NOMBRE, u.getNombre());
        values.put(TablaUsuario.COLUMN_NAME_APELLIDOS, u.getApellido());
        values.put(TablaUsuario.COLUMN_NAME_EMAIL, u.getEmail());
        db.insert(TablaUsuario.TABLE_NAME,null,values);
    }

    public void insertarObra(Obra o) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String dataIn = sdf.format(o.getInicio());
        String dataOut = sdf.format(o.getFin());
        SQLiteDatabase db = tdb.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TablaObra.COLUMN_NAME_TITLE, o.getTitle());
        values.put(TablaObra.COLUMN_NAME_DESCRIPCION, o.getDescripcion());
        values.put(TablaObra.COLUMN_NAME_DURACION, o.getDuracion());
        values.put(TablaObra.COLUMN_NAME_INICIO,dataIn);
        values.put(TablaObra.COLUMN_NAME_PRECIO,o.getPrecio());
        values.put(TablaObra.COLUMN_NAME_SALIDA, dataOut);
        db.insert(TablaObra.TABLE_NAME, null, values);
        for (int i = 0; i < Obra.num_butacas(); ++i) insertarButaca(o.getButaca(i),dataIn,db);
    }

    public void insertarButaca(Butaca b, String fecha,SQLiteDatabase db) {
        ContentValues values = new ContentValues();
        values.put(TablaButaca.COLUMN_NAME_ID, b.getId());
        values.put(TablaButaca.COLUMN_NAME_OCUPADA, b.isOcupado());
        values.put(TablaButaca.COLUMN_NAME_TIEMPO, fecha);
        if (b.getUsuario() != null) {
            Usuario u = b.getUsuario();
            String selectQuery = "SELECT " + TablaUsuario._ID + " FROM " + TablaUsuario.TABLE_NAME
                    + " WHERE " + TablaUsuario.COLUMN_NAME_NOMBRE + " = " + u.getNombre() +
                    " AND " + TablaUsuario.COLUMN_NAME_APELLIDOS + " = " + u.getApellido() +
                    " AND " + TablaUsuario.COLUMN_NAME_EMAIL + " = " + u.getEmail();
            Cursor c = db.rawQuery(selectQuery, null);
            if (c.moveToFirst()) {
                int id = c.getInt(
                        c.getColumnIndexOrThrow(TablaUsuario._ID));
                values.put(TablaButaca.COLUMN_NAME_USUARIO, id);
            }
        }
        db.insert(TablaButaca.TABLE_NAME, null, values);
    }
}
