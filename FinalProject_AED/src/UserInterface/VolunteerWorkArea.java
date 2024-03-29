/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.Appointment.Appointment;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Orders.Orders;
import Business.Role.SalesPerson;
import Business.Role.Volunteer;
import Business.vaccine.Vaccine;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tendusmac
 */
public class VolunteerWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form VolunteerWorkArea
     *
     */
    Appointment ad;
    Ecosystem ecoSystem = Ecosystem.getInstance();
    Volunteer vou;
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public VolunteerWorkArea(Volunteer v) {
        initComponents();
//        ecoSystem = dB4OUtil.retrieveSystem();
//        Ecosystem.setInstance(ecoSystem);
        this.vou = v;
        welcome.setText("Hello "+v.getFirstName()+" "+v.getLastName());
        PopulateVolunteerWorkAreaTable();
        jPanel4.setBackground(new Color(255, 255, 255, 90));
        workPanel.setBackground(new Color(255, 255, 255, 100));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        workPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        comments1 = new javax.swing.JTextField();
        status1 = new javax.swing.JComboBox<>();
        backbutton1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        opacityPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Status");

        update1.setBackground(new java.awt.Color(0, 102, 150));
        update1.setForeground(new java.awt.Color(255, 255, 255));
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        welcome.setText("Volunteer Work Area");

        vTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "App ID", "First Name", "Last name", "Date of Birth", "Gender", "Email ID", "Phone Number", "AppointmentDate", "AppStatus", "Price", "Comments"
            }
        ));
        jScrollPane3.setViewportView(vTable);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Comments");

        status1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vaccinated", "On Hold", "Rejected", "Payment Pending", "Vaccine not available" }));

        backbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/previous (4).png"))); // NOI18N
        backbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbutton1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274)
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update1))
                                .addGap(33, 33, 33))
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(update1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(workPanel);
        workPanel.setBounds(0, 0, 1200, 670);

        jPanel4.setAlignmentY(0.0F);
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vaccine3.jpg"))); // NOI18N
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel4.add(jLabel4);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1200, 700);

        opacityPanel.setBackground(new java.awt.Color(255, 255, 255));
        opacityPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        opacityPanel.setLayout(new javax.swing.OverlayLayout(opacityPanel));
        jPanel1.add(opacityPanel);
        opacityPanel.setBounds(0, 0, 1200, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
        boolean validatedOtherFields = false;
        String status = status1.getSelectedItem() == null ? "" : status1.getSelectedItem().toString();
        
        if(!status.isEmpty()){
             validatedOtherFields = true;
        }
        else {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
        
        int s = vTable.getSelectedRow();
        
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Please select an Appointment");
        } else {
            for (Appointment c : ecoSystem.getAppointmenthistory().getAppointmenthistory()) {
                if (ad == c) {
                    c.setAppointmentstatus(status1.getSelectedItem().toString());
                    c.setComments(comments1.getText());
                    JOptionPane.showMessageDialog(this, "Appointment Updation Successful");
                    PopulateVolunteerWorkAreaTable();
                    break;
                }
            }
        }


    }//GEN-LAST:event_update1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int s = vTable.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Please Select Appointment");
        } else {
            for (Appointment c : ecoSystem.getAppointmenthistory().getAppointmenthistory()) {
                if (c.getAppid().equals(vTable.getValueAt(s, 0).toString())) {
                    ad = c;
                    status1.setSelectedItem(c.getAppointmentstatus());
                    comments1.setText(c.getComments());
                    JOptionPane.showMessageDialog(this, "Selected Appointment");
                    break;
                }

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbutton1MouseClicked
        // TODO add your handling code here:
        
        dB4OUtil.storeSystem(Ecosystem.getInstance());
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public void PopulateVolunteerWorkAreaTable() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) vTable.getModel();
        model.setRowCount(0);
        for (Appointment vObj : ecoSystem.getAppointmenthistory().getAppointmenthistory()) {

            if (vObj.getVolunteer().getVolunteerId().equals(vou.getVolunteerId())) {
                Object[] row = new Object[11];
                row[0] = vObj.getAppid();
                row[1] = vObj.getPatient().getFirstName();
                row[2] = vObj.getPatient().getLastName();
                row[3] = dateFormat.format(vObj.getPatient().getDateOfBirth());
                row[4] = vObj.getPatient().getGender();
                row[5] = vObj.getPatient().getEmailId();

                row[6] = vObj.getPatient().getPhoneNumber();
                row[7] = vObj.getDate();
                row[8] = vObj.getAppointmentstatus();
                row[9] = vObj.getPrice();
                row[10] = vObj.getComments();

                model.addRow(row);
            }

        }
    }

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
            java.util.logging.Logger.getLogger(VolunteerWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolunteerWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolunteerWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolunteerWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VolunteerWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbutton1;
    private javax.swing.JTextField comments1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel opacityPanel;
    private javax.swing.JComboBox<String> status1;
    private javax.swing.JButton update1;
    private javax.swing.JTable vTable;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
