/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase Pelicula
con el título, director y duración de la película (en horas).

Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos
en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/

package Ejercicio4.Principal;

import Ejercicio4.Servicios.PeliculaServicio;

public class Principal {

    public static void main(String[] args) {

        PeliculaServicio pelSer = new PeliculaServicio();

        pelSer.guardarPelicula();

        System.out.println("\nLista de peliculas:");
        pelSer.mostrarPeliculas();

        System.out.println("\nLista de peliculas con duracion mayor a 1 hs:");
        pelSer.mostrarConMayorDuracion(1);

        pelSer.ordenarPorDuracion();
        System.out.println("\nLista de peliculas ordenadas por duracion:");
        pelSer.mostrarPeliculas();

        pelSer.ordenarPorTitulo();
        System.out.println("\nLista de peliculas ordenadas por titulo:");
        pelSer.mostrarPeliculas();

        pelSer.ordenarPorDirector();
        System.out.println("\nLista de peliculas ordenadas por director:");
        pelSer.mostrarPeliculas();

    }

}
