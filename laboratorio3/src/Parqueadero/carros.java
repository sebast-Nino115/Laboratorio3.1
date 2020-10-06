/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
class carros extends Transportes{
    public String cedula;

    public carros(String Placa, Date fechaingreso){
        this.placa = Placa;
        this.fechaingreso=fechaingreso;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }
}
