/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd.vistas.modulo.compraVenta;

import java.awt.Color;
import javax.swing.JOptionPane;
import proyectobd.vistas.modulo.compraVenta.CompraPiezaFrame;

/**
 *
 * @author ricar
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    public Compra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CompraFondo = new javax.swing.JPanel();
        compraPieza = new javax.swing.JLabel();
        compraObjeto = new javax.swing.JLabel();
        compraServicio = new javax.swing.JLabel();
        compraConsulta = new javax.swing.JLabel();
        name_pieza = new javax.swing.JLabel();
        name_objeto = new javax.swing.JLabel();
        name_servicio = new javax.swing.JLabel();
        name_consulta = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        Errores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CompraFondo.setBackground(new java.awt.Color(255, 255, 255));
        CompraFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        CompraFondo.setPreferredSize(new java.awt.Dimension(1050, 575));
        CompraFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        compraPieza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compraPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_pieza.png"))); // NOI18N
        compraPieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compraPieza.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                compraPiezaMouseMoved(evt);
            }
        });
        compraPieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraPiezaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compraPiezaMouseExited(evt);
            }
        });
        CompraFondo.add(compraPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, 200));

        compraObjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compraObjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_objeto.png"))); // NOI18N
        compraObjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compraObjeto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                compraObjetoMouseMoved(evt);
            }
        });
        compraObjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraObjetoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compraObjetoMouseExited(evt);
            }
        });
        CompraFondo.add(compraObjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 200, 200));

        compraServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compraServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_servicio.png"))); // NOI18N
        compraServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compraServicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                compraServicioMouseMoved(evt);
            }
        });
        compraServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraServicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compraServicioMouseExited(evt);
            }
        });
        CompraFondo.add(compraServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 200, 200));

        compraConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compraConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_lista.png"))); // NOI18N
        compraConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compraConsulta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                compraConsultaMouseMoved(evt);
            }
        });
        compraConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraConsultaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                compraConsultaMouseExited(evt);
            }
        });
        CompraFondo.add(compraConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 200, 200));

        name_pieza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_pieza.setForeground(new java.awt.Color(252, 100, 68));
        name_pieza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_pieza.setText("PIEZA");
        CompraFondo.add(name_pieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 200, -1));

        name_objeto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_objeto.setForeground(new java.awt.Color(252, 100, 68));
        name_objeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_objeto.setText("OBJETO");
        CompraFondo.add(name_objeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 200, -1));

        name_servicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_servicio.setForeground(new java.awt.Color(252, 100, 68));
        name_servicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_servicio.setText("SERVICIO");
        CompraFondo.add(name_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 200, -1));

        name_consulta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_consulta.setForeground(new java.awt.Color(252, 100, 68));
        name_consulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_consulta.setText("CONSULTA");
        CompraFondo.add(name_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 200, -1));

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        CompraFondo.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, 30));

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        CompraFondo.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_regreso_32px.png"))); // NOI18N
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CompraFondo.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 30));
        CompraFondo.add(Errores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 1020, 20));

        getContentPane().add(CompraFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        /*int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir?","Exit",dialog);
        if(result == 0){
            System.exit(0);
        } POR SI QUIERO PREGUNTAR SI DESEA SALIR*/ 
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Compra.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void compraPiezaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraPiezaMouseMoved
        compraPieza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252,100,68)));
    }//GEN-LAST:event_compraPiezaMouseMoved

    private void compraPiezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraPiezaMouseExited
        compraPieza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_compraPiezaMouseExited

    private void compraObjetoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraObjetoMouseMoved
        compraObjeto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252,100,68)));
    }//GEN-LAST:event_compraObjetoMouseMoved

    private void compraServicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraServicioMouseMoved
        compraServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252,100,68)));
    }//GEN-LAST:event_compraServicioMouseMoved

    private void compraConsultaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraConsultaMouseMoved
        compraConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252,100,68)));
    }//GEN-LAST:event_compraConsultaMouseMoved

    private void compraObjetoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraObjetoMouseExited
        compraObjeto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_compraObjetoMouseExited

    private void compraServicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraServicioMouseExited
        compraServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_compraServicioMouseExited

    private void compraConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraConsultaMouseExited
        compraConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_compraConsultaMouseExited

    private void compraPiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraPiezaMouseClicked
        CompraPiezaFrame pieza = new CompraPiezaFrame();
        pieza.setVisible(true);
        dispose();
    }//GEN-LAST:event_compraPiezaMouseClicked

    private void compraObjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraObjetoMouseClicked
        CompraObjetoFrame objeto = new CompraObjetoFrame();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_compraObjetoMouseClicked

    private void compraServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraServicioMouseClicked
        CompraServicioFrame servicio = new CompraServicioFrame();
        servicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_compraServicioMouseClicked

    private void compraConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraConsultaMouseClicked
        ConsultaCompraFrame consultaCompra = new ConsultaCompraFrame();
        consultaCompra.setVisible(true);
        dispose();
    }//GEN-LAST:event_compraConsultaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CompraFondo;
    public static javax.swing.JLabel Errores;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel compraConsulta;
    private javax.swing.JLabel compraObjeto;
    private javax.swing.JLabel compraPieza;
    private javax.swing.JLabel compraServicio;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel name_consulta;
    private javax.swing.JLabel name_objeto;
    private javax.swing.JLabel name_pieza;
    private javax.swing.JLabel name_servicio;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}