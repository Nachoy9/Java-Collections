/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como atributos el nombre
y discoConMasVentas.
Se debe crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo CantanteFamoso a la lista. Luego, se debe
mostrar los nombres de cada cantante y su disco con más ventas por pantalla.

Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa.

Al final se deberá mostrar la lista con todos los cambios
*/

package EjercicioExtra2.Principal;

import java.util.Scanner;
import EjercicioExtra2.Servicios.CantantesServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CantantesServicio cantSer = new CantantesServicio();

        int opc;
        boolean salir = false;

        System.out.println("Bienvenido");

        while (cantSer.cantCantantes() < 5) {
            cantSer.agregarCantante();
        }

        System.out.println("\nCantantes Añadidos:\n");
        cantSer.mostrarCantantes();

        while (!salir) {

            System.out.println("\nMenu principal\n");
            System.out.println("1. Añadir cantante.");
            System.out.println("2. Mostrar cantantes.");
            System.out.println("3. Eliminar cantante.");
            System.out.println("4. Salir");
            System.out.println("\nIngrese opcion:");

            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    cantSer.agregarCantante();
                    break;
                case 2:

                    System.out.println("\nListado de cantantes:\n");
                    cantSer.mostrarCantantes();

                    break;

                case 3:
                    cantSer.eliminarCantante();
                    break;
                case 4:

                    System.out.println("\nLista final de cantantes:\n");
                    cantSer.mostrarCantantes();

                    System.out.println("\nCerrando aplicacion, hasta luego.");

                    salir = true;
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    break;
            }
        }
    }
}
