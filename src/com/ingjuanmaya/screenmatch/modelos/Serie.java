package com.ingjuanmaya.screenmatch.modelos;

public class Serie extends Titulo { // Con extend decimos que una Serie es un hijo de Titulo o bien, Una serie es un titulo.
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {

        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
