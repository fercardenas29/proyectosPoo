/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.herenciaempleadoabstracto;

/**
 *
 * @author usuario
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, String nombre, String apellido, 
            String identificacion, double ventasBrutas, double porcentajeComision) 
    {        
        super(nombre, apellido, identificacion, ventasBrutas, porcentajeComision);
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
                "Salario", calcularSalario()   );//Cuando quiero llamar al metodo de la clase utilizo el super, sino el IDE utiliza el mismo de la clasa en la que se encuentra
    
    }

    @Override
    public double calcularSalario() {
        return salarioBase + super.calcularSalario(); 
    }
    
    
}
