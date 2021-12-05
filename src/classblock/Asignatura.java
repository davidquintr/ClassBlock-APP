package classblock;
import conexion.TActividades;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:49 p. m.
 */
public class Asignatura {

        private int idAsignatura;
	private String descripcion;
	private String docente;
	private String linkAsig;
	private String nombre;
	private TActividades tActividades = new TActividades();
        private int idUsuario;
	public Asignatura(){

	}

	public void finalize() throws Throwable {
            
	}
        
	/**
	 * 
	 * @param calificacionMaxima
	 * @param calificacionObtenida
	 * @param descripcion
	 * @param estadoDeEntrega
	 * @param fechaDeEntrega
	 * @param tipoDeActividad
	 * @param titulo
	 */
	public void agregarActividad(float calificacionObtenida, float calificacionMaxima, String descripcion, String estadoDeEntrega, Calendar fechaDeEntrega, String tipoDeActividad, String titulo){
            tActividades.anadirActividad(calificacionObtenida, calificacionMaxima, descripcion, estadoDeEntrega, fechaDeEntrega, tipoDeActividad, titulo, idAsignatura);
            cargarActividades();
	}
        
        public void cargarActividades(){
            tActividades.cargarActividades(idAsignatura);
        }
        
        public void editarActividad(float calificacionObtenida, float calificacionMaxima, String descripcion, String estadoDeEntrega, Calendar fechaDeEntrega, String tipoDeActividad, String titulo, int idActividad){
            tActividades.editarActividad(calificacionObtenida, calificacionMaxima, descripcion, estadoDeEntrega, fechaDeEntrega, tipoDeActividad, titulo, idActividad);
            cargarActividades();
        }

        public boolean eliminarActividad(int idActividad){
            boolean eliminada = tActividades.eliminarActividad(idActividad);
            if(eliminada){
                cargarActividades();
            }
            return eliminada;
        }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getLinkAsig() {
        return linkAsig;
    }

    public void setLinkAsig(String linkAsig) {
        this.linkAsig = linkAsig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividad> getActividades() {
        return tActividades.getActividades();
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}//end Asignatura