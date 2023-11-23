/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author Fernando Cardenas
 */
public class DiaSemana {
    
    public static boolean esDiaLaborable(int d){
       boolean b=false;
       if(d>=1 && d<=5){
           b=true;
       }
       return b;
    }
    public static String diaNombre (int d){
        String nombre ="";
        switch (d){
            case 1:
                nombre="Lunes";
                break;
            case 2:
                nombre="Martes";
                break;    
            case 3:
                nombre="Miercoles";
                break;    
            case 4:
                nombre="Jueves";
                break;    
            case 5:
                nombre="Viernes";
                break;    
            case 6:
                nombre="Sabado";
                break;
            case 7:
                nombre="Domingo";
                break;    
        }
     return nombre;
    }
    
    
    
}
