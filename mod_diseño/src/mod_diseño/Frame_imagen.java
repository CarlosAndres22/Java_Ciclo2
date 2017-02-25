
package mod_diseño;
import javax.swing.JFrame;
/**
 *
 * @author Usuario
 */
public class Frame_imagen extends JFrame{
    public Frame_imagen(){
    add(new fondo_img());
    setSize(300,300);
    setVisible(true);
    
    }
    
    public static void main(String[] args) {
        fondo_img f = new fondo_img();
    }
    
}
