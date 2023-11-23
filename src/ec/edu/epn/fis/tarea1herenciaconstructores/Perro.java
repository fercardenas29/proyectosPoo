/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.tarea1herenciaconstructores;

/**
 *
 * @author Fernando Cardenas
 */
public class Perro extends Mascota {
    protected String raza;

    public Perro() {
        super();//Esto hace Java implisitamente OJO NO LO DUPLICA y en la primera linea del constructor
        
        System.out.println("Estoy en el constructor vacio de la SUBCLASE PERRO");
    }

    public Perro(String raza) {
        this.raza = raza;
         System.out.println("Estoy en el constructor raza de la SUBCLASE PERRO");
    }

    public Perro(String raza, String nombre, String genero) {
        //super(nombre, genero); //Llamada a super es como llamar a mascota, con los atributos que tienen macota
                                            //Si no hago la llamada al de3parametos, llama al constructor vacio
        this.raza = raza;
        System.out.println("Estoy en el constructor De3parametros de la SUBCLASE PERRO");
    }
    
}
