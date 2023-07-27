package EjercicioExtra3.Entidades;

public class Libreria {

    private String autor, titulo;
    private int stock, prestado;

    public Libreria() {
        this.prestado = 0;
    }

    public Libreria(String autor, String titulo, int stock) {
        this.autor = autor;
        this.titulo = titulo;
        this.stock = stock;
        this.prestado = 0;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrestado() {
        return prestado;
    }

    public void setPrestado(int prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return  "Autor: '" + autor + '\'' +
                ", Titulo: '" + titulo + '\'' +
                ", Stock: " + stock +
                ", Prestado: " + prestado;
    }
}
