

package ec.edu.epn.fis.herenciaempleadoabstracto;

/**
 * @author Fernando Cardenas
 * Utiilizamos protected por recomendacion del libro
 */

public abstract class Empleado {
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public abstract double calcularSalario();
    
}

