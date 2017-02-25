package fruver.herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author James ceballos
 */

public class verdurash extends FRUVERHERENCIA {
    
    
public int ver(int op){
     
    String  opc_men_ver; 
            opc_men_ver = null;
            int opc_men_ver2;
            String cantidadver=null;
            String opc_salida2=null;
    
              while(opc_salida!=0){
                            
                    do{

                    opc_men_ver=JOptionPane.showInputDialog(null,"Usted ha seleccionado Verduras \n "+
                    "*************************************************************\n"+
                    "\t  1. Arveja $ 1800 \n"+
                    "\t  2. Papa $ 1000 \n"+
                    "\t  3. Yuca $ 700 \n"+ 
                    "\t  4. Tomate $ 1200 \n"+
                    "\t  5. Cebolla $ 1300 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_ver2=Integer.parseInt(opc_men_ver);
                            
                                } while(opc_men_ver2<1 || opc_men_ver2>5);
                            
                switch( opc_men_ver2){
                    
                    case 1: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Arveja");
                        cantidadver=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadver);
                        setsubtotal(getcantidad()*verduras[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;      
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Papa");
                        cantidadver=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadver);
                        setsubtotal(getcantidad()*verduras[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Yuca");
                        cantidadver=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadver);
                        setsubtotal(getcantidad()*verduras[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Tomate");
                        cantidadver=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadver);
                        setsubtotal(getcantidad()*verduras[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);    
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Cebolla");
                        cantidadver=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadver);
                        setsubtotal(getcantidad()*verduras[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;  
                    }
              }return getcont();    
                
        }/* Cierre public void ver */
}
  