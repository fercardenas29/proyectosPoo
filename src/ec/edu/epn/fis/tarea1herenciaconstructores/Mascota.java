/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.tarea1herenciaconstructores;

/**
 *
 * @author Fernando Cardenas
 */
public class Mascota {
 
    protected String nombre;
    protected String genero;

    public Mascota() {
        System.out.println("Estoy en el constrcutor vacio de la SUPERCLASE MASCOTA");
    }

    public Mascota(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        System.out.println("Estoy en el constrcutor De2parametros de la SUPERCLASE MASCOTA");
    }
    
}
