package com.parcial;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //crear lista de mesas
        List<Mesa> mesas = new ArrayList<>();
        //crear mesas
        Mesa mesa1 = new Mesa(1, 4, true);
        Mesa mesa2 = new Mesa(2, 6, true);
        Mesa mesa3 = new Mesa(3, 2, true);
        Mesa mesa4 = new Mesa(4, 8, true);
        Mesa mesa5 = new Mesa(5, 4, true);

        //agregar mesas a la lista
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        mesas.add(mesa5);

        //crear lista de clientes
        List<Cliente> clientes = new ArrayList<>();

        //crear clientes
        Cliente cliente1 = new Cliente("Juan", "123456789");
        Cliente cliente2 = new Cliente("Ana", "987654321");
        Cliente cliente3 = new Cliente("Pedro", "456789123");
        Cliente cliente4 = new Cliente("Maria", "321654987");
        Cliente cliente5 = new Cliente("Carlos", "654987321");
        Cliente cliente6 = new Cliente("Sofia", "789321654");
        Cliente cliente7 = new Cliente("Luis", "654321987");

        //agregar clientes a la lista
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);

        //crear restaurante
        Restaurante restaurante = new Restaurante();

        //agregar mesas al restaurante
        mesas.forEach(mesa -> restaurante.agregarMesa(mesa));


        System.out.println("-------------------------------------------------");
        System.out.println("Reservas:");
        System.out.println("-------------------------------------------------");
        //simular reservas
        Random random = new Random();
        clientes.forEach(cliente -> {
            int capacidad = random.nextInt(8) + 1;
            try {
                Mesa mesa = restaurante.buscarMesaDisponible(capacidad);
                Reserva reserva = new Reserva(cliente, mesa, LocalDateTime.now());
                restaurante.registrarReserva(reserva);
                System.out.println("Reserva realizada para " + capacidad + " personas");
                System.out.println(cliente.obtenerInformacion());
                System.out.println(mesa.obtenerInformacion());
                System.out.println(reserva.obtenerDetalle());
                System.out.println();
            
            } catch (Exception e) {
                System.out.println("No hay mesas disponibles para " + cliente.getNombre() + " con capacidad de " + capacidad + " personas");    
            }
        });

        System.out.println("-------------------------------------------------");
        System.out.println("Estado de las mesas");
        System.out.println("-------------------------------------------------");

        //mostrar estado de las mesas
        mesas.forEach(mesa -> System.out.println(mesa.obtenerInformacion()));

        System.out.println("-------------------------------------------------");
        System.out.println("Cancelaciones:");
        System.out.println("-------------------------------------------------");

        //simular cancelaciones
        clientes.forEach(cliente -> {
            try{
                System.out.println("Reserva cancelada");
                restaurante.cancelarReserva(cliente.getReserva());
                System.out.println(cliente.obtenerInformacion());
                System.out.println();
            } catch (Exception e) {
                System.out.println("No hay reservas para " + cliente.getNombre());  
            }
        });

        System.out.println("-------------------------------------------------");
        System.out.println("Estado final de las mesas");
        System.out.println("-------------------------------------------------");

        //mostrar estado final de las mesas
        mesas.forEach(mesa -> System.out.println(mesa.obtenerInformacion()));
    }
}