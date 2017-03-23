/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeoTha;

import java.awt.Container;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author DongHo
 */
public class DangKy extends javax.swing.JFrame {

     /**
      * Creates new form DangKy
      */
     public DangKy() {
	  initComponents();
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          myGroup = new javax.swing.ButtonGroup();
          p1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          txtAccount = new javax.swing.JTextField();
          txtPassword = new javax.swing.JPasswordField();
          txtPassword2 = new javax.swing.JPasswordField();
          p2 = new javax.swing.JPanel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          txtPhone = new javax.swing.JTextField();
          txtEmail = new javax.swing.JTextField();
          Male = new javax.swing.JRadioButton();
          Female = new javax.swing.JRadioButton();
          Unknow = new javax.swing.JRadioButton();
          cbbFav = new javax.swing.JComboBox<>();
          jLabel8 = new javax.swing.JLabel();
          jScrollPane2 = new javax.swing.JScrollPane();
          txtArea = new javax.swing.JTextArea();
          jButton1 = new javax.swing.JButton();
          jButton2 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("Chương trình đăng ký");

          p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tài khoản"));

          jLabel1.setText("Account");

          jLabel2.setText("Password");

          jLabel3.setText("Confirm");

          txtAccount.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtAccountActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
          p1.setLayout(p1Layout);
          p1Layout.setHorizontalGroup(
               p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(p1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel1)
                         .addComponent(jLabel3)
                         .addComponent(jLabel2))
                    .addGap(43, 43, 43)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                         .addComponent(txtAccount)
                         .addComponent(txtPassword)
                         .addComponent(txtPassword2))
                    .addContainerGap())
          );
          p1Layout.setVerticalGroup(
               p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(p1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1)
                         .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE))
          );

          txtAccount.getAccessibleContext().setAccessibleName("txtAccount");
          txtPassword.getAccessibleContext().setAccessibleName("");
          txtPassword2.getAccessibleContext().setAccessibleName("");

          p2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin cá nhân"));

          jLabel4.setText("Phone");

          jLabel5.setText("Email");

          jLabel6.setText("Gender");

          jLabel7.setText("Favorite");

          myGroup.add(Male);
          Male.setText("Male");
          Male.setToolTipText("Giới tính của bạn");
          Male.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MaleActionPerformed(evt);
               }
          });

          myGroup.add(Female);
          Female.setText("Female");
          Female.setToolTipText("Giới tính của bạn");
          Female.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    FemaleActionPerformed(evt);
               }
          });

          myGroup.add(Unknow);
          Unknow.setSelected(true);
          Unknow.setText("Unknow");
          Unknow.setToolTipText("Giới tính của bạn");

          cbbFav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bóng đá", "Xem phim", "Du lịch" }));
          cbbFav.setToolTipText("Sở thích của bạn");
          cbbFav.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cbbFavActionPerformed(evt);
               }
          });

          jLabel8.setText("Ghi chú thêm");

          txtArea.setColumns(20);
          txtArea.setRows(5);
          jScrollPane2.setViewportView(txtArea);
          txtArea.getAccessibleContext().setAccessibleParent(p2);

          javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
          p2.setLayout(p2Layout);
          p2Layout.setHorizontalGroup(
               p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(p2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel4)
                         .addComponent(jLabel5)
                         .addComponent(jLabel6)
                         .addComponent(jLabel7)
                         .addComponent(jLabel8))
                    .addGap(26, 26, 26)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(txtPhone)
                         .addComponent(txtEmail)
                         .addComponent(cbbFav, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addGroup(p2Layout.createSequentialGroup()
                              .addComponent(Male)
                              .addGap(18, 18, 18)
                              .addComponent(Female)
                              .addGap(18, 18, 18)
                              .addComponent(Unknow)
                              .addGap(0, 29, Short.MAX_VALUE))
                         .addComponent(jScrollPane2))
                    .addContainerGap())
          );
          p2Layout.setVerticalGroup(
               p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(p2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel4)
                         .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel5)
                         .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel6)
                         .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(Male)
                              .addComponent(Female)
                              .addComponent(Unknow)))
                    .addGap(18, 18, 18)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel7)
                         .addComponent(cbbFav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(p2Layout.createSequentialGroup()
                              .addComponent(jLabel8)
                              .addGap(0, 0, Short.MAX_VALUE))
                         .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addContainerGap())
          );

          txtPhone.getAccessibleContext().setAccessibleName("txtPhone");
          txtEmail.getAccessibleContext().setAccessibleName("txtName");

          jButton1.setText("Submit");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jButton2.setText("Reset");
          jButton2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addContainerGap()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(144, 144, 144)
                              .addComponent(jButton1)
                              .addGap(18, 18, 18)
                              .addComponent(jButton2)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jButton1)
                         .addComponent(jButton2))
                    .addContainerGap(18, Short.MAX_VALUE))
          );

          p1.getAccessibleContext().setAccessibleName("p1");
          p2.getAccessibleContext().setAccessibleName("p2");

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
	  // TODO add your handling code here:
     }//GEN-LAST:event_MaleActionPerformed

     private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
	  // TODO add your handling code here:
     }//GEN-LAST:event_FemaleActionPerformed

     private void txtAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountActionPerformed
	  // TODO add your handling code here:
     }//GEN-LAST:event_txtAccountActionPerformed

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	  Untilities.reset(p1, p2);
	  txtArea.setText("");
     }//GEN-LAST:event_jButton2ActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	  // Các trường
	  String account = txtAccount.getText();
	  String pass = new String(txtPassword.getPassword());
	  String phone = txtPhone.getText();
	  String email = txtEmail.getText();
	  String gender = Untilities.getSelectedButtonText(myGroup);
	  String favorite = cbbFav.getSelectedItem().toString();
	  String note = txtArea.getText();

	  // Validate
	  if (Validates.isEmpty(account)) {
	       Untilities.showMessage("Không để trống tài khoản!");
	       return;
	  }
	  if (Validates.isEmpty(pass)) {
	       Untilities.showMessage("Không để trống password!");
	       return;
	  }
	  if (Validates.isEmpty(new String(txtPassword2.getPassword()))) {
	       Untilities.showMessage("Không để trống confirm password!");
	       return;
	  }
	  if (!Validates.confirm(pass, new String(txtPassword2.getPassword()))) {
	       Untilities.showMessage("Password không khớp!");
	       return;
	  }
	  if (Validates.isEmpty(phone)) {
	       Untilities.showMessage("Không để trống Phone!");
	       return;
	  }
	  if (!Validates.email(email)) {
	       Untilities.showMessage("Không để trống Email hoặc Email không đúng định dạng!");
	       return;
	  }
	  if (Validates.isEmpty(gender)) {
	       Untilities.showMessage("Vui lòng chọn giới tính!");
	       return;
	  }
//	  if (Untilities.getSelectedButtonText(myGroup).equals("")) {
//	       Untilities.showMessage("Vui lòng chọn giới tính!");
//	       return;
//	  }
	  if (Validates.isEmpty(note)) {
	       Untilities.showMessage("Không để trống Ghi chú thêm!");
	       return;
	  }

	  User user = new User(account, pass, phone, email, gender, favorite, note);
	  try {
	       Model.insert(user);
	  } catch (SQLException ex) {
	       Untilities.showMessage("Có lỗi: " + ex);
	  }
	  Untilities.showMessage("Thêm thành công!");
	  Untilities.showMessage(user.toString());

     }//GEN-LAST:event_jButton1ActionPerformed

     private void cbbFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbFavActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_cbbFavActionPerformed

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
		    if ("Nimbusss".equals(info.getName())) {
			 javax.swing.UIManager.setLookAndFeel(info.getClassName());
			 break;
		    }
	       }
	  } catch (ClassNotFoundException ex) {
	       java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  } catch (InstantiationException ex) {
	       java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  } catch (IllegalAccessException ex) {
	       java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	       java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  }
	  //</editor-fold>

	  /* Create and display the form */
	  java.awt.EventQueue.invokeLater(new Runnable() {
	       public void run() {
		    new DangKy().setVisible(true);
	       }
	  });
     }
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JRadioButton Female;
     private javax.swing.JRadioButton Male;
     private javax.swing.JRadioButton Unknow;
     private javax.swing.JComboBox<String> cbbFav;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.ButtonGroup myGroup;
     private javax.swing.JPanel p1;
     private javax.swing.JPanel p2;
     private javax.swing.JTextField txtAccount;
     private javax.swing.JTextArea txtArea;
     private javax.swing.JTextField txtEmail;
     private javax.swing.JPasswordField txtPassword;
     private javax.swing.JPasswordField txtPassword2;
     private javax.swing.JTextField txtPhone;
     // End of variables declaration//GEN-END:variables
}