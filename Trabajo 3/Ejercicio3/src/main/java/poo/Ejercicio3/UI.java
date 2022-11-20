/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.Ejercicio3;

import figuras.Cilindro;
import figuras.Esfera;
import figuras.Piramide;

/**
 *
 * @author danie
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        esferaRadio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cilindroRadio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        piramideBase = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cilindroAltura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        piramideAltura = new javax.swing.JTextField();
        cilindroBtn = new javax.swing.JButton();
        esferaBtn = new javax.swing.JButton();
        piramideBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        esferaSuperficie = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        esferaVolumen = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cilindroSuperficie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cilindroVolumen = new javax.swing.JTextField();
        esferaBtn1 = new javax.swing.JButton();
        cilindroBtn1 = new javax.swing.JButton();
        piramideApotema = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        piramideBtn2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        piramideSuperficie = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        piramideVolumen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel2.setText("Esfera");

        jLabel3.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel3.setText("Cilíndro");

        jLabel5.setFont(new java.awt.Font("Inter Black", 0, 36)); // NOI18N
        jLabel5.setText("Piramíde");

        esferaRadio.setForeground(new java.awt.Color(134, 134, 139));

        jLabel6.setForeground(new java.awt.Color(134, 134, 139));
        jLabel6.setText("Radio");

        jLabel7.setForeground(new java.awt.Color(134, 134, 139));
        jLabel7.setText("Radio");

        cilindroRadio.setForeground(new java.awt.Color(134, 134, 139));

        jLabel9.setForeground(new java.awt.Color(134, 134, 139));
        jLabel9.setText("Base");

        piramideBase.setForeground(new java.awt.Color(134, 134, 139));

        jLabel10.setForeground(new java.awt.Color(134, 134, 139));
        jLabel10.setText("Altura");

        cilindroAltura.setForeground(new java.awt.Color(134, 134, 139));

        jLabel11.setForeground(new java.awt.Color(134, 134, 139));
        jLabel11.setText("Altura");

        piramideAltura.setForeground(new java.awt.Color(134, 134, 139));

        cilindroBtn.setBackground(new java.awt.Color(0, 113, 227));
        cilindroBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        cilindroBtn.setForeground(new java.awt.Color(255, 255, 255));
        cilindroBtn.setText("Continuar");
        cilindroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroBtnActionPerformed(evt);
            }
        });

        esferaBtn.setBackground(new java.awt.Color(0, 113, 227));
        esferaBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        esferaBtn.setForeground(new java.awt.Color(255, 255, 255));
        esferaBtn.setText("Continuar");
        esferaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esferaBtnActionPerformed(evt);
            }
        });

        piramideBtn.setBackground(new java.awt.Color(0, 113, 227));
        piramideBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        piramideBtn.setForeground(new java.awt.Color(255, 255, 255));
        piramideBtn.setText("Continuar");
        piramideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piramideBtnActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(134, 134, 139));
        jLabel12.setText("Superficie");

        esferaSuperficie.setForeground(new java.awt.Color(134, 134, 139));
        esferaSuperficie.setEnabled(false);

        jLabel13.setForeground(new java.awt.Color(134, 134, 139));
        jLabel13.setText("Volumen");

        esferaVolumen.setForeground(new java.awt.Color(134, 134, 139));
        esferaVolumen.setEnabled(false);

        jLabel14.setForeground(new java.awt.Color(134, 134, 139));
        jLabel14.setText("Superficie");

        cilindroSuperficie.setForeground(new java.awt.Color(134, 134, 139));
        cilindroSuperficie.setEnabled(false);

        jLabel15.setForeground(new java.awt.Color(134, 134, 139));
        jLabel15.setText("Volumen");

        cilindroVolumen.setForeground(new java.awt.Color(134, 134, 139));
        cilindroVolumen.setEnabled(false);

        esferaBtn1.setBackground(new java.awt.Color(0, 113, 227));
        esferaBtn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        esferaBtn1.setForeground(new java.awt.Color(255, 255, 255));
        esferaBtn1.setText("Limpiar");
        esferaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esferaBtn1ActionPerformed(evt);
            }
        });

        cilindroBtn1.setBackground(new java.awt.Color(0, 113, 227));
        cilindroBtn1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        cilindroBtn1.setForeground(new java.awt.Color(255, 255, 255));
        cilindroBtn1.setText("Limpiar");
        cilindroBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroBtn1ActionPerformed(evt);
            }
        });

        piramideApotema.setForeground(new java.awt.Color(134, 134, 139));

        jLabel22.setForeground(new java.awt.Color(134, 134, 139));
        jLabel22.setText("Apotema");

        piramideBtn2.setBackground(new java.awt.Color(0, 113, 227));
        piramideBtn2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        piramideBtn2.setForeground(new java.awt.Color(255, 255, 255));
        piramideBtn2.setText("Limpiar");
        piramideBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piramideBtn2ActionPerformed(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(134, 134, 139));
        jLabel23.setText("Superficie");

        piramideSuperficie.setForeground(new java.awt.Color(134, 134, 139));
        piramideSuperficie.setEnabled(false);

        jLabel24.setForeground(new java.awt.Color(134, 134, 139));
        jLabel24.setText("Volumen");

        piramideVolumen.setForeground(new java.awt.Color(134, 134, 139));
        piramideVolumen.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(esferaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(esferaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(esferaVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(esferaSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esferaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cilindroBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cilindroRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(cilindroAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cilindroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cilindroVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cilindroSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(piramideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(piramideBase, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(piramideAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(piramideApotema, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(piramideBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(piramideVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(piramideSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(piramideBase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addGap(1, 1, 1)
                        .addComponent(piramideAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(piramideApotema, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(piramideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addGap(1, 1, 1)
                        .addComponent(piramideVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(1, 1, 1)
                        .addComponent(piramideSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(piramideBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(esferaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(esferaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addGap(1, 1, 1)
                        .addComponent(esferaVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(1, 1, 1)
                        .addComponent(esferaSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(esferaBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(cilindroRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(cilindroAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cilindroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(1, 1, 1)
                        .addComponent(cilindroVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(1, 1, 1)
                        .addComponent(cilindroSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cilindroBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void esferaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaBtnActionPerformed

        Esfera miesfera = new Esfera();
        miesfera.radio = Double.parseDouble(esferaRadio.getText());
        esferaVolumen.setText(String.valueOf(miesfera.volumen()));
        esferaSuperficie.setText(String.valueOf(miesfera.superficie()));
        
    }//GEN-LAST:event_esferaBtnActionPerformed

    private void esferaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaBtn1ActionPerformed
        esferaVolumen.setText("");
        esferaSuperficie.setText("");
        esferaRadio.setText("");
    }//GEN-LAST:event_esferaBtn1ActionPerformed

    private void cilindroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroBtnActionPerformed
        Cilindro micilindro = new Cilindro();
        micilindro.altura = Double.parseDouble(cilindroAltura.getText());
        micilindro.radio = Double.parseDouble(cilindroRadio.getText());
        cilindroVolumen.setText(String.valueOf(micilindro.volumen()));
        cilindroSuperficie.setText(String.valueOf(micilindro.superficie()));
    }//GEN-LAST:event_cilindroBtnActionPerformed

    private void cilindroBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroBtn1ActionPerformed
        cilindroSuperficie.setText("");
        cilindroVolumen.setText("");
        cilindroAltura.setText("");
        cilindroRadio.setText("");
    }//GEN-LAST:event_cilindroBtn1ActionPerformed

    private void piramideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piramideBtnActionPerformed
        Piramide mipiramide = new Piramide();
        mipiramide.altura = Double.parseDouble(piramideAltura.getText());
        mipiramide.base = Double.parseDouble(piramideBase.getText());
        mipiramide.apotema = Double.parseDouble(piramideApotema.getText());
        piramideVolumen.setText(String.valueOf(mipiramide.volumen()));
        piramideSuperficie.setText(String.valueOf(mipiramide.superficie()));
    }//GEN-LAST:event_piramideBtnActionPerformed

    private void piramideBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piramideBtn2ActionPerformed
        piramideAltura.setText("");
        piramideBase.setText("");
        piramideApotema.setText("");
        piramideVolumen.setText("");
        piramideSuperficie.setText("");
    }//GEN-LAST:event_piramideBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cilindroAltura;
    private javax.swing.JButton cilindroBtn;
    private javax.swing.JButton cilindroBtn1;
    private javax.swing.JTextField cilindroRadio;
    private javax.swing.JTextField cilindroSuperficie;
    private javax.swing.JTextField cilindroVolumen;
    private javax.swing.JButton esferaBtn;
    private javax.swing.JButton esferaBtn1;
    private javax.swing.JTextField esferaRadio;
    private javax.swing.JTextField esferaSuperficie;
    private javax.swing.JTextField esferaVolumen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField piramideAltura;
    private javax.swing.JTextField piramideApotema;
    private javax.swing.JTextField piramideBase;
    private javax.swing.JButton piramideBtn;
    private javax.swing.JButton piramideBtn2;
    private javax.swing.JTextField piramideSuperficie;
    private javax.swing.JTextField piramideVolumen;
    // End of variables declaration//GEN-END:variables
}
