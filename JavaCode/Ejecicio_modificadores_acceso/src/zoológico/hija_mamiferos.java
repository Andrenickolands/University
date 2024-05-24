/*

 */
package zoológico;

/**
 *
 * @author Nicolás
 */
public class hija_mamiferos extends mamiferos {
    
    public String nombrePublicoMaH = "Nombre hija publico gets_sets ";
    public int edadPublicaMaH = 80;
    protected String nombreProtegidoMaH = "Nombre hija mamifero protegido gets_sets ";
    protected int edadProtegidaMaH = 81;
    private String nombrePrivadoMaH = "Nombre hija mamifero privado gets_sets ";
    private int edadPrivadaMaH = 82;
    

   
    public hija_mamiferos(String VnombrePublicoMaH, int VedadPublicaMaH, String VnombreProtegidoMaH, int VedadProtegidaMaH, String VnombrePrivadoMaH, int VedadPrivadaMaH, String VnombrePublicoMa, int VedadPublicaMa, String VnombreProtegidoMa, int VedadProtegidaMa, String VnombrePrivadoMa, int VedadPrivadaMa) {
        super(VnombrePublicoMa, VedadPublicaMa, VnombreProtegidoMa, VedadProtegidaMa, VnombrePrivadoMa, VedadPrivadaMa);
        this.nombrePublicoMaH = VnombrePublicoMaH;
        this.edadPublicaMaH = VedadPublicaMaH;
        this.nombreProtegidoMaH = VnombreProtegidoMaH;
        this.edadProtegidaMaH = VedadProtegidaMaH;
        this.nombrePrivadoMaH = VnombrePrivadoMaH;
        this.edadPrivadaMaH = VedadPrivadaMaH;  
    }
    
    //sets
    public void setPublicoMamiferosH(String nombrePublicoMaHT,int edadPublicaMaHT) {
        nombrePublicoMaH = nombrePublicoMaHT;
        edadPublicaMaH = edadPublicaMaHT;
    }
    
    protected void setProtegidoMamiferosH(String nombreProtegidoMaHT, int edadProtegidaMaHT) {
        nombreProtegidoMaH = nombreProtegidoMaHT;
        edadProtegidaMaH = edadProtegidaMaHT;
    }
    
    private void setPrivadoMamiferosH(String nombrePrivadoMaHT, int edadPrivadaMaHT) {
        nombrePrivadoMaH = nombrePrivadoMaHT;
        edadPrivadaMaH = edadPrivadaMaHT;
    }
    
     //gets

    public String getPublicoMamiferosH() {
        return nombrePublicoMaH + edadPublicaMaH;
    }

    protected String getProtegidoMamiferosH() {
        return nombreProtegidoMaH + edadProtegidaMaH;
    }

    private String getPrivadoMamiferosH() {
        return nombrePrivadoMaH + edadPrivadaMaH;
    }    
}
