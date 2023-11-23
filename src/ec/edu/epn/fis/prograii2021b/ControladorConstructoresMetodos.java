/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author Fernando Cardenas
 */
public class ControladorConstructoresMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
    Carro micarro = new Carro(" Mercedez "," Benz ", 2021);
    micarro.incrementarVelocidad(20);
    System.out.println(micarro);
    micarro.incrementarVelocidad(80);
    System.out.println(micarro);
    System.out.println(micarro.getVelocidad());
    //System.out.println(micarro.velocidad); //Error porque la velocidad es privado
    micarro.color = "negro"; //Esto es en contra de las convensiones de java
    System.out.println(micarro.color);
    
    System.out.println("Antiguedad:" + micarro.calcularAntiguedadCarro(2010));
   
    Carro micarro2 = new Carro();
        System.out.println("Ingrese la marca de su carro: ");
        String marca = LecturaEstandar.leerString();  //Se queda en espera, ingresa el string y sera asignado a marca
        micarro2.setMarca(marca);
        micarro2.setModelo(LecturaEstandar.leerString("Ingrese un modelo: ")); //setModelo necesita un string, y leerString le puede pasar el string que ingrese
        
        System.out.println("Ingrese el año de su carro");
        micarro2.setAño(LecturaEstandar.leerEntero());
        
        System.out.println(micarro2);
        System.out.println(micarro2.calcularAntiguedadCarro(2021));
        
 }
    
}
