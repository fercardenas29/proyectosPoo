

package ec.edu.epn.fis.tarea2herenciaempleado;

/**
 *
 * @author Fernando Cardenas
 */
public class EmpleadoPorComision extends Empleado {
    protected double ventasBrutas;
    protected double porcentajeComision;
    
//IDE me ayuda con la llamada a super, ya que es una clase que hereda, el IDE tambien hereda los constructores 
 //con la llamada a super

    public EmpleadoPorComision(String nombre, String apellido, String identificacion, double ventasBrutas, double porcentajeComision) {
        super(nombre, apellido, identificacion);
        this.ventasBrutas = ventasBrutas;
        this.porcentajeComision = porcentajeComision;
    }



//A los metodos los mantengo publicos
    public double calcularSalario(){
        return porcentajeComision * ventasBrutas;
        
    }
//Como funciona exactamente el string.format
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "Empleado",nombre, apellido,
                "Identificacion", identificacion,
                "Ventas Brutas", ventasBrutas,
                "Comision", porcentajeComision,
                "Salario", calcularSalario()   );
    }
 
     
 }
    
 