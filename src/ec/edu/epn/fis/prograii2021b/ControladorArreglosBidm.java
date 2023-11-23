/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author usuario
 */
public class ControladorArreglosBidm {
    

   public static void main(String[] args) {
       Carro[][] misAutos = new Carro [2][3];
          llenarArregloBidCarro(misAutos);
          imprimirArregloBidCarro(misAutos);
          
          
        /**float [][] calificaciones= new float[4][3];
       llenarArregloBidimensional(calificaciones);
       promediarDatos(calificaciones);
       imprimirMatriz(calificaciones);
       **/
    }
    
   
   public static void llenarArregloBidCarro(Carro[][] autos){
            for( int f=0; f<autos.length;f++){  
                     for (int col=0; col<autos[f].length; col++){
                        autos[f][col] = new Carro(LecturaEstandar.leerString("Ingrese una marca de carro: "));
                     }
             }
   }
   
   public static void imprimirArregloBidCarro(Carro[][] autos){
            for(Carro[] auto : autos){  
                     for (Carro auto1 : auto){
                         System.out.println(auto1);
                     }
             }
   }
   
   
   
    public static void llenarArregloBidimensional(float[][] datos){ //pidiendo datos e ir guardando en la variable datos
     for(int f=0; f<datos.length;f++ ){  
         for (int c=0; c<datos[f].length-1;c++){ //el -1 es para Dejar vacia la ultima columna ya que voy a utilizar para actualizar calculando el promedio de cada fila 
           datos[f][c]=LecturaEstandar.leerFloat("Ingrese nota["+f+"]"+"["+c+"]: "); //Leer float, desde la clase LecturaEstandar Espera que el usuario ingrese-Si ingresa un valor no valido, toca poner un tryCash
         }
     }
    }
    
    public static void promediarDatos(float[][] datos){ 
    float promedioFila;
        for (float[] dato : datos) {
            promedioFila=0.0f;
            for (int c = 0; c < dato.length - 1; c++) {
                promedioFila += dato[c];
            }
            promedioFila/=datos.length-1;
            dato[dato.length -1 ] = promedioFila;
        }      
    }
    
     public static void imprimirMatriz(float[][]  datos){ 
        for (float[] dato : datos) {
            for (int c = 0; c<dato.length; c++) {
                System.out.println(dato[c]+"\t");
            }
                System.out.println();
        }      
    }
        
}
