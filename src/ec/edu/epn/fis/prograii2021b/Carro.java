/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.fis.prograii2021b;

/**
 *
 * @author ferch
 */
public class Carro {
    private String marca; //Los atributos sean private, por caracteristicas del lenguaje
    private String modelo; //Los atributos sean private, por caracteristicas del lenguaje
    private int año; //Los atributos sean private, por caracteristicas del lenguaje
    private int velocidad;
    public String color;

    Carro(int leerEntero, String leerString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        
    }

//Contructor
 public Carro(){}
 
 //Contructor
 public Carro(String marca){
     this.marca=marca;
 }
    public Carro(String marca, String modelo,int año){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        
    }

    @Override
    public String toString() {
        return "Marca:" +this.marca+ " "  + "Modelo:" +"   "+this.modelo + " Año:"+ this.año+ ",Velocidad:"+velocidad;
    
    }
    
    public String getMarca() { //Get(Return marca)(Me va a deveolver el atributo Marca) Retorna un String
        return marca;
    }

    public void setMarca(String marca) {  //Set (Fijar, recibe el string para asignar al atributo de la clase)
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    //Metodos
    public void incrementarVelocidad(int v){
        this.velocidad +=v; //Esto quiere decir > velocidad = velocidad + v;
    }
    public void reducirVelocidad(int v){
        this.velocidad -=v; //Esto quiere decir > velocidad = velocidad - v;
          
    }
    public int calcularAntiguedadCarro(int añoActual){
        int n = añoActual-año;
        return n;
    }
        
    }
