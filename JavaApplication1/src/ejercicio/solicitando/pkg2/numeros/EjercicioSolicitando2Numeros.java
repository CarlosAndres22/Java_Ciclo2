/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.solicitando.pkg2.numeros;
/*importar de la libreria de API */

import java.util.Scanner;

/**
 * @author Usuario
 * mobil 3103209265
 * jamesceballos2013@gmail.com
 */
public class EjercicioSolicitando2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        
        /*delaracion de variables*/  
        int x, y;
        
        /*inicializo variables*/ 
        x=0; y=0;
        
       /* Contextuaizar el usuario */
       /* Solicitar datos de entrada */
        
        System.out.println("Este programa solicita 2 numeros enteros para indcar cual es el menor, cual es el mayor y cuales son iguales");
        /*Solicito datos de entrada*/
        
        System.out.println("Por favor digite el valor de x");
           /*Almaceno el valor digitado por el usuario*/
           x=captura.nextInt ();
           
       System.out.println("Por favor digite el valor de y");
           /*Almaceno el valor digitado por el usuario*/
           y=captura.nextInt ();
        
        /*realizo operación*/
        
        if (x>y)
            /*muestro el resultado*/
            System.out.println("El primer numero digitado " + x +" es mayor que el segundo numero " + y );
        
            if (y>x)
                /*muestro el resultado*/
                System.out.println("El primer numero digitado " + x +" es menor que el segundo numero " + y );
            
                if (x==y)
                    /*muestro el resultado*/
                    System.out.println("El primer numero digitado " + x +" es igual que el segundo numero " + y );
    }
    
}
