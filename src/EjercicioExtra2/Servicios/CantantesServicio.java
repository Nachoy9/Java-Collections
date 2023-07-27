package EjercicioExtra2.Servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import EjercicioExtra2.Entidades.Cantantes;

public class CantantesServicio {

    private HashMap<String, Cantantes> cantantes = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    public void agregarCantante() {

        Cantantes cantante = new Cantantes();

        System.out.println("\nIngrese el nombre del cantante:");
        cantante.setNombreCantante(input.nextLine().toUpperCase());

        System.out.println("Ingrese el titulo del disco mas vendido:");
        cantante.setTituloDiscoMV(input.nextLine().toUpperCase());

        System.out.println("Ingrese la cantidad de ventas del disco '" + cantante.getTituloDiscoMV() + "':");
        cantante.setVentasDiscoMV(input.nextInt());
        input.nextLine();

        if (cantantes.containsKey(cantante.getNombreCantante())) {
            System.out.println("\nYa existe un disco para el cantante ingresado. Se actualizará la entrada.");
        }

        cantantes.put(cantante.getNombreCantante(), cantante);

    }

    public int cantCantantes() {
        return cantantes.size();
    }

    public void mostrarCantantes() {

        int contador = 0;

        for (Map.Entry<String, Cantantes> elemento : cantantes.entrySet()) {
            contador++;
            System.out.println(contador + ". " + elemento.getValue().toString());
        }
    }

    public void eliminarCantante() {

        String nombre;

        System.out.println("Ingrese el nombre del cantante que desea eliminar:");
        nombre = input.nextLine().toUpperCase();

        if (cantantes.containsKey(nombre)) {
            System.out.println("Cantante eliminado");
            cantantes.remove(nombre);
        } else {
            System.out.println("No se encontraron cantantes con ese nombre.");
        }
    }
}
