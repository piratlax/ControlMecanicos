/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mao
 */
public class Conector {
    
    Connection conn = null;
   
   public Connection conecta() {
               
       try{
         //obtenemos el driver para Access 
         Class.forName("org.mariadb.jdbc.Driver");
         //obtenemos la conexión         
         conn = DriverManager.getConnection("jdbc:mysql://maorivera.com:3306/maoriver_gonac","maoriver_usuario","Barbara2401");
         //conn = DriverManager.getConnection("jdbc:mysql://localhost/gonac_mecanico","root","");
         //si la conexion tuvo exito
         if (conn!=null){
            System.out.println("Conexión a base de datos Gonac Mecanico");
            
         }
      }catch(SQLException e){
           //JOptionPane.showMessageDialog(null, "Sin conexion a BD, se necesita acceso a internet");
           //System.exit(0);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
       return conn;
   }

   

   //como dice su nombre, termina la conexion a la base de datos
   public void desconectar(){
        try {
            conn.close();
            //conn = null;
            System.out.println("La conexion a la  base de datos alumnos a terminado");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
    
}
