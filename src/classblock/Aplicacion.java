package classblock;
import java.util.Calendar;
import conexion.TUsuario;

/**
 * Pantalla principal.
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:52 p. m.
 */
public class Aplicacion {

    private String autores;
    private Calendar fecha;
    private float version;
    private TUsuario tUsuario = new TUsuario();

    public Aplicacion(){

    }

    public void finalize() throws Throwable {

    }
  
    public boolean crearUsuario(String nombre, String clave){
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setClave(clave);
        boolean existe = tUsuario.buscarUsuario(nombre);
        if(!existe){
            registrarUsuario(u);
            validarUsuario(nombre, clave);
            return true;
        }
        return false;

    }

    public void mostrarAsignaturas(){
        getUsuario().mostrarAsignaturas();
    }

    public void registrarUsuario(Usuario u){
        tUsuario.anadirUsuario(u.getNombre(), u.getClave());
    }

    /**
     * 
     * @param nombre
     * @param clave
     */
    public boolean validarUsuario(String nombre, String clave){
        boolean encontrado = tUsuario.buscarUsuario(nombre);
        boolean validado = tUsuario.validarUsuario(clave);

        if(encontrado && validado){
            this.getUsuario().setAutenticado(true);
            this.getUsuario().cargarAsignaturas();
            return true;
        }
        if(!encontrado){
            return false;
        } if(encontrado && !validado){
            return false;
        }
        return false;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public Usuario getUsuario() {
        return tUsuario.getUsuario();
    }

}//end Aplicacion