package conexion;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion
{
       public static Connection cn=null; 
    
        private String driver;
        private String url;
        private String user;
        private String password;
        

    private Conexion(){
           try {
               driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
               url="jdbc:sqlserver://localhost:1433;databasename=ClassBlock;";
               user="user=sa;";
               password="password=1234;";

               Class.forName(driver);
               cn = DriverManager.getConnection(url+user+password);
               
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
           }catch (SQLServerException ex){
               JOptionPane.showMessageDialog(null, "Sin conexión al servidor", "Conexión", 0);
           } catch (SQLException ex) {
               Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex); 
           }
    }
                                
    public static Connection getConexion(){
        if(cn==null){
            new Conexion();              
        }
 
        return cn;
    }
    
    // Cierra la conexión si está abierta
    public void cerrar() throws SQLException
    {
        if(cn!=null){
            cn.close();
        }            
    }
}
