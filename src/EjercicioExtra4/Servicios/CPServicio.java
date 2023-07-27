package EjercicioExtra4.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CPServicio {

    private HashMap<Integer, String> cps = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    public void ingresarCiudad() {

        int cp;
        String ciudad;

        System.out.println("Ingrese el nombre de la ciudad:");
        ciudad = input.nextLine().toUpperCase();

        System.out.println("Ingrese el codigo postal de " + ciudad + ":");
        cp = input.nextInt();
        input.nextLine();

        cps.put(cp,ciudad);

    }

    public void mostrarCiudades() {

        TreeMap<Integer, String> ordenadosPorCP = new TreeMap<>(cps);

        int contador = 0;

        for (Map.Entry<Integer, String> ciudad : ordenadosPorCP.entrySet()) {
            contador++;
            System.out.println(contador + ". CP: " + ciudad.getKey() + " -  " + ciudad.getValue());
        }

    }

    public void buscarPorCP() {

        int cp;

        System.out.println("Ingrese codigo postal:");
        cp = input.nextInt();
        input.nextLine();

        if (existeCiudad(cp)) {
            System.out.println("El codigo " + cp + " corresponde a la ciudad " + cps.get(cp));
        } else {
            System.out.println("No existe ciudad para el Codigo Postal ingresado.");
        }

    }

    public boolean existeCiudad(int cp) {
        return cps.containsKey(cp);
    }

    public void eliminarCiudad() {

        int cp;

        System.out.println("Ingrese codigo postal:");
        cp = input.nextInt();
        input.nextLine();

        if (existeCiudad(cp)) {
            System.out.println("Se ha eliminaod " + cps.get(cp) + " del listado.");
            cps.remove(cp);
        } else {
            System.out.println("No existe ciudad para el Codigo Postal ingresado.");
        }

    }


}
