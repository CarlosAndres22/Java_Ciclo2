/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.ciclo.pkgfor.pkg1;

import java.util.Scanner;

/**
 *
 * @author James ceballos
 */
public class EjercicioCicloFor1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner captura = new Scanner (System.in);
       /* Contextuaizar el usuario */
        /*declaracion de variables*/
        /*inicializo variables*/
        
        int fecha_nac=0; 
        
        String nombres=null;
        
        System.out.println("Digite sus nombres y apellidos");
           nombres=captura.nextLine();
                          
        System.out.println("Digite su fecha de nacimiento");
           /*Almaceno el valor digitado por el usuario*/
           fecha_nac=captura.nextInt();
           
          /*realizo operacion*/  
        int edad=2016-fecha_nac;
            System.out.println("su edad es "+edad);
        
        for(int pares=2; pares<=edad; pares=pares+2)
            System.out.println(""+pares);
    }
    
}
