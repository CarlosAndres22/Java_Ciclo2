/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servifruver2;

import java.util.Scanner;

/**
 *
 * @author JAMES CEBALLOS
 */
public class Servifruver2 {

    /**
     * @param args the command line arguments
     */
  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
       /* Contextuaizar el usuario */
       /* Solicitar datos de entrada */
        
       /*declaracion de variables*/  
        int opc, opc_sal,opc_men,opc_men_lac, opc_men_car,opc_men_frut,opc_men_ver, opc_men_mis,opc_men_gra,aseo,contador, sumador, fecha_act, fecha_nac, descuento, edad_par, edad_impar, cantidad_art = 0, valor_articulo, subtotal, total_factura;

       
        String nombres_apellidos=null;
        String nombre_art=null;
        
        opc_sal=0;
                
        /*inicializo variables*/ 
       opc=0; opc_men=0; opc_men_lac=0;opc_men_frut=0; opc_men_ver=0; opc_men_mis=0; opc_men_gra=0; aseo=0; descuento=0; contador=0; sumador=0; fecha_act=2016; edad_par=0; edad_impar=0; valor_articulo=0; subtotal=0; total_factura=0; fecha_nac=0; 
       
        
       //Lacteos
       int[]lacteos;
       lacteos=new int [5];
       lacteos[0]=3000;
       lacteos[1]=3200;
       lacteos[2]=2700;
       lacteos[3]=3200;
       lacteos[4]=3900;
       
       //Carnicos
       int[]carnicos;
       carnicos=new int [5];
       carnicos[0]=5000;
       carnicos[1]=5200;
       carnicos[2]=4700;
       carnicos[3]=2200;
       carnicos[4]=3800;
                                
       //Frutas
       int[]frutas;
       frutas=new int [5];
       frutas[0]=800;
       frutas[1]=400;
       frutas[2]=700;
       frutas[3]=200;
       frutas[4]=1800;
       
       //Verduras
       int[]verduras;
       verduras=new int [5];
       verduras[0]=1800;
       verduras[1]=1000;
       verduras[2]=700;
       verduras[3]=1200;
       verduras[4]=1300;
       
       //Miscelanea
       int[]miscelanea;
       miscelanea=new int [5];
       miscelanea[0]=9800;
       miscelanea[1]=8000;
       miscelanea[2]=4700;
       miscelanea[3]=2100;
       miscelanea[4]=2400;
       
       //Granos
       int[]granos;
       granos=new int [5];
       granos[0]=1350;
       granos[1]=4800;
       granos[2]=4600;
       granos[3]=3700;
       granos[4]=4100;
       
       //Productos de Aseo
       int[]a;
       a=new int [5];
       a[0]=9800;
       a[1]=1350;
       a[2]=3800;
       a[3]=3200;
       a[4]=5600;
       
       System.out.println("Bienvenido a la tienda On_line del Almacen Fruver.");
      
       /*Solicito datos de entrada*/
        
        do {
        System.out.println("Para realizar sus compras se requiere sus datos personales");
        
        System.out.println("Si esta de acuerdo seleccione la opcion \n\t 1. si \n\t 2. no");
        
        opc=captura.nextInt();
        } while(opc<1 || opc>2);
          if (opc==1)
          {
        System.out.println("Usted ha aceptado digitar sus datos personales");   
        System.out.println("");      
        
        System.out.println("Digite sus nombres y apellidos");
           nombres_apellidos=captura.next();
           nombres_apellidos=captura.next();
         
                 
        System.out.println("");  
        
        System.out.println("De acuerdo a su edad se realizara un descuento del 5% si la edad es par y 6% si la edad es impar" );
        System.out.println("" );
        System.out.println("Digite su fecha de nacimiento");
           fecha_nac=captura.nextInt();
        
        int edad=fecha_act-fecha_nac;
            
            System.out.println("");  
            System.out.println("su edad es " +edad+ " años" ); 
            System.out.println("" );
            System.out.println("Digite la edad" );
            edad=captura.nextInt();
            
            System.out.println("");  
        if (edad % 2 == 0) {
            System.out.println("Su edad es par, por lo cual obtiene un descuento del 5%.");
        }else{
            System.out.println("Su edad es impar, por lo cual obtiene un descuento del 6%.");   
        } 
        System.out.println("" );              
            } 
        else if (opc==2){    
        System.out.println("Usted no ha aceptado digitar sus datos personales, gracias.");
        System.exit(0);
        }  
         
        while(opc_sal!=1){
        do{ 
            System.out.println("Las opciones para el dia de hoy son: \n"+
        "\t  1. lacteos \n"+
        "\t  2. carnicos \n"+
        "\t  3. frutas \n"+
        "\t  4. verduras \n"+
        "\t  5. miscelanea \n"+
        "\t  6. granos \n"+
        "\t  7. prod. aseo \n"+ 
        "\n"+
        "\t seleccione una de las opciones deseadas <1-7>");
        opc_men=captura.nextInt();
        
        } while (opc_men<1 || opc_men>7);
        
         switch( opc_men){           
                        case 1: {
                            do{

                                System.out.println("Usted ha seleccionado Lacteos \n "+
                                "\t  1. Leche 1.3 ml $ 3000 \n"+
                                "\t  2. yogurth 1.3 ml $ 3200 \n"+
                                "\t  3. Queso doble crema $ 2700 \n"+ 
                                "\t  4. Queso tajado lbs $ 3200 \n"+
                                "\t  5. Mantequilla lbs $ 3900 \n"+
                                "\n"+
                                "\t seleccione una de las opciones deseadas <1-5>");
                                opc_men_lac=captura.nextInt();
                            
                                } while(opc<1 || opc>5);
                            
                switch( opc_men_lac){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado leche 1.3 ml");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * lacteos[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado yogourth 1.3");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * lacteos[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Queso doble crema");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * lacteos[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Queso tajado");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * lacteos[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Mantequilla lb");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * lacteos[4];;
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;  
                        
           }
        }
        
                case 2: {                                                                                                                                                                                                                                                               
                do{ 
                    System.out.println("Usted ha seleccionado Carnicos \n "+
                    "\t  1. Murillo $ 5000 \n"+
                    "\t  2. Cogote $ 5200 \n"+
                    "\t  3. Sobrebarriga $ 4700 \n"+ 
                    "\t  4. Hueso $ 2200 \n"+
                    "\t  5. Visceras $ 3800 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_car=captura.nextInt();
                    
                } while(opc<1 || opc>5);
                
                switch( opc_men_car){
                    case 1: {
                        System.out.println("usted ha seleccionado carne de murillo");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * carnicos[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de cogote");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * carnicos[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Sobrebarriga");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * carnicos[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Hueso");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * carnicos[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado visceras");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * carnicos[4];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                } 
        }
           
                
                 
            case 3: {                                                                                                                                                                                                                                                               
                
                do{ 
                    System.out.println("Usted ha seleccionado frutas \n "+
                    "\t  1. Manzana $ 800 \n"+
                    "\t  2. Mango $ 400 \n"+
                    "\t  3. Pera $ 700 \n"+ 
                    "\t  4. Limón $ 200 \n"+
                    "\t  5. Papaya $ 1800 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_frut=captura.nextInt();
                    
                } while(opc<1 || opc>5);
                
                switch( opc_men_frut){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Manzana");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * frutas[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de Mango");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * frutas[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Pera");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * frutas[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Limon");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * frutas[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Papaya");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * frutas[4];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                }
        }    
            
            
            case 4: {
                    System.out.println("Usted ha seleccionado Verduras \n "+
                    "\t  1. Arveja $ 1800 \n"+
                    "\t  2. Papa $ 1000 \n"+
                    "\t  3. Yuca $ 700 \n"+ 
                    "\t  4. Tomate $ 1200 \n"+
                    "\t  5. Cebolla $ 1300 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_ver=captura.nextInt();
                    
               } while(opc<1 || opc>5);
                
                switch( opc_men_ver){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Arveja");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * verduras[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de Papa");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * verduras[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Yuca");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * verduras[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Tomate");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * verduras[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Cebolla");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * verduras[4];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                }
            
                   
 
            case 5: {
                    System.out.println("Usted ha seleccionado Miscelanea \n "+
                    "\t  1. Salsa de tomate $ 9800 \n"+
                    "\t  2. Mayonesa $ 8000 \n"+
                    "\t  3. Salsa soya $ 4700 \n"+ 
                    "\t  4. Salsa negra $ 2100 \n"+
                    "\t  5. Salsa BBQ $ 2400 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    opc_men_mis=captura.nextInt();
                    
                } while(opc<1 || opc>5);
                
                switch( opc_men_mis){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Salsa de tomate");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * miscelanea[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado Mayonesa");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * miscelanea[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Salsa Soya");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * miscelanea[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Salsa Negra");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * miscelanea[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Salsa BBQ");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * miscelanea[4];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                }
        
               
            case 6: {
                    System.out.println("Usted ha seleccionado granos \n "+
                    "\t  1. Arroz $ 1350 \n"+
                    "\t  2. Frijol $ 4800 \n"+
                    "\t  3. Arveja seca $ 4600 \n"+ 
                    "\t  4. Garbanzo $ 3700 \n"+
                    "\t  5. Maiz $ 4100 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
            int opc_men_gran = captura.nextInt();
                    
                } while(opc<1 || opc>5);
                
                switch( opc_men_gra){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Arroz");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * granos[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado Frijol");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * granos[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Arveja");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * granos[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Garbanzo");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * granos[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Maiz");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * granos[4];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                }
         
            case 7: {
                    System.out.println("Usted ha seleccionado productos de aseo \n "+
                    "\t  1. Jabon en polvo $ 9800 \n"+
                    "\t  2. Jabon en barra $ 1350 \n"+
                    "\t  3. Jabon liquido $ 3800 \n"+ 
                    "\t  4. Limpido $ 3200 \n"+
                    "\t  5. Suavisante $ 5600 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    aseo=captura.nextInt();
                    
                } while(opc<1 || opc>5);
                
                switch(aseo){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Jabon en polvo");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art *a[0];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado Jabon en barra");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * a[1];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Jabon liquido");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * a[2];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Limpido");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * a[3];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Suavizante");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * a[4];
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        opc_sal=captura.nextInt();   
    }
                        }break;     
    
}        
      System.out.println("El subtotal a pagar es " +subtotal);
                System.out.println("");  
                System.out.println("indique el descuento 5% - 6%");
                descuento=captura.nextInt();
                descuento=descuento*subtotal/100;               
                total_factura=subtotal-descuento;
                
                    System.out.println("Señor(a) " + nombres_apellidos + " \n "+
                    "\t  El total a pagar sin descuento es \t\t $ " + subtotal + "  \n"+
                    "\t  El descuento de acuerdo a la edad es de \t $ " + descuento + " \n"+
                    "\t  Total a pagar \t\t\t\t $ " + total_factura + " \n"+ 
                    "\n"+
                    "\t Gracias por utilizar nuestros servicios en linea");
                    
        }
    
    }
}
      
    