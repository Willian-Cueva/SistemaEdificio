/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author compu
 */
public class Departamento implements Restriccion{
    public String nombreDepartamento;
    
    public double capacidad;
    public double codigo;
    public double numeroPropietarios=0;
    public String contraseniaDepartamento;
    

    public Departamento() {
    }

    public Departamento(String nombreDepartamento, double capacidad, double codigo, String contraseniaDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.capacidad = capacidad;
        this.codigo = codigo;
        this.contraseniaDepartamento = contraseniaDepartamento;
    }

   
    
     
    
    @Override
    public boolean restriccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nombreDepartamento
     */
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    /**
     * @param nombreDepartamento the nombreDepartamento to set
     */
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    /**
     * @return the capacidad
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the codigo
     */
    public double getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the contraseniaDepartamento
     */
    public String getContraseniaDepartamento() {
        return contraseniaDepartamento;
    }

    /**
     * @param contraseniaDepartamento the contraseniaDepartamento to set
     */
    public void setContraseniaDepartamento(String contraseniaDepartamento) {
        this.contraseniaDepartamento = contraseniaDepartamento;
    }

    /**
     * @return the nombreDepartamento
     */
    
}
