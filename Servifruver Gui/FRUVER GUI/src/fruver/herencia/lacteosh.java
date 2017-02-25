
package fruver.herencia;

/**
 *
 * @author James ceballos
 */

import javax.swing.JOptionPane;

public class lacteosh extends FRUVERHERENCIA {
    
    
public int lac(int op){
    
   
   String   opc_men_lac; 
            opc_men_lac = null;
            int opc_men_lac2;
            String cantidadlac=null;
            String opc_salida2=null;
    
//    Scanner captura=new Scanner (System.in);

                    while(opc_salida!=0){
                    
                        do{

                               opc_men_lac=JOptionPane.showInputDialog(null,"Usted ha seleccionado Lacteos \n "+
                                "*************************************************************\n"+
                                "\t  1. Leche 1.3 ml $ 3000 \n"+
                                "\t  2. yogurth 1.3 ml $ 3200 \n"+
                                "\t  3. Queso doble crema $ 2700 \n"+ 
                                "\t  4. Queso tajado lbs $ 3200 \n"+
                                "\t  5. Mantequilla lbs $ 3900 \n"+
                                "*************************************************************\n"+
                                "\t seleccione una de las opciones deseadas <1-5>");
//                              JOptionPane.showInputDialog(null,"\t seleccione una de las opciones deseadas <1-5>");
                                opc_men_lac2=Integer.parseInt(opc_men_lac);
                                
                                } while(opc_men_lac2<1 || opc_men_lac2>5);
                            
                switch( opc_men_lac2){
                    
                    case 1:    {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado leche 1.3 ml");
                        cantidadlac=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadlac);
                        setsubtotal(getcantidad()*lacteos[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;                        
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado yogurth 1.3 ml");
                        cantidadlac=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadlac);
                        setsubtotal(getcantidad()*lacteos[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Queso doble crema");
                        cantidadlac=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadlac);
                        setsubtotal(getcantidad()*lacteos[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Queso tajado");
                        cantidadlac=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadlac);
                        setsubtotal(getcantidad()*lacteos[3]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Mantequilla lbs");
                        cantidadlac=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadlac);
                        setsubtotal(getcantidad()*lacteos[4]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);  
                        
                        }break;  
                    }
                       
            } return getcont();
        }
}

