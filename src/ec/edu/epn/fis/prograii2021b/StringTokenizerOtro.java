/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author usuario
 */
public class StringTokenizerOtro {
    
  /**
 *Metodo que valida si tiene la palabra Hola
 * 
 * @Return return true si contiene la palabra Hola
 *                    return false si no contiene la palabra Hola
 */
  public static boolean esSaludo(String frase){
      String er= "Hola[A-Z]*[a-z]* ";
      boolean resultado=false;
      resultado =frase.matches(er);
      return resultado;
    }
}
