package com.example.camiloandrescastro.teatro;

import java.util.ArrayList;

public class GestorObras {
    private ArrayList<Obra> obras;

    public GestorObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public Obra getObra(int i) {
        return obras.get(i);
    }
}
