package fruver.herencia;

/**
 *
 * @author James ceballos
 */

import javax.swing.JOptionPane;

public class productosaseoh extends FRUVERHERENCIA {
    
    
public int aseo(int op){
     
    String  opc_men_aseo; 
            opc_men_aseo = null;
            int opc_men_aseo2;
            String cantidadaseo=null;
            String opc_salida2=null;
    
             while(opc_salida!=0){
                            
                    do{

                    opc_men_aseo=JOptionPane.showInputDialog(null,"Usted ha seleccionado productos de aseo \n "+
                    "*************************************************************\n"+
                    "\t  1. Jabon en polvo $ 9800 \n"+
                    "\t  2. Jabon en barra $ 1350 \n"+
                    "\t  3. Jabon liquido $ 3800 \n"+ 
                    "\t  4. Limpido $ 3200 \n"+
                    "\t  5. Suavisante $ 5600 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_aseo2=Integer.parseInt(opc_men_aseo);
                            
                                } while(opc_men_aseo2<1 || opc_men_aseo2>5);
                            
                switch( opc_men_aseo2){
                    
                    case 1: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Jabon en polvo");
                        cantidadaseo=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadaseo);
                        setsubtotal(getcantidad()*aseo[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;      
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Jabon en barra");
                        cantidadaseo=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadaseo);
                        setsubtotal(getcantidad()*aseo[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Jabon liquido");
                        cantidadaseo=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadaseo);
                        setsubtotal(getcantidad()*aseo[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Limpido");
                        cantidadaseo=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadaseo);
                        setsubtotal(getcantidad()*aseo[3]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Suavizante");
                        cantidadaseo=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadaseo);
                        setsubtotal(getcantidad()*aseo[4]);
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
        }/* Cierre public void aseo */
}
  