/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.primos;

import java.util.Scanner;

/**
 *
 * @author James Ceballos
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
       /* Contextuaizar el usuario */
       /* Solicitar datos de entrada */
        
       /*delaracion de variables*/  
        int limite;
        
        System.out.println("Por favor digite el limite de los numeros primos");
        limite= leer.nextInt();
        System.out.println("1");
        
        for (int inicio=1; inicio<limite; inicio++) {
            int count=0;
            
            for (int j=1; j<=inicio; j++) {
                if(inicio%j==0)
                count++;
            }
                if(count==2)
                    System.out.println(inicio);
        }
        
        
        
    }
    
}
