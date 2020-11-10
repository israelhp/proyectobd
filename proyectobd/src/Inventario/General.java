/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author emman
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectobd.dao.mysql.MySQLCarro;
import proyectobd.dao.mysql.MySQLPieza;
import proyectobd.dao.mysql.MySQLProducto;
import proyectobd.dao.mysql.MySQLEstadoPieza;
import proyectobd.dao.mysql.MySQLInventarioGeneral;
import proyectobd.dao.mysql.MySQLInventarioPieza;
import proyectobd.dao.mysql.MySQLMarcaPieza;
import proyectobd.dao.mysql.MySQLNombrePieza;
import proyectobd.modelos.Carro;
import proyectobd.modelos.EstadoPieza;
import proyectobd.modelos.EstadoPieza;
import proyectobd.modelos.FacturaCompra;
import proyectobd.modelos.FacturaGeneral;
import proyectobd.modelos.FacturaProducto;
import proyectobd.modelos.InventarioGeneral;
import proyectobd.modelos.InventarioPieza;
import proyectobd.modelos.MarcaPieza;
import proyectobd.modelos.NombrePieza;
import proyectobd.modelos.Pieza;
import proyectobd.modelos.Producto;
import proyectobd.modelos.TipoFactura;
public class General extends javax.swing.JFrame {

    MySQLCarro carro = new MySQLCarro();
    MySQLPieza pieza = new MySQLPieza();
    MySQLNombrePieza nom_pieza = new MySQLNombrePieza();
    MySQLEstadoPieza e_pieza = new MySQLEstadoPieza();
    ArrayList <EstadoPieza> lista = e_pieza.listar();
    ArrayList <Pieza> lista2 = pieza.listar();
    ArrayList <NombrePieza> lista3 = nom_pieza.listar();
    MySQLMarcaPieza m_pieza = new MySQLMarcaPieza();
    List<Integer> list = new ArrayList<Integer>();
    List<String> lis = new ArrayList<String>();
    DefaultTableModel model = new DefaultTableModel();
    MySQLInventarioPieza inv_pieza = new MySQLInventarioPieza();
    ArrayList <InventarioPieza> inv = inv_pieza.listar();
    int ref=0;
    public General() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 100, 68));
        jButton1.setText("BUSCAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 100, 68), 4));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 100, 68));
        jButton2.setText("LIMPIAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 100, 68), 4));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("←");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setForeground(new java.awt.Color(252, 100, 68));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE DE LA PIEZA", "MARCA", "MARCA", "LINEA", "MODELO", "PRECIO", "DISPONIBILIDAD"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(252, 100, 68));
        jTable1.setSelectionBackground(new java.awt.Color(252, 100, 68));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("▼");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTable1.setModel(model);
        int id;
        int id_p;
        int id_c;
        int id_inv;
        int id_mp;
        int dis=0;
        float precio;
        String nom;
        String ma_pieza;
        String m_c;
        String c_li;
        String modelo;
        if(ref==0){
            model.addColumn("CODIGO");
            model.addColumn("NOMBRE");
            model.addColumn("MARCA");
            model.addColumn("MARCA");
            model.addColumn("LINEA");
            model.addColumn("MODELO");
            model.addColumn("PRECIO");
            model.addColumn("DISPONIBILIDAD");
            ref=1;
        }
        for(int i=0;i<lista2.size();i++){
            id=lista2.get(i).getIdPieza();
            id_p=lista2.get(i).getIdNombrePieza();
            id_mp=lista2.get(i).getIdMarcaPieza();
            id_c=lista2.get(i).getIdCarro();
            nom=nom_pieza.obtenerId(id_p).getNombre();
            ma_pieza=m_pieza.obtenerId(id_mp).getMarca();
            m_c=carro.obtenerId(id_c).getMarca();
            c_li=carro.obtenerId(id_c).getLinea();
            modelo=carro.obtenerId(id_c).getModelo();
            precio=pieza.obtenerId(id).getPrecio_venta();
            for(int j=0;j<inv.size();j++){
                id_inv=inv.get(j).getIdPieza();
                if(id_inv==id){
                    dis=inv.get(j).getCantidad();
                }
            }
            model.addRow(new Object[]{id,nom,ma_pieza,m_c,c_li,modelo,precio,dis});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a= model.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            model.removeRow(model.getRowCount()-1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inventario inv = new Inventario();
        inv.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(General.ICONIFIED);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
