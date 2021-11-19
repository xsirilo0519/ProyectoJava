package Ejercicio_18;

import Utilidades.Utils;

import java.util.Arrays;


public class mainEjercicio18 {
    private int countSeries=0;
    private int countVideoJuegos=0;
    public mainEjercicio18(Utils util){
        util.showMessage("Interfaz");
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];

        listaVideojuegos[0]=new Videojuego("Dying Light",60,"Supervivencia","Techland");
        listaVideojuegos[1]=new Videojuego();
        listaVideojuegos[2]=new Videojuego("Mario Car",100);
        listaVideojuegos[3]=new Videojuego("Fall guys",20);
        listaVideojuegos[4]=new Videojuego("Albion",500,"MMORPG"," Sandbox Interactive");

        listaSeries[0]=new Serie("The Walking Death",18,"Supervivencia","Juan Andres");
        listaSeries[1]=new Serie("Breaking Bad","Bryan Cranston");
        listaSeries[2]=new Serie("Juego de tronos","Kit Harington");
        listaSeries[3]=new Serie();
        listaSeries[4]=new Serie();

        // entregar
        listaSeries[1].entregar();
        listaSeries[0].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[2].entregar();

        Arrays.stream(listaSeries).filter(x->x.isEntregado()).forEach(x->{x.devolver(); countSeries++;});
        Arrays.stream(listaVideojuegos).filter(x->x.isEntregado()).forEach(x->{x.devolver(); countVideoJuegos++;});
        util.showMessage("La cantidad de video juegos entregados es: "+countVideoJuegos+"\n"+
                        "La cantidad de series entregadas es: "+countSeries+"\n"+
                        "Se entregaron en total: "+(countVideoJuegos+countSeries));

        Serie serieMayor = listaSeries[0];
        Videojuego videojuegoMayor = listaVideojuegos[0];

        for (int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)){
                videojuegoMayor=listaVideojuegos[i];
            }
        }
        util.showMessage(videojuegoMayor.toString()+"\n"+serieMayor.toString());


    }
}
