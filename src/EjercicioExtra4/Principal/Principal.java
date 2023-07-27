/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm.
Nota: Poner el código postal sin la letra, solo el número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Realizar un menu que permita, agregar otra ciudad, buscar por codigo postal, mostrar todos los datos y eliminar ciudad.
*/

package EjercicioExtra4.Principal;

import java.util.Scanner;
import EjercicioExtra4.Servicios.CPServicio;

public class Principal {

    private static CPServicio CPSer = new CPServicio();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opc;
        boolean salir = false;

        iniciarPrograma();

        while (!salir) {

            System.out.println("\nMenu principal\n");
            System.out.println("1. Añadir ciudad.");
            System.out.println("2. Eliminar ciudad.");
            System.out.println("3. Mostrar ciudades.");
            System.out.println("4. Buscar ciudad.");
            System.out.println("5. Salir");
            System.out.println("\nIngrese opcion:");

            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    CPSer.ingresarCiudad();
                    break;
                case 2:
                    CPSer.eliminarCiudad();
                    break;
                case 3:
                    System.out.println("\nListado de ciudades ingresadas:");
                    CPSer.mostrarCiudades();
                    break;
                case 4:
                    CPSer.buscarPorCP();
                    break;
                case 5:
                    System.out.println("\nCerrando aplicacion, hasta luego.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    break;
            }
        }
    }

    public static void iniciarPrograma() {

        System.out.println("Bienvenido");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nCiudad Nro " + (i+1));
            CPSer.ingresarCiudad();

        }
    }

}
