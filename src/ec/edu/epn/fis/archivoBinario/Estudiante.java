
package ec.edu.epn.fis.archivoBinario;
import java.io.Serializable;

/**
 * @author Fernando Cardenas
 */
public class Estudiante implements Serializable {
    private String codigoUnico;
    private String apellidosNombres;
    private String emailEPN;
    
    public Estudiante() {
    }
 
    public Estudiante(String codigoUnico, String apellidosNombres, String emailEPN) {
        this.codigoUnico = codigoUnico;
        this.apellidosNombres = apellidosNombres;
        this.emailEPN = emailEPN;
    }

   public String formatearRegistroArchivoTexto(int nroRegistro){
       String registro = nroRegistro + "\t" +
               codigoUnico + "\t" +
               apellidosNombres.toUpperCase() + "\t" +
               emailEPN;
       return registro;
   }
   
    //02//02/2022
    @Override
    public String toString() {
        return "Codigo U: " + codigoUnico + "\n" +
                "Apellidos y Nombres: " + apellidosNombres + "\n" +
                "Email EPN: " + emailEPN+ "\n" ;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void setApellidosNombres(String apellidosNombres) {
        this.apellidosNombres = apellidosNombres.toUpperCase();
    }

    public void setEmailEPN(String emailEPN) {
        this.emailEPN = emailEPN.toLowerCase();
    }
 
    public String toFila(){
        return String.format("%-10s%-35s%-20s",
                             codigoUnico,
                             apellidosNombres,
                             emailEPN);
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public String getApellidosNombres() {
        return apellidosNombres;
    }

    public String getEmailEPN() {
        return emailEPN;
    }
    
    
    
    public boolean contieneBusqueda (String busqueda){
        boolean b=false;
        if( this.codigoUnico.contains(busqueda)
               || apellidosNombres.contains(busqueda.toUpperCase())
               || (emailEPN.toUpperCase()).contains(busqueda.toUpperCase()))
            b = true;
        return b;
    }
}
