package com.giu.tp3_1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre, String direccion, String telefono, List<Libro> libros){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = libros;
    }
    public String getDireccion() {
        return direccion;
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
