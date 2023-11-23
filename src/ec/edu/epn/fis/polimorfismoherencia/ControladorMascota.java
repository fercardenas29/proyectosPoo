/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.polimorfismoherencia;

/**
 *
 * @author usuario
 */
public class ControladorMascota {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
            Mascota misMascotas[]= {new Mascota(),new Perro(),new Mascota()};
        Perro p = new Perro ();
        misMascotas[2]=p;
        for(Mascota m:misMascotas){
            System.out.println(m.hacerRuido());
            if(m instanceof Perro){
                System.out.println(((Perro)m).jugar()+"\n");// Esto es una casting (conversion) explicita
            }
            
        }

        Perro perro3 = new Perro("husky","nala","apache");
        
        Mascota mascota = new Mascota("UWU","OWO");
    }
}
