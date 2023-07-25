/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto.
El programa pedirá un país en un bucle, se guardará el país en el conjunto y después se le preguntará al usuario
si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países guardados en el conjunto.

Después deberemos mostrar el conjunto ordenado alfabéticamente

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto
y si está en el conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
*/

package Ejercicio5.Principal;

import Ejercicio5.Servicios.PaisServicio;

public class Principal {

    public static void main(String[] args) {

        PaisServicio paSer = new PaisServicio();

        paSer.agregarPais();

        System.out.println("\nLista de paises:");
        paSer.mostrarSetPaises();

        paSer.ordenarPorNombre();
        System.out.println("\nLista de paises ordenados:");
        paSer.mostrarArrayPaises();

        paSer.eliminarPais();

        System.out.println("\nLista actualizada de paises:");
        paSer.mostrarArrayPaises();
    }
}
