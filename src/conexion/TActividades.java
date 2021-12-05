package conexion;

import classblock.Actividad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.Conexion;
import java.sql.Date;
import java.util.Calendar;

public class TActividades {
    private Connection con = Conexion.getConexion();
    private Statement stm;
    private ResultSet tabla;
    private ArrayList<Actividad> actividades = new ArrayList<>();
    
    public void cargarActividades(int idAsignatura){
        try {
            //Obtenemos los datos desde la base de datos a través de la conexión
            stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            tabla = stm.executeQuery("Select * from Actividad WHERE idAsignatura='"+idAsignatura+"'");
            getActividades().clear();
            /*  Mapeamos los datos de la base de datos a nuestro objeto Usuario */
            for(int i = 1; tabla.next(); i++){
                int idActividad = tabla.getInt("idActividad");
                String titulo = tabla.getString("titulo");
                String descripcion = tabla.getString("descripcion");
                Date fecha = tabla.getDate("fechaDeEntrega");
                Calendar fechaDeEntrega = Calendar.getInstance();
                fechaDeEntrega.setTime(fecha);
                String estadoDeEntrega = tabla.getString("estadoDeEntrega");
                String tipoDeActividad = tabla.getString("tipoDeActividad");
                float calificacionMaxima = tabla.getFloat("calificacionMaxima");
                float calificacionObtenida = tabla.getFloat("calificacionObtenida");
                
                Actividad a = new Actividad();
                a.setIdActividad(idActividad);
                a.setTitulo(titulo);
                a.setDescripcion(descripcion);
                a.setFechaDeEntrega(fechaDeEntrega);
                a.setEstadoDeEntrega(estadoDeEntrega);
                a.setTipoDeActividad(tipoDeActividad);
                a.setCalificacionMaxima(calificacionMaxima);
                a.setCalificacionObtenida(calificacionObtenida);
                a.setIdAsignatura(idAsignatura);
                getActividades().add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void anadirActividad(float calificacionObtenida, float calificacionMaxima, String descripcion, String estadoDeEntrega, Calendar fechaDeEntrega, String tipoDeActividad, String titulo, int idAsignatura){
        int anio = fechaDeEntrega.get(fechaDeEntrega.YEAR)-1900;
        int mes = fechaDeEntrega.get(fechaDeEntrega.MONTH);
        int dia = fechaDeEntrega.get(fechaDeEntrega.DATE);
        Date fecha = new Date(anio, mes, dia);
        try {
            tabla.moveToInsertRow();
            tabla.updateString("titulo", titulo);
            tabla.updateString("descripcion", descripcion);
            tabla.updateDate("fechaDeEntrega", fecha);
            tabla.updateString("estadoDeEntrega", estadoDeEntrega);
            tabla.updateString("tipoDeActividad", tipoDeActividad);
            tabla.updateFloat("calificacionMaxima", calificacionMaxima);
            tabla.updateFloat("CalificacionObtenida", calificacionObtenida);
            tabla.updateInt("idAsignatura", idAsignatura);
            tabla.insertRow();
            
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public boolean eliminarActividad(int idActividad) {
        try {
            tabla = stm.executeQuery("SELECT * from Actividad WHERE idActividad='"+idActividad+"'");
            tabla.next();
            tabla.deleteRow();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void editarActividad(float calificacionObtenida, float calificacionMaxima, String descripcion, String estadoDeEntrega, Calendar fechaDeEntrega, String tipoDeActividad, String titulo, int idActividad) {
        int anio = fechaDeEntrega.get(fechaDeEntrega.YEAR)-1900;
        int mes = fechaDeEntrega.get(fechaDeEntrega.MONTH);
        int dia = fechaDeEntrega.get(fechaDeEntrega.DATE);
        Date fecha = new Date(anio, mes, dia);
        try {
            tabla = stm.executeQuery("SELECT * from Actividad WHERE idActividad='"+idActividad+"'");
            tabla.next();
            tabla.updateString("titulo", titulo);
            tabla.updateString("descripcion", descripcion);
            tabla.updateDate("fechaDeEntrega", fecha);
            tabla.updateString("estadoDeEntrega", estadoDeEntrega);
            tabla.updateString("tipoDeActividad", tipoDeActividad);
            tabla.updateFloat("calificacionMaxima", calificacionMaxima);
            tabla.updateFloat("CalificacionObtenida", calificacionObtenida);
            tabla.updateRow();
        } catch (SQLException ex) {
            Logger.getLogger(TAsignaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setAsignaturas(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
}