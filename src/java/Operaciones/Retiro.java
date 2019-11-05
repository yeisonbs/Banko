/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Dto.Cuenta;
import Operaciones.Operacion;
import java.util.TreeSet;

/**
 *
 * @author usuario
 */
public class Retiro extends Operacion {
    
    private double valorRetirado;

    public Retiro() {
        super();
    }

    public Retiro(double valorRetirado) {
        this.valorRetirado = valorRetirado;
    }

    public double getValorRetirado() {
        return valorRetirado;
    }

    public void setValorRetirado(double valorRetirado) {
        this.valorRetirado = valorRetirado;
    }

    public TreeSet<Cuenta> getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(TreeSet<Cuenta> cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    
    
    
}
