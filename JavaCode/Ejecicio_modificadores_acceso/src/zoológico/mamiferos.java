/*

 */
package zoológico;

/**
 *
 * @author Nicolás
 */
public class mamiferos {
    public String nombrePublicoMa = "Nombre mamifero publico gets_sets ";
    public int edadPublicaMa = 70;
    protected String nombreProtegidoMa = "Nombre mamifero protegido gets_sets ";
    protected int edadProtegidaMa = 71;
    private String nombrePrivadoMa = "Nombre mamifero privado gets_sets ";
    private int edadPrivadaMa = 72;
    
    public mamiferos(String VnombrePublicoMa, int VedadPublicaMa, String VnombreProtegidoMa, int VedadProtegidaMa, String VnombrePrivadoMa, int VedadPrivadaMa) {
        this.nombrePublicoMa = VnombrePublicoMa;
        this.edadPublicaMa = VedadPublicaMa;
        this.nombreProtegidoMa = VnombreProtegidoMa;
        this.edadProtegidaMa = VedadProtegidaMa;
        this.nombrePrivadoMa = VnombrePrivadoMa;
        this.edadPrivadaMa = VedadPrivadaMa;
    }
      
    //sets
    public void setPublicoMamiferos (String nombrePublicoMaT,int edadPublicaMaT) {
        nombrePublicoMa = nombrePublicoMaT;
        edadPublicaMa = edadPublicaMaT;
    }
    
    protected void setProtegidoMamiferos(String nombreProtegidoMaT, int edadProtegidaMaT) {
        nombreProtegidoMa = nombreProtegidoMaT;
        edadProtegidaMa = edadProtegidaMaT;
    }
    
    private void setPrivadoMamiferos(String nombrePrivadoMaT, int edadPrivadaMaT) {
        nombrePrivadoMa = nombrePrivadoMaT;
        edadPrivadaMa = edadPrivadaMaT;
    }
    
     //gets

    public String getPublicoMamiferos() {
        return nombrePublicoMa + edadPublicaMa;
    }

    protected String getProtegidoMamiferos() {
        return nombreProtegidoMa + edadProtegidaMa;
    }

    private String getPrivadoMamiferos() {
        return nombrePrivadoMa + edadPrivadaMa;
    }  
    
      //Instancias mamiferos
    public String nombrePublicoMa2inst  = "Nombre mamiferos publico objeto_nom ";
    public int edadPublicaMa2inst  = 90;
    protected String nombreProtegidoMa2inst  = "Nombre mamiferos protegido objeto_nom ";
    protected int edadProtegidaMa2inst  = 91;
    private String nombrePrivadoMa2inst  = "Nombre mamiferos privado objeto_nom ";
    private int edadPrivadaMa2inst  = 92;
    
     //Instancias hija mamiferos
    public String nombrePublicoMaH2inst  = "Nombre hija mamiferos publico objeto_nom ";
    public int edadPublicaMaH2inst  = 110;
    protected String nombreProtegidoMaH2inst  = "Nombre hija mamiferos protegido objeto_nom ";
    protected int edadProtegidaMaH2inst  = 111;
    private String nombrePrivadoMaH2inst  = "Nombre hija mamiferos privado objeto_nom ";
    private int edadPrivadaMaH2inst  = 112;
    
     //Instancias hija mamiferos 2
    public String nombrePublicoMaH2inst2  = "Nombre 2 hija mamiferos publico objeto_nom ";
    public int edadPublicaMaH2inst2  = 120;
    protected String nombreProtegidoMaH2inst2  = "Nombre 2 hija mamiferos protegido objeto_nom ";
    protected int edadProtegidaMaH2inst2  = 121;
    private String nombrePrivadoMaH2inst2  = "Nombre 2 hija mamiferos privado objeto_nom ";
    private int edadPrivadaMaH2inst2  = 122;
    
    
    hija_mamiferos obj_hija_mamiferos2 = new hija_mamiferos(nombrePublicoMa2inst, edadPublicaMa2inst, nombreProtegidoMa2inst, edadProtegidaMa2inst, nombrePrivadoMa2inst, edadPrivadaMa2inst,  nombrePublicoMaH2inst, edadPublicaMaH2inst, nombreProtegidoMaH2inst, edadProtegidaMaH2inst, nombrePrivadoMaH2inst, edadPrivadaMaH2inst);
    
     
       //////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////Acceso a la clase hija_mamiferos
    ////////nombre
     public void porObjetoMaH2() {
         //publico
         String objNombrePublicoRecupMaH2 = obj_hija_mamiferos2.nombrePublicoMaH = "Nombre hija mamiferos publico porObjeto";
         int objEdadPublicaRecupMaH2 = obj_hija_mamiferos2.edadPublicaMaH = 160;
         
         //protected
         String objNombreProtegidoRecupMaH2 = obj_hija_mamiferos2.nombreProtegidoMaH = "Nombre hija mamiferos protegido porObjeto";
         int objEdadProtegidaRecupMaH2 = obj_hija_mamiferos2.edadPublicaMaH = 161;
         
         //private
         //No se puede // String objNombrePrivadoRecupMaH2 = obj_hija_mamiferos2.nombrePrivadoMaH = "Nombre hija mamiferos privado porObjeto";
                       //int objEdadPrivadaRecupMaH2 = obj_hija_mamiferos2.edadPrivadaMaH= 162;
         
         //imprimir
         System.out.println("Publico " + objNombrePublicoRecupMaH2 + objEdadPublicaRecupMaH2);
         System.out.println("Protegdo " + objNombreProtegidoRecupMaH2 + objEdadProtegidaRecupMaH2);
         //No se puede // System.out.println("Privado " + objNombrePrivadoRecupMaH2 + objEdadPrivadaRecupMaH2);
     }
    
    /////////objeto_nombre
     public void porObjetoNombreMaH2() {
         //publico
         String nombrePublicoRecupMaH2 = obj_hija_mamiferos2.nombrePublicoMaH;
         int edadPublicaRecupMaH2 = obj_hija_mamiferos2.edadPublicaMaH;
         
         //protected
         String nombreProtegidoRecupMaH2 = obj_hija_mamiferos2.nombreProtegidoMaH;
         int edadProtegidaRecupMaH2 = obj_hija_mamiferos2.edadProtegidaMaH;
         
         //private
         //No se puede // String nombrePrivadoRecupMaH2 = obj_hija_mamiferos.nombrePrivadoMaH;
                       // int edadPrivadaRecupMaH2 = obj_hija_mamiferos.edadPrivadaMaH;
         
         //imprimir
         System.out.println("publico " + nombrePublicoRecupMaH2 + edadPublicaRecupMaH2);
         System.out.println("protegido " + nombreProtegidoRecupMaH2 + edadProtegidaRecupMaH2);
         //No se puede // System.out.println("privado " + nombrePrivadoRecupMaH2 + edadPrivadaRecupMaH2);
     }
    
    //////////get_set
     public void porObjetoGetSetMaH2() {   
         // sets
         obj_hija_mamiferos2.setPublicoMamiferosH(nombrePublicoMaH2inst2, edadPublicaMaH2inst2);
         obj_hija_mamiferos2.setProtegidoMamiferosH(nombreProtegidoMaH2inst2, edadProtegidaMaH2inst2);
         //No se puede // obj_hija_mamiferos2.setPrivadoMamiferosH(nombrePrivadoMaH2inst2, edadPrivadaMaH2inst2);
         
         // gets
         String getPublicoRecupMaH2 = obj_hija_mamiferos2.getPublicoMamiferosH();
         String getProtegidoRecupMaH2 = obj_hija_mamiferos2.getProtegidoMamiferosH();
         //No se puede // String getPrivadoRecupMaH2 = obj_hija_mamiferos2.getPrivadoMamiferosH();
         
         //imprimir
         System.out.println("publico " + getPublicoRecupMaH2);
         System.out.println("protegido " + getProtegidoRecupMaH2);
         //No se puede // System.out.println("privado " + getPrivadoRecupMaH2);
     }
}
