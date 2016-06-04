package com.example.camiloandrescastro.teatro;

import android.provider.BaseColumns;

public class TablaObra {
    public static final String TABLE_NAME = "obras";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_DESCRIPCION = "descripcion";
    public static final String COLUMN_NAME_INICIO = "inicio";
    public static final String COLUMN_NAME_DURACION = "duracion";
    public static final String COLUMN_NAME_PRECIO = "precio";
    public static final String COLUMN_NAME_SALIDA = "salida";

    private static final String SEPARADOR = ",";
    private static final String TEXT_TYPE = " TEXT";
    private static final String PK = "PRIMARY KEY";
    private static final String NOTNULL = "NOT NULL";

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_NAME_INICIO + TEXT_TYPE + PK + SEPARADOR +
                    COLUMN_NAME_TITLE + TEXT_TYPE + NOTNULL + SEPARADOR +
                    COLUMN_NAME_DESCRIPCION + TEXT_TYPE + NOTNULL + SEPARADOR +
                    COLUMN_NAME_DURACION + NOTNULL + " INTEGER " +
                    COLUMN_NAME_PRECIO + NOTNULL +" DOUBLE " +
                    COLUMN_NAME_SALIDA + TEXT_TYPE + SEPARADOR +
                    " )";
    public static final String DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    public TablaObra() {
    }




}
