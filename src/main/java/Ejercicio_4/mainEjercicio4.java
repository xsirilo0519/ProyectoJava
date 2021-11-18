package Ejercicio_4;

import Utilidades.Utils;


public class mainEjercicio4 {
    public mainEjercicio4(Utils util){
        util.showMessage("Calcular IVA");
        double precio=util.inputDoubleMessage("Ingrese el precio del producto");
        double IVA=precio*0.21;
        util.showMessage("El precio del producto con IVA ES: "+(precio+IVA)+"\n su IVA ES: "+IVA);
    }
}
