
package myclassblockinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class agregarAsignatura extends javax.swing.JInternalFrame {

    String asignatura = "";
    String maestro = "";
    String enlace = "";
    String descripcion = "";
    
    
    principalGui gui;
    
    
    public agregarAsignatura(principalGui gui) {
        initComponents();
        this.gui = gui;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Asignaturas: agregar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Asignaturas: agregar");

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(tfNombreasig)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(tfLink)
                            .addComponent(tfMaestro)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHechoActionPerformed
        if(!tfNombreasig.getText().isEmpty() && !tfMaestro.getText().isEmpty()){
            boolean repetido = false;
            
            for (int i = 0; i < gui.actividades.size(); i++) {
                if(gui.app.getUsuario().getAsignaturas().get(i).getNombre().equals(tfNombreasig.getText())){
                    repetido = true;
                    break;
                }
                repetido = false;
            }
            if(!repetido){
                if(taDescripcion.getText().isBlank())
                    taDescripcion.setText("Sin descripción");
                if(tfLink.getText().isBlank())
                    tfLink.setText("Sin enlace");

                asignatura = tfNombreasig.getText();
                maestro = tfMaestro.getText();
                enlace = tfLink.getText();
                descripcion = taDescripcion.getText();
                gui.app.getUsuario().agregarAsignatura(asignatura, maestro, enlace, descripcion);
                JOptionPane.showMessageDialog(null, "Asignatura agregada exitosamente", "Asignaturas: agregar" ,1);
                gui.asig.actualizarGui();
                gui.actividades.forEach(actividad -> actividad.actualizar());
                clearFields();
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "¡No puedes añadir una Asignatura con el mismo nombre!", "Asignaturas: agregar" ,0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Tienes que llenar todos los campos", "Asignaturas: agregar" ,1);
        }
        
    }//GEN-LAST:event_jbHechoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        
        this.setVisible(false);

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void clearFields(){
        tfNombreasig.setText("");
        tfMaestro.setText("");
        tfLink.setText("");
        taDescripcion.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbHecho;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfMaestro;
    private javax.swing.JTextField tfNombreasig;
    // End of variables declaration//GEN-END:variables
}
