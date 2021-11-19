package Utilidades;

import javax.swing.*;

public class Utils {

    public int inputIntMessage(String message){
        boolean loop=true;
        int num=1;
        do{
            try {
                num=Integer.parseInt(JOptionPane.showInputDialog(message));
                loop=false;
            }catch(Exception e){
                showMessage("Ingrese un valor entero");
            }

        }while(loop);
        return num;
    }
    public double inputDoubleMessage(String message){
        boolean loop=true;
        double num=1.0;
        do{
            try {
                num=Double.parseDouble(JOptionPane.showInputDialog(message));
                loop=false;
            }catch(Exception e){
                showMessage("Ingrese un valor con decimales");
            }

        }while(loop);
        return num;
    }
    public String inputStringMessage(String message){
        boolean loop=true;
        String cadena="";
        do{
            try {
                cadena=JOptionPane.showInputDialog(message);
                if (cadena==null||cadena.isEmpty())
                    loop=true;
                else
                    loop=false;
            }catch(Exception e){
                showMessage("Ingrese una cadena");
            }

        }while(loop);
        return cadena;
    }
    public char inputCharMessage(String message){
        boolean loop=true;
        char charText=' ';
        do{
            try {
                charText= JOptionPane.showInputDialog(message).charAt(0);
                if (charText==' ')
                    loop=true;
                else
                    loop=false;
            }catch(Exception e){
                showMessage("Ingrese una char");
            }

        }while(loop);
        return charText;
    }
    public void showMessage(String message){
        JOptionPane.showMessageDialog(null,message);
    }
}
