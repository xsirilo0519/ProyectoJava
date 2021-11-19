package Ejercicio_17;

public class Television extends Electrodomestico{
    private final int resolucionD=20;
    private final boolean sincronizadorTDTD=false;
    private int resolucion;
    private  boolean sincronizadorTDT;

    public Television(){
        this.resolucion=this.resolucionD;
        this.sincronizadorTDT=this.sincronizadorTDTD;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion=this.resolucionD;
        this.sincronizadorTDT=this.sincronizadorTDTD;
    }

    public Television(double precioBase, String color, char consumoElectrico, double peso, int resolucion, boolean sincronizadorTDT) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSincronizadorTDT() {
        return sincronizadorTDT;
    }

    @Override
    public double precioFinal() {
        double acumulador = super.precioFinal();
        if(resolucion > 40){
            acumulador += super.getPrecioBase() * 0.3;
        }
        if(sincronizadorTDT){
            acumulador += 50;
        }
        return acumulador;
    }
}
