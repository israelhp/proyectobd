/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd.vistas.modulo.vacaciones;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectobd.controladores.ControladorEmpleado;
import proyectobd.controladores.ControladorEquipo;
import proyectobd.controladores.ControladorHorario;
import proyectobd.controladores.ControladorPersona;
import proyectobd.controladores.ControladorPuesto;
import proyectobd.dao.mysql.MySQLAsistencia;
import proyectobd.dao.mysql.MySQLDetalleEquipo;
import proyectobd.dao.mysql.MySQLInasistencia;
import proyectobd.dao.mysql.MySQLVacaciones;
import proyectobd.excepciones.Excepcion;
import proyectobd.modelos.Asistencia;
import proyectobd.modelos.DetalleEquipo;
import proyectobd.modelos.Empleado;
import proyectobd.modelos.Equipo;
import proyectobd.modelos.Horario;
import proyectobd.modelos.Inasistencia;
import proyectobd.modelos.Persona;
import proyectobd.modelos.Puesto;
import proyectobd.vistas.Admin;
import proyectobd.vistas.Login;
import proyectobd.vistas.custom.CustomUI;

/**
 *
 * @author israe
 */
public class Vacaciones extends javax.swing.JFrame {

    private ControladorHorario controladorHorario;
    private ControladorEquipo controladorEquipo;
    private ControladorPersona controladorPersona;
    private ControladorEmpleado controladorEmpleado;
    private ControladorPuesto controladorPuesto;
    private String regreso;
    private Empleado info;
    DefaultTableModel modelo;

    /**
     * Creates new form Vacaciones
     */
    public Vacaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Vacaciones(String regreso, Empleado info) {

        initComponents();

        this.setLocationRelativeTo(null);
        this.regreso = regreso;
        this.info = info;

        this.controladorHorario = new ControladorHorario();
        this.controladorEquipo = new ControladorEquipo();
        this.controladorPersona = new ControladorPersona();
        this.controladorEmpleado = new ControladorEmpleado();
        this.controladorPuesto = new ControladorPuesto();

        this.jLabel3.setText(String.valueOf(this.info.getIdEmpleado()));
        Persona persona = new ControladorPersona().obtenerPorID(this.info.getIdPersona());
        this.jLabel5.setText(persona.getNombre());
        Puesto puesto = new ControladorPuesto().buscarPuesto(this.info.getIdPuesto());
        this.jLabel7.setText(puesto.getNombre());

        this.jCBEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        this.jCBEmpleados.setUI(new CustomUI());

        ArrayList<Equipo> listaEquipos = controladorEquipo.obtenerEquipos();

        for (int i = 0; i < listaEquipos.size(); i++) {
            if (listaEquipos.get(i).getIdEmpleado() == info.getIdEmpleado()) {
                ArrayList<DetalleEquipo> listaDetalle = new MySQLDetalleEquipo().listarIdEquipo(listaEquipos.get(i).getIdEquipo());
                for (int j = 0; j < listaDetalle.size(); j++) {
                    Empleado auxEmpleado = controladorEmpleado.buscarEmpleado(listaDetalle.get(j).getIdEmpleado());
                    Persona auxPersona = controladorPersona.obtenerPorID(auxEmpleado.getIdPersona());

                    jCBEmpleados.addItem(String.valueOf(auxEmpleado.getIdEmpleado()) + "-" + auxPersona.getNombre() + "-" + auxPersona.getApellido());
                }
            }
        }

        this.jDCFechaSalida.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));

        modelo = new DefaultTableModel();

        modelo.addColumn("ID Empleado");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("Fecha Entrada");

        this.jTable1.setModel(modelo);

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
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCBEmpleados = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDCFechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDCFechaSalida = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_id_32px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(238, 112, 82));
        jSeparator2.setForeground(new java.awt.Color(238, 112, 82));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 10));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("ID Empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 30));

        jSeparator3.setBackground(new java.awt.Color(238, 112, 82));
        jSeparator3.setForeground(new java.awt.Color(238, 112, 82));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 230, 10));

        jLabel5.setBackground(new java.awt.Color(238, 112, 82));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setText("Nombre Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(238, 112, 82));
        jSeparator4.setForeground(new java.awt.Color(238, 112, 82));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 10));

        jLabel7.setBackground(new java.awt.Color(238, 112, 82));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("Puesto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 180, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_empleado32px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_User_96px_2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 90));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Menu_32px.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(238, 112, 82));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar Sesion ");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(238, 112, 82));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 112, 82));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha de Entrada");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, 30));

        jCBEmpleados.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jCBEmpleados.setForeground(new java.awt.Color(238, 112, 82));
        jCBEmpleados.setBorder(null);
        jCBEmpleados.setFocusable(false);
        jCBEmpleados.setOpaque(false);
        jCBEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEmpleadosActionPerformed(evt);
            }
        });
        jPanel2.add(jCBEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 310, 30));

        jButton3.setBackground(new java.awt.Color(238, 112, 82));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sacar de vacaciones");
        jButton3.setBorder(null);
        jButton3.setFocusPainted(false);
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 680, 50));

        jLabel44.setBackground(new java.awt.Color(238, 112, 82));
        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(238, 112, 82));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Informacion");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 370, -1));

        jLabel45.setBackground(new java.awt.Color(238, 112, 82));
        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(238, 112, 82));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Vacaciones");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 370, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 680, 200));
        jPanel2.add(jDCFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 190, 30));

        jLabel18.setBackground(new java.awt.Color(238, 112, 82));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 112, 82));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Empleado");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, 30));

        jLabel19.setBackground(new java.awt.Color(238, 112, 82));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 112, 82));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Fecha Salida");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 30));
        jPanel2.add(jDCFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 30));

        jButton4.setBackground(new java.awt.Color(238, 112, 82));
        jButton4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Obtener info.");
        jButton4.setBorder(null);
        jButton4.setFocusPainted(false);
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 200, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icon_regreso_32px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/vistas/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 30, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        jButton2.setBackground(new Color(204, 51, 0));
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(238, 112, 82));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Horario horario = controladorHorario.obtenerHorario(this.info.getIdHorario());

        if (horario != null) {
            Calendar calendario = Calendar.getInstance();
            String horaActual = calendario.get(Calendar.HOUR_OF_DAY) + ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND);
            /*System.out.println("horaActual: " + horaActual);
            System.out.println("HoraSalida:" + horario.getSalida());*/

            try {
                DateFormat dateFormat = new SimpleDateFormat("hh:mm");

                Date DHoraSalida = dateFormat.parse(horario.getSalida());
                Date DHoraActual = dateFormat.parse("10:00:00");

                if (DHoraSalida.compareTo(DHoraActual) > 0) {
                    int respuesta = JOptionPane.showConfirmDialog(null, "Tu hora de salida es: " + horario.getSalida() + ". Estas seguro que deseas salir? (se te contara como inasistencia)", "Cerrando Sesion", JOptionPane.YES_NO_OPTION);
                    if (respuesta == 0) {
                        try {
                            Inasistencia inasistencia = new Inasistencia();
                            inasistencia.setIdEmpleado(this.info.getIdEmpleado());
                            inasistencia.setIdTipoInasistencia(2);

                            MySQLInasistencia myinasistencia = new MySQLInasistencia();
                            myinasistencia.insertar(inasistencia);

                            MySQLAsistencia myasistencia = new MySQLAsistencia();
                            Asistencia aux = myasistencia.obtenerIdyFecha(this.info.getIdEmpleado());
                            aux.setHora_salida(horaActual);
                            myasistencia.modificar(aux);
                            JOptionPane.showMessageDialog(null, "Cerro Sesion correctamente");
                            dispose();
                            Login login = new Login();
                            login.setVisible(true);
                        } catch (Excepcion e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
                } else {
                    MySQLAsistencia myasistencia = new MySQLAsistencia();
                    Asistencia aux = myasistencia.obtenerIdyFecha(this.info.getIdEmpleado());
                    aux.setHora_salida(horaActual);
                    myasistencia.modificar(aux);
                    JOptionPane.showMessageDialog(null, "Cerro Sesion correctamente");
                    dispose();
                    Login login = new Login();
                    login.setVisible(true);
                }

            } catch (ParseException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCBEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEmpleadosActionPerformed

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        jButton3.setBackground(new Color(204, 51, 0));
    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(238, 112, 82));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int cont = this.jTable1.getRowCount();
        for (int i = cont - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        String opcion = (String) this.jCBEmpleados.getSelectedItem();
        String[] opciones = opcion.split("-");

        Empleado auxEmpleado = controladorEmpleado.buscarEmpleado(Integer.parseInt(opciones[0]));

        proyectobd.modelos.Vacaciones vacas = new proyectobd.modelos.Vacaciones();
        vacas.setIdEmpleado(auxEmpleado.getIdEmpleado());
        vacas.setFecha_salida(this.jDCFechaSalida.getDate());

        if (this.jDCFechaSalida.getDate() != null) {
            vacas.setFecha_entrada(this.jDCFechaEntrada.getDate());
            MySQLVacaciones mysql = new MySQLVacaciones();
            mysql.insertar(vacas);

            proyectobd.modelos.Vacaciones auxvacas = mysql.obtenerId(1);
            System.out.println(auxvacas.getFecha_entrada());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicacion?", "Salir", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (this.regreso.equalsIgnoreCase("Admin")) {
            this.dispose();
            Admin modAdmin = new Admin(this.info);
            modAdmin.setVisible(true);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setState(Vacaciones.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int cont = this.jTable1.getRowCount();
        for (int i = cont - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        String opcion = (String) this.jCBEmpleados.getSelectedItem();
        String[] opciones = opcion.split("-");

        ArrayList<proyectobd.modelos.Vacaciones> lista = new MySQLVacaciones().listarVacacionesPorIdEmpleado(Integer.parseInt(opciones[0]));

        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                String[] valores = new String[3];
                valores[0] = String.valueOf(lista.get(i).getIdEmpleado());

                long f = lista.get(i).getFecha_salida().getTime();
                valores[1] = String.valueOf(new java.sql.Date(f));

                long f2 = lista.get(i).getFecha_entrada().getTime();
                valores[2] = String.valueOf(new java.sql.Date(f2));

                modelo.addRow(valores);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCBEmpleados;
    private com.toedter.calendar.JDateChooser jDCFechaEntrada;
    private com.toedter.calendar.JDateChooser jDCFechaSalida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
