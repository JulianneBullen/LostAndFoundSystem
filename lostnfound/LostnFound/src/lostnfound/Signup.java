
package lostnfound;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.zip.GZIPOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
 
public class Signup extends javax.swing.JFrame {

    private Connection connection;
    
    public Signup() {
        
        
        initComponents();
         initializeDatabaseConnection();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JTextField();
        jLabelComfirmPassword = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(15, 32, 42));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonSubmit.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButtonSubmit.setText("Register");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 32, 42)));

        jLabel9.setForeground(java.awt.Color.lightGray);
        jLabel9.setText("Username *");

        jLabel10.setForeground(java.awt.Color.lightGray);
        jLabel10.setText("Emai Address*");

        jLabelEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 32, 42)));

        jLabelComfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 32, 42)));
        jLabelComfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelComfirmPasswordActionPerformed(evt);
            }
        });

        jLabelPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 32, 42)));
        jLabelPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelPasswordActionPerformed(evt);
            }
        });

        jLabel11.setForeground(java.awt.Color.lightGray);
        jLabel11.setText("Password *");

        jLabel12.setForeground(java.awt.Color.lightGray);
        jLabel12.setText("Comfirm Password *");

        CancelButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(240, 231, 213));
        jLabel5.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Registration");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelUsername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelComfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)))
                .addGap(45, 45, 45))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
    String username = jLabelUsername.getText();
    String email = jLabelEmail.getText();
    String password = new String(jLabelPassword.getPassword());

    if (validateInputs()) {
        if (saveToDatabase(username, email, password)) {
            JOptionPane.showMessageDialog(this, "Registration successful!");

            // Open the LoginLNF window
            LoginLnF loginWindow = new LoginLnF();
            loginWindow.setVisible(true);

            // Close the current registration window
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Please try again.");
        }
    }
    }//GEN-LAST:event_jButtonSubmitActionPerformed
private boolean validateInputs() {
 String username = jLabelUsername.getText().trim();
    String email = jLabelEmail.getText().trim();
    
    if (username.isEmpty() || email.isEmpty() || jLabelPassword.getPassword().length == 0) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        return false;
    }

    String password = new String(jLabelPassword.getPassword()).trim();
    String confirmPassword = new String(jLabelComfirmPassword.getPassword()).trim();

    if (!password.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match.");
        return false;
    }

    return true;
}

 private boolean saveToDatabase(String username, String email, String password) {
  try {
            String query = "INSERT INTO admin (username, email, password) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                statement.setString(2, email);
                statement.setString(3, password);

                int rowsAffected = statement.executeUpdate();

                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error while saving to database: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
 


    private void jLabelComfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelComfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelComfirmPasswordActionPerformed

    private void jLabelPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPasswordActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
      try {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    // Create an instance of LoginLnF and set it to be visible
    LoginLnF loginFrame = new LoginLnF();
    
    // Center the LoginLnF frame on the screen
    loginFrame.setLocationRelativeTo(null);
    
    loginFrame.setVisible(true);

    // Close the current frame
    dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

   
    private void initializeDatabaseConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/lostnfound";
        String user = "root";
        String dbPassword = "";

        try {
            connection = DriverManager.getConnection(url, user, dbPassword);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jLabelComfirmPassword;
    private javax.swing.JTextField jLabelEmail;
    private javax.swing.JPasswordField jLabelPassword;
    private javax.swing.JTextField jLabelUsername;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
