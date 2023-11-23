/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.tarea2herenciaempleado;

/**
 *
 * @author Fernando Cardenas
 */
public class EmpleadoPorHoras extends Empleado {
    int numeroHoras;
    double valorHora;
    
    
 public EmpleadoPorHoras(int numeroHoras, double valorHora, String nombre, String apellido, String identificacion) {
        super(nombre, apellido, identificacion);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }
 

    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %d\n%s: %.2f\n"
                + "%s: %.2f\n",
                "Empleado",nombre, apellido,
                "Identificacion", identificacion,
                "Horas Trabajadas", numeroHoras,
                "Valor Hora", valorHora,
                "Salario", calcularSalario()   );
    
    }
 
    public double calcularSalario() {
        double salario=0;
        salario = numeroHoras<=40 ? valorHora*numeroHoras: valorHora*40 + (numeroHoras-40)*valorHora*1.5;
        return salario;
    }

   
    
}
