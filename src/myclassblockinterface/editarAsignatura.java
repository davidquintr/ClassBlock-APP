
package myclassblockinterface;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author David
 */
public class editarAsignatura extends javax.swing.JInternalFrame {

    String asignatura = null;
    String maestro = null;
    String enlace = null;
    String descripcion = null;
    principalGui gui;
    int idAsignatura;
    
    public editarAsignatura(principalGui gui) {
        initComponents();
        this.gui = gui;
    }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombreasig = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMaestro = new javax.swing.JTextField();
        tfLink = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        jbHecho = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbCancelar1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("Asignaturas: editar");
        setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTitulo.setText("Asignaturas: editar");

        jLabel2.setText("Nombre de la asignatura");

        jLabel3.setText("Nombre del maestro");

        jLabel4.setText("Enlace a la asignatura");

        jLabel5.setText("Descripción de la asginatura");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/quarterBanner.png"))); // NOI18N

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        jScrollPane1.setViewportView(taDescripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombreasig)
                            .addComponent(tfLink)
                            .addComponent(tfMaestro)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreasig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jbHecho.setBackground(new java.awt.Color(0, 102, 153));
        jbHecho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbHecho.setForeground(new java.awt.Color(255, 255, 255));
        jbHecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hechoIcon.png"))); // NOI18N
        jbHecho.setText("Hecho");
        jbHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHechoActionPerformed(evt);
            }
        });

        jbCancelar.setBackground(new java.awt.Color(0, 102, 153));
        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancelarBoton.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbCancelar1.setBackground(new java.awt.Color(0, 102, 153));
        jbCancelar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/borrarIcon.png"))); // NOI18N
        jbCancelar1.setText("Eliminar");
        jbCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancelar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jbHecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHechoActionPerformed
        if(!tfNombreasig.getText().isEmpty() && !tfMaestro.getText().isEmpty()){
            if(taDescripcion.getText().isBlank())
                taDescripcion.setText("Sin descripción");
            if(tfLink.getText().isBlank())
                tfLink.setText("Sin enlace");
            
            asignatura = tfNombreasig.getText();
            maestro = tfMaestro.getText();
            enlace = tfLink.getText();
            descripcion = taDescripcion.getText();
            int id = gui.app.getUsuario().getAsignaturas().get(idAsignatura).getIdAsignatura();
            gui.app.getUsuario().editarAsignatura(asignatura, maestro, enlace, descripcion, id);
            JOptionPane.showMessageDialog(null, "Asignatura editada exitosamente", "Asignaturas: agregar" ,1);
            gui.asig.actualizarGui();
            clearFields();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Tienes que llenar todos los campos", "Asignaturas: agregar" ,1);
        }
        
    }//GEN-LAST:event_jbHechoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar1ActionPerformed
        int id = gui.app.getUsuario().getAsignaturas().get(idAsignatura).getIdAsignatura();
        if(JOptionPane.showConfirmDialog(null, "¿Desea eliminar esta asignatura?\nEsta acción es permanente", "Eliminar Asignatura",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.OK_OPTION){
            gui.app.getUsuario().eliminarAsignatura(id);
            JOptionPane.showMessageDialog(null, "Asignatura eliminada", "Eliminar Asignatura",JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
            gui.asig.actualizarGui();
        }
        
        
    }//GEN-LAST:event_jbCancelar1ActionPerformed

    public void colocarDatos(){
        tfNombreasig.setText(this.asignatura);
        tfMaestro.setText(this.maestro);
        tfLink.setText(this.enlace);
        taDescripcion.setText(this.descripcion);
        labelTitulo.setText(this.asignatura + ": editar");
        this.setTitle(this.asignatura + ": editar");
        
    }
    
    private void clearFields(){
        tfNombreasig.setText("");
        tfMaestro.setText("");
        tfLink.setText("");
        taDescripcion.setText("");
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelar1;
    private javax.swing.JButton jbHecho;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfMaestro;
    private javax.swing.JTextField tfNombreasig;
    // End of variables declaration//GEN-END:variables
}
