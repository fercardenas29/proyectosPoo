
package ec.edu.epn.fis.archivoBinario;

import ec.edu.epn.fis.prograii2021b.LecturaEstandar;
import java.util.ArrayList;

/**
 * @author Fernando Cardenas
 */

public class ControladorArchivoBinario {
 
    static final int opcionSalir = 7;
    static String pathArchivoBinario = "EstudiantesBinarios.data";
    
    public static void main(String[] args) {    
        int opcion;
        do{
            opcion=menuOpciones();
            switch(opcion){
                case 1:
                    System.out.println();
                    ManejadorArchivoBinario.mostrarArchivosBin(pathArchivoBinario);
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                   break;
                case 4:
                    opcion4();
                    break;
                case 5:
                    opcion5();
                    break;
                case 6:
                    opcion6();
                    break;
                case opcionSalir:
                    System.out.println("Chau! Vuelve pronto");
                    break;
                default:
                 System.out.println("Opcion Inexistente ");
                    break;   
            }
        }while(opcion != opcionSalir);
   } 
    
    
    public static int menuOpciones(){ 
        int opcion = 0;
        System.out.println("Programa realizado por Fernando J. Cardenas");
        System.out.println("1. Mostrar listado de estudiantes");
        System.out.println("2. Crear/sobreescribir archivo");
        System.out.println("3. Agregar nuevo estudiante");
        System.out.println("4. Buscar estudiante");
        System.out.println("5. Acutalizar un estudiante");
        System.out.println("6. Eliminar un estudiante");
        System.out.println(Integer.toString(opcionSalir) + ". Salir");
        System.out.println("Ingrese un opcion: ");
        opcion= LecturaEstandar.leerEntero();
        return opcion;
                
    }
    
    static void opcion2(){
        System.out.println("Crear/sobreescribir archivo con un primer registro");
        Estudiante estudiante = new Estudiante(
                LecturaEstandar.leerString("Ingrese código unico: "),
                LecturaEstandar.leerString("Ingrese Apellidos y Nombres: "),
                LecturaEstandar.leerString("Ingrese correo EPN: ")
        );
        if(ManejadorArchivoBinario.agregarRegistro(estudiante, pathArchivoBinario)){
            System.out.println("\nRegistro(s) guardados exitosamente!\n");
        }else {
            System.out.println("Ups algo salio mal!");
        }
    }
    
    
    
    static void opcion3(){
        System.out.println("Agregar un nuevo estudiante");
        Estudiante estudiante = new Estudiante(
                LecturaEstandar.leerString("Ingrese código unico: "),
                LecturaEstandar.leerString("Ingrese Apellidos y Nombres: "),
                LecturaEstandar.leerString("Ingrese correo EPN: ")
        );
        if(ManejadorArchivoBinario.agregarRegistroAlFinal(estudiante, pathArchivoBinario)){
            System.out.println("\nRegistro(s) guardados exitosamente!\n");
        }else {
            System.out.println("Ups algo salio mal!");
        }
    }
    
    static void opcion4(){
        System.out.println("Buscar registros ");
        String busqueda = LecturaEstandar.leerString("Ingrese dato de busqueda: ");
        ManejadorArchivoBinario.buscarEstudiantes(busqueda, pathArchivoBinario);
    }
    
    static void opcion5(){
        System.out.println("Para actualizar al estudiante, necesita el codigo actual");
        String busqueda = LecturaEstandar.leerString("Ingrese codigo actual: ");

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes = ManejadorArchivoBinario.leerArchivoBinEstudiantes(pathArchivoBinario);
        boolean actualizo = false;
        for(int indice=0; indice<estudiantes.size();indice++){
            if((estudiantes.get(indice).getCodigoUnico()).equals(busqueda)){
                actualizo = true;
                System.out.println("Datos Actuales");
                System.out.println((estudiantes.get(indice)));
                System.out.println("Ingrese nuevo codigo unico: "
                        + "(<ENTER> para no actualizar)");
                String cu = LecturaEstandar.leerString();
                if(cu.length()>0){
                    (estudiantes.get(indice)).setCodigoUnico(cu);
                }
                System.out.println("Ingrese nuevos Apellidos y Nombres: "
                        + "(<ENTER> para no actualizar)");
                String apellidosNombres = LecturaEstandar.leerString();
                if(apellidosNombres.length()>0){
                    (estudiantes.get(indice)).setApellidosNombres(apellidosNombres);
                }
                System.out.println("Ingrese nuevo correo EPN: "
                        + "(<ENTER> para no actualizar)");
                String emailEPN = LecturaEstandar.leerString();
                if(emailEPN.length()>0){
                    (estudiantes.get(indice)).setEmailEPN(emailEPN);  
                }
            }
        }    
        if (actualizo ){
            Object [] estudianteActualizado = estudiantes.toArray();
            if (ManejadorArchivoBinario.agregarVariosRegistros(
                 estudianteActualizado,
                    pathArchivoBinario)){
                System.out.println("Registro actualizado exitosamente!");
            }
        }
        else {
            System.out.println("Estudiante de codigo unico: " + busqueda + " no existe."        
                    + " Nada que actualizar! ");
        }
        
    }
    
    static void opcion6(){
        System.out.println("Para eliminar al estudiante, necesita el codigo actual");
        String busqueda = LecturaEstandar.leerString("Ingrese codigo actual: ");
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes = ManejadorArchivoBinario.leerArchivoBinEstudiantes(pathArchivoBinario);
        boolean elimino = false;
        for(int indice=0; indice<estudiantes.size();indice++){
            if((estudiantes.get(indice).getCodigoUnico()).equals(busqueda)){
                System.out.println(" \nDatos Actuales ");
                System.out.println((estudiantes.get(indice)));
                if((LecturaEstandar.leerString("Confirma que quiere eliminar el registro "
                        + "S/sí, N/no?: ")).toUpperCase().equals("S")){
                    elimino = true;
                    estudiantes.remove(indice);
                }
            
            }
       
        }
        if (elimino){
            
            Object [] estudianteActualizado = estudiantes.toArray();
            if (ManejadorArchivoBinario.agregarVariosRegistros(
                 estudianteActualizado,
                    pathArchivoBinario)){
                System.out.println(" Registro eliminado exitosamente! ");            
        }

        } else {
            System.out.println("Estudiante de codigo unico: " + busqueda + " no existe "
                    + " Nada que eliminar! ");
        }
    }
}

    /*
    static final int opcionSalir=6;
    public static void main(String[] args) {
        String pathArchivoBinario = "EstudiantesBinarios.data";
        int opcion;
        do{
            opcion = menuOpciones();
            switch (opcion) {
                case 1:                 
                    System.out.println();
                    ManejadorArchivoBinario.mostrarArchivosBin(pathArchivoBinario);
                    break;
                case 2:
                    System.out.println("2. Agregar nuevo estudiante");
                    Estudiante estudiante = new Estudiante(
                            LecturaEstandar.leerString("Ingrese código unico: "),
                            LecturaEstandar.leerString("Ingrese Apellidos y Nombres: "),
                            LecturaEstandar.leerString("Ingrese correo EPN: ")
                            );
                    if(ManejadorArchivoBinario.agregarRegistro(estudiante, pathArchivoBinario))
                        System.out.println("\nRegistro(s) guardados exitosamente!\n");
                    else 
                        System.out.println("Ups algo salio mal!");
                    break;
                default:
                    System.out.println("Opcion Inexistente ");
                    break;
            }
        }while(opcion !=opcionSalir);
        
    }
    
    public static int menuOpciones(){
        int opcion = 0;
        System.out.println("Programa realizado por Fernando J. Cardenas");
        System.out.println("1. Mostrar listado de estudiantes");
        System.out.println("2. Agregar nuevo estudiante");
        System.out.println("3. Buscar estudiantes");
        System.out.println("4. Actualizar estudiante");
        System.out.println("5. Eliminar estudiante");
        System.out.println(Integer.toString(opcionSalir) + ". Salir");
        System.out.println("Ingrese un opcion: ");
        opcion= LecturaEstandar.leerEntero();
        return opcion;
    }
    */

