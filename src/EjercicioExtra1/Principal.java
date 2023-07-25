/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de
tipo Integer. La lectura de números termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList.
A continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma y su media (promedio).
*/

package EjercicioExtra1;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Integer> numeros = new ArrayList<>();

    public static void main(String[] args) {

        ingresarNumeros();

        if (numeros.size() == 0) {
            System.out.println("No se ingresaron numeros");
            return;
        }

        System.out.println("\nNumeros ingresados:");
        mostrarNumeros();

        System.out.println("\nEstadisticas:");
        mostrarSumaYPromedio();
    }

    public static void ingresarNumeros() {

        int numero;

        do {
            System.out.println("Ingrese un numero:");
            numero = input.nextInt();

            if (numero != -99) {
                numeros.add(numero);
            }

        } while (numero != -99);
    }

    public static void mostrarNumeros() {

        int contador = 0;

        for (Integer elemento : numeros) {
            contador++;
            System.out.println(contador + ". " + elemento);
        }
    }

    public static void mostrarSumaYPromedio() {

        int suma = 0, promedio = 0;

        for (Integer elemento : numeros) {
            suma += elemento;
        }

        promedio = suma/numeros.size();

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

}
