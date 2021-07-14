/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author Sagi_H
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        pnlBlack = new javax.swing.JPanel();
        pnlFront2 = new javax.swing.JPanel();
        lblIcon2 = new javax.swing.JLabel();
        btnDoctor2 = new javax.swing.JButton();
        btnAlert = new javax.swing.JButton();
        btnPatient2 = new javax.swing.JButton();
        btnDonor2 = new javax.swing.JButton();
        btnNurse2 = new javax.swing.JButton();
        btnReport2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        pnlBlack.setBackground(new java.awt.Color(102, 102, 102));

        pnlFront2.setBackground(new java.awt.Color(255, 255, 255));
        pnlFront2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        btnDoctor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDoctor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Doctors.png"))); // NOI18N
        btnDoctor2.setText("  DOCTOR");
        btnDoctor2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDoctor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctor2ActionPerformed(evt);
            }
        });

        btnAlert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/emergency.png"))); // NOI18N
        btnAlert.setText("  ALERT");
        btnAlert.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertActionPerformed(evt);
            }
        });

        btnPatient2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPatient2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/patient.png"))); // NOI18N
        btnPatient2.setText("  PATIENT");
        btnPatient2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatient2ActionPerformed(evt);
            }
        });

        btnDonor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDonor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/donor.png"))); // NOI18N
        btnDonor2.setText("  DONOR");
        btnDonor2.setToolTipText("");
        btnDonor2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonor2ActionPerformed(evt);
            }
        });

        btnNurse2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNurse2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Nurse.png"))); // NOI18N
        btnNurse2.setText("  NURSE");
        btnNurse2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNurse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNurse2ActionPerformed(evt);
            }
        });

        btnReport2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReport2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Report.png"))); // NOI18N
        btnReport2.setText("  REPORT");
        btnReport2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReport2ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("LOGOUT");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("USER");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Help.png"))); // NOI18N
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFront2Layout = new javax.swing.GroupLayout(pnlFront2);
        pnlFront2.setLayout(pnlFront2Layout);
        pnlFront2Layout.setHorizontalGroup(
            pnlFront2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFront2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIcon2)
                .addGap(73, 73, 73)
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(pnlFront2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlFront2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDonor2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoctor2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNurse2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFront2Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        pnlFront2Layout.setVerticalGroup(
            pnlFront2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFront2Layout.createSequentialGroup()
                .addGroup(pnlFront2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFront2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFront2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHelp)))
                .addGap(27, 27, 27)
                .addComponent(btnDonor2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnPatient2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDoctor2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnNurse2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(pnlFront2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBlackLayout = new javax.swing.GroupLayout(pnlBlack);
        pnlBlack.setLayout(pnlBlackLayout);
        pnlBlackLayout.setHorizontalGroup(
            pnlBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFront2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBlackLayout.setVerticalGroup(
            pnlBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFront2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReport2ActionPerformed

        Report R = new Report();
        R.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReport2ActionPerformed

    private void btnPatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatient2ActionPerformed

        Patient P = new Patient();
        P.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnPatient2ActionPerformed

    private void btnDoctor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctor2ActionPerformed

        Doctor D = new Doctor();
        D.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnDoctor2ActionPerformed

    private void btnDonor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonor2ActionPerformed

        Donor uop = new Donor();
        uop.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDonor2ActionPerformed

    private void btnNurse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNurse2ActionPerformed

        Nurse N = new Nurse();
        N.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnNurse2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        Login L = new Login();
        L.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        UserUI U = new UserUI();
        U.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed

        Help HP = new Help();
        HP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertActionPerformed

        Alert E = new Alert();
        E.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAlertActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlert;
    private javax.swing.JButton btnDoctor2;
    private javax.swing.JButton btnDonor2;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnNurse2;
    private javax.swing.JButton btnPatient2;
    private javax.swing.JButton btnReport2;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JPanel pnlBlack;
    private javax.swing.JPanel pnlFront2;
    // End of variables declaration//GEN-END:variables
}
