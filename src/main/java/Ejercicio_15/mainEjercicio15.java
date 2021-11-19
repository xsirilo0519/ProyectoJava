package Ejercicio_15;

import Utilidades.Utils;


public class mainEjercicio15 {
    public mainEjercicio15(Utils util){
        util.showMessage("Menu");
        int opcion=0;
        do {
            opcion = util.inputIntMessage("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            if(opcion<1||opcion>8){
                util.showMessage("OPCION INCORRECTA");
            }
        }while (opcion!=8);
    }
}
