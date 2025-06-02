
package VIEWER;
import MODEL.my_methods;
import javax.swing.JOptionPane;
import javax.swing.*;
public class SignUp extends javax.swing.JFrame {

  
    public SignUp() {
        initComponents();
    }
    my_methods obj = new my_methods();

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        txt_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Right.setBackground(new java.awt.Color(0, 0, 0));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\473145755_582658941192825_2220336435085207578_n.jpg")); // NOI18N
        jLabel15.setText("jLabel14");
        Right.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-520, -130, -1, -1));

        jPanel1.add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 800));

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 215, 0));
        jLabel1.setText("P");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 100, 60));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fullname:");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txt_fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_fullname.setForeground(new java.awt.Color(102, 102, 102));
        txt_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullnameActionPerformed(evt);
            }
        });
        Left.add(txt_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 343, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));
        Left.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 343, 40));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("U");
        Left.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 50, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 60)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("S");
        Left.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 50, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 215, 0));
        jLabel11.setText("IGN");
        Left.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 60));

        SignUp.setBackground(new java.awt.Color(255, 215, 0));
        SignUp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SignUp.setText("SIGN UP");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        Left.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 250, 36));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        Left.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 343, 40));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Email:");
        Left.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(102, 102, 102));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        Left.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 343, 40));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Username:");
        Left.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jPanel1.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 470, 580));

        BACK.setBackground(new java.awt.Color(255, 215, 0));
        BACK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BACK.setText("jButton1");
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 700, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
    String fullName = txt_fullname.getText();
    String email = txt_email.getText();
    String username = txt_username.getText();
    String password = txt_password.getText();

    if (fullName.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        return;
    }

    String existingUser = obj.databal("SELECT username FROM tbl_admin WHERE username = '" + username + "'", "username");
    if (!existingUser.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username already taken. Please choose another one.");
        return;
    }

    obj.Chony("INSERT INTO tbl_admin (full_name, email, username, password) VALUES ('" + fullName + "', '" + email + "', '" + username + "', '" + password + "')");

    JOptionPane.showMessageDialog(null, "Sign-up successful! You can now log in.");

    txt_fullname.setText("");
    txt_email.setText("");
    txt_username.setText("");
    txt_password.setText("");

    Login login = new Login();
    login.setVisible(true);
    login.setLocationRelativeTo(this);
    this.dispose();
    }//GEN-LAST:event_SignUpActionPerformed

    private void txt_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullnameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
