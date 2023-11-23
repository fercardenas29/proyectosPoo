/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.herenciaempleadoabstracto;

/**
 *
 * @author Fernando Cardenas
 */
public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String identificacion, double salarioSemanal) {
        super(nombre, apellido, identificacion);
        this.salarioSemanal = salarioSemanal;
    }

        @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n"
                + "%s: %.2f\n%s: %.2f\n",
                "Empleado",nombre, apellido,
                "Identificacion", identificacion,
                "Salario Semanal", salarioSemanal,
                "Salario", calcularSalario()   );
    
    }
    
    @Override
    public double calcularSalario() {
        
        return salarioSemanal;
    }
    
}
