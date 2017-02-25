package fruver.herencia;

/**
 *
 * @author James ceballos
 */


import javax.swing.JOptionPane;

public class carnicosh extends FRUVERHERENCIA {
    
    
public int car(int op){
     
    String  opc_men_car; 
            opc_men_car = null;
            int opc_men_car2;
            String cantidadcar=null;
            String opc_salida2=null;
    
             while(opc_salida!=0){
                 
             
                            do{

                    opc_men_car=JOptionPane.showInputDialog(null,"Usted ha seleccionado Carnicos \n "+
                    "*************************************************************\n"+
                    "\t  1. Murillo $ 5000 \n"+
                    "\t  2. Cogote $ 5200 \n"+
                    "\t  3. Sobrebarriga $ 4700 \n"+ 
                    "\t  4. Hueso $ 2200 \n"+
                    "\t  5. Visceras $ 3800 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
//                    opc_men_car=JOptionPane.showInputDialog(null,"\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_car2=Integer.parseInt(opc_men_car);
                            
                                } while(opc_men_car2<1 || opc_men_car2>5);
                            
                switch(opc_men_car2){
                    
                    case 1: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Murillo");
                        cantidadcar=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadcar);
                        setsubtotal(getcantidad()*carnicos[0]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);
                        
                        }break;      
                        
                    case 2: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Cogote");
                        cantidadcar=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadcar);
                        setsubtotal(getcantidad()*carnicos[1]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2); 
                        
                        }break;
               
                    case 3: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Sobrebarriga");
                        cantidadcar=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadcar);
                        setsubtotal(getcantidad()*carnicos[2]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);    
                        
                        }break;        
                    
                    case 4: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado Hueso");
                        cantidadcar=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadcar);
                        setsubtotal(getcantidad()*carnicos[3]);
                        JOptionPane.showMessageDialog(null,"su compra es:" + subtotal);
                        setcont(getcont()+getsubtotal());
                        opc_salida2=JOptionPane.showInputDialog(null,"desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_salida=Integer.parseInt(opc_salida2);   
                        
                        }break;     
                    
                    case 5: {
                        JOptionPane.showMessageDialog(null,"usted ha seleccionado visceras");
                        cantidadcar=JOptionPane.showInputDialog(null,"Indique la cantidad que desea llevar");
                        cantidad=Integer.parseInt(cantidadcar);
                        setsubtotal(getcantidad()*carnicos[4]);
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
  