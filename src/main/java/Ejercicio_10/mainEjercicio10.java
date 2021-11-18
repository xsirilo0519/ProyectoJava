package Ejercicio_10;

import Utilidades.Utils;


public class mainEjercicio10 {
    public mainEjercicio10(Utils util){
        util.showMessage("Sin espacios");
        String frase=util.inputStringMessage("Ingrese una frase");
        util.showMessage(frase.replace(" ",""));
    }
}
