package fruver.herencia;

/**
 *
 * @author James ceballos
 */

import javax.swing.JOptionPane;

public class granosh extends FRUVERHERENCIA {
    
    
public int gra(int op){
     
   String   opc_men_gra; 
            opc_men_gra = null;
            int opc_men_gra2;
            String cantidadgra=null;
            String opc_salida2=null;
    
             while(opc_salida!=0){
                 
                     do{

                    opc_men_gra=JOptionPane.showInputDialog(null,"Usted ha seleccionado granos \n "+
                    "*************************************************************\n"+
                    "\t  1. Arroz $ 1350 \n"+
                    "\t  2. Frijol $ 4800 \n"+
                    "\t  3. Arveja seca $ 4600 \n"+ 
                    "\t  4. Garbanzo $ 3700 \n"+
                    "\t  5. Maiz $ 4100 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_gra2=Integer.parseInt(opc_men_gra);
                            
                                } while(opc_men_gra2<1 || opc_men_gra2>5);
                            
                switch( opc_men_gra2){
                    
                    case 1: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Arroz");
                        cantidadgra=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadgra);
                        setsubtotal(getcantidad()*granos[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;      
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Frijol");
                        cantidadgra=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadgra);
                        setsubtotal(getcantidad()*granos[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Arveja Seca");
                        cantidadgra=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadgra);
                        setsubtotal(getcantidad()*granos[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Garbanzo");
                        cantidadgra=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadgra);
                        setsubtotal(getcantidad()*granos[3]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Maiz");
                        cantidadgra=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadgra);
                        setsubtotal(getcantidad()*granos[4]);
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
    }/* Cierre public void gran */
}
  