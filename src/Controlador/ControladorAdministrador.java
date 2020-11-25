/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author compu
 */
public class ControladorAdministrador {
     public boolean autenticarAdministrador(String user,String password){
        String usuario="";
        String contrasenia="";
        try {
            
            FileReader fi = new FileReader("Administrador.txt");
            BufferedReader bu = new BufferedReader(fi);
            
            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                
                usuario=st.nextToken();
                contrasenia=st.nextToken();
   
            }
            bu.close();
        } catch (Exception ex) {
            System.out.println("Error al cargar archivo en Autenticar Administrador " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
         if (user.equals(user) && contrasenia.equals(password)) {
             return true;
         } else {
             return false;
         }
    }
}
