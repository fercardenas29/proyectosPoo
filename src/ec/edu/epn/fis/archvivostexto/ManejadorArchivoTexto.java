
package ec.edu.epn.fis.archvivostexto;

import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 * @author Fernando Cardenas
 */
public class ManejadorArchivoTexto {
    public static char separadorDefault ='\t';
    
    //Metodo ccapaz de leer un archvivo de texto
    //Lee el archivo y devuelve un arreglo de string OJO solo para archivos pequeños
     public static ArrayList<String> leerArchivo(String rutaArchivo){
        ArrayList<String> filas = new ArrayList<>();
        FileReader archivo = null;        //Utilizamos try/cash para que no me de un error si en caso no existe el archivo
        try {
            archivo = new FileReader(rutaArchivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejadorArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        Scanner scan = new Scanner(archivo);
        while(scan.hasNextLine()){      //Verificar si hay una linea, el hasNextLine me devuele un boolean (T or F)
            filas.add(scan.nextLine()); //
        }
        scan.close(); //Cerrar el archivo, despues de leerlo
        return filas;
        
    }
       //Metodo para mostrar los archivos que nos devuelve el arrayList de leerArchivos
     public static void mostrarArchivos(ArrayList<String> archivo){
        for (String fila:archivo){
            System.out.println(fila);
        }   
    } 
     
     public static int contarRegistros (String rutaArchivo){
        int contador = 0;
        FileReader archivo = null;
        try {
            archivo = new FileReader(rutaArchivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejadorArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        try(Scanner scan = new Scanner(archivo)){
            while(scan.hasNextLine()){  
                scan.nextLine();
                contador++;
            }
             scan.close();
        }     
        return contador;
    }
     
    public static boolean agregarRegistro(String registro, String pathArchivo){
        FileWriter fw = null;
        boolean b = false;
         try {
             fw = new FileWriter(pathArchivo, true); //false Sobre escribir el archivo, true agregar
             PrintWriter printW = new PrintWriter(fw);
             printW.println(registro);
             fw.close();
             b = true;    
         } catch (IOException ex) {
             Logger.getLogger(ManejadorArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex.getMessage());
         }
        return b;
    }
    //Miercoles 02/02/2022
    
    public static ArrayList<String> encontrarRegistro(String busqueda, String pathArchivo){
        ArrayList<String> resultados = new ArrayList<>();
        FileReader archivo = null;
        Scanner scan = null;
        try {
            archivo = new FileReader(pathArchivo);
            scan = new Scanner(archivo);
            while(scan.hasNextLine()){
                String registro = scan.nextLine();
                if( (registro.toLowerCase()).contains(busqueda.toLowerCase()))
                    resultados.add(registro);
            }
        }catch (FileNotFoundException ex){
            Logger.getLogger(ManejadorArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        finally {
            if(scan != null)
                scan.close();  
        }
        return resultados;  
    }   
    public static String[] separarCampos(String registro){
        return registro.split(Character.toString(separadorDefault));
    }
    public static boolean eliminarContenido(String pathArchivo){
        FileWriter fw = null;
        boolean b = false;
         try {
             fw = new FileWriter(pathArchivo, false); //false Sobre escribir el archivo, true agregar
             PrintWriter printW = new PrintWriter(fw);
             printW.print("");
             fw.close();
             b = true;    
         } catch (IOException ex) {
             Logger.getLogger(ManejadorArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex.getMessage());
         }
        return b;
    }
    

   public static boolean actualizarArchivoUnRegistro(int idxRegistro, String nuevoRegistro, 
           String pathArchivo){
       boolean b = false;
       ArrayList<String> archivo = leerArchivo(pathArchivo);
       if(archivo == null || archivo.size() < 1 )
           return b;
       archivo.set(idxRegistro, nuevoRegistro); //0 Nro ApellidosNombres
       if(!eliminarContenido(pathArchivo))
           return b;
       for(String registro:archivo){
           if(!agregarRegistro(registro, pathArchivo))
               return b;  
           
       }
       b=true;
       return b;
   }
   
   public static void leerYMostrarArchivo(String rutaArchivo){
       FileReader archivo = null;
       try{
           archivo = new FileReader(rutaArchivo);
       }catch (FileNotFoundException ex){
           Logger.getLogger(ManejadorArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex.getMessage());
       }
       Scanner scan = new Scanner(archivo);
       while(scan.hasNextLine()){
           System.out.println(scan.nextLine());
       }
       scan.close();
   }
   
    public static boolean eliminarUnRegistro(int idxRegistro, String pathArchivo){
       boolean b = false;
       ArrayList<String> archivo = leerArchivo(pathArchivo);
       if(archivo == null || archivo.size() < 1 )
           return b;
       archivo.remove(idxRegistro); //Elimino segundo el indice del registro 
       if(!eliminarContenido(pathArchivo))
           return b;
       for(String registro:archivo){
           if(!agregarRegistro(registro, pathArchivo))
               return b;  
       }
       b=true;
       return b;
   }
}



