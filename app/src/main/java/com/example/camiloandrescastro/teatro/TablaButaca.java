package com.example.camiloandrescastro.teatro;

public class TablaButaca {
    public static final String TABLE_NAME = "butaca";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_TIEMPO = "tiempo";
    public static final String COLUMN_NAME_OCUPADA = "ocupada";
    public static final String COLUMN_NAME_USUARIO = "usuario";

    private static final String SEPARADOR = ",";
    private static final String TEXT_TYPE = " TEXT";
    private static final String PK = "PRIMARY KEY";
    private static final String FK = "FOREIGN KEY";
    private static final String NOTNULL = "NOT NULL";

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_NAME_ID + " INTEGER " + NOTNULL + SEPARADOR +
                    COLUMN_NAME_TIEMPO + TEXT_TYPE + NOTNULL + SEPARADOR +
                    PK + "(" + COLUMN_NAME_ID + SEPARADOR + COLUMN_NAME_TIEMPO + ")" + SEPARADOR +
                    FK + "(" + COLUMN_NAME_TIEMPO + ") REFERENCES + " + TablaObra.TABLE_NAME + "(" + TablaObra.COLUMN_NAME_INICIO + ")" + SEPARADOR +
                    COLUMN_NAME_OCUPADA + " INTEGER" + NOTNULL + SEPARADOR +
                    COLUMN_NAME_USUARIO + " INTEGER " + NOTNULL + SEPARADOR +
                    FK + "(" + COLUMN_NAME_USUARIO + ") REFERENCES + " + TablaUsuario.TABLE_NAME + "(" + TablaUsuario._ID + ")" + SEPARADOR +
                    " )";

    public static final String DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}
