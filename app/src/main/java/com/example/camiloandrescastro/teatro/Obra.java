package com.example.camiloandrescastro.teatro;

public class Obra {
    private String title;
    private String descripcion;
    private int duracion;
    private int precio;
    private DiaHoras diaHoras;

    public Obra(String title, String descripcion, int duracion, int precio, DiaHoras diaHoras) {
        this.title = title;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.precio = precio;
        this.diaHoras = diaHoras;
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

    public DiaHoras getDiaHoras() {
        return diaHoras;
    }

    public void setDiaHoras(DiaHoras diaHoras) {
        this.diaHoras = diaHoras;
    }
}
