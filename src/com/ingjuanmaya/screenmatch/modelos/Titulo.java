package com.ingjuanmaya.screenmatch.modelos;

public class Titulo {
    // Modificadores de acceso "private" {"protected", "public", "default", "private"}
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidaEnElPlan;
    private double sumaEvaluaciones;
    private int totalEvaluacione;

    public void setNombre(String nombre) {
        this.nombre = nombre; // this le aclara al copilador que es el atributo nombre que definimos en esta clase.
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidaEnElPlan(boolean incluidaEnElPlan) {
        this.incluidaEnElPlan = incluidaEnElPlan;
    }

    // Forma de obtener una variable privada
    public int getTotalEvaluacione(){
        return totalEvaluacione;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidaEnElPlan() {
        return incluidaEnElPlan;
    }

    public void muestraFichaTecnica() {
        System.out.println("El Titulo es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("La duración en minutos es: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluacione ++;

    }

    public double calculaMedia(){
        return sumaEvaluaciones / totalEvaluacione;
    }
}
