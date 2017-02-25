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
        int opc, opc_men,opc_men_lac, opc_men_car,opc_men_frut,opc_men_ver, contador, sumador, fecha_act, fecha_nac, descuento, edad_par, edad_impar, cantidad_art = 0, valor_articulo, subtotal, total_factura;
        int leche, yogourth, queso_doble, queso_tajado, mantequilla, leche_des, nutriday,cremosino,murillo,cogote, sobrebarriga, hueso, opc_sal;
       
        String nombres_apellidos=null;
        String nombre_art=null;
        murillo=5000;
        opc_sal=1;
                
        /*inicializo variables*/ 
       opc=0; opc_men=0; opc_men_lac=0;opc_men_frut=0; opc_men_ver=0; descuento=0; contador=0; sumador=0; fecha_act=2016; edad_par=0; edad_impar=0; valor_articulo=0; subtotal=0; total_factura=0; fecha_nac=0; 
       leche=3000; yogourth=3200; queso_doble=2700; queso_tajado=3200; mantequilla=3900; leche_des=3600; nutriday=7800;cremosino=3200; cogote=5200; sobrebarriga=0; hueso=0;
        
       //System.out.println("Bienvenido a la tienda On_line del Almacen Fruver.");
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
        /*
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
        } */
        System.out.println("" );              
            } 
        else if (opc==2){    
        System.out.println("Usted no ha aceptado digitar sus datos personales, gracias.");
        System.exit(0);
        }  
         
        while(opc_sal!=0){
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
        
                    switch (opc_men) {
                        case 1: {
                            do{

                                System.out.println("Usted ha seleccionado Lacteos \n "+
                                "\t  1. Leche 1.3 ml $ 3000 \n"+
                                "\t  2. yogurth 1.3 ml $ 3200 \n"+
                                "\t  3. Queso doble crema $ 2700 \n"+ 
                                "\t  4. Queso tajado lbs $ 3200 \n"+
                                "\t  5. Mantequilla lbs $ 3900 \n"+
                                "\t  6. Leche deslactosada 1.3 ml $ 3600 \n"+
                                "\t  7. Nutriday sixpac $ 7800 \n"+
                                "\t  8. Cremosino untable $ 3200 \n"+
                                "\n"+
                                "\t seleccione una de las opciones deseadas <1-8>");
                                opc_men_lac=captura.nextInt();
                            
                                switch (opc_men){
                                    case 1:{
                                        do {
                                            
                                        
                                            System.out.println("leche " +leche);
                                            subtotal=cantidad_art*leche;
                                            System.out.println("subtotal "+subtotal);
                                        
                                            
                                        } while (opc_men==1);
                                        
                                    
                                     
                                                break;  
                                }     
                                 
                                
                            }
                         
                        }while(opc_men<1||opc_men>8);
                            break;

                            /*if (opc==1) {                 
                            subtotal=cantidad_art*leche;
                            }
                            if (opc==2)  {                

                            subtotal=cantidad_art*yogourth;
                            }

                            if (opc==3){

                            subtotal=cantidad_art*queso_doble;
                            }

                            if (opc==4){

                            subtotal=cantidad_art*queso_tajado;
                            }
                            if (opc==5){

                            subtotal=cantidad_art*mantequilla;
                            }
                            if (opc==6){

                            subtotal=cantidad_art*leche_des;
                            }
                            if (opc==7){

                            subtotal=cantidad_art*nutriday;
                            }
                            if (opc==8){

                            subtotal=cantidad_art*cremosino;
                            }
                            
                            if (subtotal>0){
                              } while(opc<1 || opc>8);*/
                        }
/*
                            System.out.println("Indique la cantidad que desea llevar");
                            cantidad_art=captura.nextInt();
                            System.out.println("");  
                            subtotal=cantidad_art*cremosino;
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
                  
*/
           case 2: {                                                                                                                                                                                                                                                               {
                do{ 
                    System.out.println("Usted ha seleccionado Carnicos \n "+
                    "\t  1. Murillo $ 5000 \n"+
                    "\t  2. Cogote $ 5200 \n"+
                    "\t  3. Sobrebarriga $ 4700 \n"+ 
                    "\t  4. Hueso $ 2200 \n"+
                    "\t  5. Visceras $ 3800 \n"+
                    "\t  6. Churrasco $ 9600 \n"+
                    "\t  7. Cadera $ 8800 \n"+
                    "\t  8. Lomo $ 7200 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-8>");
                    opc_men_car=captura.nextInt();
                    
                } while(opc<1 || opc>8);
                switch( opc_men_car){
                    case 1: {
                        System.out.println("usted ha seleccionado carne de murillo");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * murillo;
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  1. Continuar \n"
                                + "\t  0. Salir \n"
                                + "\t seleccione una de las opciones deseadas <1-0>");
                        
                        opc_sal=captura.nextInt();
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de cogote");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * cogote;
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  1. Continuar \n"
                                + "\t  0. Salir \n"
                                + "\t seleccione una de las opciones deseadas <1-0>");
                        
                        opc_sal=captura.nextInt();   
                        
                    }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado carne de Sobrebarriga");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * sobrebarriga;
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  1. Continuar \n"
                                + "\t  0. Salir \n"
                                + "\t seleccione una de las opciones deseadas <1-0>");
                        
                        opc_sal=captura.nextInt();   
                        
                    }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado carne de Hueso");
                        System.out.println("Indique la cantidad que desea llevar");
                        cantidad_art = captura.nextInt();
                        subtotal = cantidad_art * hueso;
                        System.out.println("su compra es:" + subtotal);
                        
                        System.out.println("desea realizar mas compras?"
                                + "\t  1. Continuar \n"
                                + "\t  0. Salir \n"
                                + "\t seleccione una de las opciones deseadas <1-0>");
                        
                        opc_sal=captura.nextInt();   
                        
                    }break;     
                        
                } 
//                
//                if (opc==1)                  
//                
//            int murillo = 5000;
//              
//                
//                if (opc==2)                  
//                cantidad_art=captura.nextInt();
//            int cogote = 5200;
//                subtotal=cantidad_art*cogote;
//                
//                if (opc==3)
//                cantidad_art=captura.nextInt();
//            int sobrebarriga = 4700;
//                subtotal=cantidad_art*sobrebarriga;
//                
//                if (opc==4)
//                cantidad_art=captura.nextInt();
//            int hueso = 2200;
//                subtotal=cantidad_art*hueso;
//                
//                if (opc==5)
//                cantidad_art=captura.nextInt();
//            int viceras = 3800;
//                subtotal=cantidad_art*viceras;
//                
//                if (opc==6)
//                cantidad_art=captura.nextInt();
//            int churrasco = 9600;
//                subtotal=cantidad_art*churrasco;
//                
//                if (opc==7)
//                cantidad_art=captura.nextInt();
//            int cadera = 8800;
//                subtotal=cantidad_art*cadera;
//                
//                if (opc==8)
//                cantidad_art=captura.nextInt();
//            int lomo = 7200;
//                subtotal=cantidad_art*lomo;
                
                 
                 
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
                break;
            
            case 3:                                                                                                                                                                                                                                                                {
                
                do{ 
                    System.out.println("Usted ha seleccionado frutas \n "+
                    "\t  1. Manzana $ 800 \n"+
                    "\t  2. Mango $ 400 \n"+
                    "\t  3. Pera $ 700 \n"+ 
                    "\t  4. Limón $ 200 \n"+
                    "\t  5. Papaya $ 1800 \n"+
                    "\t  6. Maracuya $ 1600 \n"+
                    "\t  7. Fresa $ 1600 \n"+
                    "\t  8. Mora $ 1100 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-8>");
                    opc_men_frut=captura.nextInt();
                    
                } while(opc<1 || opc>8);
                
                System.out.println("Indique la cantidad que desea llevar");
                if (opc==1)                  
                cantidad_art=captura.nextInt();
            int manzana = 800;
                subtotal=cantidad_art*manzana;
                
                if (opc==2)                  
                cantidad_art=captura.nextInt();
            int mango = 400;
                subtotal=cantidad_art*mango;
                
                if (opc==3)
                cantidad_art=captura.nextInt();
            int pera = 700;
                subtotal=cantidad_art*pera;
                
                if (opc==4)
                cantidad_art=captura.nextInt();
            int limon = 200;
                subtotal=cantidad_art*limon;
                
                if (opc==5)
                cantidad_art=captura.nextInt();
            int papaya = 1800;
                subtotal=cantidad_art*papaya;
                
                if (opc==6)
                cantidad_art=captura.nextInt();
            int maracuya = 1600;
                subtotal=cantidad_art*maracuya;
                
                if (opc==7)
                cantidad_art=captura.nextInt();
            int fresa = 1600;
                subtotal=cantidad_art*fresa;
                
                if (opc==8)
                cantidad_art=captura.nextInt();
            int mora = 1100;
                subtotal=cantidad_art*mora;
                
                System.out.println("Indique la cantidad que desea llevar");
                cantidad_art=captura.nextInt();
                System.out.println("");  
                 
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
break;
                
            case 4: {
                    System.out.println("Usted ha seleccionado Verduras \n "+
                    "\t  1. Arveja $ 1800 \n"+
                    "\t  2. Papa $ 1000 \n"+
                    "\t  3. Yuca $ 700 \n"+ 
                    "\t  4. Tomate $ 1200 \n"+
                    "\t  5. Cebolla $ 1300 \n"+
                    "\t  6. Zanahoria $ 800 \n"+
                    "\t  7. Platano $ 900 \n"+
                    "\t  8. Ahuyama $ 300 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-8>");
                    opc_men_ver=captura.nextInt();
                    
               if (opc==1)                  
                cantidad_art=captura.nextInt();
            int arveja = 1800;
                subtotal=cantidad_art*arveja;
                
                if (opc==2)                  
                cantidad_art=captura.nextInt();
            int papa = 1000;
                subtotal=cantidad_art*papa;
                
                if (opc==3)
                cantidad_art=captura.nextInt();
            int yuca = 700;
                subtotal=cantidad_art*yuca;
                
                if (opc==4)
                cantidad_art=captura.nextInt();
            int tomate = 1200;
                subtotal=cantidad_art*tomate;
                
                if (opc==5)
                cantidad_art=captura.nextInt();
            int cebolla = 1300;
                subtotal=cantidad_art*cebolla;
                
                if (opc==6)
                cantidad_art=captura.nextInt();
            int zanahoria = 800;
                subtotal=cantidad_art*zanahoria;
                
                if (opc==7)
                cantidad_art=captura.nextInt();
            int platano = 900;
                subtotal=cantidad_art*platano;
                
                if (opc==8)
                cantidad_art=captura.nextInt();
            int ahuyama = 300;
                subtotal=cantidad_art*ahuyama;
                    
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
                    
                } break;
                
            case 5: {
                    System.out.println("Usted ha seleccionado Miscelanea \n "+
                    "\t  1. Salsa de tomate $ 9800 \n"+
                    "\t  2. Mayonesa $ 8000 \n"+
                    "\t  3. Salsa soya $ 4700 \n"+ 
                    "\t  4. Salsa negra $ 2100 \n"+
                    "\t  5. Aji Picante $ 2400 \n"+
                    "\t  6. Pasta de ajo $ 4800 \n"+
                    "\t  7. Condimentos $ 1900 \n"+
                    "\t  8. Guisantes $ 1200 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-8>");
                    opc_men_lac=captura.nextInt();
                    
                System.out.println("Indique la cantidad que desea llevar");
                cantidad_art=captura.nextInt();
                subtotal=cantidad_art*opc_men_lac;
                System.out.println("El subtotal a pagar es " +subtotal);
                } break;
            
            case 6: {
                    System.out.println("Usted ha seleccionado granos \n "+
                    "\t  1. Arroz $ 1350 \n"+
                    "\t  2. Frijol $ 4800 \n"+
                    "\t  3. Arveja seca $ 4600 \n"+ 
                    "\t  4. Garbanzo $ 3700 \n"+
                    "\t  5. Maiz $ 4100 \n"+
                    "\t  6. Cebada $ 2100 \n"+
                    "\t  7. Lenteja $ 4500 \n"+
                    "\t  8. Quinua $ 5100 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-8>");
                    opc_men_lac=captura.nextInt();
                    
                System.out.println("Indique la cantidad que desea llevar");
                cantidad_art=captura.nextInt();
                subtotal=cantidad_art*opc_men_lac;
                System.out.println("El subtotal a pagar es " +subtotal);
                } break;  
            
            case 7: {
                    System.out.println("Usted ha seleccionado productos de aseo \n "+
                    "\t  1. Jabon en polvo $ 9800 \n"+
                    "\t  2. Jabon en barra $ 1350 \n"+
                    "\t  3. Jabon liquido $ 3800 \n"+ 
                    "\t  4. Limpido $ 3200 \n"+
                    "\t  5. Suavisante $ 5600 \n"+
                    "\t  6. Limpia vidrios $ 2800 \n"+
                    "\t  7. Esponjas $ 2100 \n"+
                    "\t  8. Trapero $ 4800 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-8>");
                    opc_men_lac=captura.nextInt();
                    
                System.out.println("Indique la cantidad que desea llevar");
                cantidad_art=captura.nextInt();
                subtotal=cantidad_art*opc_men_lac;
                System.out.println("El subtotal a pagar es " +subtotal);
                
                
                } break;  
                
                
     
                
    
}
}
        }