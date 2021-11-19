package Ejercicio_14;

import Utilidades.Utils;


public class mainEjercicio14 {
    public mainEjercicio14(Utils util){
        util.showMessage("Numero hasta 1000");
        int numero=util.inputIntMessage("Ingrese un numero");
        while(numero<=1000){
            System.out.print(numero+" ");
            numero+=2;
        }
        util.showMessage("Los numeros se imprimieron por consola");
    }
}
