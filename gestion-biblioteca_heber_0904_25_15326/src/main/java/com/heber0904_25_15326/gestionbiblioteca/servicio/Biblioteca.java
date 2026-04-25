/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heber0904_25_15326.gestionbiblioteca.servicio;

import com.heber0904_25_15326.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * ***
 * @author umg
 */
public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            libros.add(libro);
        }
    }

    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
    
}
