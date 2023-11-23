
package ec.edu.epn.fis.interfazherencia;


/**
 *
 * @author Fernando Cardenas
 */
public class EmpleadoPorComision extends Empleado implements Comisionable{
    protected double ventasBrutas;
    protected double porcentajeComision;
    
//IDE me ayuda con la llamada a super, ya que es una clase que hereda, el IDE tambien hereda los constructores 
 //con la llamada a super

    public EmpleadoPorComision(String nombre, String apellido, String identificacion, double ventasBrutas, double porcentajeComision) {
        super(nombre, apellido, identificacion);
        this.ventasBrutas = ventasBrutas;
        this.porcentajeComision = porcentajeComision;
    }
    
    //OtroConstrcutor sin porcentajecomision
    public EmpleadoPorComision(String nombre, String apellido, String identificacion, double ventasBrutas) {
        super(nombre, apellido, identificacion);
        this.ventasBrutas = ventasBrutas;
        this.porcentajeComision = Comisionable.TAZA_COMISION;

    }
    
    public double calcularSalario(){
        //Nos puede servir por si tenemos un constructor vacio, sin argumentos
       double taza = 0;
        taza = porcentajeComision<=0? Comisionable.TAZA_COMISION: porcentajeComision;
        return taza * ventasBrutas;
        
    }
   
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "Empleado",nombre, apellido,
                "Identificacion", identificacion,
                "Ventas Brutas", ventasBrutas,
                "% Comision", porcentajeComision,
                "Salario", calcularSalario()   );
    }


    @Override
    public void incrementarVentas(double sales) {
        ventasBrutas += sales;//+= da igual a ventasBrutas+sales, es una abreviatura de java
    }
     
    
 }