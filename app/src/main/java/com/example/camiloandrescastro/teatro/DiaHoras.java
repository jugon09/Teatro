package com.example.camiloandrescastro.teatro;

import android.text.format.Time;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by camilo on 04/06/2016.
 */
public class DiaHoras {
    private Date dia;
    private ArrayList<Time> horas;

    public DiaHoras(Date dia, ArrayList<Time> horas) {
        this.dia = dia;
        this.horas = horas;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public ArrayList<Time> getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<Time> horas) {
        this.horas = horas;
    }
}
