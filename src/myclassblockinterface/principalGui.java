package myclassblockinterface;

import classblock.Aplicacion;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class principalGui extends javax.swing.JFrame {   
        Aplicacion app;
        asignaturasGui asig = new asignaturasGui(this);
        agregarAsignatura addAsig = new agregarAsignatura(this);
        ArrayList <showActivities> actividades = new ArrayList<>();
        agregarActividad addAct = new agregarActividad(this);
        editarAsignatura editAsig = new editarAsignatura(this);
        editarActividad editAct = new editarActividad(this);
        calendarioGui calendar = new calendarioGui(this);
        acercaDe acerca = new acercaDe();
        login log;

    public principalGui(login log) {
        initComponents();
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        Jdeskp.add(asig);
        Jdeskp.add(addAsig);
        Jdeskp.add(editAsig);
        Jdeskp.add(addAct);
        Jdeskp.add(editAct);
        Jdeskp.add(acerca);
        this.log = log;
        actividades.forEach(actividad -> actividad.actualizar());
        
        Jdeskp.add(calendar);
        
    }
    public void asignar(showActivities act){
        try{
            Jdeskp.add(act);
        }catch(java.lang.IllegalArgumentException e){}
    }
    
    public void asignarAct(detalleActividad detAct){
        try{
            Jdeskp.add(detAct);
        }catch(java.lang.IllegalArgumentException e){}

    }
    
    
    public void setApp(Aplicacion app) {
        this.app = app;
        user.setText(app.getUsuario().getNombre());
    }
    
    public agregarActividad getAddAct() {
        return addAct;
    }   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jdeskp = new javax.swing.JDesktopPane();
        user = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jmOpciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClassBlock");
        setIconImage(getIconImage());
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        Jdeskp.setBackground(new java.awt.Color(117, 172, 200));
        Jdeskp.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                JdeskpComponentHidden(evt);
            }
        });

        user.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon usuario.png"))); // NOI18N
        user.setText("Username");

        Jdeskp.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JdeskpLayout = new javax.swing.GroupLayout(Jdeskp);
        Jdeskp.setLayout(JdeskpLayout);
        JdeskpLayout.setHorizontalGroup(
            JdeskpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JdeskpLayout.createSequentialGroup()
                .addContainerGap(522, Short.MAX_VALUE)
                .addComponent(user)
                .addContainerGap())
        );
        JdeskpLayout.setVerticalGroup(
            JdeskpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JdeskpLayout.createSequentialGroup()
                .addContainerGap(465, Short.MAX_VALUE)
                .addComponent(user)
                .addContainerGap())
        );

        jmOpciones.setText("Opciones");

        jMenuItem2.setText("Asignaturas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmOpciones.add(jMenuItem2);

        jMenuItem3.setText("Calendario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmOpciones.add(jMenuItem3);

        jMenuBar.add(jmOpciones);

        jMenu1.setText("Cuenta");

        jMenuItem6.setText("Cerrar Sesión");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar.add(jMenu1);

        jmAyuda.setText("Ayuda");

        jMenuItem5.setText("Acerca de");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmAyuda.add(jMenuItem5);

        jMenuBar.add(jmAyuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdeskp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdeskp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        asig.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        calendar.setVisible(true);
        calendar.requestFocus();
        calendar.checkCalendar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void JdeskpComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JdeskpComponentHidden

    }//GEN-LAST:event_JdeskpComponentHidden

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        if(JOptionPane.showConfirmDialog(null, "¿Desea cerrar la sesión?","Cerrar Sesión",YES_NO_OPTION,1) == 0){
            JOptionPane.showMessageDialog(null, "La sesión ha finalizado, inicie nuevamente", "Cerrar Sesión",0);
            this.setVisible(false);
            log.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        acerca.setVisible(true);
        acerca.requestFocus();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("resources/classBlockicon.png"));
        return retValue;
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Jdeskp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
