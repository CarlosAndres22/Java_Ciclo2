/*estas lineas se usan para DOCUMENTAR AL PROGRAMADOR O AL DESARROLLADOR DEl programa
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo9;
import java.util.Scanner;

/**camilo andres ovalle ruiz
 * 3204344593
 *Desarrollo de Software
 * 2 ciclo
 * @author Usuario
 */
public class Algoritmo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner (System.in);
        System.out.println("secuencia de numeros pares del 1-50");
        int i=2;
        while( i<=50){
            System.out.println("secuencia de numeros pares hasta 50  "+i);
            i=i+2;
        }
    }
    
}
