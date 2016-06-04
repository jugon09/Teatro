package com.example.camiloandrescastro.teatro;


import android.provider.BaseColumns;

public class TablaUsuario implements BaseColumns{
    public static final String TABLE_NAME = "usuarios";
    public static final String COLUMN_NAME_NOMBRE = "nombre";
    public static final String COLUMN_NAME_APELLIDOS = "apellidos";
    public static final String COLUMN_NAME_EMAIL = "email";

    private static final String SEPARADOR = ",";
    private static final String TEXT_TYPE = " TEXT";
    private static final String PK = "PRIMARY KEY";
    private static final String NOTNULL = "NOT NULL";

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    _ID + " INTEGER " + NOTNULL + PK + SEPARADOR +
                    COLUMN_NAME_NOMBRE + TEXT_TYPE + SEPARADOR +
                    COLUMN_NAME_APELLIDOS + TEXT_TYPE + NOTNULL + SEPARADOR +
                    COLUMN_NAME_EMAIL + TEXT_TYPE + NOTNULL + SEPARADOR +
                    " )";

    public static final String DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    private TablaUsuario() {
    }

}
