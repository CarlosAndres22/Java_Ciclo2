/* esta linea es para orientar al programador
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores.racionales;
import java.util.Scanner;

/**camilo andres ovalle ruiz
 * 3204344593
 * desarrollo de software
 * ciclo II
 */
public class OperadoresRacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura= new Scanner (System.in);
        /**DEFINIR VARIABLES*/
        int num1, num2;
        /**CONTEXTUALIZAR AL USUARIO*/
        System.out.println("Este programa solicita 2 numeros enteros los compara y nos indica cual es el mayor, el menor.");
        /**DATOS DE ENTRADA*/
        System.out.println("Por favor digite el primer numero");
        num1=captura.nextInt();
        System.out.println("Por favor digite el segundo numero");
        num2=captura.nextInt();
        if (num1<num2)
            System.out.println("El primer valor digitado" +num1+ "es menor que el segundo numero"+num2);
        if (num1>num2)
            System.out.println("El primer valor digitado" +num1+ "es mayor que el segundo numero"+num2);
    }
    
}
