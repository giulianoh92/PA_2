package com.parcial;

public class Mesa {

    private int numeroMesa;
    private int capacidad;
    private boolean disponible;

    public Mesa(int numeroMesa, int capacidad, boolean disponible) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    void ocuparMesa() {
        this.disponible = false;
    }

    void liberarMesa() {
        this.disponible = true;
    } 

    String obtenerInformacion() {
        return "Mesa " + this.numeroMesa + " - Capacidad: " + this.capacidad + " - Disponible: " + this.disponible;
    }

    //getters y setters

    public int getNumeroMesa() {
        return numeroMesa;
    }
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}   
