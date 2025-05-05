package com.ingjuanmaya.screenmatch.modelos;

import com.ingjuanmaya.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {// Con extend decimos que una pelicula es un hijo de Titulo o bien, Una Pelicula es un titulo.
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
