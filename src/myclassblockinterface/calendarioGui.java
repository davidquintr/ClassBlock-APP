/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclassblockinterface;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class calendarioGui extends javax.swing.JInternalFrame {

    principalGui gui;
    Component component[];
    Color colorFondo = new Color(0,102,153);
    Color colorRed = new Color(207,152,149);
    Color colorGreen = new Color(160,207,149);
    ArrayList <JButton> botones = new ArrayList<>();
    
    public calendarioGui(principalGui gui) {
        initComponents();
        this.gui = gui;
        jPanel1 = jc.getDayChooser().getDayPanel();
        this.component = jPanel1.getComponents();
        jc.setCalendar(Calendar.getInstance());
        jc.setLocale(Locale.US);
        jc.addPropertyChangeListener("calendar", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                checkCalendar();
            }
        });
    }

    public void checkCalendar(){
        panelContenedor.removeAll();
        botones.clear();
        int selYear = jc.getDate().getYear() + 1900;
        int selMes = jc.getDate().getMonth() + 1;
        int selDay = jc.getDate().getDate();
        
        int fYear; int fMes; int fDay; int brecha;
        
        Calendar temp;
        int flimit = gui.app.getUsuario().getAsignaturas().size();
        int slimit;
        labelActividades.setText("Actividades para: " + selDay + "/" + selMes + "/" + selYear);
        
        for(int i = 0 ; i < flimit ; i++){
            slimit = gui.app.getUsuario().getAsignaturas().get(i).getActividades().size();
            for (int j = 0; j < slimit; j++) {
                temp = gui.app.getUsuario().getAsignaturas().get(i).getActividades().get(j).getFechaDeEntrega();
                fMes = temp.getTime().getMonth() + 1;
                fYear = temp.getTime().getYear() + 1900;
                fDay = temp.getTime().getDate();
                brecha = LocalDate.of(selYear, selMes, selDay).with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().getValue();
                if(fMes == selMes && fYear == selYear){
                    component[brecha + 6 + fDay].setBackground(colorFondo);
                    component[brecha + 6 + fDay].setForeground(Color.white);
                    crearBoton(i,j,selDay);
                }
            }
        }
    }
    
    public void crearBoton(int i, int j,int dia){
        JButton jb = new JButton();
            if(dia == gui.app.getUsuario().getAsignaturas().get(i).getActividades().get(j).getFechaDeEntrega().getTime().getDate()){
                String tituloAct = gui.app.getUsuario().getAsignaturas().get(i).getActividades().get(j).getTitulo();
                String tituloAsi = gui.app.getUsuario().getAsignaturas().get(i).getNombre();
                jb.setText(tituloAsi + " - " + tituloAct);
                jb.setForeground(Color.white);
                if(gui.app.getUsuario().getAsignaturas().get(i).getActividades().get(j).getEstadoDeEntrega().equals("Entregado")){
                    jb.setBackground(colorGreen);
                }else{
                    jb.setBackground(colorRed);
                }
                panelContenedor.add(jb);
                botones.add(jb);
        }
        panelContenedor.updateUI();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jc = new com.toedter.calendar.JCalendar();
        labelActividades = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("Calendario");

        panelContenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelContenedor.setLayout(new java.awt.GridLayout(6, 2, 0, 3));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jc.setBackground(new java.awt.Color(255, 255, 255));
        jc.setDate(new java.util.Date(1638316206000L));
        jc.setSundayForeground(new java.awt.Color(0, 0, 0));
        jc.setWeekdayForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jc, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jc, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelActividades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelActividades.setText("Actividades para el día: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Calendario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelActividades)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelActividades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar jc;
    private javax.swing.JLabel labelActividades;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables

    private void Switch(String dia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
