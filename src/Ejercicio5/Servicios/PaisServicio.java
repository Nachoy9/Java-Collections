package Ejercicio5.Servicios;

import Ejercicio4.Entidades.Pelicula;

import java.util.*;

public class PaisServicio {

    // Podria usar un TreeSet pero la idea es que lo con un método
    private HashSet<String> paises = new HashSet<>();
    private ArrayList<String> arrayPaises;
    private Scanner input = new Scanner(System.in);

    public void agregarPais() {

        boolean salir = false;
        String opc;

        while (!salir) {

            System.out.println("Ingrese el nombre del pais:");
            paises.add(input.nextLine());

            opc = "";

            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {

                System.out.println("\nDesea agregar otro pais? (s/n)");
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

    public void mostrarSetPaises() {

        int contador = 0;

        for (String pais : paises) {

            contador++;
            System.out.println(contador + " - " + pais);

        }
    }

    public void ordenarPorNombre() {

        //Para ordenar un HashSet tengo que convertirlo a un Arraylist en primer lugar
        arrayPaises = new ArrayList<>(paises);
        Collections.sort(arrayPaises);

    }

    public void mostrarArrayPaises() {

        int contador = 0;

        for (String pais : arrayPaises) {

            contador++;
            System.out.println(contador + " - " + pais);

        }
    }

    public void eliminarPais() {

        String _pais;
        int aux = 0;
        boolean encontrado = false;

        System.out.println("\nIngrese el nombre del pais que desea eliminar:");
        _pais = input.nextLine();

        Iterator<String> iterator = arrayPaises.iterator();

        while (iterator.hasNext()) {

            String pais = iterator.next();

            if (pais.equalsIgnoreCase(_pais)) {
                arrayPaises.remove(aux);
                encontrado = true;
            }

            aux++;
        }

        if (encontrado) {
            System.out.println("El pais ha sido eliminado de la lista");
        } else {
            System.out.println("Pais no encontrado");
        }
    }

}
