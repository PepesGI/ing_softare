/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ing_soft;

/**
 *
 * @author bob_p
 */
public class interfaz_principal extends javax.swing.JFrame {

    /**
     * Creates new form interfaz_principal
     */
    public interfaz_principal() {
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

        Panel_Principal = new javax.swing.JPanel();
        panel_conenedor_superior = new javax.swing.JPanel();
        Panel_boton_ayudante = new javax.swing.JPanel();
        bnt_mod_ayud = new javax.swing.JButton();
        Panel_etiqueta_FECHA = new javax.swing.JPanel();
        lbl_fecha = new javax.swing.JLabel();
        Panel_etiqueta_HORA = new javax.swing.JPanel();
        lbl_hora = new javax.swing.JLabel();
        panel_contenedor_botones = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jcb_buscar_grupos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btn_nuevo_grupo = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_inicar_clase = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        bnt_importar_datos = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        tbn_generar_archivo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpanel_opc_buscar_grupo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla_datos_grupos = new javax.swing.JTable();
        jlb_grupo_seleccionado = new javax.swing.JLabel();
        btn_editar_grupo = new javax.swing.JButton();
        btn_elimimnar_grupo = new javax.swing.JButton();
        jpanel_opc_nuevo_grupo = new javax.swing.JPanel();
        lbl_nom_prof = new javax.swing.JLabel();
        lbl_nom_grupo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtf_nom_grupo = new javax.swing.JTextField();
        jtf_nom_prof = new javax.swing.JTextField();
        jtf_ciclo = new javax.swing.JTextField();
        btn_crear_grupo = new javax.swing.JButton();
        lbl_materia = new javax.swing.JLabel();
        jtf_materia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Principal.setBackground(new java.awt.Color(204, 255, 255));

        panel_conenedor_superior.setLayout(new java.awt.GridBagLayout());

        Panel_boton_ayudante.setBackground(new java.awt.Color(204, 204, 255));
        Panel_boton_ayudante.setLayout(new java.awt.GridBagLayout());

        bnt_mod_ayud.setText("Modo Ayudante");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 84, 35, 106);
        Panel_boton_ayudante.add(bnt_mod_ayud, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        panel_conenedor_superior.add(Panel_boton_ayudante, gridBagConstraints);

        Panel_etiqueta_FECHA.setBackground(new java.awt.Color(204, 204, 255));
        Panel_etiqueta_FECHA.setLayout(new java.awt.GridBagLayout());

        lbl_fecha.setText("FECHA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 124, 36, 145);
        Panel_etiqueta_FECHA.add(lbl_fecha, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        panel_conenedor_superior.add(Panel_etiqueta_FECHA, gridBagConstraints);

        Panel_etiqueta_HORA.setBackground(new java.awt.Color(204, 204, 255));
        Panel_etiqueta_HORA.setLayout(new java.awt.GridBagLayout());

        lbl_hora.setText("HORA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 121, 34, 148);
        Panel_etiqueta_HORA.add(lbl_hora, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 24);
        panel_conenedor_superior.add(Panel_etiqueta_HORA, gridBagConstraints);

        panel_contenedor_botones.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        panel_contenedor_botones.add(jPanel3);

        jcb_buscar_grupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_buscar_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_buscar_gruposActionPerformed(evt);
            }
        });
        panel_contenedor_botones.add(jcb_buscar_grupos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        panel_contenedor_botones.add(jPanel1);

        btn_nuevo_grupo.setText("NuevoGrupo");
        panel_contenedor_botones.add(btn_nuevo_grupo);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        panel_contenedor_botones.add(jPanel8);

        btn_inicar_clase.setText("Iniciar clase");
        panel_contenedor_botones.add(btn_inicar_clase);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        panel_contenedor_botones.add(jPanel9);

        bnt_importar_datos.setText("Asistencia");
        panel_contenedor_botones.add(bnt_importar_datos);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        panel_contenedor_botones.add(jPanel10);

        tbn_generar_archivo.setText("Importar");
        panel_contenedor_botones.add(tbn_generar_archivo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        panel_contenedor_botones.add(jPanel2);

        jtabla_datos_grupos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabla_datos_grupos);

        jlb_grupo_seleccionado.setText("Grupo: ");

        btn_editar_grupo.setText("Editar");

        btn_elimimnar_grupo.setText("Eliminar");

        javax.swing.GroupLayout jpanel_opc_buscar_grupoLayout = new javax.swing.GroupLayout(jpanel_opc_buscar_grupo);
        jpanel_opc_buscar_grupo.setLayout(jpanel_opc_buscar_grupoLayout);
        jpanel_opc_buscar_grupoLayout.setHorizontalGroup(
            jpanel_opc_buscar_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_opc_buscar_grupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_opc_buscar_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_opc_buscar_grupoLayout.createSequentialGroup()
                        .addComponent(jlb_grupo_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jpanel_opc_buscar_grupoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_editar_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_elimimnar_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_opc_buscar_grupoLayout.setVerticalGroup(
            jpanel_opc_buscar_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_opc_buscar_grupoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_grupo_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanel_opc_buscar_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_grupo)
                    .addComponent(btn_elimimnar_grupo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lbl_nom_prof.setText("Nombre del profesor:");

        lbl_nom_grupo.setText("Nombre del grupo:");

        jLabel1.setText("Ciclo escolar:");

        btn_crear_grupo.setText("Aceptar");
        btn_crear_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_grupoActionPerformed(evt);
            }
        });

        lbl_materia.setText("Materia:");

        javax.swing.GroupLayout jpanel_opc_nuevo_grupoLayout = new javax.swing.GroupLayout(jpanel_opc_nuevo_grupo);
        jpanel_opc_nuevo_grupo.setLayout(jpanel_opc_nuevo_grupoLayout);
        jpanel_opc_nuevo_grupoLayout.setHorizontalGroup(
            jpanel_opc_nuevo_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_opc_nuevo_grupoLayout.createSequentialGroup()
                .addGroup(jpanel_opc_nuevo_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_opc_nuevo_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_ciclo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_nom_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_nom_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_nom_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpanel_opc_nuevo_grupoLayout.createSequentialGroup()
                            .addGap(434, 434, 434)
                            .addComponent(lbl_nom_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpanel_opc_nuevo_grupoLayout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(btn_crear_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_opc_nuevo_grupoLayout.setVerticalGroup(
            jpanel_opc_nuevo_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_opc_nuevo_grupoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lbl_nom_grupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nom_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_nom_prof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nom_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_ciclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_materia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_crear_grupo)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_PrincipalLayout = new javax.swing.GroupLayout(Panel_Principal);
        Panel_Principal.setLayout(Panel_PrincipalLayout);
        Panel_PrincipalLayout.setHorizontalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanel_opc_nuevo_grupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_opc_buscar_grupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_conenedor_superior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_contenedor_botones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel_PrincipalLayout.setVerticalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_conenedor_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_contenedor_botones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jpanel_opc_buscar_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanel_opc_nuevo_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1879, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_buscar_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_buscar_gruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_buscar_gruposActionPerformed

    private void btn_crear_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_grupoActionPerformed

       




        // TODO add your handling code here:
    }//GEN-LAST:event_btn_crear_grupoActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_boton_ayudante;
    private javax.swing.JPanel Panel_etiqueta_FECHA;
    private javax.swing.JPanel Panel_etiqueta_HORA;
    private javax.swing.JButton bnt_importar_datos;
    private javax.swing.JButton bnt_mod_ayud;
    private javax.swing.JButton btn_crear_grupo;
    private javax.swing.JButton btn_editar_grupo;
    private javax.swing.JButton btn_elimimnar_grupo;
    private javax.swing.JButton btn_inicar_clase;
    private javax.swing.JButton btn_nuevo_grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_buscar_grupos;
    private javax.swing.JLabel jlb_grupo_seleccionado;
    private javax.swing.JPanel jpanel_opc_buscar_grupo;
    private javax.swing.JPanel jpanel_opc_nuevo_grupo;
    private javax.swing.JTable jtabla_datos_grupos;
    private javax.swing.JTextField jtf_ciclo;
    private javax.swing.JTextField jtf_materia;
    private javax.swing.JTextField jtf_nom_grupo;
    private javax.swing.JTextField jtf_nom_prof;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_materia;
    private javax.swing.JLabel lbl_nom_grupo;
    private javax.swing.JLabel lbl_nom_prof;
    private javax.swing.JPanel panel_conenedor_superior;
    private javax.swing.JPanel panel_contenedor_botones;
    private javax.swing.JButton tbn_generar_archivo;
    // End of variables declaration//GEN-END:variables
}
