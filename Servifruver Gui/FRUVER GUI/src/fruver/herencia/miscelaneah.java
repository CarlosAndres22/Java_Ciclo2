package fruver.herencia;

/**
 *
 * @author James ceballos
 */

import javax.swing.JOptionPane;

public class miscelaneah extends FRUVERHERENCIA {
    
    
public int mis(int op){
     
    String  opc_men_mis; 
            opc_men_mis = null;
            int opc_men_mis2;
            String cantidadmis=null;
            String opc_salida2=null;
    
             while(opc_salida!=0){
                 
                    do{

                    opc_men_mis=JOptionPane.showInputDialog(null,"Usted ha seleccionado Miscelanea \n "+
                    "*************************************************************\n"+
                    "\t  1. Salsa de tomate $ 9800 \n"+
                    "\t  2. Mayonesa $ 8000 \n"+
                    "\t  3. Salsa soya $ 4700 \n"+ 
                    "\t  4. Salsa negra $ 2100 \n"+
                    "\t  5. Salsa BBQ $ 2400 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_mis2=Integer.parseInt(opc_men_mis);
                            
                                } while(opc_men_mis2<1 || opc_men_mis2>5);
                            
                switch( opc_men_mis2){
                    
                    case 1: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Salsa de tomate");
                        cantidadmis=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadmis);
                        setsubtotal(getcantidad()*miscelanea[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;      
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Mayonesa");
                        cantidadmis=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadmis);
                        setsubtotal(getcantidad()*miscelanea[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Salsa Soya");
                        cantidadmis=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadmis);
                        setsubtotal(getcantidad()*miscelanea[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Salsa Negra");
                        cantidadmis=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadmis);
                        setsubtotal(getcantidad()*miscelanea[3]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Salsa BBQ");
                        cantidadmis=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadmis);
                        setsubtotal(getcantidad()*miscelanea[4]);
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
                
        }/* Cierre public void mis */
}
  