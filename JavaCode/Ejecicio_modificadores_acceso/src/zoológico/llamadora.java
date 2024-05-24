/*

 */
package zoológico;

/**
 *
 * @author Nicolás
 */
public class llamadora {
    public String nombrePublicoLl = "Nombre llamadora publico gets_sets ";
    public int edadPublicaLl = 40;
    protected String nombreProtegidoLl = "Nombre llamadora protegido gets_sets ";
    protected int edadProtegidaLl = 41;
    private String nombrePrivadoLl = "Nombre llamadora privado gets_sets ";
    private int edadPrivadaLl = 42;

    public llamadora(String VnombrePublicoLl, int VedadPublicaLl, String VnombreProtegidoLl, int VedadProtegidaLl, String VnombrePrivadoLl, int VedadPrivadaLl) {
        this.nombrePublicoLl = VnombrePublicoLl;
        this.edadPublicaLl = VedadPublicaLl;
        this.nombreProtegidoLl = VnombreProtegidoLl;
        this.edadProtegidaLl = VedadProtegidaLl;
        this.nombrePrivadoLl = VnombrePrivadoLl;
        this.edadPrivadaLl = VedadPrivadaLl;
    }
    
    //sets
    public void setPublicoLlamadora(String nombrePublicoLlT,int edadPublicaLlT) {
        nombrePublicoLl = nombrePublicoLlT;
        edadPublicaLl = edadPublicaLlT;
    }
    
    protected void setProtegidoLlamadora(String nombreProtegidoLlT, int edadProtegidaLlT) {
        nombreProtegidoLl = nombreProtegidoLlT;
        edadProtegidaLl = edadProtegidaLlT;
    }
    
    private void setPrivadoLlamadora(String nombrePrivadoLlT, int edadPrivadaLlT) {
        nombrePrivadoLl = nombrePrivadoLlT;
        edadPrivadaLl = edadPrivadaLlT;
    }
    
     //gets

    public String getPublicoLlamadora() {
        return nombrePublicoLl + edadPublicaLl;
    }

    protected String getProtegidoLlamadora() {
        return nombreProtegidoLl + edadProtegidaLl;
    }

    private String getPrivadoLlamadora() {
        return nombrePrivadoLl + edadPrivadaLl;
    }  
}
