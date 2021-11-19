package Ejercicio_18;

public class Videojuego implements Entregable{
    private String Titulo="";
    private int horasEstimadas=10;
    private boolean entregado=false;
    private String genero="";
    private String compania="";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        Titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        Titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego con Mayor cantidad de horas: \n" +
                "Titulo= " + Titulo +"\n" +
                "Horas estimadas= " + horasEstimadas +"\n" +
                "Entregado= " + entregado +"\n" +
                "Genero= " + genero + "\n" +
                "Compania= " + compania+"\n";
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object objeto) {
        boolean esMayor=false;
        Videojuego vJuegoToCompare=(Videojuego) objeto ;
        if (this.horasEstimadas>vJuegoToCompare.getHorasEstimadas()){
            esMayor=true;
        }
        return esMayor;
    }
}
