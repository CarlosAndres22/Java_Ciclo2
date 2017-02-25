/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado1;

import java.util.Scanner;

/**
 *
 * @author James Ceballos
 */
public class Empleado1 {

    /* Atributos */
        protected String Nombre;
        protected String Apellido;
        protected String Correo;
        protected String Telefono;
        protected String Tipodecontrato;
        protected long Sueldo;
    /* Cierre de Atributos */
        
        
    /* Construtor */
    public Empleado1() {
        this.Nombre = null;
        this.Apellido = null;
        this.Correo = null;
        this.Telefono = null;
        this.Tipodecontrato= null;
        this.Sueldo=0;
    } /* cierre del Construtor */
    
    
    /* Metodos */
    public String getNombre() {
        return Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }
    
    public String getCorreo() {
        return Correo;
    }
    
    public String getTelefono() {
        return Telefono;
    }
    
    public String getTipodecontrato() {
        return Tipodecontrato;
    }

    public long getSueldo() {
        return Sueldo;
    }
    /* cierre del Metodo */ 
    
    public void setNombre (String Nombre){
        this.Nombre=Nombre;
    }    
    
   public void setApellido (String Apellido){
        this.Apellido=Apellido;
    }    
        
   public void setCorreo (String Correo){
        this.Correo=Correo;
    }       
        
    public void setTelefono (String Telefono){
        this.Telefono=Telefono;
    } 
   
    public void setTipodecontrato (String Tipodecontrato){
        this.Tipodecontrato=Tipodecontrato;
    } 
    
    public void setSueldo (Long Sueldo){
        this.Sueldo=Sueldo;
    } 
    
    
    public static void main(String[] args) {

        Empleado1 em = new Empleado1();  /* Instanciamiento la clase publica y convirtiendola en objeto*/
        Scanner cap = new Scanner (System.in); /* Instanciando Scanner*/
        
    /* Asignar el objeto a la clase*/   
        
        System.out.println("Este programa solicitara sus datos personales y los mostrara por pantalla ");   
        System.out.println("Digite sus datos personales ----- Nombre ----- \t "); 
        em.setNombre(cap.next());
        System.out.println("Digite sus datos personales ----- Apellido ----- \t "); 
        em.setApellido(cap.next());
        System.out.println("Digite sus datos personales ----- Correo ----- \t "); 
        em.setCorreo(cap.next());
        System.out.println("Digite sus datos personales ----- Telefono ----- \t "); 
        em.setTelefono(cap.nextLine());
        System.out.println("Digite sus datos personales ----- Tipo de contrato ----- \t "); 
        em.setTipodecontrato(cap.next());
        System.out.println("Digite sus datos personales ----- Sueldo ----- \t "); 
        em.setSueldo(cap.nextLong());
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|                                                                                      |");
        System.out.println(" | Sus datos personales digitados son:  \n | Nombre \t\t" +em.getNombre()+" \n | Apellido \t\t" +em.getApellido()+" \n | Correo \t\t" +em.getCorreo()+" \n | Telefono \t\t" +em.getTelefono()+" \n | Tipo de contrato \t" +em.getTipodecontrato()+ " \n | Sueldo \t\t" +em.getSueldo());                                                                                    
        System.out.println("|                                                                                      |");
        System.out.println("---------------------------------------------------------------------------------------");
        
        
    } /* Cierre de public static void */

} /* fin del class*/
