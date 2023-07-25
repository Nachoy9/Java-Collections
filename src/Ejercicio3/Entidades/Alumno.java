package Ejercicio3.Entidades;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    ArrayList<Integer> notas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public void addNota(int nota) {
        this.notas.add(nota);
    }

    @Override
    public String toString() {
        return "Alumno: " +
                "Nombre: '" + nombre + '\'' +
                ", Notas = " + notas;
    }
}
