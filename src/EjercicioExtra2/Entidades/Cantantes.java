package EjercicioExtra2.Entidades;

public class Cantantes {

    private String nombreCantante, tituloDiscoMV;
    private int ventasDiscoMV;

    public Cantantes() {
    }

    public Cantantes(String nombreCantante, String tituloDiscoMV, int ventasDiscoMV) {
        this.nombreCantante = nombreCantante;
        this.tituloDiscoMV = tituloDiscoMV;
        this.ventasDiscoMV = ventasDiscoMV;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getTituloDiscoMV() {
        return tituloDiscoMV;
    }

    public void setTituloDiscoMV(String tituloDiscoMV) {
        this.tituloDiscoMV = tituloDiscoMV;
    }

    public int getVentasDiscoMV() {
        return ventasDiscoMV;
    }

    public void setVentasDiscoMV(int ventasDiscoMV) {
        this.ventasDiscoMV = ventasDiscoMV;
    }

    @Override
    public String toString() {
        return  "Cantante: '" + nombreCantante + '\'' +
                ", Titulo del Disco: '" + tituloDiscoMV + '\'' +
                ", Cantidad de Ventas: " + ventasDiscoMV;
    }
}
