/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

/**
 *
 * @author nicolasmedina
 */
public class puestoscarro {
    private int numero;
    private String estado;
    private carros carro;
    
    public puestoscarro (int numero){
        this.numero = numero;
        this.estado = "Libre";
    }
    
    public void asignarpuesto(carros carro){
        this.carro = carro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public carros getcarro() {
        return carro;
    }

    public void setcarro(carros carro) {
        this.carro = carro;
    }
    
    
    public String libreStringc(){
        return "Puesto: "+this.getNumero()
            +"\nEstado: "+this.getEstado();
    }
    
    public String Datoscarro(){
        return "Puesto: " + this.getNumero()
            +"\nEstado: " + this.getEstado()
            +"\nPlaca del carro: "+this.getcarro().getplaca()
            +"\nHora: "+this.getcarro().getFechaingreso();
    }
}
