package Ejercicio_16;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Persona {
    private String nombre="";
    private int edad=0;
    private String DNI;
    private char sexo='H';
    private double peso=0;
    private double altura=0;
    private String[] letrasDNI = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Persona() {
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo=sexo;
        comprobarSexo(this.sexo);
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo=sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(this.sexo);
        generarDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        comprobarSexo(this.sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC=this.peso/(Math.pow(this.altura,2));
        if (IMC<20){
            return -1;
        }else if(IMC>=20 && IMC<=25){
            return 0;
        }
        return 1;
    }

    public boolean esMayorDeEdad(){
        if(edad>=18)
            return true;

        return false;
    }


    private void comprobarSexo(char sexo){
        if (sexo=='M'||sexo=='H'){
            this.sexo=sexo;
        }else{
            this.sexo='H';
        }
    }

    private void generarDNI(){
        int random=(int)(Math.random()*(99999999-10000000))+10000000;
        this.DNI=random+letrasDNI[random%23];
    }

    @Override
    public String toString() {
        return "Persona\n" +
                "nombre= " + nombre + "\n" +
                "edad= " + edad + "\n" +
                "DNI= " + DNI + "\n" +
                "sexo= " + sexo + "\n" +
                "peso= " + peso + "\n" +
                "altura= " + altura + "\n";
    }
}
