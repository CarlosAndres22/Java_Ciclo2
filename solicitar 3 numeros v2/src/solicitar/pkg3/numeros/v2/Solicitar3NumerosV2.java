/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solicitar.pkg3.numeros.v2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Solicitar3NumerosV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captura = new Scanner (System.in);
       /* Contextuaizar el usuario */
       /* Solicitar datos de entrada */
        
       /*delaracion de variables*/  
        int x, y, z;
        
       /*inicializo variables*/ 
        x=0; y=0; z=0;
       
        System.out.println("Este programa solicita tres numeros enteros (X, Y, Z) para indicar cual es el menor, cual es el mayor y cuales son iguales");
        /*Solicito datos de entrada*/
        
        System.out.println("Digite el valor de X");
           /*Almaceno el valor digitado por el usuario*/
           x=captura.nextInt ();
           
        System.out.println("Digite el valor de Y");
           /*Almaceno el valor digitado por el usuario*/
           y=captura.nextInt ();
           
        System.out.println("Digite el valor de Z");
           /*Almaceno el valor digitado por el usuario*/
           z=captura.nextInt ();
           
        /*realizar operación*/
        
        if (x>y && x>z)
            /*muestro el resultado*/
            System.out.println("El numero " + x + " es mayor que el numero " + y + " y el numero" + z );
        
        if (x<y && x<z)
            /*muestro el resultado*/
            System.out.println("El numero " + x + " es menor que el numero " + y + " y el numero" + z );
        
        if (x==y && x==z)
            /*muestro el resultado*/
            System.out.println("El numero " + x + " es igual que el numero " + y + " y el numero" + z );
        
        
        
        
        
        
        
       if (x<y)
            /*muestro el resultado*/
            System.out.println("El primer numero digitado " + x + " es menor que el segundo numero digitado " + y );
       
       if (x==y)
            /*muestro el resultado*/
            System.out.println("El primer numero digitado " + x + " es igual que el segundo numero digitado " + y );
       
       if (x>z)
            /*muestro el resultado*/
            System.out.println("El primer numero digitado " + x + " es mayor que el tercer numero digitado " + z );
        
       if (x<z)
            /*muestro el resultado*/
            System.out.println("El primer numero digitado " + x + " es menor que el tercer numero digitado " + z );
       
       if (x==z)
            /*muestro el resultado*/
            System.out.println("El primer numero digitado " + x + " es igual que el tercer numero digitado " + z );
       
       if (y>x)
            /*muestro el resultado*/
            System.out.println("El segundo numero digitado " + y + " es mayor que el primer numero digitado " + x );
        
       if (y<x)
            /*muestro el resultado*/
            System.out.println("El segundo numero digitado " + y + " es menor que el primer numero digitado " + x );
       
       if (y==x)
            /*muestro el resultado*/
            System.out.println("El segundo numero digitado " + y + " es igual que el primer numero digitado " + x );
       
       if (y>z)
            /*muestro el resultado*/
            System.out.println("El segundo numero digitado " + y + " es mayor que el tercer numero digitado " + z );
        
       if (y<z)
            /*muestro el resultado*/
            System.out.println("El segundo numero digitado " + y + " es menor que el tercer numero digitado " + z );
       
       if (y==z)
            /*muestro el resultado*/
            System.out.println("El segundo numero digitado " + y + " es igual que el tercer numero digitado " + z );
           
       if (z>x)
            /*muestro el resultado*/
            System.out.println("El tercer numero digitado " + z + " es mayor que el primer numero digitado " + x );
        
       if (z<x)
            /*muestro el resultado*/
            System.out.println("El tercer numero digitado " + z + " es menor que el primer numero digitado " + x );
       
       if (z==x)
            /*muestro el resultado*/
            System.out.println("El tercer numero digitado " + z + " es igual que el tercer numero digitado " + x );
       
       if (z>y)
            /*muestro el resultado*/
            System.out.println("El tercer numero digitado " + z + " es mayor que el segundo numero digitado " + y );
        
       if (z<y)
            /*muestro el resultado*/
            System.out.println("El tercer numero digitado " + z + " es menor que el segundo numero digitado " + y );
       
       if (z==y)
            /*muestro el resultado*/
            System.out.println("El tercer numero digitado " + z + " es igual que el segundo numero digitado " + y );
       
  
  System.out.println("Programa diseñado por James Ceballos 19/oct/2016");
                  
    }
    
}
