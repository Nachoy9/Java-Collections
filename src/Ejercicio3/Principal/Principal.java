/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá
como atributos, su nombre y una lista de tipo Integer con sus 3 notas.

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario
y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método: notaFinal(): El usuario ingresa el nombre del alumno que quiere
calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del método
se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método
y mostrado en el main.
*/

package Ejercicio3.Principal;

import Ejercicio3.Servicios.AlumnoServicio;

public class Principal {

    public static void main(String[] args) {

        AlumnoServicio alSer = new AlumnoServicio();

        alSer.crearAlumnos();
        alSer.notaFinal();

    }
}
