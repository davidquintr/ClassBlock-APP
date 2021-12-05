package classblock;
import java.util.Calendar;

/**
 * Tareas o pruebas que el estudiante puede realizar.
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:51 p. m.
 */
public class Actividad {
        
        private int idActividad;
	private float calificacionMaxima;
	private float calificacionObtenida;
	private String descripcion;
	private String estadoDeEntrega;
	private Calendar fechaDeEntrega;
	private String tipoDeActividad;
	private String titulo;
        private int idAsignatura;
	private Asignatura asignatura;

	public Actividad(){

	}

	public void finalize() throws Throwable {

	}
	public void cambiarEstadoEntrega(){
            
	}

	public void editarActividad(){

	}

	public void mostrarDetallesActividad(){
            
	}

    public float getCalificacionMaxima() {
        return calificacionMaxima;
    }

    public void setCalificacionMaxima(float calificacionMaxima) {
        this.calificacionMaxima = calificacionMaxima;
    }

    public float getCalificacionObtenida() {
        return calificacionObtenida;
    }

    public void setCalificacionObtenida(float calificacionObtenida) {
        this.calificacionObtenida = calificacionObtenida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoDeEntrega() {
        return estadoDeEntrega;
    }

    public void setEstadoDeEntrega(String estadoDeEntrega) {
        this.estadoDeEntrega = estadoDeEntrega;
    }

    public Calendar getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Calendar fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public String getTipoDeActividad() {
        return tipoDeActividad;
    }

    public void setTipoDeActividad(String tipoDeActividad) {
        this.tipoDeActividad = tipoDeActividad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
}//end Actividad