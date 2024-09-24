package com.parcial;

import java.time.LocalDateTime;

public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private LocalDateTime fechaHora;

    public Reserva(Cliente cliente, Mesa mesa, LocalDateTime fechaHora) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
    }

    public void confirmarReserva() {
        this.mesa.ocuparMesa();
    }
    public void cancelarReserva(){
        this.mesa.liberarMesa();
    }
    public String obtenerDetalle(){
        return "Reserva para " + this.cliente.getNombre() + " - Mesa " + this.mesa.getNumeroMesa() + " - Fecha y hora: " + this.fechaHora;
    }

    //getters y setters

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
