/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

/**
 *
 * @author Acer
 */
public class puestosbici {
    private int numero;
    private String estado;
    private bicicletas Bici;
    
    public puestosbici(int numero){
        this.numero = numero;
        this.estado = "Libre";
    }
    
    public void asignarpuesto(bicicletas Bici){
        this.Bici = Bici;
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

    public bicicletas getBici() {
        return Bici;
    }

    public void setBici(bicicletas Bici) {
        this.Bici = Bici;
    }

    

  
    
    public String libreStringb(){
        return "Puesto: "+this.getNumero()
            +"\nEstado: "+this.getEstado();
    }
    
    public String Datosbici(){
        return "Puesto: "+this.getNumero()
            +"\nEstado: "+this.getEstado()
            +"\nColor del carro: "+this.getBici().getCedula()
            +"\nHora: "+this.getBici().getFechaingreso();
    }
}
