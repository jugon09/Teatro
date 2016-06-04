package com.example.camiloandrescastro.teatro;

import java.util.ArrayList;
import java.util.Date;

public class Obra {
    private String title;
    private String descripcion;
    private int duracion;
    private int precio;
    private Date inicio;
    private Date fin;
    private GestorButacas gb;

    public Obra(String title, String descripcion, int duracion, int precio, Date inicio, Date fin) {
        this.title = title;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.precio = precio;
        this.inicio = inicio;
        this.fin = fin;
        ArrayList<Boolean> buts = new ArrayList<>(GestorButacas.NUM_BUTACAS);
        for (int i = 0; i < buts.size(); ++i) buts.set(i,false);
        this.gb = new GestorButacas(buts);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public GestorButacas getGb() {
        return gb;
    }

    public void setGb(GestorButacas gb) {
        this.gb = gb;
    }

    public Butaca getButaca(int id) {return gb.getButaca(id);}

    public static int num_butacas() {return GestorButacas.NUM_BUTACAS;}
}
