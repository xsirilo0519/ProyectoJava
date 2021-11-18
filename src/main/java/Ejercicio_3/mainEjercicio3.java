package Ejercicio_3;

import Utilidades.Utils;

import java.text.DecimalFormat;

public class mainEjercicio3 {
    public mainEjercicio3(Utils util){
        util.showMessage("Area de un circulo");
        DecimalFormat formato = new DecimalFormat("#.###");
        double radio=util.inputDoubleMessage("Ingrese el radio del circulo");
        util.showMessage("El area del circulo es: "+formato.format(Math.PI * Math.pow(radio,2)));
    }
}
