/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen.fruver;

import java.util.Scanner;

/**
 *
 * @author James ceballos
 */
public class AlmacenFruver {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
       Scanner captura = new Scanner (System.in);
       /* Contextuaizar el usuario */
       /* Solicitar datos de entrada */
        
       /*declaracion de variables*/  
        int opc, opc_men,opc_men_lac, contador, sumador, fecha_act, fecha_nac, descuento, edad_par, edad_impar, cantidad_art, valor_articulo, total_factura;
        
        String nombres_apellidos=null;
        String nombre_art=null;
        
       /*inicializo variables*/ 
       opc=0; opc_men=0; opc_men_lac=0;descuento=0; contador=0; sumador=0; fecha_act=2016; edad_par=0; edad_impar=0; valor_articulo=0; total_factura=0; fecha_nac=0; 
       
        System.out.println("Bienvenido a la tienda On_line del Almacen Fruver.");
        /*Solicito datos de entrada*/
        
        do {
        System.out.println("Para realizar sus compras se requiere sus datos personales");
        
        System.out.println("Si esta de acuerdo seleccione \n\t 1. si \n\t 2. no");
        
        opc=captura.nextInt();
        } while(opc<1 || opc>2);
          if (opc==1)
          {
        System.out.println("Usted ha aceptado digitar sus datos personales");   
                
        System.out.println("Digite sus nombres y apellidos");
           nombres_apellidos=captura.next();
           nombres_apellidos=captura.next();
           
        System.out.println("Digite su fecha de nacimiento");
           fecha_nac=captura.nextInt();
        
        int edad=fecha_act-fecha_nac;
            System.out.println("su edad es " +edad+ " años" );  
          }
        else if (opc==2){    
        System.out.println("Usted no ha aceptado digitar sus datos personales");
        System.exit(0);
        }    
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
            case 1: System.out.println("Usted ha seleccionado Lacteos \n "+
                    "\t  1. Leche 1.3 ml $ 3000 \n"+
                    "\t  2. yogurth 1.3 ml $ 3200 \n"+
                    "\t  3. Queso doble crema $ 2700 \n"+ 
                    "\t  4. Queso doble crema $ 2700 \n"+
                    "\t  5. Queso doble crema $ 2700 \n"+
                    "\t  6. Queso doble crema $ 2700 \n"+
                    "\t  7. Queso doble crema $ 2700 \n"+
                    "\t  8. Queso doble crema $ 2700 \n"+
                    "\t  9. Queso doble crema $ 2700 \n"+
                    "\n"+
                    "\t seleccione una de las opciones deseadas <1-9>");
                    opc_men_lac=captura.nextInt();
                }
        
        
        
        
        
        System.out.println("Digite el articulo a llevar");
           nombre_art=captura.next();
        
        System.out.println("Digite el valor del articulo");
           /*Almaceno el valor del articulo a llevar por el usuario*/
           valor_articulo=captura.nextInt ();      
           
        System.out.println("Digite el numero de articulos a llevar");
           /*Almaceno el valor digitado por el usuario*/
           cantidad_art=captura.nextInt ();
           
        total_factura= valor_articulo*cantidad_art;
           
        System.out.println("El total a pagar es " +total_factura+ "  Pesos");   
         
        System.out.println("Gracias Señor(a) " +nombres_apellidos+" "+nombres_apellidos+ " por utilizar los servicios de Almacen Fruver On_Line su compra es de " +cantidad_art+ " unidades de " +nombre_art+ " por un valor de  $ " +valor_articulo+ " pesos la unidad para un total de $ " +total_factura+ " Pesos ");   
       
        /*Elaborado por James Ceballos 25-oct-2016*/
}
    
}