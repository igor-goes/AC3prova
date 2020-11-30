/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sprint3.igor;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Artilheiros = new javax.swing.JTextArea();
        btSaoPaulo = new javax.swing.JButton();
        btPalmeiras = new javax.swing.JButton();
        btSantos = new javax.swing.JButton();
        btJuventus = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textIdolo = new javax.swing.JLabel();
        textMaior = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textTitulo = new javax.swing.JLabel();
        textBemVindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Artilheiros");

        Artilheiros.setColumns(20);
        Artilheiros.setRows(5);
        jScrollPane1.setViewportView(Artilheiros);

        btSaoPaulo.setBackground(new java.awt.Color(255, 0, 0));
        btSaoPaulo.setText("São Paulo");
        btSaoPaulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaoPauloActionPerformed(evt);
            }
        });

        btPalmeiras.setBackground(new java.awt.Color(0, 204, 0));
        btPalmeiras.setText("Palmeiras");
        btPalmeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalmeirasActionPerformed(evt);
            }
        });

        btSantos.setText("Santos");
        btSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSantosActionPerformed(evt);
            }
        });

        btJuventus.setBackground(new java.awt.Color(102, 0, 0));
        btJuventus.setText("Juventus");
        btJuventus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJuventusActionPerformed(evt);
            }
        });

        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jLabel2.setText("Maior Ídolo:");

        jLabel4.setText("Maior Título");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btSaoPaulo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(btPalmeiras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSantos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btJuventus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textIdolo)
                                    .addComponent(textTitulo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(textMaior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btsair)
                            .addComponent(textBemVindo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btsair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textBemVindo)
                        .addGap(89, 89, 89)
                        .addComponent(btSaoPaulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPalmeiras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSantos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btJuventus)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textIdolo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(textTitulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMaior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaoPauloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaoPauloActionPerformed

        SaoPaulo saopaulo = new SaoPaulo();
        
        Artilheiros.setText(saopaulo.topArtilheiro());
        textBemVindo.setText(saopaulo.BemVindo());
        textIdolo.setText(saopaulo.idolos());
        textMaior.setText(saopaulo.Maior());
        textTitulo.setText(saopaulo.Titulos());
    }//GEN-LAST:event_btSaoPauloActionPerformed

    private void btSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSantosActionPerformed
        
        Santos santos = new Santos();
        
        Artilheiros.setText(santos.topArtilheiro());
        textBemVindo.setText(santos.BemVindo());
        textIdolo.setText(santos.idolos());
        textMaior.setText(santos.Maior());
        textTitulo.setText(santos.Titulos());
    }//GEN-LAST:event_btSantosActionPerformed

    private void btPalmeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalmeirasActionPerformed
        
        Palmeiras palmeiras = new Palmeiras();
        
        Artilheiros.setText(palmeiras.topArtilheiro()); 
        textBemVindo.setText(palmeiras.BemVindo());
        textIdolo.setText(palmeiras.idolos());
        textMaior.setText(palmeiras.Maior());
        textTitulo.setText(palmeiras.Titulos());

    }//GEN-LAST:event_btPalmeirasActionPerformed

    private void btJuventusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJuventusActionPerformed
        
        Juventus juventus = new Juventus();
        
        Artilheiros.setText(juventus.topArtilheiro());
        textBemVindo.setText(juventus.BemVindo());
        textIdolo.setText(juventus.idolos());
        textMaior.setText(juventus.Maior());
        textTitulo.setText(juventus.Titulos());
    }//GEN-LAST:event_btJuventusActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        TelaUsuario login01 = new TelaUsuario();
        login01.setVisible(true);
    }//GEN-LAST:event_btsairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Artilheiros;
    private javax.swing.JButton btJuventus;
    private javax.swing.JButton btPalmeiras;
    private javax.swing.JButton btSantos;
    private javax.swing.JButton btSaoPaulo;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel textBemVindo;
    protected javax.swing.JLabel textIdolo;
    protected javax.swing.JLabel textMaior;
    protected javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables
}
