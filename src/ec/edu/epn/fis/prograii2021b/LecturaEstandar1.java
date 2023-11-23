/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

import java.util.Scanner;

/**
 *
 * @author ferch
 */
public class LecturaEstandar1 {
    

public static String leerString (String msg){
        System.out.println(msg);
        return leerString();
               
    }
    //Puede tener mas de una version, tener sobrescritura
    //SOBRECARGA    
public static String leerString (){  //Recibe parametros
        Scanner stdln = new Scanner(System.in);
        return stdln.nextLine();
               
    }
}