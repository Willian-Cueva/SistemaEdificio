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
public class Propietario extends Persona{
    private String cedula;
    private double codigoDeDepartamento;

    public Propietario() {
        super(null, null);
    }
    
    public Propietario(String cedula, int codigoDeDepartamento, String usuario, String contrasenia) {
        super(usuario, contrasenia);
        this.cedula = cedula;
        this.codigoDeDepartamento = codigoDeDepartamento;
    }
    

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the codigoDeDepartamento
     */
    public double getCodigoDeDepartamento() {
        return codigoDeDepartamento;
    }

    /**
     * @param codigoDeDepartamento the codigoDeDepartamento to set
     */
    public void setCodigoDeDepartamento(double codigoDeDepartamento) {
        this.codigoDeDepartamento = codigoDeDepartamento;
    }
    
}
