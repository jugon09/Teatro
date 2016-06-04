package com.example.camiloandrescastro.teatro;

public class Butaca {
    private int id;
    private boolean ocupado;
    private Usuario usuario;
    public Butaca(int id, boolean ocupado, Usuario usu) {
        this.id = id;
        this.ocupado = ocupado;
        usuario = usu;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
