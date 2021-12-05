package classblock;
import classblock.Asignatura;
import conexion.TAsignaturas;
import java.util.ArrayList;

public class Usuario {

    private boolean autenticado;
    private int idUsuario;
    private String clave;
    private String nombre;
    private TAsignaturas tAsignaturas = new TAsignaturas();


    public void finalize() throws Throwable {

    }
    /**
     * 
     * @param nombre
     * @param docente
     * @param linkAsig
     * @param descripcion
     */
    public void agregarAsignatura(String nombre, String docente, String linkAsig, String descripcion){
        tAsignaturas.anadirAsignatura(nombre, docente, linkAsig, descripcion, idUsuario);
        cargarAsignaturas();
    }
    
    public void editarAsignatura(String nombre, String docente, String linkAsig, String descripcion, int idAsignatura){
        tAsignaturas.editarAsignatura(nombre, docente, linkAsig, descripcion, idAsignatura);
        cargarAsignaturas();
    }

    public boolean eliminarAsignatura(int idAsignatura){
        boolean eliminada = tAsignaturas.eliminarAsignatura(idAsignatura);
        if(eliminada){
            cargarAsignaturas();
        }
        return eliminada;
    }

    public void mostrarAsignaturas(){
        System.out.println("Asignaturas: \n");
        for (Asignatura asig: getAsignaturas()){
            System.out.println("Nombre: " + asig.getNombre() + 
                               "\nDescripción: " + asig.getDescripcion() + 
                               "\nDocente: " + asig.getDocente() + 
                               "\nLink a la asignatura: " + asig.getLinkAsig() + "\n------------------");
        }
    }
    
    public void cargarAsignaturas(){
        tAsignaturas.cargarAsignaturas(idUsuario);
    }


    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return tAsignaturas.getAsignaturas();

    }



    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}//end Usuario