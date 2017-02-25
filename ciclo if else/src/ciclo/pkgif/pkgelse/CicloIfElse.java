/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author andrea
 */
public class CicloIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        
        int km = 0;
        
        System.out.println("Digite el kilometraje del vehiculo");
        km=captura.nextInt();
        
        if (km>=50) { 
            System.out.println("Debe realizar el cambio de repuesto");
        }   else { System.out.println("El repuesto aun tiene vida util"); 
        }
    }
}

