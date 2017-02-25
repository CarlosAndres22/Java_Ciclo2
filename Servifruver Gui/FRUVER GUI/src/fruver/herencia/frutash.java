package fruver.herencia;

/**
 *
 * @author James ceballos
 */


import javax.swing.JOptionPane;

public class frutash extends FRUVERHERENCIA {
    
    
public int frut(int op){
     
    String  opc_men_frut; 
            opc_men_frut = null;
            int opc_men_frut2;
            String cantidadfrut=null;
            String opc_salida2=null;
    
              while(opc_salida!=0){
                  
                          do{

                    opc_men_frut=JOptionPane.showInputDialog(null,"Usted ha seleccionado frutas \n "+
                    "*************************************************************\n"+
                    "\t  1. Manzana $ 800 \n"+
                    "\t  2. Mango $ 400 \n"+
                    "\t  3. Pera $ 700 \n"+ 
                    "\t  4. Limón $ 200 \n"+
                    "\t  5. Papaya $ 1800 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_frut2=Integer.parseInt(opc_men_frut);
                            
                                } while(opc_men_frut2<1 || opc_men_frut2>5);
                            
                switch( opc_men_frut2){
                    
                    case 1: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Manzana");
                        cantidadfrut=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadfrut);
                        setsubtotal(getcantidad()*frutas[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;      
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Mango");
                        cantidadfrut=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadfrut);
                        setsubtotal(getcantidad()*frutas[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Pera");
                        cantidadfrut=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadfrut);
                        setsubtotal(getcantidad()*frutas[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Limon");
                        cantidadfrut=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadfrut);
                        setsubtotal(getcantidad()*frutas[3]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Papaya");
                        cantidadfrut=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadfrut);
                        setsubtotal(getcantidad()*frutas[4]);
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
              
        }/* Cierre public void frut */
}
  