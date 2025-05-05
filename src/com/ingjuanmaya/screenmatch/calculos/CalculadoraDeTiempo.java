package com.ingjuanmaya.screenmatch.calculos;
import com.ingjuanmaya.screenmatch.modelos.Pelicula;
import com.ingjuanmaya.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) { // Polimorfismo: Titulo = {Pelicula o Serie}
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
