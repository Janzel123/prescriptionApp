/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontdesk;

import doctor.*;
import prescriptionapp.*;



import java.awt.Color;

/**
 *
 * @author Frank
 */
public class canresAppointment extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public canresAppointment() {
        initComponents();
    }

    Color navcolor = new Color(0,102,102);
    Color bodycolor = new Color(0,51,51);

    Color incolor = new Color(204,204,204);
    Color outcolor = new Color(255,255,255);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addpPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addaPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        printaPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        printdpPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateaPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DocMinder");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(33, 76, 176, 35);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-medical-insurance-64.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(88, 11, 64, 64);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("____________________________________________");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 117, 264, 14);

        addpPanel.setBackground(new java.awt.Color(0, 102, 102));
        addpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addpPanelMouseExited(evt);
            }
        });
        addpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-user-male-35.png"))); // NOI18N
        addpPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Add Patient");
        addpPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 30));

        jPanel2.add(addpPanel);
        addpPanel.setBounds(0, 140, 240, 50);

        addaPanel.setBackground(new java.awt.Color(0, 102, 102));
        addaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addaPanelMouseExited(evt);
            }
        });
        addaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Appointment");
        addaPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-properties-35.png"))); // NOI18N
        addaPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(addaPanel);
        addaPanel.setBounds(0, 190, 240, 50);

        printaPanel.setBackground(new java.awt.Color(0, 102, 102));
        printaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printaPanelMouseExited(evt);
            }
        });
        printaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Print Appointment");
        printaPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-print-35.png"))); // NOI18N
        printaPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanel2.add(printaPanel);
        printaPanel.setBounds(0, 240, 240, 60);

        printdpPanel.setBackground(new java.awt.Color(0, 102, 102));
        printdpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printdpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printdpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printdpPanelMouseExited(evt);
            }
        });
        printdpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Print Diagnosis");
        printdpPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-print-35.png"))); // NOI18N
        printdpPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("and Prescription");
        printdpPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 14));

        jPanel2.add(printdpPanel);
        printdpPanel.setBounds(0, 300, 240, 50);

        updateaPanel.setBackground(new java.awt.Color(0, 51, 51));
        updateaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateaPanelMouseExited(evt);
            }
        });
        updateaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Update Appointment");
        updateaPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-schedule-35.png"))); // NOI18N
        updateaPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jPanel2.add(updateaPanel);
        updateaPanel.setBounds(0, 360, 240, 50);

        logoutPanel.setBackground(new java.awt.Color(0, 102, 102));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutPanelMouseExited(evt);
            }
        });
        logoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log Out");
        logoutPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-log-out-35.png"))); // NOI18N
        logoutPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jPanel2.add(logoutPanel);
        logoutPanel.setBounds(0, 450, 240, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Please enter new schedule.");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 120, 560, 19);

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backPanelMouseExited(evt);
            }
        });
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-back-30.png"))); // NOI18N
        backPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel3.add(backPanel);
        backPanel.setBounds(520, 10, 40, 40);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(110, 200, 350, 41);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Date (YYYY-MM-DD):");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(110, 170, 180, 22);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Time:");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(110, 260, 45, 22);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6);
        jTextField6.setBounds(110, 290, 350, 41);

        jButton2.setText("ENTER");
        jPanel3.add(jButton2);
        jButton2.setBounds(390, 350, 70, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 560, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpPanelMouseExited
        addpPanel.setBackground(navcolor);
    }//GEN-LAST:event_addpPanelMouseExited

    private void addpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpPanelMouseEntered
        addpPanel.setBackground(bodycolor);
    }//GEN-LAST:event_addpPanelMouseEntered

    private void addaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaPanelMouseEntered
        addaPanel.setBackground(bodycolor);
    }//GEN-LAST:event_addaPanelMouseEntered

    private void addaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaPanelMouseExited
        addaPanel.setBackground(navcolor);
    }//GEN-LAST:event_addaPanelMouseExited

    private void printaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printaPanelMouseEntered
        printaPanel.setBackground(bodycolor);
    }//GEN-LAST:event_printaPanelMouseEntered

    private void printaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printaPanelMouseExited
        printaPanel.setBackground(navcolor);
    }//GEN-LAST:event_printaPanelMouseExited

    private void printdpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdpPanelMouseEntered
        printdpPanel.setBackground(bodycolor);
    }//GEN-LAST:event_printdpPanelMouseEntered

    private void printdpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdpPanelMouseExited
        printdpPanel.setBackground(navcolor);
    }//GEN-LAST:event_printdpPanelMouseExited

    private void updateaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateaPanelMouseEntered
        updateaPanel.setBackground(bodycolor);
    }//GEN-LAST:event_updateaPanelMouseEntered

    private void updateaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateaPanelMouseExited

    }//GEN-LAST:event_updateaPanelMouseExited

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
        logoutPanel.setBackground(bodycolor);
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
        logoutPanel.setBackground(navcolor);
    }//GEN-LAST:event_logoutPanelMouseExited

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
          loginForm lif = new loginForm();
        lif.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void addpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpPanelMouseClicked
        addPatient ap = new addPatient();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addpPanelMouseClicked

    private void addaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addaPanelMouseClicked
        addAppointment aa = new addAppointment();
        aa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addaPanelMouseClicked

    private void printaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printaPanelMouseClicked
        printAppointment pa = new printAppointment();
        pa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_printaPanelMouseClicked

    private void printdpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdpPanelMouseClicked
        printDiagPres pdp = new printDiagPres();
        pdp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_printdpPanelMouseClicked

    private void backPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseEntered

    backPanel.setBackground(incolor);
        
    }//GEN-LAST:event_backPanelMouseEntered

    private void backPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseExited
        backPanel.setBackground(outcolor);
    }//GEN-LAST:event_backPanelMouseExited

    private void backPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseClicked

        updateAppointment ua = new updateAppointment();
        ua.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backPanelMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(canresAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(canresAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(canresAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(canresAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new canresAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addaPanel;
    private javax.swing.JPanel addpPanel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel printaPanel;
    private javax.swing.JPanel printdpPanel;
    private javax.swing.JPanel updateaPanel;
    // End of variables declaration//GEN-END:variables
}