/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * Hacer uso del formato de 24 o 12 horas
 * Por defecto espera valores de hora en formato 24 horas  0-24
 * @author Fernando Cardenas
  
 */
public class TiempoHMS {
    
    private int hora; //0-24 esto va a esperar
    private int minutos;
    private int segundos;

    public TiempoHMS(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public TiempoHMS(int hora, int minutos, int segundos) {
        this.hora = hora; 
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public TiempoHMS(){
        this(0,0,0);  //ASi puedo llamar tambien a un constructor de la clase
    }

    /** Convierte a objeto String en formato de hora universal HH-MM-SS
     * @return en formato HH-MM-SS
     */
    public String aStringUniversal()
    {
        return String.format("%02d.%02d.%02d",hora,minutos,segundos );
    
       }
    
    //Metodo para formato de 12 horas
    //Uso del operador ternario
    //Formato H MM-SS-(AM v PM)
    
    
    public String aStringDoceHoras()
    {
        return String.format("%d:%02d:%02d %s", (( hora == 0 || hora == 12)?12: hora % 12), minutos, segundos, (hora<12? "AM" : "PM"));       
    }
        
    @Override
    public String toString (){
        return aStringUniversal();
    }

}

