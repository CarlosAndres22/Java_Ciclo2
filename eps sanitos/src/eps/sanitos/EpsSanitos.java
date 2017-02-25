/*Esta linea es para orientar al programador
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eps.sanitos;
import java.util.Scanner;

/**camilo andres ovalle ruiz
 * 3204344593
 * desarrollo de software
 * ciclo II
 *
 * @author Usuario
 */
public class EpsSanitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura= new Scanner (System.in);
        /*definir variables*/
        String nombre="",apellido="",id="",email="",tel="",dir="";
        int edad=0;
        
        //contextualizar al usuario//
        System.out.println("Este programa nos permite saver los datos de la consulta en la eps");
        System.out.println("por favor digite su nombre ");
       nombre= captura.next();
       System.out.println("por favor digite su apellido");
       apellido= captura.next();
       System.out.println("por favor digite su id");
       id= captura.next();
       System.out.println("por favor digite su email");
       email=captura.next();
       System.out.println("digite su teléfono");
       tel=captura.next();
       System.out.println("digite su dirección");
       dir=captura.next();
       System.out.println("digite su edad");
       edad=captura.nextInt();
        
    }
    
}
