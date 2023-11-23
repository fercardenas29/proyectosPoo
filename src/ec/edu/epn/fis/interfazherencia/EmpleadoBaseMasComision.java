package ec.edu.epn.fis.interfazherencia;

/**
 *
 * @author Fernando Cardenas
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision  {
    private double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, String nombre, String apellido, 
            String identificacion, double ventasBrutas, double porcentajeComision) 
    {        
        super(nombre, apellido, identificacion, ventasBrutas, porcentajeComision);
        this.salarioBase = salarioBase;
    }
    
    //Constrcutor sin porcentajeComision
    public EmpleadoBaseMasComision(double salarioBase, String nombre, String apellido, 
            String identificacion, double ventasBrutas) 
    {        
        super(nombre, apellido, identificacion, ventasBrutas);
        this.salarioBase = salarioBase;
    }
    

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n"
                + "%s: %.2f\n%s: %.2f\n",
                "Empleado",nombre, apellido,
                "Identificacion", identificacion,
                "Ventas Brutas", ventasBrutas,
                "Comision", porcentajeComision,
                "Salario Base", salarioBase,
                "Salario", calcularSalario()   );
 
    
    }

    @Override
    public double calcularSalario() {
        return salarioBase + super.calcularSalario(); 
    }
    
    
}
