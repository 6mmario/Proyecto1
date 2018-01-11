
package proyectoedd;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ProyectoEDD {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        Login log = new Login();
        log.setVisible(true);
        
     //   Inicio ini = new Inicio();
     //  ini.setVisible(true);
    }
    
}
