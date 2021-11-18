package Ejercicio_9;

import Utilidades.Utils;


public class mainEjercicio9 {
    public mainEjercicio9(Utils util){
        util.showMessage("Reemplazar ");
        String mensaje="La sonrisa sera la mejor arma contra la tristeza";
        util.showMessage(mensaje);
        String frase=util.inputStringMessage("Ingrese la frase a adicionar");
        mensaje=mensaje.replace("a","e")+" "+frase;
        util.showMessage(mensaje);

    }
}
