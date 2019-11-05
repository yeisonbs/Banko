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
public class Transferencia extends Operacion{
    
    private double transferir;
    TreeSet<Cuenta> cuentaDestino= new TreeSet();

    public Transferencia() {
    }

    public double getTransferir() {
        return transferir;
    }

    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }

    public TreeSet<Cuenta> getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(TreeSet<Cuenta> cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public TreeSet<Cuenta> getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(TreeSet<Cuenta> cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    
    
    
}
