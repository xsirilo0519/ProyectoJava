package Ejercicio_11;

import Utilidades.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class mainEjercicio11 {
    public mainEjercicio11(Utils util){
        util.showMessage("Contar vocales");
        String frase=util.inputStringMessage("Ingrese una frase").toLowerCase();
        int [] contador = new int[]{0,0,0,0,0};
        List<String> vocales = Arrays.asList("a","e","i","o","u");
        for(int i=0;i<frase.length();i++){
            switch (String.valueOf(frase.charAt(i))){
                case "a":
                    contador[0]++;
                    break;
                case "e":
                    contador[1]++;
                    break;
                case "i":
                    contador[2]++;
                    break;
                case "o":
                    contador[3]++;
                    break;
                case "u":
                    contador[4]++;
                    break;
                default:
                    break;

            }
        }
        util.showMessage("El tamano de la frase es: "+(frase.length())+"\nLa cantidad de vocales es: "+ Arrays.stream(contador).sum()
                +"\n Cantidad de a: "+contador[0]+"\n Cantidad de e: "+contador[1]+"\n Cantidad de i: "+contador[2]+"\n Cantidad de o: "+contador[3]
                +"\n Cantidad de u: "+contador[4]);

    }
}
