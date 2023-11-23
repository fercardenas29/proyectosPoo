/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author ferch
 */
public class ControladorPasoPorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=3;
        String b="Ana";
        System.out.println("Mostrando a en el main: "+ a);
        System.out.println("Mostrando b en el main: "+ b);
        metodoProbandoPasoReferencia(a,b);
        //String es un tipo de dato cuyo valor de sus variables es INMUTABLE
        System.out.println("Mostrando a en el main despues de usar miMetodo: "+ a);
        System.out.println("Mostrando b en el main despues de usar miMetodo: "+ b);
        
        
        
        //Utilziar nuestra clase carro
        
        Carro carro1 = new Carro("Mercedez","Benz",2021); 
        System.out.println(carro1);
        
        
        Carro carro2;
        carro2=carro1;
        carro2.setAño(2008);
        System.out.println("Mostrando carro1 despues de setter carro2 "+ carro1);
        metodoProbandoCarroReferencia (carro1);
        System.out.println("Mostrando carro1 despues de usar el metodo: -> "+ carro1);
        System.out.println("Mostrando carro2 despues de usar el metodo: -> "+ carro2);                
        }
    
    
    public static void metodoProbandoPasoReferencia (int n, String s){//Variable inmutable s 
        n+=5;
        System.out.println("Mostrando n en miMetodo: " + n);
        s="Sofia";
        System.out.println("Mostrando s en miMetodo: " + s);
        
                
    }
  public static void metodoProbandoCarroReferencia (Carro car){
      car.setMarca("BMW");
      car.setAño(2019);
      System.out.println("Mostrando carro en el metodo: "+ car);
      
      
  }
    
}
