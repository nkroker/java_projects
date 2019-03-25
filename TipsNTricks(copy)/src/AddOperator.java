import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nikhil
 */
public class AddOperator extends javax.swing.JFrame {

    /**
     * Creates new form AddOperator
     */
    public AddOperator() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 204, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 0, 117, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabel6.setText("A D D  O P E R A T O R");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 94, -1, -1));

        jLabel7.setText("Name: ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 132, 66, 30));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 314, 30));

        jLabel8.setText("Email: ");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 171, 66, 28));
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 314, 33));

        jLabel11.setText("Username: ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 211, 79, 28));
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 314, 33));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanel5.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 314, 34));

        jLabel12.setText("Password: ");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 79, 34));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 577, 79, 28));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 314, 33));

        jLabel13.setText("Address: ");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 79, 28));

        jLabel15.setText("Gov. ID.no:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 79, 28));
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 314, 33));

        jLabel16.setText("Age: ");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 79, 28));
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 314, 33));

        jLabel17.setText("Gender: ");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 79, 28));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Female");
        jPanel5.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Male");
        jPanel5.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        jLabel18.setText("ConfirmPass:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 79, 34));

        jPasswordField3.setText("jPasswordField1");
        jPasswordField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseClicked(evt);
            }
        });
        jPanel5.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 314, 34));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add User Group Man Man_50px.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 25, 65, 62));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aDDoPERATOR.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 580));

        jLabel25.setText("Contact: ");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 79, 28));
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 314, 33));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cancel_50px.png"))); // NOI18N
        jLabel9.setText("Cancel");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add_50px.png"))); // NOI18N
        jLabel10.setText("Add");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel10KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Undo_50px.png"))); // NOI18N
        jLabel19.setText("Reset");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jLabel19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel19KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseClicked
        jPasswordField3.setText("");
    }//GEN-LAST:event_jPasswordField3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new AdminLanding().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9KeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String name = jTextField1.getText();
        String email = jTextField2.getText();
        String username = jTextField9.getText();
        String contact = jTextField3.getText();
        String address = jTextField4.getText();
        String govid = jTextField5.getText();
        String age = jTextField6.getText();
        String gender = "";
        if(jRadioButton5.isSelected())
        {
            gender="female";
        }
        if(jRadioButton6.isSelected())
        {
            gender="male";
        }
        
        String pass1 = new String(jPasswordField1.getPassword());
        String pass2= new String(jPasswordField3.getPassword());
        
        
        if(name.equals("")&&email.equals("")&&username.equals("")&&contact.equals("")&&address.equals("")&&govid.equals("")&&age.equals("")&&gender.equals("")&&jPasswordField1.equals("")&&jPasswordField3.equals(""))
        {
            JOptionPane.showMessageDialog(this, "All Fields are Required");
        }
        else if(name.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Name is Required");
        }
        else if(email.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Email is Required");
        }
        else if(username.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Username is Required");
        }
        else if(contact.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Contact is Required");
        }
        else if(address.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Address is Required");
        }
        else if(govid.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Government ID is Required");
        }
        else if(age.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Age is Required");
        }
        else if(gender.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Gender is Required");
        }
        else if(jPasswordField1.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Password is Required");
        }
        else if(jPasswordField3.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Confirmation Password is Required");
        }
       else if(!(pass1.equals(pass2)))
        {
            JOptionPane.showMessageDialog(this, "Password and Confirmation password are not same");
        }
        else
       {
           
           
           try
                          {
                              Date date = new Date();  //creating the Date class object
                              DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);  //formating date
                              Class.forName("com.mysql.jdbc.Driver");   //invoking the mysql JDBC driver
                              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tipsntricks","root","root");   //accesing the database using password and accesport credintials
                              PreparedStatement st = con.prepareStatement("insert into operator values(?,?,?,?,?,?,?,?,?,?)");   //commeting the fields to inserting the value
                              st.setString(1, name);       //inserting the values here one by one in a sequence
                              st.setString(2, email);   //inserting the values here one by one in a sequence
                              st.setString(3, username);      //inserting the values here one by one in a sequence
                              st.setString(4, contact);   //inserting the values here one by one in a sequence
                              st.setString(5, address);     //inserting the values here one by one in a sequence
                              st.setString(6, govid);   //inserting the values here one by one in a sequence
                              st.setString(7,age);   //inserting the values here one by one in a sequence
                              st.setString(8, gender);   //inserting the values here one by one in a sequence
                              st.setString(9,pass1 );   //inserting the values here one by one in a sequence
                              st.setString(10, df.format(date)+"");   //inserting the values here one by one in a sequence
                              st.executeUpdate();          //updating and executing the quiry
                              JOptionPane.showMessageDialog(this, "Operator was added sucessfully");
                              new AdminLanding().setVisible(true);
                              dispose();

                              
                              
                          }catch(SQLException | ClassNotFoundException ex)   //here we have applied the pipe concept
                          {
                              ex.printStackTrace();     //exploring exception line by line using the print stack trace method
                          }
           
           
           
       }
        
        
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10KeyPressed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        
        
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         jTextField9.setText("");
         jPasswordField1.setText("");
         jPasswordField3.setText("");
//         jRadioButton5.setSelected(false);
//         jRadioButton6.setSelected(false);
         
         
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19KeyPressed

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
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOperator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
