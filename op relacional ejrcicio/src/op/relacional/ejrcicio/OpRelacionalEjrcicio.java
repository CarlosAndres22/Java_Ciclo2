/*esta linea es para orientar al programador
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op.relacional.ejrcicio;
import java.util.Scanner;

/*camilo andres ovalle ruiz
 * 3204344593
 * desarrollo de software
 * ciclo II
 * @author Usuario
 */
public class OpRelacionalEjrcicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura= new Scanner (System.in);
        /**DEFINIR VARIABLES*/
        int num1, num2, num3;
        /**CONTEXTUALIZAR AL USUARIO*/
        System.out.println("Este programa solicita 3 numeros enteros los compara y nos indica cual es el mayor, el menor, el igual.");
        System.out.println("Por favor digite el primer numero");
        num1=captura.nextInt();
         System.out.println("Por favor digite el segundo numero");
        num2=captura.nextInt();
        System.out.println("Por favor digite el tercer numero");
        num3=captura.nextInt();
        if(num1<num2 && num2<num3)
            System.out.println("El primer valor digitado" +num1+ "es menor al segundo numero" +num2+ "El segundo valor digitado" +num2+ "es menor al tercer numero" +num3);
        if(num1>num2 || num2>num3)
            System.out.println("El primer valor digitado" +num1+ "es mayor al segundo numero" +num2+ "El segundo valor digitado" +num2+ "es mayor al tercer numero" +num3);
        if(num1<num3 && num1>num3)
            System.out.println("El primer valor digitado" +num1+ "es menor al tercer numero" +num3+ "El primer valor digitado" +num1+ "es mayor al tercer numero" +num3);
        if (num1==num2 || num2==num3 && num1==num3)
         System.out.println("El primer valor digitado" +num1+ "es igual al segundo numero" +num2+ "El segundo valor digitado" +num2+ "es igual al tercer numero" +num3+ "el primer valor digitado" +num1+ "es igual al numero tres" +num3);
    }
    
}
