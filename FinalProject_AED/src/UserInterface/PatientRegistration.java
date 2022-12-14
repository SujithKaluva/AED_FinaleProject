/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Location.GoogleMapsLocation;
import Business.Role.Patient;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author sreej
 */
public class PatientRegistration extends javax.swing.JFrame {

    /**
     * Creates new form PatientReg
     */
    Ecosystem ecoSystem = Ecosystem.getInstance();
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public PatientRegistration() {
        initComponents();
       
        fname.setName("patientFirstName");        
        lname.setName("patientLastName");
        email.setName("patientEmailId");
        dob.setName("patientDOB");
        gender.setName("patientGender");
        phone.setName("patientPhone");
        password.setName("password");
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
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        gender = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setLayout(null);
        jPanel1.add(fname);
        fname.setBounds(490, 100, 190, 30);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 100, 100, 30);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 160, 70, 17);
        jPanel1.add(lname);
        lname.setBounds(490, 150, 190, 30);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Phone Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 220, 100, 17);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date of Birth");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 270, 80, 17);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 320, 50, 17);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 370, 50, 20);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 420, 58, 17);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Location");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 470, 50, 17);
        jPanel1.add(phone);
        phone.setBounds(490, 210, 190, 30);
        jPanel1.add(dob);
        dob.setBounds(490, 260, 190, 30);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel1.add(gender);
        gender.setBounds(490, 310, 190, 30);
        jPanel1.add(email);
        email.setBounds(490, 360, 190, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(490, 410, 190, 30);

        loc.setEditable(false);
        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        jPanel1.add(loc);
        loc.setBounds(490, 460, 190, 30);

        jButton1.setBackground(new java.awt.Color(24, 85, 145));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Set Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 460, 120, 30);

        jButton2.setBackground(new java.awt.Color(48, 145, 242));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(840, 460, 120, 30);

        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(420, 530, 90, 30);

        register.setBackground(new java.awt.Color(0, 102, 150));
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(520, 530, 110, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/previous (4).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 40, 32, 32);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/blur-hospital (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        boolean validated = false;
        boolean validatedOtherFields = false;
        String selectedGender = gender.getSelectedItem().toString();
      
        JDateChooser strtDt = dob;
        if(strtDt!=null){
            validatedOtherFields = true;
        }
        else{
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
        JTextField[] VARIABLE_CONSTANTS = {fname, lname, email, phone,password};
        for (JTextField field : VARIABLE_CONSTANTS) {
            if (!validateData(field)) {
                validated = false;
                break;
            } else {
                validated = true;
                System.out.println("Validated");
            }
        }

        if (validated && validatedOtherFields) {
            
            //String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber
            Patient patient = new Patient(password.getText(),fname.getText(), lname.getText(), dob.getDate(), email.getText(), gender.getSelectedItem().toString(), Long.parseLong(phone.getText()), loc.getText());
            //System.out.println("Patient Size" + ecoSystem.getPatientDirectory().getPatientList().size());
            //System.out.println("Person Size" + ecoSystem.getPersonDirectory().getPersonList().size());

            //back to login page
            dB4OUtil.storeSystem(Ecosystem.getInstance());
            Login rf = new Login();
            rf.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
    }                                             

    public boolean validateData(JComponent input) {
        String name = input.getName();
        String errorMsg = "";
        boolean raiseError = false;
        String text = ((JTextField) input).getText().trim();
        if (text == null || text.isEmpty()) {
            raiseError = true;
            errorMsg = String.format("Please enter a value. The value for %s cannot be empty", name);
        } else {
            switch (name) {
                case "patientFirstName":
                    if (!text.matches("^[a-zA-z ]*$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientLastName":
                    if (!text.matches("^[a-zA-z ]*$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientPhone":
                    if (!text.matches("^[0-9]{10}")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "patientEmailId":
                    if (!ecoSystem.getPasswordManager().isUsernameAvailable(text,"Patient")) {
                        raiseError = true;
                        errorMsg = String.format("Email Id already exists, please enter a valid mail Id", name);
                        break;
                    }
                    if (!text.matches("^(.+)@(.+)$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                   }
                    break;
                case "patientZipCode":
                    if (!text.matches("^[0-9]{5}")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;

                default:
                    break;
            }
        }
        if (raiseError) {
            JOptionPane.showMessageDialog(this, errorMsg);
            return false;
        }
        return true;
    }//GEN-LAST:event_registerActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        Login home = new Login();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    public void populateLongituteLatitude(GoogleMapsLocation locationPoint) {
//        uLocation.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        uLocation.setForeground(Color.BLACK);
//        this.locationPoint = locationPoint;
        loc.setText(locationPoint.getLatitude() + "," + locationPoint.getLongitude());
    }
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Login home = new Login();
        //((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Location lobj = new Location();
        lobj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateLongituteLatitude(ecoSystem.getgMapsLocation());
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
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField loc;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
