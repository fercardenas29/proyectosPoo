
package ec.edu.epn.fis.tarea2herenciaempleado;

/**
 *
 * @author Fernando Cardenas
 * Utiilizamos protected por recomendacion del libro
 */
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected String identificacion;
//Contructor
    public Empleado(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }
    //Constructor por Defecto
    public Empleado() {
        
    }
}
