
package gonacmecanico;

import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import logica.Conector;


public class GonacMecanico {


    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable(){
        public void run(){
            
            try{
                // Se llama a la libreria de aspecto Substance
                JFrame.setDefaultLookAndFeelDecorated(true);
                
                // Agrego el aspecto de buscando a nemo (ay que bonito :D )
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");
                // agrego la combinacion de colores de Aqua
                //SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceBottleGreenTheme");
                //Le pongo un fondo de burbujitas, para darle un toque del sistema de agua :)
                //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceFabricWatermark");
            }              
            catch(Exception e){
            } 
            Conector con = new Conector();
            con.conecta();

            Portada frm = new Portada();
            //frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frm.setVisible(true);
        }
        });          
    }
    
}
