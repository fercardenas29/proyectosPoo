
package ec.edu.epn.fis.archvivostexto;

import ec.edu.epn.fis.prograii2021b.LecturaEstandar;
import java.util.ArrayList;

/**
 * @author Fernando Cardenas
 */
public class ControladorArchivoTexto {

    
    public static void main(String[] args) {
        System.out.println("Programa realido por Fernando J. Cardenas");
        String archivoEstudiantes = "Ejemplo-Archivo-Texto.txt"; //El arhivo debo poner en la raiz del proyecto en Files
        int opcion = 0;
        final int opcionSalir=6;//La variable opcionSalir, por si el menu de opciones crece     
        do {
          opcion = menu();
          switch (opcion){
              case 1: ManejadorArchivoTexto.leerYMostrarArchivo(archivoEstudiantes);
              break;
              case 2: 
                  Estudiante nuevoEstudiante = new Estudiante(
                          LecturaEstandar.leerString("Ingrese codigo unico: "), 
                          LecturaEstandar.leerString("Ingrese Apellidos y Nombres: "), 
                          LecturaEstandar.leerString("Ingrese correo EPN: "));
                  int nroRegistro = ManejadorArchivoTexto.contarRegistros(archivoEstudiantes);
                  String nuevoRegistro = nuevoEstudiante.formatearRegistroArchivoTexto(nroRegistro);
                  if (ManejadorArchivoTexto.agregarRegistro(nuevoRegistro, archivoEstudiantes))
                      System.out.println("\nRegistro agregado exitosamente ");
                  break;
              case 3:
                  System.out.println("Ingrese un letra/palabra que pertenece al codigo, nombre o correo: "
                          + "del Estudiante");
                  String busqueda = LecturaEstandar.leerString();
                  ArrayList<String> estudiantes = ManejadorArchivoTexto.encontrarRegistro(busqueda, archivoEstudiantes);
                  if(estudiantes.size()<1)
                      System.out.println("0 Resultados");
                  else {
                      System.out.println(estudiantes.size() + " resultados");
                      ManejadorArchivoTexto.mostrarArchivos(estudiantes);
                  }
                  break;
              case 4:
                  System.out.println("Para actualizar un registro requiere identificar "
                          + " el Nro de registro. 1ro Realice una busqueda.");
                  int indexNroRegistroActualizar = LecturaEstandar.leerEntero("Ingrese el numero de registro: ");
                  ArrayList<String> listadoEstudiantes = ManejadorArchivoTexto.leerArchivo(archivoEstudiantes);
                  String[] unEstudianteCamposSeparados = ManejadorArchivoTexto.separarCampos(
                          listadoEstudiantes.get(indexNroRegistroActualizar));
                  System.out.println("Registro Actual: ");
                  Estudiante objetoEstudiante = new Estudiante(
                                                    unEstudianteCamposSeparados[1],
                                                    unEstudianteCamposSeparados[2], 
                                                    unEstudianteCamposSeparados[3]);
                  System.out.println(objetoEstudiante);
                  System.out.println("Nuevo codigo unico(Deje vacio si no va actualizar): ");
                  String nuevoCU = LecturaEstandar.leerString();
                  if(nuevoCU.length() > 0)objetoEstudiante.setCodigoUnico(nuevoCU);
                  System.out.println("Nuevo apellidos y nombres (Deje vacio si no va actualizar): ");
                  String nuevoApelNom = LecturaEstandar.leerString();
                  if(nuevoApelNom.length()>0)objetoEstudiante.setApellidosNombres(nuevoApelNom);
                  System.out.println("Nuevo correo (Deje vacio si no va a actualizar): ");
                  String nuevoEmail = LecturaEstandar.leerString();
                  if(nuevoEmail.length()>0)objetoEstudiante.setEmailEPN(nuevoEmail);
                  String registroModificado = objetoEstudiante.formatearRegistroArchivoTexto(
                          indexNroRegistroActualizar);
                  if(ManejadorArchivoTexto.actualizarArchivoUnRegistro(
                          indexNroRegistroActualizar, 
                          registroModificado, 
                          archivoEstudiantes));
                  System.out.println("Registro actualizado Extiosamente");
                  break;
              case 5:
                  System.out.println("Para eliminar un registro requiere identificar "
                          + " el Nro de registro. 1ro Realice una busqueda.");
                  int indexNroRegistroEliminar = LecturaEstandar.leerEntero("Ingrese el numero de registro: ");
                  if(ManejadorArchivoTexto.eliminarUnRegistro(indexNroRegistroEliminar, archivoEstudiantes))
                      System.out.println("Registro eliminado Extiosamente");
                  else 
                      System.out.println("Ups, es problable que no se elimino el registro");
                  break;
              case opcionSalir: 
                  System.out.println("Gracias, vuelva pronto! <3");
                  break;
              default: 
                  System.out.println("Opcion Inexistente, vuelva a escoger");
                  break;                         
              }

          }while (opcion!=opcionSalir);    
            
        }
    
    //Metodo menu, fuera del main, ya que es otro metodo
       static int menu(){
        int opcion = 0;
        System.out.println("\nSistema Estudiantil CDH");
        System.out.println("1. Listado de Estudiantes");
        System.out.println("2. Agregar un Estudiante");
        System.out.println("3. Buscar Estudiante");
        System.out.println("4. Actualizar Estudiante");
        System.out.println("5. Eliminar un Estudiante");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opcion: ");
        opcion = LecturaEstandar.leerEntero();
        return opcion;
    }
    
        /*
        ArrayList<String> registrosArchivo = new ArrayList<>();
        registrosArchivo = ManejadorArchivoTexto.leerArchivo(archivoEstudiantes);
        ManejadorArchivoTexto.mostrarArchivos(registrosArchivo);
        
        System.out.println("Ingresar un nuevo estudiante");
        Estudiante estud0 = new Estudiante(
                LecturaEstandar.leerString("Codigo Unico: "), 
                (LecturaEstandar.leerString("Apellidos y Nombres: ")).toUpperCase(), 
                LecturaEstandar.leerString("Correo EPN: "));
        
        String registroFormateado = estud0.formatearRegistroArchivoTexto(ManejadorArchivoTexto.contarRegistros(archivoEstudiantes));
        if (ManejadorArchivoTexto.agregarRegistro(registroFormateado, archivoEstudiantes))
            System.out.println("Registro Existoso");
        else
            System.out.println("Ups, paso algo Error");
        
        registrosArchivo = ManejadorArchivoTexto.leerArchivo(archivoEstudiantes);
        ManejadorArchivoTexto.mostrarArchivos(registrosArchivo);
        
        String palabraBusqueda = "u";
        System.out.println("Registros que contiene " + palabraBusqueda);
        registrosArchivo = ManejadorArchivoTexto.encontrarRegistro(palabraBusqueda, archivoEstudiantes);
        ManejadorArchivoTexto.mostrarArchivos(registrosArchivo);
        
        
        int indexNroRegistroActualizar = 7;
        String[] unRegistroCamposSeparados = ManejadorArchivoTexto.separarCampos(
                registrosArchivo.get(indexNroRegistroActualizar));
        unRegistroCamposSeparados[2] = "ALVEAR CACHIPUENDO KEVIN XAVIER";
        Estudiante unEstudiante = new Estudiante(
                unRegistroCamposSeparados[1],
                unRegistroCamposSeparados[2], 
                unRegistroCamposSeparados[3]);
        System.out.println("Estudiante a actualizar");
        System.out.println(unEstudiante);
        String registroModificado = unEstudiante.formatearRegistroArchivoTexto(indexNroRegistroActualizar);
        ManejadorArchivoTexto.actualizarArchivoUnRegistro(indexNroRegistroActualizar, 
                registroModificado, 
                archivoEstudiantes);
        ManejadorArchivoTexto.leerYMostrarArchivo(archivoEstudiantes);
    }
   */
    
  
    
    
    
}
