package Ejercicio_13;

import Utilidades.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class mainEjercicio13 {
    public mainEjercicio13(Utils util){
        DateTimeFormatter datefp = DateTimeFormatter.ofPattern("YYYY/MM/DD HH:MM:SS");
        DateTimeFormatter datefs = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
        util.showMessage("Formato: YYYY/MM/DD HH:MM:SS= "+datefp.format(LocalDateTime.now())+"\nFormato: YYYY/MM/dd HH:mm:ss="+datefs.format(LocalDateTime.now()));
    }
}
