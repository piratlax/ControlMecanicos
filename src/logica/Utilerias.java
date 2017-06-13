
package logica;

import java.util.Calendar;
import java.util.Date;




public class Utilerias {
   public String darNumeroServicio(){
       String periodo=null;
       int mes;
       int servicio;
     
      Calendar fecha= Calendar.getInstance();
      periodo = Integer.toString(fecha.get(Calendar.YEAR));
      mes = (fecha.get(Calendar.MONTH));
      String Mes=String.format("%02d",mes); 
      servicio=1;
      String Numero=String.format("%02d",servicio); 
      char primeracifra=periodo.charAt(2);
      String primera=String.valueOf(primeracifra);
      char doscifras=periodo.charAt(3);
      String segunda=String.valueOf(doscifras);
      String Servicio = primera+segunda+Mes+Numero;
      return Servicio;
   }
}
