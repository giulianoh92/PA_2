
package com.giu.tp3_1;

import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        //instanciar objeto Autor
        Autor autor = new Autor("Pepe");
        //instanciar lista de ejemplares
        List<Ejemplar> ejemplares = new ArrayList<>();
        ejemplares.add(new Ejemplar(1, false, false));
        ejemplares.add(new Ejemplar(2, true, false));
        ejemplares.add(new Ejemplar(3, true, true));
        ejemplares.add(new Ejemplar(4, false, true));
        //instanciar objeti Libro
        Libro libro = new Libro("Harry Potter", 1920, ejemplares, autor);
        //imprimir atributos de Libro
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Edicion: " + libro.getEdicion());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Ejemplares: ");
        //imprimir atributos de cada ejemplar asociado
        for (Ejemplar ejemplar : libro.getEjemplares()) {
            System.out.println("\t Ejemplar Nro: " + ejemplar.getNroInventario());
            System.out.println("\t a la venta?: " + ejemplar.getSale());
            System.out.println("\t prestado?: " + ejemplar.getPrestado() + "\n");
        }
    }
}
