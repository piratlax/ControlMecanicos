
package logica;

import java.util.Calendar;
import java.util.Date;




public class Utilerias {
   public void darNumeroServicio(){
       String periodo=null;
       String mes=null;
       String servicio=null;
     
      Calendar fecha= Calendar.getInstance();
      periodo = Integer.toString(fecha.get(Calendar.YEAR));
      System.out.println (periodo);
      mes = Integer.toString(fecha.get(Calendar.MONTH));
      System.out.println (String.format("%02d",mes));
   }
}
