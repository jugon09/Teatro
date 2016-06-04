package com.example.camiloandrescastro.teatro;

public class Butaca {
    private int id;
    private boolean ocupado;
    public Butaca(int id, boolean ocupado) {
        this.id = id;
        this.ocupado = ocupado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
