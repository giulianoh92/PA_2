package com.giu.tp3_1;

public class Ejemplar {
    private int nroInventario;
    private boolean sale;
    private boolean prestado;

    public Ejemplar(int nroInventario, boolean sale, boolean prestado){
        this.nroInventario = nroInventario;
        this.sale = sale;
        this.prestado = prestado;
    }

    public int getNroInventario() {
        return nroInventario;
    }

    public void setNroInventario(int nroInventario) {
        this.nroInventario = nroInventario;
    }

    public boolean getPrestado(){
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean getSale(){
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }
}
