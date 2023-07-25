package Ejercicio6.Servicios;

import java.util.*;

public class ProductoServicio {

    private HashMap<String, Double> producto = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    public void agregarProducto() {

        String nombre;
        double precio;

        System.out.println("\nIngrese el nombre del producto:");
        nombre = input.nextLine().toUpperCase();

        System.out.println("\nIngrese el precio del producto:");
        precio = input.nextDouble();
        input.nextLine();

        producto.put(nombre, precio);

    }

    // Como el nombre del producto es la key, eliminamos el producto y agregamos uno con otro nombre y mismo precio
    public void actualizarNombre() {

        String nombreViejo, nombreNuevo;
        double precio;

        System.out.println("\nIngrese el nombre del producto que desea actualizar:");
        nombreViejo = input.nextLine().toUpperCase();

        if (existeProducto(nombreViejo)) {

            System.out.println("Ingrese el nuevo nombre del producto:");
            nombreNuevo = input.nextLine().toUpperCase();

            precio = producto.get(nombreViejo);

            producto.remove(nombreViejo);
            producto.put(nombreNuevo, precio);

        } else {
            System.out.println("No se encontraron productos con ese nombre.");
        }
    }

    public void actualizarPrecio() {

        String nombre;
        double precio;

        System.out.println("\nIngrese el nombre del producto que desea actualizar:");
        nombre = input.nextLine().toUpperCase();

        if (existeProducto(nombre)) {

            System.out.println("Ingrese el nuevo precio del producto:");
            precio = input.nextDouble();
            input.nextLine();

            producto.put(nombre, precio);

        } else {
            System.out.println("No se encontraron productos con ese nombre.");
        }
    }

    public void eliminarProducto() {

        String nombre;

        System.out.println("\nIngrese el nombre del producto que desea eliminar:");
        nombre = input.nextLine().toUpperCase();

        if (existeProducto(nombre)) {
            System.out.println("El producto '" + nombre + "' ha sido eliminado.");
            producto.remove(nombre);
        } else {
            System.out.println("No se encontraron productos con ese nombre.");
        }
    }

    public boolean existenProductos() {
        return producto.size() > 0;
    }

    public boolean existeProducto(String nombre) {
        return producto.containsKey(nombre);
    }

    public void listarProductos() {

        // Ordeno los productos creando un Treemap
        TreeMap<String, Double> productosOrdenados = new TreeMap<>(producto);

        int contador = 0;

        for (Map.Entry<String, Double> elemento : productosOrdenados.entrySet()) {
            contador++;
            System.out.println(contador + ". " + elemento.getKey() + " - $ " + elemento.getValue());
        }
    }
}
