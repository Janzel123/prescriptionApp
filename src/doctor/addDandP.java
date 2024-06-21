/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import config.Session;
import config.dbConnector;
import frontdesk.frontdeskDashboard;
import prescriptionapp.*;

import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Frank
 */
public class addDandP extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public addDandP() {
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
        jLabel22 = new javax.swing.JLabel();
        diagnosis = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        medicine = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        dosage = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        frequency = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        did = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        adddpPanel.setBackground(new java.awt.Color(0, 51, 51));
        adddpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
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

        updatefaPanel.setBackground(new java.awt.Color(0, 102, 102));
        updatefaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatefaPanelMouseClicked(evt);
            }
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
        jPanel3.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setText("Enter Diagnosis:");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(30, 260, 116, 19);

        diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisActionPerformed(evt);
            }
        });
        jPanel3.add(diagnosis);
        diagnosis.setBounds(180, 260, 350, 40);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel23.setText("Enter Medicine:");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(30, 310, 132, 19);

        medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineActionPerformed(evt);
            }
        });
        jPanel3.add(medicine);
        medicine.setBounds(180, 310, 350, 40);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel24.setText("Dosage (mg):");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(30, 370, 115, 19);

        dosage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageActionPerformed(evt);
            }
        });
        jPanel3.add(dosage);
        dosage.setBounds(180, 360, 350, 40);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel25.setText("Frequency:");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(30, 420, 77, 19);

        frequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyActionPerformed(evt);
            }
        });
        jPanel3.add(frequency);
        frequency.setBounds(180, 411, 350, 40);

        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(460, 460, 70, 30);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel26.setText("(times per day)");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(30, 450, 104, 19);

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

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-back-30.png"))); // NOI18N
        backPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        jPanel3.add(backPanel);
        backPanel.setBounds(530, 0, 30, 40);

        aid.setEnabled(false);
        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });
        jPanel3.add(aid);
        aid.setBounds(180, 10, 350, 40);

        jLabel27.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel27.setText("Appointment ID:");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(30, 10, 111, 19);

        jLabel30.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel30.setText("Patient's Name:");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(30, 210, 140, 19);

        pname.setEnabled(false);
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel3.add(pname);
        pname.setBounds(180, 210, 350, 40);

        jLabel31.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel31.setText("Doctor's Name:");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(30, 110, 140, 19);

        dname.setEnabled(false);
        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });
        jPanel3.add(dname);
        dname.setBounds(180, 111, 350, 40);

        pid.setEnabled(false);
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        jPanel3.add(pid);
        pid.setBounds(180, 160, 350, 40);

        jLabel32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel32.setText("Patient's ID:");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(30, 160, 140, 19);

        jLabel29.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel29.setText("Doctor's ID:");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(30, 60, 81, 19);

        did.setEnabled(false);
        did.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didActionPerformed(evt);
            }
        });
        jPanel3.add(did);
        did.setBounds(180, 60, 350, 40);

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
        updatefaPanel.setBackground(navcolor);
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

    private void printdapPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printdapPanelMouseClicked
        printDandP pdp = new printDandP();
        pdp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_printdapPanelMouseClicked

    private void updatefaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatefaPanelMouseClicked
         updateFinishedA ufa = new updateFinishedA();
        ufa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatefaPanelMouseClicked

    private void adduserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserPanelMouseClicked
        addUser au = new addUser();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adduserPanelMouseClicked

    private void diagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosisActionPerformed

    private void medicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineActionPerformed

    private void dosageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosageActionPerformed

    private void frequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyActionPerformed

    private void backPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseClicked

        addDandPAT adpat = new addDandPAT();
        adpat.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_backPanelMouseClicked

    private void backPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseEntered

        backPanel.setBackground(incolor);

    }//GEN-LAST:event_backPanelMouseEntered

    private void backPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseExited
        backPanel.setBackground(outcolor);
    }//GEN-LAST:event_backPanelMouseExited

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Session sess = Session.getInstance();
        
        
          if(diagnosis.getText().isEmpty() || medicine.getText().isEmpty() || dosage.getText().isEmpty() || frequency.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "All fields are required!");
      }else{
          dbConnector dbc = new dbConnector();
    
            if(dbc.insertData("INSERT INTO tbl_prescription(u_id, a_id, p_id, pr_diagnosis, pr_medicine, pr_dosage, pr_frequency) "
            + "VALUES ('"+sess.getUid()+"','"+aid.getText()+"','"+pid.getText()+"','"+diagnosis.getText()+"','"+medicine.getText()+"','"+dosage.getText()+"','"+frequency.getText()+"')"))
            {
                JOptionPane.showMessageDialog(null, "Prescription Added!");
                
                doctorDashboard ddb = new doctorDashboard();
                ddb.setVisible(true);
                this.dispose();
    
            }
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
         Session sess = Session.getInstance();
        if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No Account, Login First!");
            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();
        }
        
        did.setText(""+sess.getUid());
        dname.setText(""+sess.getUname());
       
        
    }//GEN-LAST:event_formWindowActivated

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void didActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_didActionPerformed

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
            java.util.logging.Logger.getLogger(addDandP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDandP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDandP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDandP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDandP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adddpPanel;
    private javax.swing.JPanel adduserPanel;
    public javax.swing.JTextField aid;
    private javax.swing.JPanel backPanel;
    private javax.swing.JTextField diagnosis;
    public javax.swing.JTextField did;
    public javax.swing.JTextField dname;
    private javax.swing.JTextField dosage;
    private javax.swing.JTextField frequency;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel logOutPanel;
    private javax.swing.JTextField medicine;
    public javax.swing.JTextField pid;
    public javax.swing.JTextField pname;
    private javax.swing.JPanel printdapPanel;
    private javax.swing.JPanel updatefaPanel;
    private javax.swing.JPanel viewaPanel;
    // End of variables declaration//GEN-END:variables
}
