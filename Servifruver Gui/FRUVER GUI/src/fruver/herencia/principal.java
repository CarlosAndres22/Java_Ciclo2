
package fruver.herencia;


import javax.swing.JOptionPane;

/**
 *
 * @author James Ceballos
 */
public class principal extends FRUVERHERENCIA {
    
    
    public static void main(String[] args) {
         
       
        FRUVERHERENCIA fr = new FRUVERHERENCIA();

        lacteosh lac = new lacteosh ();
        carnicosh car = new carnicosh ();
        frutash frut = new frutash ();
        verdurash ver = new verdurash ();
        miscelaneah mis = new miscelaneah ();
        granosh gra = new granosh ();
        productosaseoh aseo = new productosaseoh ();
        
        String control, Nombre, Apellido, Correo, Telefono, mensaje, fecha_nac,fecha_act, edad;
        String opc, opc_salida, opc_men, opc_men_lac, opc_men_car, opc_men_frut, opc_men_ver;
        String opc_men_mis, opc_men_gra, opc_men_aseo, cantidad, descuento, descuento_edad,subtotal,cont,total;   
        int fecha_nac_C, num, opc_men2=0;
        
        
        
        
        /* Asignar el objeto a la clase*/   
            
        JOptionPane.showMessageDialog(null,"Bienvenido a la tienda On_line del Almacen SurtiFruver.\n"
        + "\n"
        +"Para realizar sus compras se requiere el registro de sus datos personales");
           
        int resp = JOptionPane.showConfirmDialog(null,"Si esta de acuerdo seleccione la opcion \n\t\t * Si \n\t\t * No ");
        
        if(JOptionPane.YES_OPTION==resp){
        
        JOptionPane.showMessageDialog(null,"Usted ha aceptado digitar sus datos personales \t" 
        + "\n"
        + "\t\n\"Este programa solicitara sus datos personales y los mostrara por pantalla");   
        
        fr.Nombre=JOptionPane.showInputDialog(null,"Digite su Nombre \t "); 
      
        fr.Apellido=JOptionPane.showInputDialog(null,"Digite su Apellido  \t "); 
        
        fr.Correo=JOptionPane.showInputDialog(null,"Digite su Correo electronico  \t "); 
        
        fr.Telefono=JOptionPane.showInputDialog(null,"Digite su numero de Telefono\t "); 
         
       
        fecha_nac=JOptionPane.showInputDialog(null,"Digite su fecha de nacimiento");
        fecha_nac_C = Integer.parseInt(fecha_nac);
              
        fr.setedad(2016 - fecha_nac_C);

             
       JOptionPane.showMessageDialog(null,"su edad es " + fr.edad + " años");
       
        if (fr.edad % 2 == 0) {
           fr.setdescuento(fr.descuento=5);
            JOptionPane.showMessageDialog(null,"Su edad es par, por lo cual obtiene un descuento del 5%.");
        }else{
            fr.setdescuento(fr.descuento=6);
            JOptionPane.showMessageDialog(null,"Su edad es impar, por lo cual obtiene un descuento del 6%.");   
        } 
        
            } 
            
        else if(JOptionPane.NO_OPTION==resp){    
        JOptionPane.showMessageDialog(null,"Usted ha declinado en digitar sus datos personales, gracias.");
        System.exit(0);
        }  
         
        while(fr.getopc_salida()!=0){
        do{ 
        fr.opc_men=JOptionPane.showInputDialog(null, "Las opciones de comprar para el dia de hoy son: \n"+
        "*************************************************************\n"+
        "\t  1. Lacteos \n"+
        "\t  2. Carnicos \n"+
        "\t  3. Frutas \n"+
        "\t  4. Verduras \n"+
        "\t  5. Miscelanea \n"+
        "\t  6. Granos \n"+
        "\t  7. Prod. Aseo \n"+ 
        "\t  8. Imprimir factura \n"+            
        "*************************************************************\n"+
        "\t seleccione una de las opciones deseadas <1-8>");
//        opc_men=JOptionPane.showInputDialog(null, "\t seleccione una de las opciones deseadas <1-8>");
        fr.opc_men2=Integer.parseInt(fr.opc_men);

            
        
        } while (fr.opc_men2<1 || fr.opc_men2>8);
        
         switch( fr.opc_men2){  
            
        
             case 1: {
                 lac.lac(0);
             }
             break;

             case 2: {
                 car.car(0);
             }
             break;

             case 3: {
                 frut.frut(0);
             }
             break;
            
            case 4: {
                 ver.ver(0);
             }
             break;
            
            case 5: {
                 mis.mis(0);
             }
             break;
             
            case 6: {
                 gra.gra(0);
             }
             break;
             
            case 7: {
                 aseo.aseo(0);
             }
             break;
    
      
            case 8: {  
        fr.subtotal = (lac.getcont() + car.getcont() + frut.getcont() + ver.getcont()+ mis.getcont()+ gra.getcont()+ aseo.getcont());    
        JOptionPane.showMessageDialog(null,"El subtotal a pagar es $ " +fr.getsubtotal());
        
        
        fr.descuentoedad = (fr.getdescuento()*fr.getsubtotal()/100);
        JOptionPane.showMessageDialog(null,"El descuento de acuerdo a la edad es de $ " + fr.getdescuentoedad());
       
         
        fr.total = (lac.getcont() + car.getcont() + frut.getcont() + ver.getcont()+ mis.getcont()+ gra.getcont()+ aseo.getcont()- fr.getdescuentoedad());
        JOptionPane.showMessageDialog(null,"El total a pagar es de $ " + fr.gettotal());
        
                        JOptionPane.showMessageDialog(null," ___________________________________________________________________________\n"
                         + "\t\t\t\t\t\t SURTIFRUVER ON-LINE COLOMBIA S.A                          \n"
                         + "\t\t\t\t\t\t N.I.T 9002769621-100                                 \n"
                         + "\t\t\t\t\t\t No somos retenedores de I.V.A                            \n"
                         + "\t\t\t\t\t\t Resolucion No. 000041 de enero 30 de 2014                   \n"
                         + "_____________________________________________________________________________\n"
                         + "\n"
                +" Señor(a) " + fr.getNombre() + " " + fr.getApellido() + " Telefono " + fr.getTelefono() + " E-mail " + fr.getCorreo() + " \n "
                + "\t                                                                                          \n"
                + "\t  El subtotal a pagar sin descuento es \t\t $ " + fr.getsubtotal() + "                    \n"
                + "\t  El descuento de acuerdo a la edad es de \t $ " + fr.getdescuentoedad() + "              \n"
                + "\t  Total a pagar \t\t\t\t $ " + fr.gettotal() + "                                          \n"
                + "\n                                                                                          "
                + "\n Gracias por utilizar nuestros servicios en linea \n"
                + "_____________________________________________________________________________");
        System.exit(0);
        } break;
        }
        
  
            }/* Cierre opc salida */ 
        }
    }


        
        /*
        do {

            System.out.println("Estamos comprometidos con el medio ambiente implementando la campaña cero papel");
            System.out.println("");
            System.out.println("Si esta de acuerdo se enviara su factura al correo electronico, por tal motivo  seleccione la opcion \t\n\t 1. imprimir \n\t 2. enviar al E-mail");

            fr.opc = captura.nextInt();
        } while (fr.opc < 1 || fr.opc > 2);
        
        if (fr.opc == 1) {
            System.out.println("Usted ha aceptado la impresion de la factura");
            System.out.println("");
            System.out.println("********************************************************************************************************");
            System.out.println("Señor(a) " + fr.getNombre() + " " + fr.getApellido() + " Telefono " + fr.getTelefono() + " E-mail " + fr.getCorreo() + " \n "
                    + "\t  El subtotal a pagar sin descuento es \t\t $ " + fr.getsubtotal()+ "       \n"
                    + "\t  El descuento de acuerdo a la edad es de \t $ " + fr.getdescuentoedad() + "  \n"
                    + "\t  Total a pagar \t\t\t\t $ " + fr.gettotal() + " \n"
                    + "\n"
                    + "\t Gracias por utilizar nuestros servicios en linea");
            System.out.println("********************************************************************************************************");
        } 

        if (fr.opc == 2) {
            System.out.println("Usted ha aceptado el envio de la factura a su correo electronico");

            System.out.println("********************************************************************************************************");
            System.out.println("Señor(a)" + fr.getNombre() + " " + fr.getApellido() + " su factura fue eviada al E-mail " + fr.getCorreo() + "  \n "
                    + "\t  El subtotal a pagar sin descuento es \t\t $ " + fr.getsubtotal()+ "       \n"
                    + "\t  El descuento de acuerdo a la edad es de \t $ " + fr.getdescuentoedad() + "  \n"
                    + "\t  Total a pagar \t\t\t\t $ " + fr.gettotal() + " \n"
                    + "\n"
                    + "\t Gracias por utilizar nuestros servicios en linea");
            System.out.println("********************************************************************************************************");  */     
            
          