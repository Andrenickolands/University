/*

 */
package zoológico;

/**
 *
 * @author AndresNicolasSepulve
 */
public class principal {
    
    public String nombrePublicoP = "Nombre publico gets_sets ";
    public int edadPublicaP = 30;
    protected String nombreProtegidoP = "Nombre protegido gets_sets ";
    protected int edadProtegidaP = 31;
    private String nombrePrivadoP = "Nombre privado gets_sets ";
    private int edadPrivadaP = 32;
    
    //Instancias principal
    public String nombrePublicoPinst = "Nombre publico objeto_nom";
    public int edadPublicaPinst = 20;
    protected String nombreProtegidoPinst = "Nombre protegido objeto_nom ";
    protected int edadProtegidaPinst = 21;
    private String nombrePrivadoPinst = "Nombre privado objeto_nom ";
    private int edadPrivadaPinst = 22;
    
    //Instancias llamadora
    public String nombrePublicoLlinst  = "Nombre llamadora publico objeto_nom ";
    public int edadPublicaLlinst  = 50;
    protected String nombreProtegidoLlinst  = "Nombre llamadora protegido objeto_nom ";
    protected int edadProtegidaLlinst  = 51;
    private String nombrePrivadoLlinst  = "Nombre llamadora privado objeto_nom ";
    private int edadPrivadaLlinst  = 52;
    
     //Instancias llamadora 2
    public String nombrePublicoLlinst2  = "Nombre 2 llamadora publico objeto_nom ";
    public int edadPublicaLlinst2  = 60;
    protected String nombreProtegidoLlinst2  = "Nombre 2 llamadora protegido objeto_nom ";
    protected int edadProtegidaLlinst2  = 61;
    private String nombrePrivadoLlinst2  = "Nombre 2 llamadora privado objeto_nom ";
    private int edadPrivadaLlinst2  = 62;
    
    //Instancias mamiferos
    public String nombrePublicoMainst  = "Nombre mamiferos publico objeto_nom ";
    public int edadPublicaMainst  = 90;
    protected String nombreProtegidoMainst  = "Nombre mamiferos protegido objeto_nom ";
    protected int edadProtegidaMainst  = 91;
    private String nombrePrivadoMainst  = "Nombre mamiferos privado objeto_nom ";
    private int edadPrivadaMainst  = 92;
    
     //Instancias mamiferos 2
    public String nombrePublicoMainst2  = "Nombre 2 mamiferos publico objeto_nom ";
    public int edadPublicaMainst2  = 100;
    protected String nombreProtegidoMainst2  = "Nombre 2 mamiferos protegido objeto_nom ";
    protected int edadProtegidaMainst2  = 101;
    private String nombrePrivadoMainst2  = "Nombre 2 mamiferos privado objeto_nom ";
    private int edadPrivadaMainst2  = 102;
    
    //Instancias hija mamiferos
    public String nombrePublicoMaHinst  = "Nombre hija mamiferos publico objeto_nom ";
    public int edadPublicaMaHinst  = 110;
    protected String nombreProtegidoMaHinst  = "Nombre hija mamiferos protegido objeto_nom ";
    protected int edadProtegidaMaHinst  = 111;
    private String nombrePrivadoMaHinst  = "Nombre hija mamiferos privado objeto_nom ";
    private int edadPrivadaMaHinst  = 112;
    
     //Instancias hija mamiferos 2
    public String nombrePublicoMaHinst2  = "Nombre 2 hija mamiferos publico objeto_nom ";
    public int edadPublicaMaHinst2  = 120;
    protected String nombreProtegidoMaHinst2  = "Nombre 2 hija mamiferos protegido objeto_nom ";
    protected int edadProtegidaMaHinst2  = 121;
    private String nombrePrivadoMaHinst2  = "Nombre 2 hija mamiferos privado objeto_nom ";
    private int edadPrivadaMaHinst2  = 122;
    
        /////Main
     public static void main(String[] args) {
        principal sd = new principal();
        sd.porObjetoP();
        sd.porObjetoNombreP();
        sd.porObjetoGetSetP();
        sd.porObjetoLl();
        sd.porObjetoNombreLl();
        sd.porObjetoGetSetLl();
        sd.porObjetoMa();
        sd.porObjetoNombreMa();
        sd.porObjetoGetSetMa();
        sd.porObjetoMaH();
        sd.porObjetoNombreMaH();
        sd.porObjetoGetSetMaH();
         
     }

    public principal(String VnombrePublicoP, int VedadPublicaP, String VnombreProtegidoP, int VedadProtegidaP, String VnombrePrivadoP, int VedadPrivadaP) {
        this.nombrePublicoP = VnombrePublicoP;
        this.edadPublicaP = VedadPublicaP;
        this.nombreProtegidoP = VnombreProtegidoP;
        this.edadProtegidaP = VedadProtegidaP;
        this.nombrePrivadoP = VnombrePrivadoP;
        this.edadPrivadaP = VedadPrivadaP;
    }
    
    //sets
    public void setPublicoPrincipal(String nombrePublicoPT,int edadPublicaPT) {
        nombrePublicoP = nombrePublicoPT;
        edadPublicaP = edadPublicaPT;
    }
    
    protected void setProtegidoPrincipal(String nombreProtegidoPT, int edadProtegidaPT) {
        nombreProtegidoP = nombreProtegidoPT;
        edadProtegidaP = edadProtegidaPT;
    }
    
    private void setPrivadoPrincipal(String nombrePrivadoPT, int edadPrivadaPT) {
        nombrePrivadoP = nombrePrivadoPT;
        edadPrivadaP = edadPrivadaPT;
    }
    
     //gets

    public String getPublicoPrincipal() {
        return nombrePublicoP + edadPublicaP;
    }

    protected String getProtegidoPrincipal() {
        return nombreProtegidoP + edadProtegidaP;
    }

    private String getPrivadoPrincipal() {
        return nombrePrivadoP + edadPrivadaP;
    }
    
     ////////////////////////////////////
    //objetos
    principal obj_principal = new principal(nombrePublicoPinst, edadPublicaPinst, nombreProtegidoPinst, edadProtegidaPinst, nombrePrivadoPinst, edadPrivadaPinst);
    llamadora obj_llamadora = new llamadora(nombrePublicoLlinst, edadPublicaLlinst, nombreProtegidoLlinst, edadProtegidaLlinst, nombrePrivadoLlinst, edadPrivadaLlinst);
    mamiferos obj_mamiferos = new mamiferos(nombrePublicoMainst, edadPublicaMainst, nombreProtegidoMainst, edadProtegidaMainst, nombrePrivadoMainst, edadPrivadaMainst);
    hija_mamiferos obj_hija_mamiferos = new hija_mamiferos(nombrePublicoMaHinst, edadPublicaMaHinst, nombreProtegidoMaHinst, edadProtegidaMaHinst, nombrePrivadoMaHinst, edadPrivadaMaHinst, nombrePublicoMainst, edadPublicaMainst, nombreProtegidoMainst, edadProtegidaMainst, nombrePrivadoMainst, edadPrivadaMainst);
    
    

     //////////////////////////////////////////////////////////////////////
    ////////////////////////////////////Acceso desde la misma clase
    ////////nombre
    
     public void porObjetoP() {
         //publico
         String objNombrePublicoRecupP = obj_principal.nombrePublicoP = "Nombre publico porObjeto";
         int objEdadPublicaRecupP = obj_principal.edadPublicaP = 10;
         
         //protected
         String objNombreProtegidoRecupP = obj_principal.nombrePublicoP = "Nombre protegido porObjeto";
         int objEdadProtegidaRecupP = obj_principal.edadPublicaP = 11;
         
         //private
         String objNombrePrivadoRecupP = obj_principal.nombrePublicoP = "Nombre privado porObjeto";
         int objEdadPrivadaRecupP = obj_principal.edadPublicaP = 12;
         
         //imprimir
         System.out.println("Publico " + objNombrePublicoRecupP + objEdadPublicaRecupP);
         System.out.println("Protegdo " + objNombreProtegidoRecupP + objEdadProtegidaRecupP);
         System.out.println("Privado " + objNombrePrivadoRecupP + objEdadPrivadaRecupP);
     }
    
    /////////objeto_nombre
     public void porObjetoNombreP() {
         //publico
         String nombrePublicoRecupP = obj_principal.nombrePublicoP;
         int edadPublicaRecupP = obj_principal.edadPublicaP;
         
         //protected
         String nombreProtegidoRecupP = obj_principal.nombreProtegidoP;
         int edadProtegidaRecupP = obj_principal.edadProtegidaP;
         
         //private
         String nombrePrivadoRecupP = obj_principal.nombrePrivadoP;
         int edadPrivadaRecupP = obj_principal.edadPrivadaP;
         
         //imprimir
         System.out.println("publico " + nombrePublicoRecupP + edadPublicaRecupP);
         System.out.println("protegido " + nombreProtegidoRecupP + edadProtegidaRecupP);
         System.out.println("privado " + nombrePrivadoRecupP + edadPrivadaRecupP);
     }
    
    //////////get_set
     public void porObjetoGetSetP() {
         // sets
         obj_principal.setPublicoPrincipal(nombrePublicoP, edadPublicaP);
         obj_principal.setProtegidoPrincipal(nombreProtegidoP, edadProtegidaP);
         obj_principal.setPrivadoPrincipal(nombrePrivadoP, edadPrivadaP);
         
         // gets
         String getPublicoRecupP = obj_principal.getPublicoPrincipal();
         String getProtegidoRecupP = obj_principal.getProtegidoPrincipal();
         String getPrivadoRecupP = obj_principal.getPrivadoPrincipal();
         
         //imprimir
         System.out.println("publico " + getPublicoRecupP);
         System.out.println("protegido " + getProtegidoRecupP);
         System.out.println("privado " + getPrivadoRecupP);
     }
    
     ////////////////////////////////////////////////////////////////////
    ////////////////////////////////////Acceso a la clase llamadora
    ////////nombre
     public void porObjetoLl() {
         //publico
         String objNombrePublicoRecupLl = obj_llamadora.nombrePublicoLl = "Nombre llamadora publico porObjeto";
         int objEdadPublicaRecupLl = obj_llamadora.edadPublicaLl = 130;
         
         //protected
         String objNombreProtegidoRecupLl = obj_llamadora.nombreProtegidoLl = "Nombre llamadora protegido porObjeto";
         int objEdadProtegidaRecupLl = obj_llamadora.edadPublicaLl = 131;
         
         //private
         // No se puede   //String objNombrePrivadoRecupLl = obj_llamadora.nombrePrivadoLl = "Nombre llamadora privado porObjeto";
                          //int objEdadPrivadaRecupLl = obj_llamadora.edadPrivadaLl = 132;
         
         //imprimir
         System.out.println("Publico " + objNombrePublicoRecupLl + objEdadPublicaRecupLl);
         System.out.println("Protegdo " + objNombreProtegidoRecupLl + objEdadProtegidaRecupLl);
         // No se puede //System.out.println("Privado " + objNombrePrivadoRecupLl + objEdadPrivadaRecupLl);
     }
    
    ////////objeto_nombre
     public void porObjetoNombreLl() {
         //publico
         String nombrePublicoRecupLl = obj_llamadora.nombrePublicoLl;
         int edadPublicaRecupLl = obj_llamadora.edadPublicaLl;
         
         //protected
         String nombreProtegidoRecupLl = obj_llamadora.nombreProtegidoLl;
         int edadProtegidaRecupLl = obj_llamadora.edadProtegidaLl;
         
         //private
         // No se puede  // String nombrePrivadoRecupLl = obj_llamadora.nombrePrivadoLl;
                         // int edadPrivadaRecupLl = obj_llamadora.edadPrivadaLl;
         
         //imprimir
         System.out.println("publico " + nombrePublicoRecupLl + edadPublicaRecupLl);
         System.out.println("protegido " + nombreProtegidoRecupLl + edadProtegidaRecupLl);
         //No se puede // System.out.println("privado " + nombrePrivadoRecupLl + edadPrivadaRecupLl);
     }
    
    ////////get_set
      public void porObjetoGetSetLl() {
         // sets
         obj_llamadora.setPublicoLlamadora(nombrePublicoLlinst2, edadPublicaLlinst2);
         obj_llamadora.setProtegidoLlamadora(nombreProtegidoLlinst2, edadProtegidaLlinst2);
        //No se puede // obj_llamadora.setPrivadoLlamadora(nombrePrivadoLlinst, edadPrivadaLlinst);
         
         // gets
         String getPublicoRecupLl = obj_llamadora.getPublicoLlamadora();
         String getProtegidoRecupLl = obj_llamadora.getProtegidoLlamadora();
         //No se puede // String getPrivadoRecupLl = obj_llamadora.getPrivadaLlamadora();
         
         //imprimir
         System.out.println("publico " + getPublicoRecupLl);
         System.out.println("protegido " + getProtegidoRecupLl);
         //No se puede // System.out.println("privado " + getPrivadoRecupLl);
     }
     
     ////////////////////////////////////////////////////////////////////
    ////////////////////////////////////Acceso a la clase mamiferos
    ////////nombre
     public void porObjetoMa() {
         //publico
         String objNombrePublicoRecupMa = obj_mamiferos.nombrePublicoMa = "Nombre mamiferos publico porObjeto";
         int objEdadPublicaRecupMa = obj_mamiferos.edadPublicaMa = 140;
         
         //protected
         String objNombreProtegidoRecupMa = obj_mamiferos.nombreProtegidoMa= "Nombre mamiferos protegido porObjeto";
         int objEdadProtegidaRecupMa = obj_mamiferos.edadPublicaMa= 141;
         
         //private
         //No se puede // String objNombrePrivadoRecupMa = obj_mamiferos.nombrePrivadoMa = "Nombre mamiferos privado porObjeto";
                       //int objEdadPrivadaRecupMa = obj_mamiferos.edadPrivadaMa = 142;
         
         //imprimir
         System.out.println("Publico " + objNombrePublicoRecupMa + objEdadPublicaRecupMa);
         System.out.println("Protegdo " + objNombreProtegidoRecupMa + objEdadProtegidaRecupMa);
         //No se puede // System.out.println("Privado " + objNombrePrivadoRecupMa + objEdadPrivadaRecupMa);
     }
    
    /////////objeto_nombre
     public void porObjetoNombreMa() {
         //publico
         String nombrePublicoRecupMa = obj_mamiferos.nombrePublicoMa;
         int edadPublicaRecupMa = obj_mamiferos.edadPublicaMa;
         
         //protected
         String nombreProtegidoRecupMa = obj_mamiferos.nombreProtegidoMa;
         int edadProtegidaRecupMa = obj_mamiferos.edadProtegidaMa;
         
         //private
         //No se puede // String nombrePrivadoRecupMa = obj_mamiferos.nombrePrivadoMa;
                       // int edadPrivadaRecupMa = obj_mamiferos.edadPrivadaMa;
         
         //imprimir
         System.out.println("publico " + nombrePublicoRecupMa + edadPublicaRecupMa);
         System.out.println("protegido " + nombreProtegidoRecupMa + edadProtegidaRecupMa);
         //No se puede // System.out.println("privado " + nombrePrivadoRecupMa + edadPrivadaRecupMa);
     }
    
    //////////get_set
     public void porObjetoGetSetMa() {   
         // sets
         obj_mamiferos.setPublicoMamiferos(nombrePublicoMainst2, edadPublicaMainst2);
         obj_mamiferos.setProtegidoMamiferos(nombreProtegidoMainst2, edadProtegidaMainst2);
         //No se puede // obj_mamiferos.setPrivadoMamiferos(nombrePrivadoMainst2, edadPrivadaMainst2);
         
         // gets
         String getPublicoRecupMa = obj_mamiferos.getPublicoMamiferos();
         String getProtegidoRecupMa = obj_mamiferos.getProtegidoMamiferos();
         //No se puede // String getPrivadoRecupMa = obj_mamiferos.getPrivadoMamiferos();
         
         //imprimir
         System.out.println("publico " + getPublicoRecupMa);
         System.out.println("protegido " + getProtegidoRecupMa);
         //No se puede // System.out.println("privado " + getPrivadoRecupMa);
     }
    
     
     //////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////Acceso a la clase hija_mamiferos
    ////////nombre
     public void porObjetoMaH() {
         //publico
         String objNombrePublicoRecupMaH = obj_hija_mamiferos.nombrePublicoMaH = "Nombre hija mamiferos publico porObjeto";
         int objEdadPublicaRecupMaH = obj_hija_mamiferos.edadPublicaMaH = 160;
         
         //protected
         String objNombreProtegidoRecupMaH = obj_hija_mamiferos.nombreProtegidoMaH = "Nombre hija mamiferos protegido porObjeto";
         int objEdadProtegidaRecupMaH = obj_hija_mamiferos.edadPublicaMaH = 161;
         
         //private
         //No se puede // String objNombrePrivadoRecupMaH = obj_hija_mamiferos.nombrePrivadoMaH = "Nombre hija mamiferos privado porObjeto";
                       //int objEdadPrivadaRecupMaH = obj_hija_mamiferos.edadPrivadaMaH= 162;
         
         //imprimir
         System.out.println("Publico " + objNombrePublicoRecupMaH + objEdadPublicaRecupMaH);
         System.out.println("Protegdo " + objNombreProtegidoRecupMaH + objEdadProtegidaRecupMaH);
         //No se puede // System.out.println("Privado " + objNombrePrivadoRecupMaH + objEdadPrivadaRecupMaH);
     }
    
    /////////objeto_nombre
     public void porObjetoNombreMaH() {
         //publico
         String nombrePublicoRecupMaH = obj_hija_mamiferos.nombrePublicoMaH;
         int edadPublicaRecupMaH = obj_hija_mamiferos.edadPublicaMaH;
         
         //protected
         String nombreProtegidoRecupMaH = obj_hija_mamiferos.nombreProtegidoMaH;
         int edadProtegidaRecupMaH = obj_hija_mamiferos.edadProtegidaMaH;
         
         //private
         //No se puede // String nombrePrivadoRecupMaH = obj_hija_mamiferos.nombrePrivadoMaH;
                       // int edadPrivadaRecupMaH = obj_hija_mamiferos.edadPrivadaMaH;
         
         //imprimir
         System.out.println("publico " + nombrePublicoRecupMaH + edadPublicaRecupMaH);
         System.out.println("protegido " + nombreProtegidoRecupMaH + edadProtegidaRecupMaH);
         //No se puede // System.out.println("privado " + nombrePrivadoRecupMaH + edadPrivadaRecupMaH);
     }
    
    //////////get_set
     public void porObjetoGetSetMaH() {   
         // sets
         obj_hija_mamiferos.setPublicoMamiferosH(nombrePublicoMaHinst2, edadPublicaMaHinst2);
         obj_hija_mamiferos.setProtegidoMamiferosH(nombreProtegidoMaHinst2, edadProtegidaMaHinst2);
         //No se puede // obj_hija_mamiferos.setPrivadoMamiferosH(nombrePrivadoMaHinst2, edadPrivadaMaHinst2);
         
         // gets
         String getPublicoRecupMaH = obj_hija_mamiferos.getPublicoMamiferosH();
         String getProtegidoRecupMaH = obj_hija_mamiferos.getProtegidoMamiferosH();
         //No se puede // String getPrivadoRecupMaH = obj_hija_mamiferos.getPrivadoMamiferosH();
         
         //imprimir
         System.out.println("publico " + getPublicoRecupMaH);
         System.out.println("protegido " + getProtegidoRecupMaH);
         //No se puede // System.out.println("privado " + getPrivadoRecupMaH);
     }
}
