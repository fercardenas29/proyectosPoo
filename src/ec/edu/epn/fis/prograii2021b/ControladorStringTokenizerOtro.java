/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author usuario
 */
public class ControladorStringTokenizerOtro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        frase=LecturaEstandar.leerString("Ingrese saludo inciando con palabra: Hola");
        
        if (StringTokenizerOtro.esSaludo(frase))
            System.out.println("Es un saludo");
        else
            System.out.println("No es un saludo");
    }
    
}
