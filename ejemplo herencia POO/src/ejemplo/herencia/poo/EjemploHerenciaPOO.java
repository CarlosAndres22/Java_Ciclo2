/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.herencia.poo;

/**
 *
 * @author andrea
 */
public class EjemploHerenciaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        profesor pr = new profesor ();
        pr.hablar();
        
        estudiante es = new estudiante();
        es.hablar();
        
    }
    
}
