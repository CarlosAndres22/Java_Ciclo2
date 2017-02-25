/*estas lineas se usan para DOCUMENTAR AL PROGRAMADOR O AL DESARROLLADOR DEl programa
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo10;
import java.util.Scanner;

/**camilo andres ovalle ruiz
 * 3204344593
 *Desarrollo de Software
 * 2 ciclo
 * @author Usuario
 */
public class Algoritmo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner captura = new Scanner (System.in);
        System.out.println("secuencia de numeros primos del 1-100");
        int i=0, num1=0, cont=0;
        boolean primo=true;
        while ((primo)&&(num1!=i)){
            if(num1%i==0)
                primo= false;
            i++;
        }
    }
    
}
