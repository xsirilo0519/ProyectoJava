package Ejercicio_2;

import Utilidades.Utils;

public class mainEjercicio2 {
    public mainEjercicio2(Utils util){

        int primerNum=2;
        int segundoNum=5;
        if (primerNum==segundoNum){
            util.showMessage("Los numeros "+primerNum+" y "+segundoNum+" son iguales.");
        }else if(primerNum<segundoNum){
            util.showMessage("El segundo numero: "+segundoNum+" es mayor que el primer numero: "+primerNum);
        }else{
            util.showMessage("El primer numero: "+primerNum+" es mayor que el segundo numero:"+segundoNum);
        }
    }
}
