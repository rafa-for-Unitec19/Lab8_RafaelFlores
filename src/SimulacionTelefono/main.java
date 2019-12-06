/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionTelefono;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faith
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.cargarContacto();
        this.cargarMensaje();
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

        jdAgregarModifcarContacto = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        spnTelefono = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroContactos = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMensajes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnNuevoMensaje = new javax.swing.JButton();
        btnEnviarMensaje = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAContenido = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnCancelarMensaje = new javax.swing.JButton();
        btnVerMsj = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistroLlamadas = new javax.swing.JTable();
        btnLllamar = new javax.swing.JButton();
        btnColgar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Nuevo Contacto");

        jLabel4.setText("Nombre");

        jLabel7.setText("Edad");

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel8.setText("Telefono");

        spnTelefono.setModel(new javax.swing.SpinnerNumberModel(88900000, 88900000, 99900000, 1));

        jLabel9.setText("Correo Electrónico");

        jLabel10.setText("Direccion");

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jdAgregarModifcarContactoLayout = new javax.swing.GroupLayout(jdAgregarModifcarContacto.getContentPane());
        jdAgregarModifcarContacto.getContentPane().setLayout(jdAgregarModifcarContactoLayout);
        jdAgregarModifcarContactoLayout.setHorizontalGroup(
            jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdAgregarModifcarContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo)
                    .addComponent(txtDireccion)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnEdad)
                    .addComponent(spnTelefono))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jdAgregarModifcarContactoLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdAgregarModifcarContactoLayout.setVerticalGroup(
            jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdAgregarModifcarContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdAgregarModifcarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Contactos");

        tblRegistroContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Numero de Telefono", "Correo Electronico", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistroContactos);

        lstMensajes.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(lstMensajes);

        jLabel3.setText("Mensajes");

        btnNuevoMensaje.setText("Nuevo");

        btnEnviarMensaje.setText("Enviar");

        txtAContenido.setColumns(20);
        txtAContenido.setRows(5);
        jScrollPane4.setViewportView(txtAContenido);

        jLabel5.setText("Contenido");

        btnCancelarMensaje.setText("Cancelar");

        btnVerMsj.setText("Ver Msj");
        btnVerMsj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMsjMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoMensaje)
                            .addComponent(jLabel3))
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnVerMsj)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnviarMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarMensaje))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane3))
                    .addComponent(btnVerMsj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoMensaje)
                    .addComponent(btnEnviarMensaje)
                    .addComponent(btnCancelarMensaje))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mensajes", jPanel1);

        tblRegistroLlamadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emisor", "Receptor", "Duracion", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRegistroLlamadas);

        btnLllamar.setText("LLamar");

        btnColgar.setText("Colgar");

        jLabel6.setText("Registro de Llamadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLllamar)
                                .addGap(18, 18, 18)
                                .addComponent(btnColgar))
                            .addComponent(jLabel6))
                        .addGap(0, 460, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLllamar)
                    .addComponent(btnColgar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LLamadas", jPanel2);

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Agregar Contacto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTabbedPane1)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerMsjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMsjMouseClicked
        modeloMensaje = (DefaultListModel) this.lstMensajes.getModel();
        this.txtAContenido.setText(
                ((Mensaje)this.modeloMensaje.get(this.lstMensajes.getSelectedIndex())).getContenidoFormateado()
        );
    }//GEN-LAST:event_btnVerMsjMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if (modificar) {
            if (this.txtNombre.getText().equals("") || this.txtDireccion.getText().equals("") || this.txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this.jdAgregarModifcarContacto, "Debe llenar todos los campos", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    db.conectar();
                    db.query.execute("select * from Contacto where telefono = " + Integer.parseInt(this.spnTelefono.getValue().toString()));
                    ResultSet rs = db.query.getResultSet();
                    rs.next();
                    int cuenta = rs.getInt("Id");
                    db.desconectar();
                    db.conectar();
                    this.modeloContacto = (DefaultTableModel) this.tblRegistroContactos.getModel();
                    for (int i = 0; i < this.contactos.size(); i++) {
                        if (contactos.get(i).getNumero() == Integer.parseInt(this.tblRegistroContactos.getValueAt(this.tblRegistroContactos.getSelectedRow(), 2).toString())) {
                            this.tblRegistroContactos.setValueAt(this.txtNombre.getText(), this.tblRegistroContactos.getSelectedRow(), 0);
                            contactos.get(i).setNombre(this.txtNombre.getText());
                            this.tblRegistroContactos.setValueAt(this.txtCorreo.getText(), this.tblRegistroContactos.getSelectedRow(), 3);
                            contactos.get(i).setCorreo(this.txtNombre.getText());
                            this.tblRegistroContactos.setValueAt(this.txtDireccion.getText(), this.tblRegistroContactos.getSelectedRow(), 4);
                            contactos.get(i).setDireccion(this.txtDireccion.getText());
                            this.tblRegistroContactos.setValueAt(Integer.parseInt(this.spnEdad.getValue().toString()), this.tblRegistroContactos.getSelectedRow(), 1);
                            contactos.get(i).setEdad(Integer.parseInt(this.spnEdad.getValue().toString()));
                            break;
                        }
                    }
                    db.query.execute("update Contacto set nombre='" + this.txtNombre.getText() + "',"
                            + "direccion = '" + this.txtDireccion.getText() + "',"
                            + "correo = '" + this.txtCorreo.getText() + "', "
                            + "edad = " + Integer.parseInt(this.spnEdad.getValue().toString()) + " where Id=" + cuenta);
                    db.commit();

                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                db.desconectar();
                modificar = false;
            }
        }else{
            if (this.txtNombre.getText().equals("") || this.txtDireccion.getText().equals("") || this.txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this.jdAgregarModifcarContacto, "Debe llenar todos los campos", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    db.conectar();
                    db.query.execute("select * from Contacto where telefono = " + Integer.parseInt(this.spnTelefono.getValue().toString()));
                    ResultSet rs = db.query.getResultSet();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this.jdAgregarModifcarContacto, "Este Numero de Telefono ya existe", "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
                    } else {
                        db.desconectar();
                        db.conectar();
                        Contacto c = new Contacto(this.txtNombre.getText(), this.txtCorreo.getText(), this.txtDireccion.getText(),
                                Integer.parseInt(this.spnEdad.getValue().toString()), Integer.parseInt(this.spnTelefono.getValue().toString()));
                        this.contactos.add(c);
                        this.modeloContacto = (DefaultTableModel) this.tblRegistroContactos.getModel();
                        Object[] Row = {
                            c.getNombre(),
                            c.getEdad(),
                            c.getNumero(),
                            c.getCorreo(),
                            c.getDireccion()
                        };
                        this.modeloContacto.addRow(Row);
                        db.query.execute("INSERT INTO Contacto"
                                + " (nombre, edad, telefono, correo, direccion)"
                                + " VALUES ( '"+c.getNombre()+"', "+c.getEdad()+", "+c.getNumero()+", '"+c.getCorreo()+"', '"+c.getDireccion()+"')");
                        db.commit();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                db.desconectar();
            }
        }
        this.Limpiar();
        this.jdAgregarModifcarContacto.setVisible(false);
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.jdAgregarModifcarContacto.setModal(true); 
        this.jdAgregarModifcarContacto.pack();
        this.jdAgregarModifcarContacto.setLocationRelativeTo(this);
        this.jdAgregarModifcarContacto.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (this.tblRegistroContactos.getSelectedRow() >= 0) {
            this.modeloContacto = (DefaultTableModel) this.tblRegistroContactos.getModel();
            this.txtNombre.setText(modeloContacto.getValueAt(this.tblRegistroContactos.getSelectedRow(), 0).toString());
            this.txtCorreo.setText(modeloContacto.getValueAt(this.tblRegistroContactos.getSelectedRow(), 3).toString());
            this.txtDireccion.setText(modeloContacto.getValueAt(this.tblRegistroContactos.getSelectedRow(), 4).toString());
            this.spnEdad.setValue(Integer.parseInt(modeloContacto.getValueAt(this.tblRegistroContactos.getSelectedRow(), 1).toString()));
            this.spnTelefono.setValue(Integer.parseInt(modeloContacto.getValueAt(this.tblRegistroContactos.getSelectedRow(), 2).toString()));
            this.modificar = true;
            this.spnTelefono.setEnabled(false);
            this.jdAgregarModifcarContacto.setModal(true);
            this.jdAgregarModifcarContacto.pack();
            this.jdAgregarModifcarContacto.setLocationRelativeTo(this);
            this.jdAgregarModifcarContacto.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (this.tblRegistroContactos.getSelectedRow() >= 0) {
            this.modeloContacto = (DefaultTableModel) this.tblRegistroContactos.getModel();
            db.conectar();
            try {
                db.query.execute("select * from Contacto where telefono = " + Integer.parseInt(this.spnTelefono.getValue().toString()));
                ResultSet rs = db.query.getResultSet();
                rs.next();
                int cuenta = rs.getInt("Id");
                db.desconectar();
                db.conectar();
                for (int i = 0; i < this.contactos.size(); i++) {
                        if (contactos.get(i).getNumero() == Integer.parseInt(this.tblRegistroContactos.getValueAt(this.tblRegistroContactos.getSelectedRow(), 2).toString())) {
                            contactos.remove(i);
                            modeloContacto.removeRow(this.tblRegistroContactos.getSelectedRow());
                            break;
                        }
                    }
                    db.query.execute("delete from Contacto where Id="+cuenta);
                    db.commit();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            db.desconectar();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked
    
    public void cargarContacto() {
        db.conectar();
        try {
            db.query.execute("select nombre, edad, telefono, correo, direccion from Contacto");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                this.contactos.add(new Contacto(rs.getString(1), rs.getString(4), rs.getString(5), rs.getInt(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        this.modeloContacto = (DefaultTableModel) this.tblRegistroContactos.getModel();
        for (int i = 0; i < this.contactos.size(); i++) {
            Object[] Row = {
                this.contactos.get(i).getNombre(),
                this.contactos.get(i).getEdad(),
                this.contactos.get(i).getNumero(),
                this.contactos.get(i).getCorreo(),
                this.contactos.get(i).getDireccion()
            };
            this.modeloContacto.addRow(Row);
        }
        this.tblRegistroContactos.setModel(modeloContacto);
    }
    
    public void cargarMensaje() {
        db.conectar();
        try {
            db.query.execute("select receptor, fecha, mensaje from Mensajes");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                this.mensajes.add(new Mensaje(rs.getString(3), rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        this.modeloMensaje = (DefaultListModel) this.lstMensajes.getModel();
        for (int i = 0; i < this.mensajes.size(); i++) {
            this.modeloMensaje.addElement(this.mensajes.get(i));
        }
        this.lstMensajes.setModel(modeloMensaje);
    }
    
    public void Limpiar(){
        this.txtCorreo.setText("");
        this.txtDireccion.setText("");
        this.txtNombre.setText("");
    }
    
    public void modificarEnArrayList(){
    
    }
    
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarMensaje;
    private javax.swing.JButton btnColgar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnLllamar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoMensaje;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVerMsj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jdAgregarModifcarContacto;
    private javax.swing.JList<String> lstMensajes;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnTelefono;
    private javax.swing.JTable tblRegistroContactos;
    private javax.swing.JTable tblRegistroLlamadas;
    private javax.swing.JTextArea txtAContenido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Contacto> contactos = new ArrayList();
    private ArrayList<Mensaje> mensajes = new ArrayList();
    private Dba db = new Dba("./Telefono.accdb");
    private DefaultTableModel modeloContacto = new DefaultTableModel();
    private DefaultTableModel modeloLLamada = new DefaultTableModel();
    private DefaultListModel modeloMensaje = new DefaultListModel();
    private boolean modificar = false;
}
