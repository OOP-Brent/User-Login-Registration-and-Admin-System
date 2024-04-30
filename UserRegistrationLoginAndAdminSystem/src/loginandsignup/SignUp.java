
package loginandsignup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;



public class SignUp extends javax.swing.JFrame {

 
    public SignUp() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Usname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        SignUpBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN IN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setForeground(new java.awt.Color(51, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Andale Mono", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sign Up new Account");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 10, 270, 30);

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 120, 140, 40);

        Usname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Usname.setForeground(new java.awt.Color(102, 102, 102));
        Usname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsnameActionPerformed(evt);
            }
        });
        jPanel1.add(Usname);
        Usname.setBounds(410, 60, 200, 40);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/email.png"))); // NOI18N
        jLabel6.setText("Email: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 180, 110, 40);

        emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailAddress.setForeground(new java.awt.Color(102, 102, 102));
        emailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressActionPerformed(evt);
            }
        });
        jPanel1.add(emailAddress);
        emailAddress.setBounds(410, 180, 200, 40);

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/padlock (2).png"))); // NOI18N
        jLabel7.setText("Password: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 250, 120, 40);

        pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(pass);
        pass.setBounds(410, 250, 200, 40);

        SignUpBtn.setBackground(new java.awt.Color(0, 102, 102));
        SignUpBtn.setFont(new java.awt.Font("Andale Mono", 0, 13)); // NOI18N
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpBtn);
        SignUpBtn.setBounds(410, 320, 140, 50);

        jButton2.setFont(new java.awt.Font("Andale Mono", 0, 13)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(290, 450, 84, 31);

        jLabel8.setFont(new java.awt.Font("Andale Mono", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Go back to Login Menu:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 430, 180, 15);

        FullName.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(FullName);
        FullName.setBounds(410, 120, 200, 40);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (1).png"))); // NOI18N
        jLabel9.setText("Username: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 60, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/LoginSignInBackground.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 290, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // System.out.println("Sign up btn clicked");
        String fullName, userName, email, Password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        
        int result = JOptionPane.showConfirmDialog(null, "Sign up account?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(Usname.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(FullName.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Full Name is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(emailAddress.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if ((result == JOptionPane.NO_OPTION)){
                return;
            }else { 
            userName = Usname.getText();
            fullName = FullName.getText();
            email    = emailAddress.getText();
            Password = pass.getText();
            System.out.println(Password);
            
            query = "INSERT INTO user(full_name, username, email, password)"+
                    "VALUES('"+fullName+"', '"+userName+"', '"+email+"' , '"+Password+"')";
            
            st.execute(query);
            Usname.setText("");
            FullName.setText("");
            emailAddress.setText("");
            pass.setText("");
            showMessageDialog(null, "New account has been created successfully!");
            }
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void emailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressActionPerformed

    private void UsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsnameActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FullName;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextField Usname;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
