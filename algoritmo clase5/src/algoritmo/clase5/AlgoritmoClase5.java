/*esta linea es para orientar al programador
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.clase5;
import java.util.Scanner;

/**camilo andres ovalle ruiz
 * 3204344593
 * desarrollo de software
 * ciclo II
 *
 * 
 */
public class AlgoritmoClase5 {

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
        if (num1>num2 && num1>num3)
            System.out.println("El numero mayor de los tres es el primer digito"+num1);
        else if(num2>num1 && num2>num3)
            System.out.println("El numero mayor de los tres es el segundo digito"+num2);
        else if(num3>num1 && num3>num2)
            System.out.println("El numero mayor de los tres es el tercer digito"+num3);
        if (num1<num2 && num1<num3)
            System.out.println("El numero menor de los tres es el primer digito"+num1);
        else if (num2<num1 && num2<num3)
            System.out.println("El numero menor de los tres es el segundo digito"+num2);
        else if (num3<num1 && num3<num2)
            System.out.println("El numero menor de los tres es  el tercer digito"+num3);
        if (num1==num2 && num2==num3)
            System.out.println("Todos los numeros son iguales");
        else if(num1<num2 && num1==num3)
            System.out.println("El primer digito es menor que el segundo digito y el primer digito es igual al tercer digito");
        else if(num1>num2 && num1==num3)
            System.out.println("El primer digito es mayor que el segundo digito y el primer digito es igual al tercer digito");
        else if(num2<num1 && num2==num3)
            System.out.println("El segundo digito es menor que el primer digito y el segundo digito es igual al tercer digito");
        else if(num2>num1 && num2==num3)
            System.out.println("El segundo digito es mayor que el primer digito y el segundo digito es igual al tercer digito");
        else if(num3<num1 && num3==num2)
            System.out.println("El tercer digito es menor que el primer digito y el tercer digito es igual al segundo digito");
        else if(num3>num1 && num3==num1)
            System.out.println("El tercer digito es mayor que el primer digito y el tercer digito es igual al primer digito");
    }
    
}
