/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heber0904_25_15326.gestionbiblioteca.app;

import com.heber0904_25_15326.gestionbiblioteca.modelo.Libro;
import com.heber0904_25_15326.gestionbiblioteca.servicio.Biblioteca;

/**
 *
 * @author umg
 */
public class Main {
     public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Libros válidos
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García", 1967));
        biblioteca.agregarLibro(new Libro("Hary Potter y la piedra filosofal", "J.K. Rowling", 1997));
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943));

        // Libro inválido
        try {
            biblioteca.agregarLibro(new Libro("", "Autor", -1));
        } catch (IllegalArgumentException e) {
            System.out.println("Hubo un problema en agregar el libro: " + e.getMessage());
        }

        // Mostrar libros
        System.out.println("Listado de libros:");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() +
                    " (" + libro.getYearPublicacion() + ")" +
                    (libro.esAntiguo() ? " [Antiguo]" : ""));
        }

        // Buscar libro
        String tituloBuscar = "1984";
        Libro encontrado = biblioteca.buscarPorTitulo(tituloBuscar);

        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}
