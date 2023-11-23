
package ec.edu.epn.fis.interfazherencia;
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
        
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                LecturaEstandar.leerString("Ingrese nombre del empleado: "),
                LecturaEstandar.leerString("Ingrese apellido del empleado: "),
                LecturaEstandar.leerString("Ingrese identificacion del empleado: "),
                LecturaEstandar.leerFloat("Ingrese salario semanal del empleado asalariado: ") );
        
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(12, 1.78, "Fernando", "Cardenas", "1723889430");
        
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Karla", "Iza", "1724242666", 10000);
        
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(425, "Lucas", "Del Hierro", "1723889430", 5000);
        
        //Arreglo de Empleados
        Empleado empleados [] = new Empleado [ 4 ];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        for (Empleado empleadoActual:empleados){
            if(empleadoActual instanceof EmpleadoPorComision || empleadoActual instanceof EmpleadoBaseMasComision){
                ((EmpleadoPorComision)empleadoActual).incrementarVentas(300);
            }
            System.out.printf("\nEl empleado %s es un objeto %s\n",
                    empleadoActual,
                    empleadoActual.getClass().getName());
        
        }
    }
    
}
