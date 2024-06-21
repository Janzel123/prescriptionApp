/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import config.dbConnector;
import prescriptionapp.*;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Frank
 */
public class updateFinishedA extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public updateFinishedA() {
        initComponents();
        displayData();
    }
    
     public void displayData(){
        try{
            
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT tbl_appointment.a_id, tbl_appointment.a_date, tbl_appointment.a_time, tbl_patient.p_id, tbl_patient.p_name FROM tbl_appointment JOIN tbl_patient ON tbl_patient.p_id = tbl_appointment.p_id WHERE a_status = 'Pending'");
            apTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }

    Color navcolor = new Color(0,102,102);
    Color bodycolor = new Color(0,51,51);
    
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
        viewaPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        adddpPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        printdapPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        updatefaPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        adduserPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        logOutPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        apTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DocMinder");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 76, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-medical-insurance-64.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 11, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, -1, -1));

        viewaPanel.setBackground(new java.awt.Color(0, 102, 102));
        viewaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewaPanelMouseExited(evt);
            }
        });
        viewaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-view-schedule-30.png"))); // NOI18N
        viewaPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("View Appointments");
        viewaPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jPanel2.add(viewaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 50));

        adddpPanel.setBackground(new java.awt.Color(0, 102, 102));
        adddpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adddpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adddpPanelMouseExited(evt);
            }
        });
        adddpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Diagnosis");
        adddpPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("and Prescription");
        adddpPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 14));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-file-35.png"))); // NOI18N
        adddpPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(adddpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 70));

        printdapPanel.setBackground(new java.awt.Color(0, 102, 102));
        printdapPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printdapPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printdapPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printdapPanelMouseExited(evt);
            }
        });
        printdapPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Print Diagnosis");
        printdapPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("and Prescription");
        printdapPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 14));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-print-35.png"))); // NOI18N
        printdapPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanel2.add(printdapPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 70));

        updatefaPanel.setBackground(new java.awt.Color(0, 51, 51));
        updatefaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatefaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatefaPanelMouseExited(evt);
            }
        });
        updatefaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Update Finished");
        updatefaPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Appointments");
        updatefaPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 14));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-done-45.png"))); // NOI18N
        updatefaPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-done-45.png"))); // NOI18N
        updatefaPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 50));

        jPanel2.add(updatefaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 240, 70));

        adduserPanel.setBackground(new java.awt.Color(0, 102, 102));
        adduserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adduserPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adduserPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adduserPanelMouseExited(evt);
            }
        });
        adduserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Add User ");
        adduserPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-user-male-35.png"))); // NOI18N
        adduserPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jPanel2.add(adduserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 240, 50));

        logOutPanel.setBackground(new java.awt.Color(0, 102, 102));
        logOutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutPanelMouseExited(evt);
            }
        });
        logOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log Out");
        logOutPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-log-out-35.png"))); // NOI18N
        logOutPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jPanel2.add(logOutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 240, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Please choose appointment.");

        jButton2.setText("ENTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        apTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        apTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(apTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

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

    private void viewaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewaPanelMouseEntered
        viewaPanel.setBackground(bodycolor);
    }//GEN-LAST:event_viewaPanelMouseEntered

    private void viewaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewaPanelMouseExited
        viewaPanel.setBackground(navcolor);
    }//GEN-LAST:event_viewaPanelMouseExited

    private void adddpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddpPanelMouseEntered
        adddpPanel.setBackground(bodycolor);
    }//GEN-LAST:event_adddpPanelMouseEntered

    private void adddpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddpPanelMouseExited
        adddpPanel.setBackground(navcolor);
    }//GEN-LAST:event_adddpPanelMouseExited

    private void printdapPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdapPanelMouseEntered
        printdapPanel.setBackground(bodycolor);
    }//GEN-LAST:event_printdapPanelMouseEntered

    private void printdapPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdapPanelMouseExited
        printdapPanel.setBackground(navcolor);
    }//GEN-LAST:event_printdapPanelMouseExited

    private void updatefaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatefaPanelMouseEntered
        updatefaPanel.setBackground(bodycolor);
    }//GEN-LAST:event_updatefaPanelMouseEntered

    private void updatefaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatefaPanelMouseExited

    }//GEN-LAST:event_updatefaPanelMouseExited

    private void adduserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserPanelMouseEntered
        adduserPanel.setBackground(bodycolor);
    }//GEN-LAST:event_adduserPanelMouseEntered

    private void adduserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserPanelMouseExited
        adduserPanel.setBackground(navcolor);
    }//GEN-LAST:event_adduserPanelMouseExited

    private void logOutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutPanelMouseClicked
          loginForm lif = new loginForm();
        lif.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutPanelMouseClicked

    private void logOutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutPanelMouseEntered
        logOutPanel.setBackground(bodycolor);
    }//GEN-LAST:event_logOutPanelMouseEntered

    private void logOutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutPanelMouseExited
        logOutPanel.setBackground(navcolor);
    }//GEN-LAST:event_logOutPanelMouseExited

    private void viewaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewaPanelMouseClicked
        viewAppointments va = new viewAppointments();
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewaPanelMouseClicked

    private void adddpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddpPanelMouseClicked
        addDandPAT adp = new addDandPAT();
        adp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adddpPanelMouseClicked

    private void printdapPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdapPanelMouseClicked
        printDandP pdp = new printDandP();
        pdp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_printdapPanelMouseClicked

    private void adduserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserPanelMouseClicked
        addUser au = new addUser();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adduserPanelMouseClicked

    private void apTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apTableMouseClicked

    }//GEN-LAST:event_apTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        int rowIndex = apTable.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select an appointment!");
        }else{ 
            TableModel model = apTable.getModel();
          
            updateFinishedApp ufa = new updateFinishedApp();
        
            ufa.aid.setText(""+model.getValueAt(rowIndex, 0));    
            ufa.pname.setText(""+model.getValueAt(rowIndex, 4));
            ufa.date.setText(""+model.getValueAt(rowIndex, 1));
            ufa.time.setText(""+model.getValueAt(rowIndex, 2));
            ufa.setVisible(true);
            this.dispose();
            
          
                    
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(updateFinishedA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateFinishedA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateFinishedA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateFinishedA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new updateFinishedA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adddpPanel;
    private javax.swing.JPanel adduserPanel;
    private javax.swing.JTable apTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logOutPanel;
    private javax.swing.JPanel printdapPanel;
    private javax.swing.JPanel updatefaPanel;
    private javax.swing.JPanel viewaPanel;
    // End of variables declaration//GEN-END:variables
}
