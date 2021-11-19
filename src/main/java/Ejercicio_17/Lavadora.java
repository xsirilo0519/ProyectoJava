package Ejercicio_17;

public class Lavadora extends Electrodomestico {
    private final double cardaD=5;
    private double carga;

    public Lavadora() {
        this.carga = this.cardaD;
    }
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = this.cardaD;
    }

    public Lavadora(double precioBase, String color, char consumoElectrico, double peso, double carga) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double acumulador=super.precioFinal();
        if (carga>30)
            acumulador+=50;
        return acumulador;
    }
}
