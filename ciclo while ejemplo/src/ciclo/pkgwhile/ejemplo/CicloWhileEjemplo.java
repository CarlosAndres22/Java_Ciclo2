/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo.pkgwhile.ejemplo;

import java.util.Scanner;

/**
 *
 * @author andrea
 */
public class CicloWhileEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        
        int x=0;
        
        System.out.println("Digite el valor de x");
        x=captura.nextInt();
        
        if (x>200){
        System.out.println("Digite el valor de x"); }
         else { System.out.println("");
                }
         
        while(x<=200) {
            System.out.println("este es un ejercicio " +x); 
            x=x+7;
        }
    }
}

