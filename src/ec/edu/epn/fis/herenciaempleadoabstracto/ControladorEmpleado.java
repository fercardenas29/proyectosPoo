
package ec.edu.epn.fis.herenciaempleadoabstracto;
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
        
        EmpleadoAsalariado empleadoAsa1 = new EmpleadoAsalariado(
                LecturaEstandar.leerString("Ingrese nombre del empleado: "),
                LecturaEstandar.leerString("Ingrese apellido del empleado: "),
                LecturaEstandar.leerString("Ingrese identificacion del empleado: "),
                LecturaEstandar.leerFloat("Ingrese salario semanal del empleado asalariado: ") );
        
        EmpleadoPorHoras empleadoHor1 = new EmpleadoPorHoras(12, 1.78, "Fernando", "Cardenas", "1723889430");
        
        EmpleadoPorComision empleadoCom1 = new EmpleadoPorComision("Karla", "Iza", "1724242666", 1254, 0.82);
        
        EmpleadoBaseMasComision empleadoBMC1 = new EmpleadoBaseMasComision(425, "Lucas", "Del Hierro", "1723889430", 5000, 0.82);
        
        //Arreglo de Empleados
        Empleado empleados [] = new Empleado [ 4 ];
        empleados[0] = empleadoAsa1;
        empleados[1] = empleadoHor1;
        empleados[2] = empleadoCom1;
        empleados[3] = empleadoBMC1;
        
        for (Empleado empleadoActual:empleados){
            System.out.printf("\nEl empleado %s es un objeto %s\n",
                    empleadoActual,
                    empleadoActual.getClass().getName());
        
        }
    }
    
}
