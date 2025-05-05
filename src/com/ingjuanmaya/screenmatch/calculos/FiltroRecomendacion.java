package com.ingjuanmaya.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtrar(Clasificable clasificable){
        if (clasificable.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado actualmente");
        } else if (clasificable.getClasificacion() >= 2){
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Infravalorada");
        }
    }
}
