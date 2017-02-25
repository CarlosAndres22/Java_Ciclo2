/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servifruverpoo;

import java.util.Scanner;


/**
 *
 * @author James Ceballos
 */
public class ServifruverPOO {

    /* Atributos */
        protected String Nombre;
        protected String Apellido;
        protected String Correo;
        protected String Telefono;
        protected int fecha_nac;
        protected int fecha_act;
        protected int edad;
        protected int opc;
        protected int opc_salida;
        protected int opc_men;
        protected int opc_men_lac;
        protected int opc_men_car;
        protected int opc_men_frut;
        protected int opc_men_ver;
        protected int opc_men_mis;
        protected int opc_men_gra;
        protected int opc_men_aseo;
        protected int descuento;
        protected int cantidad;
        protected int subtotal;
        protected int cont;
        protected int total;
        protected int lacteos[]={3000,3200,2700,3200,3900};
        protected int carnicos[]={5000,5200,4700,2200,3800};
        protected int frutas[]={800,400,700,200,1800};
        protected int verduras[]={1800,1000,700,1200,1300};
        protected int miscelanea[]={9800,8000,4700,2100,2400};
        protected int granos[]={1350,4800,4600,3700,4100};
        protected int aseo[]={9800,1350,3800,3200,5600};
        private String getedad;
        
    /* Cierre de Atributos */
    
    /* Constructor */
      
    public ServifruverPOO () {
        this.Nombre = null;
        this.Apellido = null;
        this.Correo = null;
        this.Telefono = null;
        this.fecha_nac = 0;
        this.fecha_act = 0;
        this.edad=0;
        this.opc_salida=1;
        this.opc_men=0;
        this.opc_men_lac=0;
        this.opc_men_car=0;
        this.opc_men_frut=0;
        this.opc_men_ver=0;
        this.opc_men_mis=0;
        this.opc_men_gra=0;
        this.opc_men_aseo=0;
        this.descuento=0;
        this.cantidad=0;
        this.subtotal=0;
        this.cont=0;
        this.total=0;
        //Scanner captura;new Scanner (System.in);
         }
      
    /*cierre del Construtor */
    
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

    public int getfecha_nac() {
        return fecha_nac;
    }

     public int getfecha_act() {
        return fecha_act;
    }
      
    public int getedad() {
        return edad;
    }
    
    public int getopc_salida() {
        return opc_salida;
    }

    public int getopc_men() {
        return opc_men;
    }

    public int getopc_men_lac() {
        return opc_men_lac;
    }

    public int getopc_men_car() {
        return opc_men_car;
    }

    public int getopc_men_frut() {
        return opc_men_frut;
    }

    public int getopc_men_ver() {
        return opc_men_ver;
    }

    public int getopc_men_mis() {
        return opc_men_mis;
    }

    public int getopc_men_gra() {
        return opc_men_gra;
    }

      public int getopc_men_aseo() {
        return opc_men_aseo;
    }

    public int getdescuento() {
        return descuento;
    }

       
    public int getcantidad() {
        return cantidad;
    }

    public int getsubtotal() {
        return subtotal;
    }

    public int getcont() {
        return cont;
    }
    
    public int gettotal() {
        return total;
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
    
     public void setfecha_nac (int fecha_nac){
        this.fecha_nac=fecha_nac;
    } 
   
     public void setfecha_act (int fecha_act){
        this.fecha_act=fecha_act;
    } 
     
    public void setedad (int edad){
        this.edad=edad;
    } 
    
    public void setopc (int opc){
        this.opc=opc;
    } 
    
    public void setopc_salida (int opc_salida){
        this.opc_salida=opc_salida;
    } 
    
    public void setopc_men (int opc_men){
        this.opc_men=opc_men;
    } 
    
    public void setopc_men_lac (int opc_men_lac){
        this.opc_men_lac=opc_men_lac;
    } 
    
    public void setopc_men_car (int opc_men_car){
        this.opc_men_car=opc_men_car;
    } 
    
    public void setopc_men_frut (int opc_men_frut){
        this.opc_men_frut=opc_men_frut;
    } 
    
    public void setopc_men_ver (int opc_men_ver){
        this.opc_men_ver=opc_men_ver;
    } 
    
    public void setopc_men_mis (int opc_men_mis){
        this.opc_men_mis=opc_men_mis;
    }
    
    public void setopc_men_gra (int opc_men_gra){
        this.opc_men_gra=opc_men_gra;
    }
    
    public void setopc_men_aseo (int opc_men_aseo){
        this.opc_men_aseo=opc_men_aseo;
    }
    
    public void setdescuento (int descuento){
        this.descuento=descuento;
    }
    
    public void setcantidad (int cantidad){
        this.cantidad=cantidad;
    }
    
    public void setsubtotal (int subtotal){
        this.subtotal=subtotal;
    }
    
    public void setcont (int cont){
        this.cont=cont;
    }
    
    public void settotal (int total){
        this.total=total;
    }
    
    /* cierre del Metodo */
  
    
    public static void main(String[] args) {
     
       
  
    ServifruverPOO em = new ServifruverPOO();  /* Instanciamiento la clase publica y convirtiendola en objeto*/
    Scanner captura= new Scanner (System.in); /* Instanciando Scanner*/ 
     
    /* Asignar el objeto a la clase*/   
    
        System.out.println("Bienvenido a la tienda On_line del Almacen Fruver.");
        
        do {
        System.out.println("Para realizar sus compras se requiere sus datos personales");
        
        System.out.println("Si esta de acuerdo seleccione la opcion \n\t 1. si \n\t 2. no");
        
        em.opc=captura.nextInt();
        } while(em.opc<1 || em.opc>2);
          if (em.opc==1)
          {
        System.out.println("Usted ha aceptado digitar sus datos personales");   
        System.out.println("");      
        
        System.out.println("Este programa solicitara sus datos personales y los mostrara por pantalla ");   
        System.out.println("Digite sus datos personales ----- Nombre ----- \t "); 
        em.setNombre(captura.next());
        System.out.println("Digite sus datos personales ----- Apellido ----- \t "); 
        em.setApellido(captura.next());
        System.out.println("Digite sus datos personales ----- Correo ----- \t "); 
        em.setCorreo(captura.next());
        System.out.println("Digite sus datos personales ----- Telefono ----- \t "); 
        em.setTelefono(captura.next());
        System.out.println("Digite su fecha de nacimiento");
        em.setfecha_nac(captura.nextInt());
              
        System.out.println("Digite la fecha actual");
        em.setfecha_act(captura.nextInt());
              
             em.setedad(em.getfecha_act() - em.getfecha_nac());

              System.out.println("");
              System.out.println("su edad es " + em.edad + " años");
              System.out.println("");
              System.out.println("Confirme la edad");
              em.edad = captura.nextInt();
            
            System.out.println("");  
        if (em.edad % 2 == 0) {
            System.out.println("Su edad es par, por lo cual obtiene un descuento del 5%.");
        }else{
            System.out.println("Su edad es impar, por lo cual obtiene un descuento del 6%.");   
        } 
        System.out.println("" );              
            } 
             
        else if (em.opc==2){    
        System.out.println("Usted no ha aceptado digitar sus datos personales, gracias.");
        System.exit(0);
        }  
         
        while(em.opc_salida!=0){
        do{ 
            System.out.println("Las opciones de compra para el dia de hoy son: \n"+
        "*************************************************************\n"+
        "\t  1. lacteos \n"+
        "\t  2. carnicos \n"+
        "\t  3. frutas \n"+
        "\t  4. verduras \n"+
        "\t  5. miscelanea \n"+
        "\t  6. granos \n"+
        "\t  7. prod. aseo \n"+ 
        "*************************************************************\n"+
        "\t seleccione una de las opciones deseadas <1-7>");
        em.opc_men=captura.nextInt();
        
        } while (em.opc_men<1 || em.opc_men>7);
        
         switch( em.opc_men){           
                        
                    case 1: {
                            do{

                                System.out.println("Usted ha seleccionado Lacteos \n "+
                                "*************************************************************\n"+
                                "\t  1. Leche 1.3 ml $ 3000 \n"+
                                "\t  2. yogurth 1.3 ml $ 3200 \n"+
                                "\t  3. Queso doble crema $ 2700 \n"+ 
                                "\t  4. Queso tajado lbs $ 3200 \n"+
                                "\t  5. Mantequilla lbs $ 3900 \n"+
                                "*************************************************************\n"+
                                "\t seleccione una de las opciones deseadas <1-5>");
                                em.opc_men_lac=captura.nextInt();
                            
                                } while(em.opc<1 || em.opc>5);
                            
                switch( em.opc_men_lac){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado leche 1.3 ml");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.lacteos[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();
                        
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado yogourth 1.3");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.lacteos[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Queso doble crema");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.lacteos[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Queso tajado");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.lacteos[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Mantequilla lb");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.lacteos[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();  
                        
                        }break;  
                    }
                }/* Cierre del caso 1 */
            break; /* break del caso 1 */
                        
                        
                case 2: {                                                                                                                                                                                                                                                               
                do{ 
                    System.out.println("Usted ha seleccionado Carnicos \n "+
                    "*************************************************************\n"+
                    "\t  1. Murillo $ 5000 \n"+
                    "\t  2. Cogote $ 5200 \n"+
                    "\t  3. Sobrebarriga $ 4700 \n"+ 
                    "\t  4. Hueso $ 2200 \n"+
                    "\t  5. Visceras $ 3800 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                   em.opc_men_car=captura.nextInt();
                    
                } while(em.opc<1 || em.opc>5);
                
                switch( em.opc_men_car){
                    case 1: {
                        System.out.println("usted ha seleccionado carne de murillo");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.carnicos[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();
                        
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de cogote");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.carnicos[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Sobrebarriga");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.carnicos[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Hueso");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.carnicos[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado visceras");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.carnicos[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    } 
                }/* Cierre del case 2 */
            break; /* break del caso 2 */
                
                 
            case 3: {                                                                                                                                                                                                                                                               
                
                do{ 
                    System.out.println("Usted ha seleccionado frutas \n "+
                    "*************************************************************\n"+
                    "\t  1. Manzana $ 800 \n"+
                    "\t  2. Mango $ 400 \n"+
                    "\t  3. Pera $ 700 \n"+ 
                    "\t  4. Limón $ 200 \n"+
                    "\t  5. Papaya $ 1800 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    em.opc_men_frut=captura.nextInt();
                    
                } while(em.opc<1 || em.opc>5);
                
                switch( em.opc_men_frut){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Manzana");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.frutas[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();
                        
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de Mango");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.frutas[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Pera");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.frutas[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();  
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Limon");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.frutas[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Papaya");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.frutas[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    } 
                }/* Cierre del case 3 */
            break; /* break del caso 3 */
            
            
            case 4: {
                
                do{
                    System.out.println("Usted ha seleccionado Verduras \n "+
                    "*************************************************************\n"+
                    "\t  1. Arveja $ 1800 \n"+
                    "\t  2. Papa $ 1000 \n"+
                    "\t  3. Yuca $ 700 \n"+ 
                    "\t  4. Tomate $ 1200 \n"+
                    "\t  5. Cebolla $ 1300 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    em.opc_men_ver=captura.nextInt();
                    
               } while(em.opc<1 || em.opc>5);
                
                switch( em.opc_men_ver){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Arveja");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.verduras[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();
                        
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado carne de Papa");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.verduras[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Yuca");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.verduras[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Tomate");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.verduras[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Cebolla");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.verduras[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                       }break;     
                    } 
                }/* Cierre del case 4 */
            break; /* break del caso 4 */
                   
 
            case 5: {
                
                do{
                    System.out.println("Usted ha seleccionado Miscelanea \n "+
                    "*************************************************************\n"+
                    "\t  1. Salsa de tomate $ 9800 \n"+
                    "\t  2. Mayonesa $ 8000 \n"+
                    "\t  3. Salsa soya $ 4700 \n"+ 
                    "\t  4. Salsa negra $ 2100 \n"+
                    "\t  5. Salsa BBQ $ 2400 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    em.opc_men_mis=captura.nextInt();
                    
                } while(em.opc<1 || em.opc>5);
                
                switch( em.opc_men_mis){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Salsa de tomate");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.miscelanea[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();
                        
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado Mayonesa");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.miscelanea[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Salsa Soya");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.miscelanea[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Salsa Negra");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.miscelanea[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Salsa BBQ");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.miscelanea[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                         em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    } 
                }/* Cierre del case 5 */
            break; /* break del caso 5 */
        
               
            case 6: {
                
                do{
                    System.out.println("Usted ha seleccionado granos \n "+
                    "*************************************************************\n"+
                    "\t  1. Arroz $ 1350 \n"+
                    "\t  2. Frijol $ 4800 \n"+
                    "\t  3. Arveja seca $ 4600 \n"+ 
                    "\t  4. Garbanzo $ 3700 \n"+
                    "\t  5. Maiz $ 4100 \n"+
                   "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
            em.opc_men_gra=captura.nextInt();
                    
                } while(em.opc<1 || em.opc>5);
                
                switch( em.opc_men_gra){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Arroz");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.granos[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                         em.opc_salida=captura.nextInt();   
                         
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado Frijol");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.granos[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                         em.opc_salida=captura.nextInt();    
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Arveja");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.granos[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                         em.opc_salida=captura.nextInt();   
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Garbanzo");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.granos[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                         em.opc_salida=captura.nextInt();    
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Maiz");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.granos[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                         em.opc_salida=captura.nextInt();     
                        
                        }break;     
                    } 
                }/* Cierre del case 2 */
            break; /* break del caso 2 */
         
            case 7: {
                
                do{
                    System.out.println("Usted ha seleccionado productos de aseo \n "+
                    "*************************************************************\n"+
                    "\t  1. Jabon en polvo $ 9800 \n"+
                    "\t  2. Jabon en barra $ 1350 \n"+
                    "\t  3. Jabon liquido $ 3800 \n"+ 
                    "\t  4. Limpido $ 3200 \n"+
                    "\t  5. Suavisante $ 5600 \n"+
                    "*************************************************************\n"+
                    "\t seleccione una de las opciones deseadas <1-5>");
                    em.opc_men_aseo=captura.nextInt();
                    
                } while(em.opc<1 || em.opc>5);
                
                switch(em.opc_men_aseo){
                    
                    case 1: {
                        System.out.println("usted ha seleccionado Jabon en polvo");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.aseo[0]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                         
                        }break;      
                        
                    case 2: {
                        System.out.println("usted ha seleccionado Jabon en barra");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.aseo[1]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;
               
                    case 3: {
                        System.out.println("usted ha seleccionado Jabon liquido");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.aseo[2]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                       em.opc_salida=captura.nextInt();  
                        
                        }break;        
                    
                    case 4: {
                        System.out.println("usted ha seleccionado Limpido");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.aseo[3]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        
                        }break;     
                    
                    case 5: {
                        System.out.println("usted ha seleccionado Suavizante");
                        System.out.println("Indique la cantidad que desea llevar");
                        em.setcantidad(captura.nextInt());
                        em.setsubtotal(em.getcantidad()*em.aseo[4]);
                        System.out.println("su compra es:" + em.subtotal);
                        em.setcont(em.getcont()+em.getsubtotal());
                        System.out.println("desea realizar mas compras?"
                                + "\t  0. Salir \n"
                                + "\t\t\t\t  1. Continuar \n"
                                + "\t seleccione una de las opciones deseadas <0-1>");
                        
                        em.opc_salida=captura.nextInt();   
                        }break;     
                    } 
                }/* Cierre del case 7 */
            break; /* break del caso 7 */  
    
            
            } /* Cierre de swich opc menu*/
         
        } /* Cierre de while opc salida*/
        
            System.out.println("El subtotal a pagar es $ " + em.cont);
            System.out.println("");
            System.out.println("indique el descuento 5% - 6%");
            em.descuento = captura.nextInt();
            em.descuento=(em.getdescuento() * em.getcont() / 100);
            System.out.println("El descuento es de $ " + em.descuento); 
            em.total= (em.getcont() - em.getdescuento()); 
            System.out.println("El total a pagar es de $ " + em.total);
            System.out.println(""); 
            
            do {
                
            System.out.println("Estamos comprometidos con el medio ambiente implementando la campaña cero papel");
            System.out.println("");
            System.out.println("Si esta de acuerdo se enviara su factura al correo electronico, por tal motivo  seleccione la opcion \t\n\t 1. imprimir \n\t 2. enviar al E-mail");

            em.opc = captura.nextInt();
        } while (em.opc < 1 || em.opc > 2);
        if (em.opc == 1) {
            System.out.println("Usted ha aceptado la impresion de la factura");
            System.out.println("");
            System.out.println("********************************************************************************************************");
            System.out.println("Señor(a) " + em.Nombre + " " + em.Apellido + " Telefono " + em.Telefono + " E-mail " + em.Correo + " \n "
                    + "\t  El subtotal a pagar sin descuento es \t\t $ " + em.cont + "       \n"
                    + "\t  El descuento de acuerdo a la edad es de \t $ " + em.descuento + "  \n"
                    + "\t  Total a pagar \t\t\t\t $ " + em.total + " \n"
                    + "\n"
                    + "\t Gracias por utilizar nuestros servicios en linea");
            System.out.println("********************************************************************************************************");
        }

        if (em.opc == 2) {
            System.out.println("Usted ha aceptado el envio de la factura a su correo electronico");

            System.out.println("********************************************************************************************************");
            System.out.println("Señor(a)" + em.Nombre + " " + em.Apellido + " su factura fue eviada al E-mail " + em.Correo + "  \n "
                    + "\t  El subtotal a pagar sin descuento es \t\t $ " + em.cont + "       \n"
                    + "\t  El descuento de acuerdo a la edad es de \t $ " + em.descuento + "  \n"
                    + "\t  Total a pagar \t\t\t\t $ " + em.total + " \n"
                    + "\n"
                    + "\t Gracias por utilizar nuestros servicios en linea");
            System.out.println("********************************************************************************************************");
        }
       
    } /* Cierre de public static void */

} /* fin del class ServifruverPOO */
