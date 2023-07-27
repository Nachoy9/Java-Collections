/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos repetidos.
Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca.
La clase Libro debe guardar el título del libro, autor, número de ejemplares y número de ejemplares prestados.

Se creará en el servicio un HashSet de tipo Libro que guardará todos los libros creados. En el mismo tendremos un bucle
que crea un objeto Libro pidiéndole al usuario todos sus datos y los seteandolos en el Libro.
Despues, ese Libro se guarda en el conjunto y se le pregunta al usuario si quiere crear otro Libro o no.

La clase Librería contendrá además los siguientes métodos:
* Constructor por defecto.
* Constructor con parámetros.
* Métodos Setters/getters

La clase servicio tendrá minimamente:
* Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca en el conjunto.
Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa de a uno, como un carrito de
compras, el atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
Devuelve true si se ha podido realizar la operación y false en caso contrario.
* Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo busca en el conjunto.
Si está en el conjunto, se llama con ese objeto al método. El método decrementa de a uno, como un carrito de compras,
el atributo ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
* Método toString para mostrar los datos de los libros.
*/

package EjercicioExtra3.Principal;

import java.util.Scanner;
import EjercicioExtra3.Servicios.LibreriaServicio;

public class Principal {

    private static Scanner input = new Scanner(System.in);
    private static LibreriaServicio libSer = new LibreriaServicio();

    public static void main(String[] args) {

        int opc;
        boolean salir = false;

        System.out.println("Bienvenido");

        while (!salir) {

            System.out.println("\nMenu principal\n");
            System.out.println("1. Añadir libro.");
            System.out.println("2. Prestar libro.");
            System.out.println("3. Devolver libro.");
            System.out.println("4. Listar libros.");
            System.out.println("5. Salir");
            System.out.println("\nIngrese opcion:");

            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    agregarLibros();
                    break;
                case 2:
                    prestarLibro();
                    break;
                case 3:
                    devolverLibro();
                    break;
                case 4:
                    System.out.println("\nListado de libros:");
                    libSer.listarLibros();
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

    public static void agregarLibros() {

        String autor, titulo, opc;
        int stock;
        boolean salir = false;

        while (!salir) {

            System.out.println("Ingrese el autor del libro:");
            autor = input.nextLine();

            System.out.println("Ingrese el titulo del libro:");
            titulo = input.nextLine();

            System.out.println("Ingrese el stock del libro:");
            stock = input.nextInt();
            input.nextLine();

            libSer.agregarLibro(autor,titulo,stock);

            System.out.println("\nDesea agregar otro libro? (s/n)");
            opc = input.nextLine();

            if (!opc.equalsIgnoreCase("s")) {
                salir = true;
            }
        }
    }

    public static void prestarLibro() {

        String titulo;

        System.out.println("Ingrese el titulo del libro:");
        titulo = input.nextLine();

        libSer.prestamo(titulo);

    }

    public static void devolverLibro() {

        String titulo;

        System.out.println("Ingrese el titulo del libro:");
        titulo = input.nextLine();

        libSer.devolucion(titulo);

    }


}
