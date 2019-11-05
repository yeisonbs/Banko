
package Negocio;

import Operaciones.Operacion;
import Dto.*;
import java.time.LocalDate;
import java.util.TreeSet;

public class Banco {
    TreeSet<Cliente> clientes=new TreeSet();
    TreeSet<Cuenta> cuentas=new TreeSet();
    TreeSet<Operacion> operaciones= new TreeSet();

    public Banco() {
    }
    
    public boolean insertarCliente(long cedula, String nombre, String dir, String fecha, String email, long telefono)
    {    
        Cliente nuevo=new Cliente();
        nuevo.setCedula(cedula);
        nuevo.setNombre(nombre);
        nuevo.setFechaNacimiento(crearFecha(fecha));
        nuevo.setDirCorrespondencia(dir);
        nuevo.setTelefono(telefono);
        nuevo.setEmail(email);
        //iría al dao , pero sólo por hoy en dinamic_memory
        return this.clientes.add(nuevo);
    }
    
    
    public boolean insertarCuenta(long nroCuenta, long cedula, boolean tipo)
    {
    Cliente x=new Cliente();
    x.setCedula(cedula);
    x=buscarCliente(x);
    if(x==null)    
        return false;
    Cuenta nueva=tipo?new CuentaAhorro():new CuentaCorriente();
    nueva.setCliente(x);
    nueva.setNroCuenta(nroCuenta);
    nueva.setFechaCreacion(LocalDate.now());
    return this.cuentas.add(nueva);
    }
    
    
    private Cliente buscarCliente(Cliente x)
    {
        if(this.clientes.contains(x))
        {
            return this.clientes.floor(x);
        }
        return null;
    }      
    
    private Cliente buscarCliente2(Cliente x)
    {
        for(Cliente y:this.clientes)
            if(y.equals(x))
                return y;
     return null;
    }
    
    
    private LocalDate crearFecha(String fecha)
    {
        String fechas[]=fecha.split("-");
        int agno=Integer.parseInt(fechas[0]);
        int mes=Integer.parseInt(fechas[1]);
        int dia=Integer.parseInt(fechas[2]);
        return LocalDate.of(agno,mes,dia);
    }
    
    private void consignar(double valorConsignar, double saldo){
      
      /*  Consignar consignar= new Consignar();
        valorConsignar= consignar.getValorConsignado();
        
        
        if (valorConsignar > 0) {
            this.setSaldo(this.getSaldo() + valor);
            return true;
        }
        return false;*/
        
    
    }
    
    private void retirar(){
    
    }
    
    
    private void tranferir(){
    }
    
    

    public TreeSet<Cliente> getClientes() {
        return clientes;
    }
    
    public TreeSet<Cuenta> getCuentas(){
        return cuentas;
    }
    
    
    
}
