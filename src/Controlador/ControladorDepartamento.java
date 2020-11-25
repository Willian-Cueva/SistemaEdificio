/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Departamento;
import Modelo.Propietario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author compu
 */
public class ControladorDepartamento {
    public  boolean permitirAcceso(String codigo,String usuario,String clave){
        boolean chis=false;
        try {
            
            FileReader fi = new FileReader("Departamentos.txt");
            BufferedReader bu = new BufferedReader(fi);
            
            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                if(codigo.equals(st.nextToken()) && clave.equals(st.nextToken())){
                    chis=true;
                }
            }
            bu.close();
        } catch (Exception ex) {
            System.out.println("Error al cargar archivo2: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
        if (chis) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Departamento> cargarListaDepartamentos(){
        File archivo=new File("Departamentos.txt");
        ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
        Departamento p;
        try {
            
            FileReader fi = new FileReader(archivo);
            try (BufferedReader bu = new BufferedReader(fi)) {
                String linea = null;
                while ((linea = bu.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    p = new Departamento();
                    p.setCodigo(Double.parseDouble(st.nextToken()));
                    p.setContraseniaDepartamento(st.nextToken());
                    p.setNombreDepartamento(st.nextToken());
                    p.setCapacidad(Double.parseDouble(st.nextToken()));
                    listaDepartamentos.add(p);
                }
            }
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error al cargar archivo2: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
        
        return  listaDepartamentos;
    }

    public ArrayList<Propietario> cargarListaPropietarios() {
        File archivoFile=new File("Propietarios.txt");
        ArrayList<Propietario> listaPropietarios=new ArrayList<>();
        listaPropietarios.clear();
        if(archivoFile.length()!=0){
            try {
            FileReader fr=new FileReader(archivoFile);
            BufferedReader bu=new BufferedReader(fr);
            String linea = null;
            while ((linea = bu.readLine()) != null) {  
                StringTokenizer st=new StringTokenizer(linea,",");
                Propietario pro=new Propietario();
                pro.setCodigoDeDepartamento(Double.parseDouble(st.nextToken()));
                pro.setContrasenia(st.nextToken());
                pro.setUsuario(st.nextToken());
                pro.setCedula(st.nextToken());
                listaPropietarios.add(pro);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return listaPropietarios;
    }

}
