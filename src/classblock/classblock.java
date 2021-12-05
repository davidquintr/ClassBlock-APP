/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classblock;

import classblock.Aplicacion;
import javax.swing.JFrame;
import conexion.TUsuario;
import java.util.Calendar;
import java.util.Date;
import myclassblockinterface.login;


/**
 *
 * @author David
 */
public class classblock {

    public static void main(String[] args) {
        login log = new login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }
    
}
