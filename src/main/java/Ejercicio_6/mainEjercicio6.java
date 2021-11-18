package Ejercicio_6;

import Utilidades.Utils;


public class mainEjercicio6 {
    public mainEjercicio6(Utils util){
        util.showMessage("Pare e impares");
        String pares="";
        String impares="";
        for (int numero=1;numero<101;numero++){
            if ((numero%2)==0)
                pares=pares+" "+numero;
            else
                impares=impares+" "+numero;
        }
        util.showMessage("El resultado se vera por consola");
        System.out.println("Numeros pares: "+pares+"\nNumeros impares: "+impares);
    }
}
