package Ejercicio_16;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Persona {
    private final String nombreD="";
    private final int edadD=0;
    private final char sexoD='H';
    private final double pesoD=0;
    private final double alturaD=0;
    private final int sobrePeso=1;
    private final int pesoIdeal=-1;
    private final int debajoIdeal=0;
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private String[] letrasDNI = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Persona() {
        this.nombre = this.nombreD;
        this.edad = this.edadD;
        this.sexo=this.sexoD;
        this.peso = this.pesoD;
        this.altura = this.alturaD;
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo=sexo;
        this.peso = this.pesoD;
        this.altura = this.alturaD;
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
            return this.pesoIdeal;
        }else if(IMC>=20 && IMC<=25){
            return this.debajoIdeal;
        }
        return this.sobrePeso;
    }

    public boolean esMayorDeEdad(){
        if(edad>=18)
            return true;

        return false;
    }


    private void comprobarSexo(char sexo){
        char sexoUpp=Character.toUpperCase(sexo);
        if (sexoUpp=='M'||sexoUpp=='H'){
            this.sexo=sexoUpp;
        }else{
            this.sexo=this.sexoD;
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
