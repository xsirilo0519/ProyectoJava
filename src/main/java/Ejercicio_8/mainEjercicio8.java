package Ejercicio_8;

import Utilidades.Utils;

import java.util.Locale;


public class mainEjercicio8 {
    public mainEjercicio8(Utils util){
        util.showMessage("Dia laboral");
        String dia=util.inputStringMessage("Ingrese un dia de la semana").toLowerCase();
        switch (dia.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "vienes":
                util.showMessage("El dia "+dia+" es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                util.showMessage("El dia "+dia+" no es un dia laboral");
                break;
            default:
                util.showMessage("No ingreso un dia valido");
                break;
        }
    }
}
