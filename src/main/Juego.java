package main;

import personajes.*;
import hechizos.*;

public class Juego {
    public static void main(String[] args) {
        Personaje harry = new HarryPotter(); 
        Personaje ron = new RonWeasley(); 
        Personaje hermione = new HermioneGranger(); 

        System.out.println("=== INICIO DEL JUEGO ===");
        harry.performHechizo();
        ron.performHechizo();
        hermione.performHechizo();

        System.out.println("\n=== CAMBIO EN TIEMPO DE EJECUCIÓN ===");
        hermione.setHechizo(new OculusReparo());
        hermione.performHechizo();

        System.out.println("\n=== FIN DE LA DEMO ===");
    }
}


