/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.polimorfismoherencia;

/**
 *
 * @author usuario
 */
public class Mascota {
    protected String nombre;
    protected String genero;
    
    public Mascota (){
        System.out.println("Estoy en el constructor vacio DE LA SUPER CLASE MASCOTA ");
    }
    public Mascota (String nombre,String genero){
        this.nombre = nombre;
        this.genero = genero;
        System.out.println("Estoy en el constructor 2 DE LA SUPER CLASE MASCOTA ");
        
    }
    
    public String hacerRuido(){
        return "ruido generico";
        
    }
}
