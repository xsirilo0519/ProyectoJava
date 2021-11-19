package Ejercicio_18;

public class Serie implements Entregable{
    private String titulo="";
    private int nTemporadas=3;
    private boolean entregado=false;
    private String genereo="";
    private String creador="";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int nTemporadas, String genereo, String creador) {
        this.titulo = titulo;
        this.nTemporadas = nTemporadas;
        this.genereo = genereo;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public String getGenereo() {
        return genereo;
    }

    public void setGenereo(String genereo) {
        this.genereo = genereo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie con mayor numero de temporadas: \n" +
                "Titulo= " + titulo + "\n" +
                "Numero de Temporadas= " + nTemporadas +"\n" +
                "Entregado= " + entregado +"\n" +
                "Genereo= " + genereo + "\n" +
                "Creador= " + creador + "\n";
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
        Serie serieToCompare=(Serie) objeto ;
        if (this.nTemporadas>serieToCompare.getnTemporadas()){
            esMayor=true;
        }
        return esMayor;
    }
}
