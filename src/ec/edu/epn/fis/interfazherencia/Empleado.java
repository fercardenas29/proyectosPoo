

package ec.edu.epn.fis.interfazherencia;



/**
 * @author Fernando Cardenas
 * Utiilizamos protected por recomendacion del libro
 */

public  class Empleado {
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
    
@Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n",
                "Empleado",nombre, apellido,
                "Identificacion", identificacion);
    }
}

