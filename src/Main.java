class Cancion {
    private String titulo;
    private String interprete;
    private int año;
    private int duracion;

    public Cancion(String titulo, String interprete, int año, int duracion) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.año = año;
        this.duracion = duracion;
    }

    public String toString() {
        return "Cancion [titulo=" + titulo + ", interprete=" + interprete + ", año=" + año + ", duracion=" + duracion + " segundos]";
    }
}

