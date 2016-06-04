package com.example.camiloandrescastro.teatro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TeatroDb extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Teatro.db";

    public TeatroDb(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TablaObra.CREATE_TABLE);
        db.execSQL(TablaButaca.CREATE_TABLE);
        db.execSQL(TablaUsuario.CREATE_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(TablaObra.DELETE_TABLE);
        db.execSQL(TablaButaca.DELETE_TABLE);
        db.execSQL(TablaUsuario.DELETE_TABLE);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
