/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd.vistas.modulo.inven;

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
public class NumPieza extends javax.swing.JFrame {

    /**
     * Creates new form NumPieza
     */
    MySQLCarro carro = new MySQLCarro();
    MySQLPieza pieza = new MySQLPieza();
    MySQLNombrePieza nom_pieza = new MySQLNombrePieza();
    MySQLEstadoPieza e_pieza = new MySQLEstadoPieza();
    ArrayList <Carro> lista = carro.listar();
    ArrayList <Pieza> lista2 = pieza.listar();
    MySQLMarcaPieza m_pieza = new MySQLMarcaPieza();
    ArrayList <NombrePieza> lista3 = nom_pieza.listar();
    List<Integer> list = new ArrayList<Integer>();
    List<String> lis = new ArrayList<String>();
    MySQLInventarioPieza inv_pieza = new MySQLInventarioPieza();
    ArrayList <InventarioPieza> inv = inv_pieza.listar();
    DefaultTableModel model = new DefaultTableModel();
    String item;
    String item2;
    int o=0;
    int ref=0;
    public NumPieza() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 100, 68), 2));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 149, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 100, 68));
        jButton1.setText("ACTUALIZAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 100, 68), 4));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 101, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 100, 68));
        jButton2.setText("BUSCAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 100, 68), 4));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 101, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_regreso_32px.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 0, 30, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 100, 68));
        jLabel1.setText("SELECCIONE LA PIEZA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 100, 68));
        jLabel2.setText("DATOS DEL VEHICULO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 164, -1, -1));

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
                "CODIGO", "MARCA", "MARCA", "LINEA", "MODELO", "PRECIO", "ESTADO", "DISPONIBILIDAD"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(252, 100, 68));
        jTable1.setSelectionBackground(new java.awt.Color(252, 100, 68));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 1086, 240));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jComboBox1.remove(this);
        for(int i=0; i<lista3.size(); i++){
            if(i==0){
                jComboBox1.addItem(lista3.get(i).getNombre());
                lis.add(lista3.get(i).getNombre());
            }
            else{
                for(int j=0; j<lis.size();j++){
                    item2 = lista3.get(i).getNombre();
                    if(item2.equals(lis.get(j))){
                        o=1;
                    }
                }
                if(o==0){
                    jComboBox1.addItem(lista3.get(i).getNombre());
                    lis.add(lista3.get(i).getNombre());
                }
            }
            o=0;
        } 
        jButton1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTable1.setModel(model);
        int id_p;
        int id_n;
        int id_e;
        int id_c;
        int id_inv;
        int dis=0;
        String marca_p;
        String linea;
        String marca_c;
        String modelo;
        String estado;
        float pre;
        String temp="";
        item = (String)jComboBox1.getSelectedItem();
        if(ref==0){
            model.addColumn("CODIGO");
            model.addColumn("MARCA");
            model.addColumn("MARCA");
            model.addColumn("LINEA");
            model.addColumn("MODELO");
            model.addColumn("ESTADO");
            model.addColumn("PRECIO");
            model.addColumn("DISPONIBILIDAD");
            ref=1;
        }
        for(int i=0; i<lista3.size(); i++){
            if(item.equals(lista3.get(i).getNombre())){
                list.add(nom_pieza.obtenerId(i+1).getIdNombrePieza());
            }
        } 
        for(int i=0;i<list.size();i++){
            for(int j=0;j<lista2.size();j++){
               id_p=lista2.get(j).getIdPieza();
               id_n=lista2.get(j).getIdMarcaPieza();
               id_e=lista2.get(j).getIdEstadoPieza();
               id_c=lista2.get(j).getIdCarro();
               if(pieza.obtenerId(id_p).getIdNombrePieza()==list.get(i)){
                   marca_p=m_pieza.obtenerId(id_n).getMarca();
                   marca_c=carro.obtenerId(id_c).getMarca();
                   linea=carro.obtenerId(id_c).getLinea();
                   modelo=carro.obtenerId(id_c).getModelo();
                   estado=e_pieza.obtenerId(id_e).getEstado();
                   pre=pieza.obtenerId(id_p).getPrecio_venta();
                   for(int k=0;k<inv.size();k++){
                    id_inv=inv.get(k).getIdPieza();
                        if(id_inv==id_p){
                            dis=inv.get(k).getCantidad();
                        }
                    }
                   model.addRow(new Object[]{id_p,marca_p,marca_c,linea,modelo,estado,pre,dis});
                   jLabel1.setText("PIEZA: "+nom_pieza.obtenerId(list.get(i)).getNombre());
               }
            }
        }
        jButton2.setVisible(false);
        jComboBox1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Inventario inv = new Inventario();
        inv.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(NumPieza.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Inventario inv = new Inventario();
        inv.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(NumPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumPieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
