/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import PasswordEncryption.PasswordEncryption;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sreej
 * @author sujith
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public Login() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        Ecosystem.setInstance(system);
        //System.out.print(system.getOrderDirectory().getOrderdirectory().size());
    }
    
    public Login(Ecosystem eco){
        this.system = eco;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        userNameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        userRole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Vaccine1.jpg"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rightPanel.setBackground(new java.awt.Color(178, 198, 255));

        userNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        userNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        userNameTxt.setToolTipText("Username");
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordTxt.setToolTipText("Password");
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/padlock.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/user.png"))); // NOI18N

        signUpBtn.setBackground(new java.awt.Color(0, 102, 153));
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 153, 204));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        userRole.setBackground(new java.awt.Color(255, 255, 255));
        userRole.setForeground(new java.awt.Color(0, 0, 0));
        userRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Volunteer", "Clinic Officer", "Clinic Admin", "Sales Admin", "Sales Person", "Manufacturer", "Finance Admin", "Research Scientist", "Enterprise Admin", "Clinic Provider", "System Admin" }));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/hospital.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lao MN", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vaccine Management System");

        jButton2.setText("Quit Application");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userRole, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(signUpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(userRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn)
                    .addComponent(signUpBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
        if(userRole.getSelectedItem().toString().equals("Patient")){
        PatientRegistration rf = new PatientRegistration();
        rf.setVisible(true);
        dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Contact Respective Admin for Signining Up!");
        }

    }//GEN-LAST:event_signUpBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> pManager;
        if (userNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid username.");
        } else if (!passwordTxt.isValid()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid password.");
        } else if(userRole.getSelectedItem().toString().equals("System Admin") && userNameTxt.getText().equalsIgnoreCase("sysadmin") && passwordTxt.getText().equalsIgnoreCase("sysadmin")){
            SysAdminWorkArea WrkArea = new SysAdminWorkArea();
            WrkArea.setVisible(true);
            dispose();
        } else if (userRole.getSelectedItem().toString().equals("Patient")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            System.out.print(pManager.keySet());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                System.out.print(system.getPatientdirectory().getPatientMap().get(userNameTxt.getText()).getFirstName());
                //dB4OUtil.storeSystem(system);
                PatientWorkArea patWrkArea = new PatientWorkArea(system.getPatientdirectory().getPatientMap().get(userNameTxt.getText()));
                patWrkArea.setVisible(true);
                dispose();
            }
        }else if (userRole.getSelectedItem().toString().equals("Volunteer")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            //System.out.print(pManager.keySet());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                VolunteerWorkArea volWrkArea = new VolunteerWorkArea(system.getVolunteerDirectory().getVolunteerMap().get(userNameTxt.getText()));
                volWrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Clinic Officer")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                ClinicOfficerInterface wrkArea = new ClinicOfficerInterface(system.getClinicofficerdirectory().getClinicOfficerMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Clinic Admin")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                ClinicAdminWorkArea wrkArea = new ClinicAdminWorkArea(system.getClinicAdminDirectory().getClinicAdminMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Sales Admin")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                SalesAdminWorkArea wrkArea = new SalesAdminWorkArea(system.getSalesAdminDirectory().getSalesAdminMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Sales Person")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                SalesPersonWorkArea wrkArea = new SalesPersonWorkArea(system.getSalesPersonDirectory().getSalesPersonMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Manufacturer")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                ManufacturerWorkArea wrkArea = new ManufacturerWorkArea(system.getManufacturerCatalog().getManufacturerMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Finance Admin")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                FinanceAdminWorkArea wrkArea = new FinanceAdminWorkArea(system.getFinanceAdminDirectory().getFinanceAdminMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Research Scientist")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                ResearchScientistWorkArea wrkArea = new ResearchScientistWorkArea(system.getResearchScientistDirectory().getResearchScientistMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Clinic Provider")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                ClinicProviderWorkArea wrkArea = new ClinicProviderWorkArea(system.getClinicProviderDirectory().getClinicprovidermap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
        else if (userRole.getSelectedItem().toString().equals("Enterprise Admin")) {
            pManager = system.passwordManager.getPasswordManager().get(userRole.getSelectedItem().toString());
            if (!(pManager.containsKey(userNameTxt.getText())
                    && PasswordEncryption.matchPassword(pManager.get(userNameTxt.getText()), passwordTxt.getText()))) {
                JOptionPane.showMessageDialog(this, "Login Failed, please enter valid credentials.");
            } else {
                JOptionPane.showMessageDialog(this, "Login Sucessful!");
                EnterpriseAdminWorkArea wrkArea = new EnterpriseAdminWorkArea(system.getEnterpriseAdminDirectory().getEnterpriseAdminMap().get(userNameTxt.getText()));
                wrkArea.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JComboBox<String> userRole;
    // End of variables declaration//GEN-END:variables
}
