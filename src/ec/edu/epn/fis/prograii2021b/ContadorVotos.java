/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author ferch
 */
public class ContadorVotos {
    
    String candidatoUno;
    String candidatoDos;
    int votoCUno;
    int votoCDos;

    public ContadorVotos(String candidatoUno, String candidatoDos, int votoCUno, int votoCDos) {
        this.candidatoUno = candidatoUno;
        this.candidatoDos = candidatoDos;
        this.votoCUno = votoCUno;
        this.votoCDos = votoCDos;
    }
    
    public void sumarUnVoto(String candidato){
        if(candidato.equalsIgnoreCase(candidatoUno))
            votoCUno++;
        else if(candidato.equalsIgnoreCase(candidatoDos))
            votoCDos++;
    }
    
    public void contarVotos(){
        String nombre="N";
        do{
            System.out.println("Ingrese nombre de candidato que suma el voto (X para salir): ");
            nombre=LecturaEstandar.leerString();
            sumarUnVoto(nombre);
        }while(!nombre.equalsIgnoreCase("X"));   
    }

    @Override
    public String toString() {
        return "Candidato "+candidatoUno+" total votos: "+votoCUno+"  Candidato "+
                candidatoDos+" total votos: "+votoCDos;
    }
    
    
}