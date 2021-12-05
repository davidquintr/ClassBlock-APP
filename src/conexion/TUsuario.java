package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import classblock.Usuario;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import javax.swing.JOptionPane;

public class TUsuario {
    private Connection con = Conexion.getConexion();
    private Statement stm;
    private ResultSet tabla;
    private Usuario usuario;
    
    public boolean buscarUsuario(String nombreUsuario){
        try { 
            stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            tabla = stm.executeQuery("Select * from Usuario WHERE nombre='"+nombreUsuario+"'");
            return tabla.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(TUsuario.class.getName()).log(Level.SEVERE, null, ex);            
        } catch (NullPointerException ex){
            return true;
        }
        return false; 
    }
    
    public boolean validarUsuario(String claveUsuario){
        
        try { 
            int id = tabla.getInt("idUsuario");
            String nombre = tabla.getString("nombre");
            String clave = tabla.getString("clave");
            if(claveUsuario.equals(clave)){
                Usuario u = new Usuario();
                u.setIdUsuario(id);
                u.setNombre(nombre);
                u.setClave(clave);
                this.setUsuario(u);
                return true;
            }
        } catch (SQLServerException ex) {
            return false;
        }catch (SQLException ex) {
            Logger.getLogger(TUsuario.class.getName()).log(Level.SEVERE, null, ex);           
        } catch(NullPointerException ex){
            return false;
        }
        
        return false;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public void anadirUsuario(String nombre, String clave){
        try {
            tabla.moveToInsertRow();
            tabla.updateString("nombre", nombre);
            tabla.updateString("clave", clave);
            tabla.insertRow();
            
        } catch (SQLException ex) {
            Logger.getLogger(TUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex){
            
        }
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
