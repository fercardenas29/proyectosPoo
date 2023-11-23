
package ec.edu.epn.fis.archvivostexto;

/**
 * @author Fernando Cardenas
 */
public class Estudiante {
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
        this.apellidosNombres = apellidosNombres;
    }

    public void setEmailEPN(String emailEPN) {
        this.emailEPN = emailEPN;
    }

}
