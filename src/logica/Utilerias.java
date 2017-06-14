
package logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Utilerias {
    // Se instancia una conexion de la clase conecta
    Conector con=new Conector();
    // se asigna la conexion a la base de datos con la variable cn
    Connection cn=con.conecta();
   
    public String darNumeroServicio(){
       String periodo=null;
       int mes;
       int servicio=0;
       int mes2;
       String Mes2="00";
      // obtenemos el mes y lo pasamos a 2 digitos 
      Calendar fecha= Calendar.getInstance();  
      mes = (fecha.get(Calendar.MONTH))+1; 
      String Mes=String.format("%02d",mes); 
      
      //obtenemos el mes almacenado en la base de datos y lo pasamos a 2 digitos
      
        try {
            String sql="SELECT * FROM cod_serv";
            Statement st;
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
            Mes2=rs.getString("mes");
            mes2=Integer.valueOf(Mes2);
            Mes2=String.format("%02d",mes2);
            servicio=rs.getInt("servicio");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilerias.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //
        if (Mes.equals(Mes2)){
            
            servicio++;
            try {
            String sql="UPDATE cod_serv set servicio='"+servicio+"'";
            Statement st;
            st=cn.createStatement();
            st.executeUpdate(sql);
            } catch (Exception e) {
            }
            
        }else{
            try {
            String sql="UPDATE cod_serv set mes='"+mes+"', servicio='1'";
            Statement st;
            st=cn.createStatement();
            st.executeUpdate(sql);
            servicio=1;
            } catch (Exception e) {
            }
        }
      
      periodo = Integer.toString(fecha.get(Calendar.YEAR));
      
      
      String Numero=String.format("%02d",servicio); 
      char primeracifra=periodo.charAt(2);
      String primera=String.valueOf(primeracifra);
      char doscifras=periodo.charAt(3);
      String segunda=String.valueOf(doscifras);
      String Servicio = primera+segunda+Mes+Numero;
      return Servicio;
   }
}
