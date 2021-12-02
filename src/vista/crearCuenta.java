/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import AppPackage.AnimationClass;
import controlador.ConnectDB;
import controlador.Qsql;
import controlador.TextPrompt;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class crearCuenta extends javax.swing.JFrame {
    int mouseX;
    int mouseY;
    /**
     * Creates new form Vista2
     */
    public crearCuenta() {
        initComponents();
        
        Qsql qsql = new Qsql();
        qsql.rolesUsuarios();
        
        TextPrompt rut = new TextPrompt("RUT",rutText);
        TextPrompt dv = new TextPrompt("Digito Verificador",digitoVerificadorText);
        TextPrompt nombres = new TextPrompt("Nombres",nombresText);
        TextPrompt apellidos = new TextPrompt("Apellidos",apellidosText);
        TextPrompt email = new TextPrompt("E-mail",emailText);
        TextPrompt telefono = new TextPrompt("Teléfono", telefonoText);
        TextPrompt usuario = new TextPrompt("Usuario",usuarioText);
        TextPrompt contraseña = new TextPrompt("Contraseña",contraseñaText);
        TextPrompt confirmarContraseña = new TextPrompt("Repita contraseña",confirmarContraseñaText);
        TextPrompt fechaRegistro = new TextPrompt("Fecha de registro",fechaRegistroText);
        TextPrompt usuarioRegistro = new TextPrompt("Usuario de registro",usuarioRegistroText);
              
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JButton();
        botonMenu = new javax.swing.JLabel();
        tituloBuscarClientes = new javax.swing.JLabel();
        rutText = new javax.swing.JTextField();
        digitoVerificadorText = new javax.swing.JTextField();
        nombresText = new javax.swing.JTextField();
        apellidosText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        usuarioText = new javax.swing.JTextField();
        contraseñaText = new javax.swing.JTextField();
        confirmarContraseñaText = new javax.swing.JTextField();
        fechaRegistroText = new javax.swing.JTextField();
        usuarioRegistroText = new javax.swing.JTextField();
        rolCB = new javax.swing.JComboBox<>();
        botonCrearCuenta = new javax.swing.JButton();
        MoverVentana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setForeground(new java.awt.Color(0, 153, 0));
        BotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_close_window_50px.png"))); // NOI18N
        BotonCerrar.setBorder(null);
        BotonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
        });
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(BotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 40, 40));

        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menux64.png"))); // NOI18N
        botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMenuMouseClicked(evt);
            }
        });
        jPanel2.add(botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        tituloBuscarClientes.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        tituloBuscarClientes.setForeground(new java.awt.Color(255, 255, 255));
        tituloBuscarClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBuscarClientes.setText("Agregar usuario");
        jPanel2.add(tituloBuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1070, 90));

        rutText.setBackground(new java.awt.Color(51, 153, 255));
        rutText.setForeground(new java.awt.Color(255, 255, 255));
        rutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutTextActionPerformed(evt);
            }
        });
        jPanel2.add(rutText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 360, 40));

        digitoVerificadorText.setBackground(new java.awt.Color(51, 153, 255));
        digitoVerificadorText.setForeground(new java.awt.Color(255, 255, 255));
        digitoVerificadorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitoVerificadorTextActionPerformed(evt);
            }
        });
        jPanel2.add(digitoVerificadorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 360, 40));

        nombresText.setBackground(new java.awt.Color(51, 153, 255));
        nombresText.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(nombresText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 360, 40));

        apellidosText.setBackground(new java.awt.Color(51, 153, 255));
        apellidosText.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(apellidosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 360, 40));

        emailText.setBackground(new java.awt.Color(51, 153, 255));
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 360, 40));

        telefonoText.setBackground(new java.awt.Color(51, 153, 255));
        telefonoText.setForeground(new java.awt.Color(255, 255, 255));
        telefonoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTextActionPerformed(evt);
            }
        });
        jPanel2.add(telefonoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 360, 40));

        usuarioText.setBackground(new java.awt.Color(51, 153, 255));
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });
        jPanel2.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 360, 40));

        contraseñaText.setBackground(new java.awt.Color(51, 153, 255));
        contraseñaText.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaTextActionPerformed(evt);
            }
        });
        jPanel2.add(contraseñaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 360, 40));

        confirmarContraseñaText.setBackground(new java.awt.Color(51, 153, 255));
        confirmarContraseñaText.setForeground(new java.awt.Color(255, 255, 255));
        confirmarContraseñaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarContraseñaTextActionPerformed(evt);
            }
        });
        jPanel2.add(confirmarContraseñaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 360, 40));

        fechaRegistroText.setBackground(new java.awt.Color(51, 153, 255));
        fechaRegistroText.setForeground(new java.awt.Color(255, 255, 255));
        fechaRegistroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaRegistroTextActionPerformed(evt);
            }
        });
        jPanel2.add(fechaRegistroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 360, 40));

        usuarioRegistroText.setBackground(new java.awt.Color(51, 153, 255));
        usuarioRegistroText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioRegistroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioRegistroTextActionPerformed(evt);
            }
        });
        jPanel2.add(usuarioRegistroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 360, 40));

        rolCB.setBackground(new java.awt.Color(51, 153, 255));
        rolCB.setForeground(new java.awt.Color(255, 255, 255));
        rolCB.setBorder(null);
        rolCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(rolCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 360, 40));

        botonCrearCuenta.setText("Crear Cuenta");
        jPanel2.add(botonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 240, -1));

        MoverVentana.setBackground(new java.awt.Color(102, 51, 255));
        MoverVentana.setForeground(new java.awt.Color(102, 51, 255));
        MoverVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverVentanaMouseDragged(evt);
            }
        });
        MoverVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverVentanaMousePressed(evt);
            }
        });
        jPanel2.add(MoverVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1070, 620));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 1320, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1070, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void MoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverVentanaMouseDragged
        int cordenadaX = evt.getXOnScreen();
        int cordenadaY = evt.getYOnScreen();

        this.setLocation(cordenadaX-mouseX, cordenadaY-mouseY);
    }//GEN-LAST:event_MoverVentanaMouseDragged

    private void MoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverVentanaMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_MoverVentanaMousePressed

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?","Salir",dialog);
        if(result == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_BotonCerrarMouseClicked

    private void digitoVerificadorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitoVerificadorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitoVerificadorTextActionPerformed

    private void telefonoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTextActionPerformed

    private void botonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMouseClicked
        this.dispose();
        menuAdmin menuAdmn = new menuAdmin();
        menuAdmn.setVisible(true);
    }//GEN-LAST:event_botonMenuMouseClicked

    private void rutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutTextActionPerformed

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void contraseñaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaTextActionPerformed

    private void confirmarContraseñaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarContraseñaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarContraseñaTextActionPerformed

    private void fechaRegistroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaRegistroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaRegistroTextActionPerformed

    private void usuarioRegistroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioRegistroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioRegistroTextActionPerformed

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
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JLabel MoverVentana;
    private javax.swing.JTextField apellidosText;
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JLabel botonMenu;
    private javax.swing.JTextField confirmarContraseñaText;
    private javax.swing.JTextField contraseñaText;
    private javax.swing.JTextField digitoVerificadorText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField fechaRegistroText;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombresText;
    public static javax.swing.JComboBox<String> rolCB;
    private javax.swing.JTextField rutText;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JLabel tituloBuscarClientes;
    private javax.swing.JTextField usuarioRegistroText;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
