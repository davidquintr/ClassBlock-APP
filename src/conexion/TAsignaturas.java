package conexion;

import classblock.Asignatura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.Conexion;

public class TAsignaturas {
    private Connection con = Conexion.getConexion();
    private Statement stm;
    private ResultSet tabla;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    
    public void cargarAsignaturas(int idUsuario){
        try {
            //Obtenemos los datos desde la base de datos a través de la conexión
            stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            tabla = stm.executeQuery("Select * from Asignatura WHERE idUsuario='"+idUsuario+"'");
            asignaturas.clear();
            /*  Mapeamos los datos de la base de datos a nuestro objeto Usuario */
            for(int i = 1; tabla.next(); i++){
                int idAsignatura = tabla.getInt("idAsignatura");
                String nombre = tabla.getString("nombre");
                String descripcion = tabla.getString("descripcion");
                String docente = tabla.getString("docente");
                String linkAsig = tabla.getString("linkAsig");
                
                Asignatura a = new Asignatura();
                a.setIdAsignatura(idAsignatura);
                a.setNombre(nombre);
                a.setDescripcion(descripcion);
                a.setDocente(docente);
                a.setLinkAsig(linkAsig);
                a.setIdUsuario(idUsuario);
                
                asignaturas.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void anadirAsignatura(String nombre, String docente, String linkAsig, String descripcion, int idUsuario){
        try {
            tabla = stm.executeQuery("Select * from Asignatura WHERE idUsuario='"+idUsuario+"'");
            tabla.moveToInsertRow();
            tabla.updateString("nombre", nombre);
            tabla.updateString("descripcion", descripcion);
            tabla.updateString("docente", docente);
            tabla.updateString("linkAsig", linkAsig);
            tabla.updateInt("idUsuario", idUsuario);
            tabla.insertRow();
            
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean eliminarAsignatura(int idAsignatura) {
        try {
            tabla = stm.executeQuery("SELECT * from Asignatura WHERE idAsignatura='"+idAsignatura+"'");
            tabla.next();
            tabla.deleteRow();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void editarAsignatura(String nombre, String docente, String linkAsig, String descripcion, int idAsignatura) {
        try {
            tabla = stm.executeQuery("SELECT * from Asignatura WHERE idAsignatura='"+idAsignatura+"'");
            tabla.next();
            tabla.updateString("nombre", nombre);
            tabla.updateString("descripcion", descripcion);
            tabla.updateString("docente", docente);
            tabla.updateString("linkAsig", linkAsig);
            tabla.updateRow();
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

}
