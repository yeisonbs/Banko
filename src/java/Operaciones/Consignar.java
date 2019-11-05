/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Dto.Cuenta;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Consignar extends Operacion{
    
    private double valorConsignado;

    public Consignar() {
        super();
    }

    public TreeSet<Cuenta> getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(TreeSet<Cuenta> cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Consignar(double valorConsignado) {
        this.valorConsignado = valorConsignado;
    }

    public double getValorConsignado() {
        return valorConsignado;
    }

    public void setValorConsignado(double valorConsignado) {
        this.valorConsignado = valorConsignado;
    }
    
    
    
}
