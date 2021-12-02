/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import AppPackage.AnimationClass;
import controlador.TextPrompt;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Nico
 */
public class devolucionVehiculo extends javax.swing.JFrame {
    int mouseX;
    int mouseY;
    /**
     * Creates new form Vista2
     */
    public devolucionVehiculo() {
        initComponents();
        
        
        TextPrompt idArriendo = new TextPrompt("ID Arriendo",idArriendoText);
        TextPrompt fechaDeInicio = new TextPrompt("Fecha de inicio",fechaInicioText);
        TextPrompt fechaDeTermino = new TextPrompt("Fecha de termino",fechaTerminoText); 
        TextPrompt multa = new TextPrompt("Multa",multaText);
        TextPrompt kilometrajeInicial = new TextPrompt("Kilometraje inicial",kilometrajeInicialText);
        TextPrompt kilometrajeFinal = new TextPrompt("Kilometraje final",kilometrajeFinalText);
        TextPrompt kilometrosRecorridos = new TextPrompt("Kilometros recorridos",kilometrosRecorridosText);
        TextPrompt observaciones = new TextPrompt("Observaciones",observacionesText);

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
        tituloDevolucionVehiculos = new javax.swing.JLabel();
        idArriendoText = new javax.swing.JTextField();
        fechaInicioText = new javax.swing.JTextField();
        fechaTerminoText = new javax.swing.JTextField();
        kilometrajeInicialText = new javax.swing.JTextField();
        kilometrajeFinalText = new javax.swing.JTextField();
        kilometrosRecorridosText = new javax.swing.JTextField();
        multaText = new javax.swing.JTextField();
        observacionesText = new javax.swing.JTextField();
        botonAgregarRegistro = new javax.swing.JButton();
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

        tituloDevolucionVehiculos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        tituloDevolucionVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        tituloDevolucionVehiculos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDevolucionVehiculos.setText("Devolución de vehiculos");
        jPanel2.add(tituloDevolucionVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1070, 90));

        idArriendoText.setBackground(new java.awt.Color(51, 153, 255));
        idArriendoText.setForeground(new java.awt.Color(255, 255, 255));
        idArriendoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idArriendoTextActionPerformed(evt);
            }
        });
        jPanel2.add(idArriendoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 360, 40));

        fechaInicioText.setBackground(new java.awt.Color(51, 153, 255));
        fechaInicioText.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(fechaInicioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 360, 40));

        fechaTerminoText.setBackground(new java.awt.Color(51, 153, 255));
        fechaTerminoText.setForeground(new java.awt.Color(255, 255, 255));
        fechaTerminoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTerminoTextActionPerformed(evt);
            }
        });
        jPanel2.add(fechaTerminoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 360, 40));

        kilometrajeInicialText.setBackground(new java.awt.Color(51, 153, 255));
        kilometrajeInicialText.setForeground(new java.awt.Color(255, 255, 255));
        kilometrajeInicialText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometrajeInicialTextActionPerformed(evt);
            }
        });
        kilometrajeInicialText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kilometrajeInicialTextKeyTyped(evt);
            }
        });
        jPanel2.add(kilometrajeInicialText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 360, 40));

        kilometrajeFinalText.setBackground(new java.awt.Color(51, 153, 255));
        kilometrajeFinalText.setForeground(new java.awt.Color(255, 255, 255));
        kilometrajeFinalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometrajeFinalTextActionPerformed(evt);
            }
        });
        kilometrajeFinalText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kilometrajeFinalTextKeyTyped(evt);
            }
        });
        jPanel2.add(kilometrajeFinalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 360, 40));

        kilometrosRecorridosText.setBackground(new java.awt.Color(51, 153, 255));
        kilometrosRecorridosText.setForeground(new java.awt.Color(255, 255, 255));
        kilometrosRecorridosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometrosRecorridosTextActionPerformed(evt);
            }
        });
        kilometrosRecorridosText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kilometrosRecorridosTextKeyTyped(evt);
            }
        });
        jPanel2.add(kilometrosRecorridosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 360, 40));

        multaText.setBackground(new java.awt.Color(51, 153, 255));
        multaText.setForeground(new java.awt.Color(255, 255, 255));
        multaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multaTextActionPerformed(evt);
            }
        });
        jPanel2.add(multaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 360, 40));

        observacionesText.setBackground(new java.awt.Color(51, 153, 255));
        observacionesText.setForeground(new java.awt.Color(255, 255, 255));
        observacionesText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        observacionesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesTextActionPerformed(evt);
            }
        });
        jPanel2.add(observacionesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 360, 130));

        botonAgregarRegistro.setText("Realizar devolución");
        botonAgregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(botonAgregarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 290, 30));

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

    private void botonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMouseClicked
        AnimationClass animacion = new AnimationClass();
        this.dispose();
        menuAdmin menuAdmn = new menuAdmin();
        menuAdmn.setVisible(true);
    }//GEN-LAST:event_botonMenuMouseClicked

    private void observacionesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionesTextActionPerformed

    private void multaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multaTextActionPerformed

    private void kilometrajeInicialTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometrajeInicialTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilometrajeInicialTextActionPerformed

    private void kilometrajeFinalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometrajeFinalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilometrajeFinalTextActionPerformed

    private void kilometrajeInicialTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilometrajeInicialTextKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_kilometrajeInicialTextKeyTyped

    private void kilometrajeFinalTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilometrajeFinalTextKeyTyped
         char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_kilometrajeFinalTextKeyTyped

    private void botonAgregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarRegistroActionPerformed
     if(!idArriendoText.getText().isEmpty() && !fechaInicioText.getText().isEmpty() &&
             !fechaTerminoText.getText().isEmpty() && !multaText.getText().isEmpty() &&
             !kilometrajeInicialText.getText().isEmpty() && !kilometrajeFinalText.getText().isEmpty() &&
             !kilometrosRecorridosText.getText().isEmpty() && !observacionesText.getText().isEmpty()){
         
        //agregara los datos a la base de datos.
     }
      else   
       JOptionPane.showMessageDialog(null, "Rellene todos los campos!");
    }//GEN-LAST:event_botonAgregarRegistroActionPerformed

    private void idArriendoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idArriendoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idArriendoTextActionPerformed

    private void kilometrosRecorridosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometrosRecorridosTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilometrosRecorridosTextActionPerformed

    private void kilometrosRecorridosTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilometrosRecorridosTextKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_kilometrosRecorridosTextKeyTyped

    private void fechaTerminoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTerminoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTerminoTextActionPerformed

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
            java.util.logging.Logger.getLogger(devolucionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(devolucionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(devolucionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(devolucionVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new devolucionVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JLabel MoverVentana;
    private javax.swing.JButton botonAgregarRegistro;
    private javax.swing.JLabel botonMenu;
    private javax.swing.JTextField fechaInicioText;
    private javax.swing.JTextField fechaTerminoText;
    private javax.swing.JTextField idArriendoText;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField kilometrajeFinalText;
    private javax.swing.JTextField kilometrajeInicialText;
    private javax.swing.JTextField kilometrosRecorridosText;
    private javax.swing.JTextField multaText;
    private javax.swing.JTextField observacionesText;
    private javax.swing.JLabel tituloDevolucionVehiculos;
    // End of variables declaration//GEN-END:variables
}
