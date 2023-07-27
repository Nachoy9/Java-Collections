package EjercicioExtra3.Servicios;

import java.util.HashSet;
import EjercicioExtra3.Entidades.Libreria;

public class LibreriaServicio {

    private HashSet<Libreria> librerias = new HashSet<>();

    public void agregarLibro(String autor, String titulo, int stock) {

        librerias.add(new Libreria(autor, titulo, stock));

    }

    public void listarLibros() {

        if (librerias.size() == 0) {
            System.out.println("Libreria vacia!");
        }

        int contador = 0;

        for (Libreria libreria : librerias) {

            contador++;
            System.out.println(contador + ". " + libreria.toString());

        }
    }

    public void prestamo(String titulo) {

        int nuevoStock;
        int nuevoPrestado;

        if (existeLibro(titulo) && buscarLibro(titulo).getStock() > 0) {

            nuevoStock = buscarLibro(titulo).getStock() - 1;
            buscarLibro(titulo).setStock(nuevoStock);

            nuevoPrestado = buscarLibro(titulo).getPrestado() + 1;
            buscarLibro(titulo).setPrestado(nuevoPrestado);

            System.out.println("\nPrestamo realizado.");

        } else {

            System.out.println("\nEl libro no existe o no se encuentra en stock.");

        }
    }

    public void devolucion(String titulo) {

        int nuevoStock;
        int nuevoPrestado;

        if (existeLibro(titulo) && buscarLibro(titulo).getPrestado() > 0) {

            nuevoStock = buscarLibro(titulo).getStock() + 1;
            buscarLibro(titulo).setStock(nuevoStock);

            nuevoPrestado = buscarLibro(titulo).getPrestado() - 1;
            buscarLibro(titulo).setPrestado(nuevoPrestado);

            System.out.println("\nDevolucion realizada.");

        } else {

            System.out.println("\nEl libro no existe o no se encuentra prestado.");

        }
    }

    public boolean existeLibro(String titulo) {

        for (Libreria libreria : librerias) {

            if (libreria.getTitulo().equals(titulo)) {
                return true;
            }
        }

        return false;
    }

    public Libreria buscarLibro(String titulo) {

        for (Libreria libreria : librerias) {

            if (libreria.getTitulo().equals(titulo)) {
                return libreria;
            }
        }

        return null;

    }

}

