package Ejercicio_5;

import Utilidades.Utils;


public class mainEjercicio5 {
    public mainEjercicio5(Utils util){
        util.showMessage("Pare e impares");
        int numero=1;
        String pares="";
        String impares="";
        while (numero<101){
            if ((numero%2)==0)
                pares=pares+" "+numero;
            else
                impares=impares+" "+numero;
            numero++;
        }
        util.showMessage("El resultado se vera por consola");
        System.out.println("Numeros pares: "+pares+"\nNumeros impares: "+impares);
    }
}
