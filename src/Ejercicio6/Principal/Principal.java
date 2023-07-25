/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el
precio que tendrán.
Además, se necesita que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, eliminar un producto
y mostrar los productos que tenemos con su precio (Utilizar Hashmap).
El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/

package Ejercicio6.Principal;

import java.util.Scanner;
import Ejercicio6.Servicios.ProductoServicio;

public class Principal {

    public static void main(String[] args) {

        ProductoServicio pSer = new ProductoServicio();
        Scanner input = new Scanner(System.in);

        boolean salir = false;
        int opc;

        while (!salir) {

            System.out.println("\nMenu principal\n");
            System.out.println("1. Añadir producto.");
            System.out.println("2. Actualizar nombre de producto.");
            System.out.println("3. Actualizar precio de producto.");
            System.out.println("4. Eliminar producto.");
            System.out.println("5. Listar productos.");
            System.out.println("6. Salir");
            System.out.println("\nIngrese opcion:");

            opc = input.nextInt();

            switch (opc) {
                case 1:
                    pSer.agregarProducto();
                    break;
                case 2:
                    pSer.actualizarNombre();
                    break;
                case 3:
                    pSer.actualizarPrecio();
                    break;
                case 4:
                    pSer.eliminarProducto();
                    break;
                case 5:
                    if (!pSer.existenProductos()) {
                        System.out.println("No existen productos");
                        break;
                    }
                    System.out.println("\nLista de productos:");
                    pSer.listarProductos();
                    break;
                case 6:
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
