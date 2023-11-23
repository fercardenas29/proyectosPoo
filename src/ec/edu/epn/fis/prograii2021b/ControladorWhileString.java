/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author ferch
 */
public class ControladorWhileString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String candidatoUno="Correa";
        String candidatoDos="Alvarito Noboa";     
        
        ContadorVotos votaciones2021= new ContadorVotos(candidatoUno,candidatoDos,0,0);
        System.out.println("Los Candidatos son a elegir son:Correa, Alvarito Noboa. Escogja uno de ellos ");
        votaciones2021.contarVotos();
        System.out.println(votaciones2021);
    }
    
}
