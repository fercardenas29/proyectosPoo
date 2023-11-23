
package ec.edu.epn.fis.archivoBinario;
import java.io.*;
import java.util.ArrayList;

/**
 * @author Fernando Cardenas
 */
public class ManejadorArchivoBinario {
    
    public static boolean agregarRegistro(Object objeto, String pathArchivo){
        boolean b = false;
        FileOutputStream fos;       //La clase que es un apuntador
        ObjectOutputStream fileOut; //La clase que escribe
        try{
           fos = new FileOutputStream(pathArchivo);
           fileOut = new ObjectOutputStream(fos);
           fileOut.writeObject((Estudiante)objeto);
           fileOut.close();
           b = true;
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return b;
    }
    
    public static boolean agregarRegistroAlFinal (Object objeto, String pathArchivo){
        boolean b = false;
        
        try{ 
            AppendableObjectOutputStream fileOut = new AppendableObjectOutputStream(
                        new FileOutputStream(pathArchivo, true));
            fileOut.writeObject(objeto);
            fileOut.flush();
            fileOut.close();      
            b = true;
        }catch (IOException e){
            System.out.println("Error agregarRegistroAlFinal " + e.getMessage());
        }
        return b;
    }
    
    public static boolean agregarVariosRegistros(Object[] objetos, String pathArchivo){
        boolean b =false;
        ObjectOutputStream fileOut; //La clase que escribe
        FileOutputStream fos;       //La clase que es un apuntador
        try{
            fos = new FileOutputStream(pathArchivo);
            fileOut = new ObjectOutputStream(fos);    
            for (Object objeto : objetos){
                fileOut.writeObject(objeto);
            }
            fileOut.close();       
            b = true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return b;
    }
    
    public static void mostrarArchivosBin(String pathArchivo){
        FileInputStream fis;
        ObjectInputStream fileIn = null;
        try {
            fis = new FileInputStream(pathArchivo);
            fileIn = new ObjectInputStream(fis);
            Object objeto = null;
            System.out.printf("%-10s%-35s%-20s\n",
                              "Codigo",
                              "Apellidos y Nombres",
                              "Email" );
            do{
                objeto = fileIn.readObject();
                if(objeto != null){
                   Estudiante est = (Estudiante)objeto;
                    System.out.println(est.toFila());
                }
            }while (objeto !=null);
            System.out.println();
            fileIn.close();    
        }
        catch (EOFException e){
        }
        catch (IOException e){
            System.out.println("MostrarArchivoBinario IOExeption: " + e.getMessage() + e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println("ClassNotFound");
            
        }
    }
    
    private static class AppendableObjectOutputStream extends ObjectOutputStream{
        public AppendableObjectOutputStream(OutputStream out) throws IOException{
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException{
            reset();
        }
    }
    
    public static void buscarEstudiantes(String busqueda, String pathArchivo){
        FileInputStream fis;
        ObjectInputStream fileIn = null;
        int contador = 0;
        try{
            fis = new FileInputStream(pathArchivo);
            fileIn = new ObjectInputStream(fis);
            Object objeto = null;
            System.out.printf("%-10s%-35s%-20s\n",
                              "Codigo",
                              "Apellidos y Nombres",
                              "Email" );
            do{
                objeto = fileIn.readObject();
                if(objeto != null){
                    Estudiante est = (Estudiante) objeto;
                    if(est.contieneBusqueda(busqueda)){
                        System.out.println(est.toFila());
                        contador++;
                    }
                }
            }while(objeto != null);
            System.out.println();
            fileIn.close();
        }catch (EOFException e){
            System.out.println("Registros encontrados " + contador);
        }catch (IOException e){
            System.out.println("MostrarArchivoBinario IOExeption: " + e.getMessage() + e.toString());
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFound" + e.getMessage());
            
        }     
    }
    
    public static ArrayList<Estudiante> leerArchivoBinEstudiantes(String pathArchivo){
       ArrayList<Estudiante> estudiantes = new ArrayList<>();
       FileInputStream fis;
        ObjectInputStream fileIn = null;
        try{
            fis = new FileInputStream(pathArchivo);
            fileIn = new ObjectInputStream(fis);
            Object objeto = null;
            do{
                objeto = fileIn.readObject();
                if(objeto != null){
                    estudiantes.add((Estudiante) objeto);
                }
            }while(objeto != null);
            System.out.println();
            fileIn.close();
        }catch (EOFException e){
           
        }catch (IOException e){
            System.out.println("MostrarArchivoBinario IOExeption: " + e.getMessage() + e.toString());
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFound" + e.getMessage());
        }
        return estudiantes;
    }
}
