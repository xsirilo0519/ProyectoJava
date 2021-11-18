package Ejercicio_7;

import Utilidades.Utils;


public class mainEjercicio7 {
    public mainEjercicio7(Utils util){
        util.showMessage("Numero >=0");
        int numero=-1;
        do {
            numero=util.inputIntMessage("Ingrese un numero mayor o igual a 0");
        }while (numero<0);
        util.showMessage("El resultado se vera por consola");
        System.out.println("El numero mayor o igual a cero es: "+numero);
    }
}
