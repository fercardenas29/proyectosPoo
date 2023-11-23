/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author //Fernando Cardenas
 */
public class ControladorDiaSemanaIfSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        dia=LecturaEstandar.leerEntero("Ingrese dia de la semana: ");
        System.out.println("Es laborable: " + DiaSemana.esDiaLaborable(dia));
         
        System.out.println("Nombre del dia: "+DiaSemana.diaNombre(dia));
    }
    
}
