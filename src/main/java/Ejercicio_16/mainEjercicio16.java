package Ejercicio_16;

import Utilidades.Utils;


public class mainEjercicio16 {
    public mainEjercicio16(Utils util){
        String nombre=util.inputStringMessage("Ingrese su nombre");
        int edad=util.inputIntMessage("Ingrese su edad");
        char sexo=util.inputCharMessage("Ingrese\nH o M");
        double peso=util.inputDoubleMessage("Ingrese su peso");
        double altura=util.inputDoubleMessage("Ingrese su algura");
        Persona p1 =new Persona(nombre,edad,sexo,peso,altura);
        Persona p2 =new Persona(nombre,edad,sexo);
        p2.setPeso(util.inputDoubleMessage("Ingrese el peso del usuario 2"));
        p2.setAltura(util.inputDoubleMessage("Ingrese la altura del usuario 2"));
        Persona p3 =new Persona();
        p3.setNombre(util.inputStringMessage("Ingrese el nombre del usuario 3"));
        p3.setEdad(util.inputIntMessage("Ingrese la edad del usuario 3"));
        p3.setSexo(util.inputCharMessage("Ingrese el sexo del usuario 3"));
        p3.setPeso(util.inputDoubleMessage("Ingrese el peso del usuario 3"));
        p3.setAltura(util.inputDoubleMessage("Ingrese la altura del usuario 3"));
        util.showMessage(mostrarMensaje(p1.calcularIMC(),1)+"\n"+
                        esMayorDeEdad(p1.esMayorDeEdad(),1)+"\n"+
                        p1.toString());
        util.showMessage(mostrarMensaje(p2.calcularIMC(),2)+"\n"+
                esMayorDeEdad(p2.esMayorDeEdad(),2)+"\n"+
                p2.toString());
        util.showMessage(mostrarMensaje(p3.calcularIMC(),3)+"\n"+
                esMayorDeEdad(p3.esMayorDeEdad(),3)+"\n"+
                p3.toString());
    }

    public String esMayorDeEdad(boolean esMayor, int index){
            if(esMayor)
                return "El usuario "+index+" es mayor de edad";
        return "El usuario "+index+" es menor de edad";
    }

    public String mostrarMensaje(int imc,int index){
        if (imc==-1)
            return "El usuario "+index+" esta en su peso ideal";
        if (imc==0)
            return "El usuario "+index+" esta por debajo de su peso ideal";
        if (imc==1)
            return "El usuario "+index+" tiene sobrepeso";
        return "";
    }
}
