package org.example; // 1. Primero el paquete

import org.example.view.MovieView; // 2. Luego las importaciones


public class Main {
    public static void main(String[] args) {
        MovieView vista = new MovieView();

        System.out.println("🚀 Iniciando sistema de Videoclub...");

        vista.mostrarMenu();
    }
}