
package fruver.herencia;

/**
 * @author James Ceballos
 */
public class FRUVERHERENCIA {

    /* Declaro Atributos */
        protected String control;
        protected String Nombre;
        protected String Apellido;
        protected String Correo;
        protected String Telefono;
        protected int fecha_nac;
        protected int fecha_act []={2016}; 
        protected int edad;
        protected int opc;
        protected int opc_salida;
        protected String opc_men;
        protected int opc_men_lac;
        protected int opc_men_car;
        protected int opc_men_frut;
        protected int opc_men_ver;
        protected int opc_men_mis;
        protected int opc_men_gra;
        protected int opc_men_aseo;
        protected double descuento;
        protected double descuentoedad;
        protected int opc_men2;
        protected int opc_men_lac2;
        protected int opc_men_car2;
        protected int opc_men_frut2;
        protected int opc_men_gra2;
        protected int opc_men_mis2;
        protected int opc_men_aseo2;
        protected int opc_men_ver2;
        
        protected int cantidad;
        protected int subtotal;
        protected int cont;
        protected double total;
        protected int lacteos[]={3000,3200,2700,3200,3900};
        protected int carnicos[]={5000,5200,4700,2200,3800};
        protected int frutas[]={800,400,700,200,1800};
        protected int verduras[]={1800,1000,700,1200,1300};
        protected int miscelanea[]={9800,8000,4700,2100,2400};
        protected int granos[]={1350,4800,4600,3700,4100};
        protected int aseo[]={9800,1350,3800,3200,5600};
        private String getedad;
        
        
     
    /* Cierre de Atributos */
     
    public FRUVERHERENCIA () {
        this.Nombre = null;
        this.Apellido = null;
        this.Correo = null;
        this.Telefono = null;
        this.fecha_nac = 0;
        this.edad=0;
        this.opc_salida=1;
        this.opc_men=null;
        this.opc_men_lac=0;
        this.opc_men_car=0;
        this.opc_men_frut=0;
        this.opc_men_ver=0;
        this.opc_men_mis=0;
        this.opc_men_gra=0;
        this.opc_men_aseo=0;
        this.descuento=0;
        this.descuentoedad=0;
        this.cantidad=0;
        this.subtotal=0;
        this.cont=0;
        this.total=0;
        this.opc_men2=0;
        this.opc_men_lac2=0;
        this.opc_men_car2=0;
        this.opc_men_frut2=0;
        this.opc_men_gra2=0;
        this.opc_men_mis2=0;
        this.opc_men_aseo2=0;
        this.opc_men_ver2=0;
        
        
        
//        Scanner captura=new Scanner (System.in);
        }

    /*cierre del Constructor */
    
    /* Declaro Metodos */
    
    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    
    /*cierre del Constructor */
    
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

     
    public int getedad() {
        return edad;
    }
    
    public int getopc_salida() {
        return opc_salida;
    }

    public String getopc_men() {
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

    public double getdescuento() {
        return descuento;
    }

     public double getdescuentoedad() {
        return descuentoedad;
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
    
    public double gettotal() {
        return total;
    }
    
    public int getopc_men_lac2() {
        return opc_men_lac2;
    }
    
    public int getopc_men2() {
        return opc_men2;
    }
    
    public int getopc_men_car2() {
        return opc_men_car2;
    }
    
    public int getopc_men_frut2() {
        return opc_men_frut2;
    }
    
    public int getopc_men_gra2() {
        return opc_men_gra2;
    }
    
    public int getopc_men_mis2() {
        return opc_men_mis2;
    }
    
    public int getopc_men_aseo2() {
        return opc_men_aseo2;
    }
    
    public int getopc_men_ver2() {
        return opc_men_ver2;
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
   
     
    public void setedad (int edad){
        this.edad=edad;
    } 
    
    public void setopc (int opc){
        this.opc=opc;
    } 
    
    public void setopc_salida (int opc_salida){
        this.opc_salida=opc_salida;
    } 
    
    public void setopc_men (String opc_men){
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
    
    public void setdescuento (double descuento){
        this.descuento=descuento;
    }
    
     public void setcantiad (int cantidad){
        this.cantidad=cantidad;
    } 
    
     public void setdescuentoedad (double descuentoedad){
        this.descuentoedad=descuentoedad;
    }
    
     public void setopc_men2 (int opc_men2){
        this.opc_men2=opc_men2;
    }  
     
    public void setopc_men_lac2 (int opc_men_lac2){
        this.opc_men_lac2=opc_men_lac2;
    } 
    
    public void setopc_men_car2 (int opc_men_car2){
        this.opc_men_car2=opc_men_car2;
    } 
    
    public void setopc_men_frut2 (int opc_men_frut2){
        this.opc_men_frut2=opc_men_frut2;
    } 
    
    public void setopc_men_gra2 (int opc_men_gra2){
        this.opc_men_gra2=opc_men_gra2;
    } 
    
    public void setopc_men_mis2 (int opc_men_mis2){
        this.opc_men_mis2=opc_men_mis2;
    } 
    
    public void setopc_men_aseo2 (int opc_men_aseo2){
        this.opc_men_aseo2=opc_men_aseo2;
    } 
    
     public void setopc_men_ver2 (int opc_men_ver2){
        this.opc_men_ver2=opc_men_ver2;
    } 
    
    
    
//    public void setcantidad (int cantidad){
//        this.cantidad=cantidad;
//    }
    
    public void setsubtotal (int subtotal){
        this.subtotal=subtotal;
    }
    
    public void setcont (int cont){
        this.cont=cont;
    }
    
    public void settotal (double total){
        this.total=total;
    }
    
    /* cierre del Metodo */

    
   
} /* cierre public class FRUVERHERENCIA */
