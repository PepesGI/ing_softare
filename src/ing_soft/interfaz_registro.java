/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ing_soft;

import java.awt.Label;

/**
 *
 * @author bob_p
 */
public class interfaz_registro extends javax.swing.JFrame {

    /**
     * Creates new form interfaz_registro
     */
    public interfaz_registro() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtf_input_contra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_input_verifcontra = new javax.swing.JTextField();
        jtf_input_name = new javax.swing.JTextField();
        jbtn_registrar = new javax.swing.JButton();
        jbl_warnigs_contrasena = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(133, 295));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 414, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jtf_input_contra.setMinimumSize(new java.awt.Dimension(100, 22));
        jtf_input_contra.setPreferredSize(new java.awt.Dimension(100, 22));
        jtf_input_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_input_contraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 414, 0, 307);
        jPanel1.add(jtf_input_contra, gridBagConstraints);

        jLabel3.setText("Verificar contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 414, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jtf_input_verifcontra.setMinimumSize(new java.awt.Dimension(100, 22));
        jtf_input_verifcontra.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 414, 0, 307);
        jPanel1.add(jtf_input_verifcontra, gridBagConstraints);

        jtf_input_name.setMinimumSize(new java.awt.Dimension(100, 22));
        jtf_input_name.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 414, 0, 307);
        jPanel1.add(jtf_input_name, gridBagConstraints);

        jbtn_registrar.setText("Registrar");
        jbtn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 433, 103, 0);
        jPanel1.add(jbtn_registrar, gridBagConstraints);

        jbl_warnigs_contrasena.setText("datos para que la contrasena sea valida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 420, 0, 0);
        jPanel1.add(jbl_warnigs_contrasena, gridBagConstraints);

        jLabel1.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(84, 414, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registrarActionPerformed
       
        Usuario obj = new Usuario();
        
        if(jtf_input_name.getText().equals("") || jtf_input_contra.getText().equals("") || jtf_input_verifcontra.getText().equals("")){
            
            jbl_warnigs_contrasena.setText("Introducir datos");
            
        }else if(obj.Verificar_duplicado(jtf_input_name.getText())) {
            //verificar usuario
            //usuario ya registrado
            jbl_warnigs_contrasena.setText("Usuario ya registrado");
            
                
            } else if(jtf_input_contra.getText().equals(jtf_input_verifcontra.getText())){
            ///hay datos, no hay usuario ya registrado, contrasena coincide
            if(obj.Registrar_User(jtf_input_contra.getText(), jtf_input_contra.getText()))
                System.out.println("Datos agregados correctamente");
            
            
                    //manda a llamar al la pantalla principal
                    interfaz_principal inter = new interfaz_principal();
                    inter.setVisible(true);
                    this.dispose();

            
            }
            
             
        
        
    }//GEN-LAST:event_jbtn_registrarActionPerformed

    private void jtf_input_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_input_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_input_contraActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbl_warnigs_contrasena;
    private javax.swing.JButton jbtn_registrar;
    private javax.swing.JTextField jtf_input_contra;
    private javax.swing.JTextField jtf_input_name;
    private javax.swing.JTextField jtf_input_verifcontra;
    // End of variables declaration//GEN-END:variables
}
