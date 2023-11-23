/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author ferch
 */
public class ControladorTiempoHMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora, minutos, segundos;
        System.out.println("Soy Fernando, estoy creado OBJETOS TIEMPO");
        hora = LecturaEstandar.leerEntero("Ingrese la hora: ");
        minutos = LecturaEstandar.leerEntero("Ingrese los minutos: ");
        segundos = LecturaEstandar.leerEntero("Ingrese los segundos: ");
        
        TiempoHMS tiempo1= new TiempoHMS(hora,minutos,segundos);
        System.out.println(tiempo1);// Se ejectura el toString
        System.out.println(tiempo1.aStringDoceHoras());
        
        TiempoHMS tiempo2= new TiempoHMS();
        System.out.println(tiempo2);// Se ejectura el toString
        System.out.println(tiempo2.aStringDoceHoras());
    }
    
}
