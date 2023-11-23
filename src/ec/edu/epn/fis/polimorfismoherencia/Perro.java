
package ec.edu.epn.fis.polimorfismoherencia;

/**
 *
 * @author usuario
 */
public class Perro extends Mascota {
    protected String raza;
    
    public Perro(){
        super();
        System.out.println("Estoy en el constructor vacio "
                +  "Vacio de la SUBCLASE PERRO");
    }
    
    public Perro (String raza){
        this.raza = raza;
        System.out.println("Estoy en el constructor vacio "
                + "raza de la SUBCLASE PERRO ");
        
    }
    public Perro (String raza, String nombre, String genero){
        super(nombre, genero);
        this.raza = raza;
        System.out.println("Estoy en el constructor 3"
                + "param´s de la SUBCLASE PERRO");
    }

    @Override 
    public String hacerRuido(){
        return "Ladra";
        
    }
    public String jugar(){
        return "juega fuvol";
    }
}
