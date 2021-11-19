package Ejercicio_17;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class Electrodomestico {
    private final double precioBaseD =100;
    private final String colorD="blanco";
    private final char consumoElectricoD='F';
    private final double pesoD=5;

    private double precioBase ;
    private String color;
    private char consumoElectrico;
    private double peso;

    public Electrodomestico(){
        this.precioBase=this.precioBaseD;
        this.color=this.colorD;
        this.consumoElectrico=this.consumoElectricoD;
        this.peso=this.pesoD;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color=this.colorD;
        this.consumoElectrico=this.consumoElectricoD;
    }

    public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso) {
        this.precioBase = precioBase;
        this.color = color.toLowerCase();
        this.consumoElectrico = Character.toUpperCase(consumoElectrico);
        this.peso = peso;
        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumoElectrico);
    }

    private void comprobarColor(String color){
        String colores[]={"blanco","azul","negro","rojo","gris"};
        Optional<String> encontrar=Arrays.stream(colores).filter(x->x.equals(color)).findFirst();
        if(!encontrar.isPresent()){
            this.color=this.colorD;
        }
    }

    private void comprobarConsumoEnergetico(char letra){
        String consumo[]={"A","B","C","D","E","F"};
        Optional<String> encontrar=Arrays.stream(consumo).filter(x->x.equals(String.valueOf(letra))).findFirst();
        if(!encontrar.isPresent()){
            this.consumoElectrico=this.consumoElectricoD;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public double precioFinal(){
        double acumulador = 0;
        switch (consumoElectrico) {
            case 'A':
                acumulador += 100;
                break;
            case 'B':
                acumulador += 80;
                break;
            case 'C':
                acumulador += 60;
                break;
            case 'D':
                acumulador += 50;
                break;
            case 'E':
                acumulador += 30;
                break;
            case 'F':
                acumulador += 10;
                break;
        }


        return precioBase + acumulador+calcularPorPeso();
    }

    private double calcularPorPeso(){
        if (peso >= 0 && peso <= 19) {
            return 10;
        } else if (peso >= 20 && peso <= 49) {
            return 50;
        } else if (peso >= 50 && peso <= 79) {
            return 80;
        } else if (peso >= 80) {
            return 100;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoElectrico=" + consumoElectrico +
                ", peso=" + peso +
                '}';
    }
}
