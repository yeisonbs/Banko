/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Dto.Cuenta;
import java.time.LocalDate;
import java.util.TreeSet;


/**
 *
 * @author usuario
 */
public class Operacion implements Comparable{
    
    private LocalDate fecha;
    private double saldo;
    private int identificador;
    
    
    TreeSet<Cuenta> cuentaOrigen = new TreeSet();

    public Operacion() {
    }
    
    

    public Operacion(LocalDate fecha, double saldo, int identificador) {
        this.fecha = fecha;
        this.saldo = saldo;
        this.identificador = identificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Operacion{" + "fecha=" + fecha + ", saldo=" + saldo + ", identificador=" + identificador + '}';
    }

    @Override
    public int compareTo(Object o) {
         Operacion x=(Operacion)o;
       
     return ((int)(this.identificador-x.identificador));
    }
    
    
    
    
}
