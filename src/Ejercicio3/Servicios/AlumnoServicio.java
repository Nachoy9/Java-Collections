package Ejercicio3.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import Ejercicio3.Entidades.Alumno;


public class AlumnoServicio {

    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public void crearAlumnos() {

        boolean salir = false;
        String opc;

        while (!salir) {

            Alumno alumno = new Alumno();

            System.out.println("Ingrese el nombre del alumno:");
            alumno.setNombre(input.nextLine());

            for (int i = 0; i < 3; i++) {

                System.out.println("Ingrese la nota Nro " + (i+1));
                alumno.addNota(input.nextInt());
                input.nextLine();

            }

            alumnos.add(alumno);

            opc = "";

            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {

                System.out.println("\nDesea agregar otro alumno? (s/n)");
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

    public void notaFinal() {

        String nombre;
        double promedio;
        int aux = 0;
        boolean encontrado = false;

        System.out.println("Ingrese nombre del alumno:");
        nombre = input.nextLine();

        for (Alumno alumno : alumnos) {

            aux++;
            promedio = 0;

            if (alumno.getNombre().equalsIgnoreCase(nombre)) {

                encontrado = true;

                for (int nota : alumno.getNotas()) {
                    promedio = promedio + nota;
                }

                System.out.println("La nota final de " + alumno.getNombre() + " ("+ aux +") es " + promedio/3);

            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }
}
