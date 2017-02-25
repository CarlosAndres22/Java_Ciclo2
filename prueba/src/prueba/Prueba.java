/*/*estas lineas se usan para DOCUMENTAR AL PROGRAMADOR O AL DESARROLLADOR DEl programa
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.Scanner;

/**camilo andres ovalle ruiz
 * 3204344593
 *Desarrollo de Software
 * 2 ciclo
 * @author Usuario
 */
public class Prueba {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner captura = new Scanner (System.in);
        System.out.println("secuencia de numeros primos del 1-100");
    int num; 
int divisor=2;
boolean bandera=false; 

Scanner in = new Scanner (System.in) ;  

System.out.println("ingrese el numero: " ) ;
num=in.nextInt();

while(!bandera && divisor<num)
{ 
if (num%divisor==0) 
bandera=true; 
else
divisor++; 

}

if (bandera)  
System.out.println("el numero no es primo" ) ; 
else
System.out.println("el numero si es primo" ) ;


  }
 }

    
    

