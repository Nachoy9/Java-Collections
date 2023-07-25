package Ejercicio4.Servicios;

import Ejercicio4.Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public void guardarPelicula() {

        boolean salir = false;
        String opc;

        while (!salir) {

            Pelicula pelicula = new Pelicula();

            System.out.println("Ingrese el titulo de la pelicula:");
            pelicula.setTitulo(input.nextLine());

            System.out.println("Ingrese el director de la pelicula:");
            pelicula.setDirector(input.nextLine());

            System.out.println("Ingrese la duracion de la pelicula (en horas):");
            pelicula.setDuracion(input.nextDouble());
            input.nextLine();

            peliculas.add(pelicula);

            opc = "";

            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {

                System.out.println("\nDesea agregar otra pelicula? (s/n)");
                opc = input.nextLine();

                if(opc.equalsIgnoreCase("n")) {
                    salir = true;
                    break;
                } else if (!opc.equalsIgnoreCase("s")) {
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                }
            }
        }
    }

    public void mostrarPeliculas() {

        int contador = 0;

        for (Pelicula pelicula : peliculas) {

            contador++;
            System.out.println(contador + " - " + pelicula.toString());

        }
    }

    public void mostrarConMayorDuracion(double duracion) {

        int contador = 0;

        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() > duracion) {

                contador++;
                System.out.println(contador + " " + pelicula.toString());

            }
        }
    }

    public void ordenarPorDuracion() {

        Comparator<Pelicula> compPorDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        };

        Collections.sort(peliculas, compPorDuracion);
    }

    public void ordenarPorTitulo() {

        Comparator<Pelicula> compPorTitulo = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };

        Collections.sort(peliculas, compPorTitulo);
    }

    public void ordenarPorDirector() {

        Comparator<Pelicula> compPorDirector = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        };

        Collections.sort(peliculas, compPorDirector);
    }
}
