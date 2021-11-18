import Ejercicio_1.mainEjercicio1;
import Ejercicio_2.mainEjercicio2;
import Ejercicio_3.mainEjercicio3;
import Ejercicio_4.mainEjercicio4;
import Ejercicio_5.mainEjercicio5;
import Utilidades.Utils;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();
        int opcion;
        do {
            opcion=util.inputIntMessage("\nIngrese el ejercicio a realizar\n1. Ejercicio 1.\n2. Ejercicio 2.\n3. Ejercicio 3.\n4. Ejercicio 4.\n5. Ejercicio 5.\n" +
                    "6. Ejercicio 6.\n7. Ejercicio 7.\n8. Ejercicio 8.\n9. Ejercicio 9.\n10. Ejercicio 10.\n11. Ejercicio 11.\n12. Ejercicio 12.\n13. Ejercicio 13.\n" +
                    "14. Ejercicio 14.\n15. Ejercicio 15.\n16. Ejercicio 16.\n17. Ejercicio 17.\n18. Ejercicio 18.\n0. Salir.\n");
            switch (opcion){
                case 0:
                    util.showMessage("Hasta pronto");
                    break;
                case 1:
                    mainEjercicio1 E1=new mainEjercicio1(util);
                    break;
                case 2:
                    mainEjercicio2 E2=new mainEjercicio2(util);
                    break;
                case 3:
                    mainEjercicio3 E3=new mainEjercicio3(util);
                    break;
                case 4:
                    mainEjercicio4 E4=new mainEjercicio4(util);
                    break;
                case 5:
                    mainEjercicio5 E5=new mainEjercicio5(util);
                    break;
            }
        }while(opcion!=0);
    }
}
