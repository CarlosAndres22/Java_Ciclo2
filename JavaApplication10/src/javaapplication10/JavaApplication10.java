package javaapplication10;


import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author james
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Pedir al usuario que digite su nombre */
        
        String nombre
                = JOptionPane.showInputDialog("Cual es su nombre");

        /* Mensaje de Bienvenida */
        
        String mensaje
                = String.format("Bienvenido, %s, a la programacion java", nombre);

        JOptionPane.showMessageDialog(null, mensaje);

        JOptionPane.showMessageDialog(null, " Bienvenido a Java");

        /* sumatoria de 2 numeros */
        Scanner entrada = new Scanner(System.in);

        /* Declaro variables */
        int x=0, y=0, suma=0;

        /* Solicitar los numeros */
        JOptionPane.showInputDialog("Digite el primer numero entero");
        x=entrada.nextInt();

        JOptionPane.showInputDialog("Digite el segundo numero entero");
        y=entrada.nextInt();

        suma= x+y;

        JOptionPane.showMessageDialog (null,"El resultados de la suma de los dos numeros enteros es  " + suma);

    }
    /* Cierre de public static void */

}/* fin del algoritmo*/
