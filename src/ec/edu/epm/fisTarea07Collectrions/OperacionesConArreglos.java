/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epm.fisTarea07Collectrions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class OperacionesConArreglos {
    
    public void impimirArreglo(int[] arregloInt){
        for (int valorInt : arregloInt){
            System.out.printf("%d ", valorInt);
        }
        System.out.println();
    }
    
     public void impimirArreglo(double[] arregloDouble){
        for (double valorD : arregloDouble){
            System.out.printf("%f ", valorD);
        }
        System.out.println();
    }
    
     public void imprimirArreglo(String[] arregloString){
         System.out.println("{");
         for (String valor : arregloString){
             System.out.printf("%s", valor);
         }
         System.out.println("{");
         System.out.println();
     }
    public void llenarArregloConConstante(int[] arregloInt, int valor){
        Arrays.fill(arregloInt, valor);
    }
    
    public void copiarArreglo(int[] arregloInt, int[] arregloIntCopia){
        System.arraycopy(arregloInt, 0, arregloIntCopia, 0, arregloInt.length);
    }
    
    public int buscarUnInt(int [] arregloInt, int valor) {
        return Arrays.binarySearch(arregloInt, valor); 
    }
    
    public void imprimirIgualdad(int [] arreglo1, int [] arreglo2){
        boolean b = Arrays.equals(arreglo1, arreglo2);
        System.out.printf("arreglo1 %s arreglo2\n",
                (b ? " igual ": " distinto "));
    }
    
    public ArrayList<String> arregloToArrayLista(String arreglo[] ){
        ArrayList<String> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(arreglo));
        return myList;
    }
    
    public void impimirArrayListConIterator(Collection<String> coleccion ){
        Iterator <String> iterador = coleccion.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.hasNext());
        }
    }
    
    public void eliminarStringRepetidoList(Collection<String> coleccion1,
            Collection<String> coleccion2){
        Iterator<String> iterador = coleccion1.iterator();
        while(iterador.hasNext()){
            if  (coleccion2.contains(iterador.next())){
                iterador.remove();
            }
        }
    }
}
