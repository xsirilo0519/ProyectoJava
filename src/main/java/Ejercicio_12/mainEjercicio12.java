package Ejercicio_12;

import Utilidades.Utils;



public class mainEjercicio12 {
    //utilizar hola y hello permite visualizar mejor el proceso
    public mainEjercicio12(Utils util){
        util.showMessage("Validar palabra");
        String primeraPalabra=util.inputStringMessage("Ingrese una palabra").replace(" ","");
        String segundaPalabra=util.inputStringMessage("Ingrese la segunda palabra").replace(" ","");;

        if(primeraPalabra.equals(segundaPalabra)){
            util.showMessage("Las palabras son iguales");
        }else{
            util.showMessage("Las palabras son diferentes: \n* = letras iguales\n_ = palabras faltantes (diferentes tamaños)\nleta = diferencias\n"+
                    "\nPrimera: "+primeraPalabra+"\nSegunda: "+segundaPalabra+"\n"+diferencia(primeraPalabra,segundaPalabra));
        }
    }
    public String diferencia(String primeraPalabra, String segundaPalabra) {
        String palabraAuxiliar="";
        if (primeraPalabra.length()<segundaPalabra.length()){
            primeraPalabra+=getTamano(segundaPalabra.length()-primeraPalabra.length());
        }else if (primeraPalabra.length()>segundaPalabra.length()){
            segundaPalabra+=getTamano(primeraPalabra.length()-segundaPalabra.length());
        }
        for (int i=0;i<primeraPalabra.length();i++){
            if(primeraPalabra.charAt(i)==segundaPalabra.charAt(i)){
                palabraAuxiliar+="*";
            }else{
                palabraAuxiliar+=String.valueOf(segundaPalabra.charAt(i));
            }
        }
        return palabraAuxiliar;
    }
    public String getTamano(int size){
        int num=0;
        System.out.println(size);
        String espacios="";
        while (num<size){
            espacios+="_";
            num++;
        }
        return espacios;
    }



}
