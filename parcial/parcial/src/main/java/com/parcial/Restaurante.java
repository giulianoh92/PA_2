package com.parcial;
import java.util.List;
import java.util.ArrayList;

public class Restaurante {
    private List<Mesa> mesas = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Restaurante() {
    }

    public void agregarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public Mesa buscarMesaDisponible(int capacidad){
        Mesa mesaOptima = null;
        for (Mesa mesa : this.mesas) {
            if (mesa.isDisponible() && mesa.getCapacidad() >= capacidad) {
                if (mesaOptima == null || mesa.getCapacidad() < mesaOptima.getCapacidad()) {
                    mesaOptima = mesa;
                }
            }
        }
        return mesaOptima;
    }

    public void registrarReserva(Reserva reserva){
        reserva.getCliente().hacerReserva(reserva);
        this.reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva){
        this.reservas.remove(reserva);
        reserva.getCliente().cancelarReserva();
    }
}
