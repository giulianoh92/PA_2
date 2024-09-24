package com.parcial;

public class Cliente {
    private String nombre;
    private String telefono;
    private Reserva reserva;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void hacerReserva(Reserva reserva){
        reserva.confirmarReserva();
        this.reserva = reserva;
    }
    public void cancelarReserva(){
        this.reserva.cancelarReserva();
        this.reserva = null;
    }
    public String obtenerInformacion(){
        return "Cliente: " + this.nombre + " - Teléfono: " + this.telefono + " - Reserva: " + (this.reserva != null ? "Con reserva" : "Sin reserva");
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
