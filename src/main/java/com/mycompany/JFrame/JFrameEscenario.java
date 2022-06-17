package com.mycompany.JFrame;

import com.mycompany.ControlJuego.mover;
import com.mycompany.Escenarios.CrearEscenarios;
import javax.swing.JButton;


public class JFrameEscenario extends javax.swing.JFrame {

    private int opcion;
    private CrearEscenarios escenario;
    private static JButton[][] MatrizCreada;
    private static JButton botonSeleccionadoA;
    private static boolean moverA;
    private static boolean atacarA;
    private static int vehiculoSeleccionado;
    private static int Filass;
    
    public JFrameEscenario(int opcion, int vehiculoSeleccionado) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.opcion = opcion;
        escenario = new CrearEscenarios();
        escenario.generarMatriz(opcion);
        this.vehiculoSeleccionado = vehiculoSeleccionado;
    }

    public static int getVehiculoSeleccionado() {
        return vehiculoSeleccionado;
    }

    public static void setVehiculoSeleccionado(int vehiculoSeleccionado) {
        JFrameEscenario.vehiculoSeleccionado = vehiculoSeleccionado;
    }

    
    public static JButton[][] getMatrizCreada() {
        return MatrizCreada;
    }

    public static void setMatrizCreada(JButton[][] MatrizCreada) {
        JFrameEscenario.MatrizCreada = MatrizCreada;
    }

    public static JButton getBotonSeleccionadoA() {
        return botonSeleccionadoA;
    }

    public static void setBotonSeleccionadoA(JButton botonSeleccionadoA) {
        JFrameEscenario.botonSeleccionadoA = botonSeleccionadoA;
    }

    public static boolean isMoverA() {
        return moverA;
    }

    public static void setMoverA(boolean moverA) {
        JFrameEscenario.moverA = moverA;
    }

    public static boolean isAtacarA() {
        return atacarA;
    }

    public static void setAtacarA(boolean atacarA) {
        JFrameEscenario.atacarA = atacarA;
    }

    public static int getFilass() {
        return Filass;
    }

    public static void setFilass(int Filass) {
        JFrameEscenario.Filass = Filass;
    }

    

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEscenario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Escenario");

        jButton1.setText("Cambiar vehiculo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atacar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Turno:");

        jButton4.setText("Rendirse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscenario, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(11, 11, 11)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       mover moverVehiculo = new mover();
       moverVehiculo.Mover(getBotonSeleccionadoA(), moverA, vehiculoSeleccionado);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrameCambiarVehiculo cambiar = new JFrameCambiarVehiculo();
        cambiar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblEscenario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
}
