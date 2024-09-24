package com.giu.tp3_1;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private int edicion;
    private List<Ejemplar> ejemplares = new ArrayList<>();
    private Autor autor;

    // Constructor
    public Libro(String titulo, int edicion, List<Ejemplar> ejemplares, Autor autor) {
        this.titulo = titulo;
        setEdicion(edicion);  // Usar el setter para validar la edición
        this.autor = autor;
        this.ejemplares = ejemplares;
    }

    // Getter para 'autor'
    public Autor getAutor() {
        return autor;
    }

    // Getter para 'edicion'
    public int getEdicion() {
        return edicion;
    }

    // Getter para 'ejemplares'
    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    // Getter para 'titulo'
    public String getTitulo() {
        return titulo;
    }

    // Setter para 'autor'
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Setter para 'edicion' con validación
    public void setEdicion(int edicion) {
        if (edicion < 1900 || edicion > 2018) {
            
            throw new IllegalArgumentException("La edición debe estar entre 1900 y 2018.");
        }
        this.edicion = edicion;
    }

    // Setter para 'ejemplares'
    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    // Setter para 'titulo'
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
