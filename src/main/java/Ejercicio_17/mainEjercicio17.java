package Ejercicio_17;

import Utilidades.Utils;


public class mainEjercicio17 {
    public mainEjercicio17(Utils util){
        util.showMessage("Electrodimesticos");
        Electrodomestico[] e = new Electrodomestico[10];
        e[0]=new Lavadora(500,"morado",'z',14.5,31);
        e[1]=new Television(200,30);
        e[2]=new Electrodomestico(400,"Verde",'z',14.5);
        e[3]=new Electrodomestico(500,"Blanco",'a',30);
        e[4]=new Electrodomestico();
        e[5]=new Electrodomestico(300,14.5);
        e[6]=new Television(300,"negro",'a',30,30,true);
        e[7]=new Television(800,"gris",'e',30,75,false);
        e[8]=new Lavadora();
        e[9]=new Lavadora(100,"negro",'z',80,20);

        int sumaElectro=0;
        int sumaLavadora=0;
        int sumaTelevision=0;
        String televisores="Televisores: ";
        String lavadoras="Lavadoras: ";
        for (Electrodomestico electro:e){
            if(electro instanceof Electrodomestico){
                sumaElectro += electro.precioFinal();
            }
            if(electro instanceof Lavadora){
                sumaLavadora += electro.precioFinal();
                lavadoras+=electro.precioFinal()+" ";
            }
            if(electro instanceof Television){
                sumaTelevision += electro.precioFinal();
                televisores+=electro.precioFinal()+" ";
            }
        }
        System.out.println(televisores+"\n"+lavadoras);
        util.showMessage("En consola se puede ver los precios de cada televisor y lavadora");
        util.showMessage("El precio de todos los electrodomesticos es: "+sumaElectro+"\n"+
                "El precio de todos los televisores es: "+sumaTelevision+"\n"+
                "El precio de todas las lavadoras es: "+sumaLavadora);


    }
}
