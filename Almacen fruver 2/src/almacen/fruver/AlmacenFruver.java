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
        
       /*delaracion de variables*/  
        int contador, sumador, fecha_act, fecha_nac, cedula, edad_par, edad_impar, cantidad_art, valor_articulo, total_factura;
        
        String nombres_apellidos=null;
        String nombre_art=null;
        
       /*inicializo variables*/ 
       contador=0; sumador=0; fecha_act=2016; edad_par=0; edad_impar=0; valor_articulo=0; total_factura=0; fecha_nac=0; 
       
        System.out.println("Bienvenido a la tienda On_line del Almacen Fruver.");
        /*Solicito datos de entrada*/
        
        System.out.println("Digite sus nombres y apellidos");
           nombres_apellidos=captura.nextLine ();
           
        System.out.println("Digite su fecha de nacimiento");
           fecha_nac=captura.nextInt ();
        
        int edad=fecha_act-fecha_nac;
            System.out.println("su edad es " +edad+ " años" );  
                 
        System.out.println("De acuerdo a su edad usted tiene un descuento del % ");
        
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
         
        System.out.println("Gracias Señor(a) " +nombres_apellidos+ " por utilizar los servicios de Almacen Fruver On_Line su compra es de " +cantidad_art+ " unidades de " +nombre_art+ " por un valor de  $ " +valor_articulo+ " pesos la unidad para un total de $ " +total_factura+ " Pesos ");   
       
        /*Elaborado por James Ceballos 25-oct-2016*/
}
    
}