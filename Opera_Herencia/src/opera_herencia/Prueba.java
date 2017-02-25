/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opera_herencia;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void main(String[] ar) {
       int opc=0;
       Operacion op=new Operacion(); 
       Suma suma1=new Suma();
       Resta resta1=new Resta();  
                           
       switch(op.validamenu(opc)) { 
       
       case 1:{
        System.out.println("Usted ha seleccionado operación suma");
        suma1.cargar1();
        suma1.cargar2();
        suma1.operar();
        System.out.print("El resultado de la suma es:");
        suma1.mostrarResultado();
        break;
    }
       case 2:{ 
        System.out.println("Usted ha seleccionado operación resta");
        resta1.cargar1();
        resta1.cargar2();
        resta1.operar();
        System.out.print("El resultado de la resta es:");        
        resta1.mostrarResultado();
        break;
    }
       }
}
}