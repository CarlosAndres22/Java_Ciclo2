/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opera_herencia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */


public class Operacion {
    protected Scanner teclado;
    protected int valor1;
    protected int valor2;
    protected int resultado;
    protected int opc;
    
    public Operacion() {
        teclado=new Scanner(System.in);
       
    }

public int validamenu(int op){
System.out.println("Que operación desea realizar:");
       System.out.println("1. Sumar dos números:");
       System.out.println("2. Restar dos números:");
       System.out.println("Seleccione la opción deseada: (1-2)");
       opc=teclado.nextInt();
       return opc;   
}
    public void cargar1() {
       System.out.print("Ingrese el primer valor:");
        valor1=teclado.nextInt();        
    }
    
    public void cargar2() {
        System.out.print("Ingrese el segundo valor:");
        valor2=teclado.nextInt();
    }
    
    public void mostrarResultado() {
        System.out.print(resultado);
    }
}

