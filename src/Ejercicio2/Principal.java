/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la
lista con un Iterator, se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó
el usuario y se mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se
mostrará la lista ordenada.
*/

package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

    private static ArrayList<String> razas = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ingresarRaza();

        System.out.println("\nLista de razas guardadas:");
        mostrarRazas();

        eliminarRaza();

        System.out.println("\nLista de razas actualizada:");
        mostrarRazas();

        ordenarRazas();

        System.out.println("\nLista de razas ordenadas:");
        mostrarRazas();

    }

    public static void ingresarRaza() {

        String opc;
        boolean salir = false;

        while (!salir) {

            opc = "";

            System.out.println("Ingrese una raza de perro:");
            razas.add(input.nextLine());

            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {

                System.out.println("\nDesea agregar otra raza? (s/n)");
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

    public static void mostrarRazas() {

        for (String raza : razas) {
            System.out.println(raza);
        }
    }

    public static void eliminarRaza() {

        String raza;

        System.out.println("\nIngrese raza que desea eliminar:");
        raza = input.nextLine();

        razas.removeIf(n -> (n.equalsIgnoreCase(raza)));

    }

    public static void ordenarRazas() {

        Collections.sort(razas);

    }

}
