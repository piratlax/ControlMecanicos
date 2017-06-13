
package gonacmecanico;

import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import logica.Conector;
import logica.Utilerias;


public class GonacMecanico {


    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable(){
        public void run(){
            
            try{
                // Se llama a la libreria de aspecto Substance
                JFrame.setDefaultLookAndFeelDecorated(true);
                
                
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");
                
            }              
            catch(Exception e){
            } 
            
            Portada frm = new Portada();
            frm.setVisible(true);
            
        }
        });          
    }
    
}
