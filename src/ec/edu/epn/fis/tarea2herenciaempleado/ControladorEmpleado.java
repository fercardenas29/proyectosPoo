
package ec.edu.epn.fis.tarea2herenciaempleado;

import ec.edu.epn.fis.prograii2021b.LecturaEstandar;

/**
 *
 * @author Fernando Cardenas
 */
public class ControladorEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*EmpleadoPorComision empleadoCom1 = new EmpleadoPorComision(
                LecturaEstandar.leerString("Ingrese nombre del empleado: "),
                LecturaEstandar.leerString("Ingrese el apellido: "),
                LecturaEstandar.leerString("Ingreze identificacion: "),
                LecturaEstandar.leerFloat("Ingrese ventas brutas: "),
                LecturaEstandar.leerFloat("Porcentaje de comision: ") );
        System.out.println("Datos del empleado \n"+empleadoCom1);
        */
        
        /*EmpleadoPorHoras empleadoHora1 = new EmpleadoPorHoras(12, 1.78, "Fernando", "Cardenas", "1723889430");
        System.out.println("Datos del empleado \n"+empleadoHora1);
        */
        
        EmpleadoPorHoras empleadoHora1 = new EmpleadoPorHoras(
                LecturaEstandar.leerEntero("Ingrese el numero de horas trabajadas: "),
                LecturaEstandar.leerFloat("Ingrese el valor hora de trabajo: "),
                LecturaEstandar.leerString("Ingrese nombre del empleado: "),
                LecturaEstandar.leerString("Ingrese el apellido: "),
                LecturaEstandar.leerString("Ingreze identificacion: ") );
        
        System.out.println("Datos del empleado \n"+empleadoHora1);
        
    }
    
}
