
package ec.edu.epn.fis.prograii2021b;
import java.util.Scanner;
/**
 *
 * @author Fernando Cardenas
 */
public class LecturaEstandar {
    
    
  public static String leerString (){  //No va arecibir parametros
        String s;
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextLine();
        return s;
               
    }
    //Puede tener mas de una version, tener sobrescritura
    //SOBRECARGA    
public static String leerString (String ms){  //Recibe parametros
        String s;
        System.out.print(ms);  //Aqui me encargo de hacer la impresion
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextLine();
        return s;
               
    }

public static int leerEntero(){
    int i;
    i = Integer.parseInt(leerString()); //Para hacer la conversion de string a un entero. Recibo String -> Devuelve int
    return i;
}

public static int leerEntero(String ms){
    int i;
    System.out.print(ms);
   i = Integer.parseInt(leerString());
   return i;
   }

public static float leerFloat(String ms){
    float i;
    System.out.print(ms);
   i = Float.parseFloat(leerString());
   return i;

}

}

















/**
public static float leerFloat(){
    float r=0.0f;
    Scanner stdln = new Scanner(System.in);
    String s = stdln.nextLine();
    try{
        r=Float.parseFloat(s);
    } catch (NumberFormatException e){
        System.out.println("Error: "+ e.getMessage());
        r=-1000000.00f;
    }
    return r;
}
public static float leerFloat(String msg){
    System.out.println(msg);
    return leerFloat();
}
/**
public static int leerEnteroSinTryC(){
    int r=0;
    Scanner stdh = new Scanner(System.in);
    String s = stdh.nextLine();
    r=Interger.parseInt(s);
    return r;
    
 }   

public static int leerEnteroLanzaException( throws NumberFormatExpeotion){

}*/




