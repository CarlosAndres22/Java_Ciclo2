
package mod_diseño;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @(._.)
 */
public class fondo_img extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
      
       Dimension tam=getSize(); 
        ImageIcon Imagen=new ImageIcon(new ImageIcon(getClass().getResource("/Imagen/wallpaper-quadhd-1.jpg")).getImage());
    g.drawImage(Imagen.getImage(), 0, 0, tam.width, tam.height,null);
    }
    
}
