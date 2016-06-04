package com.example.camiloandrescastro.teatro;

import android.provider.BaseColumns;

public class TablaObra implements BaseColumns {
    public static final String TABLE_NAME = "obras";
    public static final String COLUMN_NAME_ENTRY_ID = "id";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_DESCRIPCION = "descripcion";
    public static final String COLUMN_NAME_DURACION = "duracion";
    public static final String COLUMN_NAME_PRECIO = "precio";

    private TablaObra() {
    }


}
