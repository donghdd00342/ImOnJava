/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.views;

import com.winterchat.controllers.Untilities;
import com.winterchat.entities.ClientSession;
import com.winterchat.entities.CommonMessage;
import com.winterchat.entities.GoodbyeClient;
import com.winterchat.entities.WinterTransporter;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author DongHo
 */
public class ClientChatUI extends javax.swing.JFrame {

     private final ClientSession clientSessiton;

     /**
      * Creates new form ClientUI
      *
      * @param clientSessiton
      */
     public ClientChatUI(ClientSession clientSessiton) {
	  this.clientSessiton = clientSessiton;
	  initComponents();
	  setLocationRelativeTo(null);
	  txtAreaChat.setEditable(false);
	  setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	  this.setTitle("Phòng chát của " + clientSessiton.getNickName());
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jLabel1 = new javax.swing.JLabel();
          txtMessage = new javax.swing.JTextField();
          jButton1 = new javax.swing.JButton();
          jScrollPane2 = new javax.swing.JScrollPane();
          tblListUser = new javax.swing.JTable();
          btnPrivateChat = new javax.swing.JButton();
          jScrollPane3 = new javax.swing.JScrollPane();
          txtAreaChat = new javax.swing.JTextArea();
          jButton2 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("Phòng chát của tui");

          jLabel1.setText("Message");

          txtMessage.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtMessageActionPerformed(evt);
               }
          });
          txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtMessageKeyPressed(evt);
               }
               public void keyTyped(java.awt.event.KeyEvent evt) {
                    txtMessageKeyTyped(evt);
               }
          });

          jButton1.setText("Gửi");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          tblListUser.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Danh sách thành viên"
               }
          ) {
               boolean[] canEdit = new boolean [] {
                    false
               };

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          jScrollPane2.setViewportView(tblListUser);
          if (tblListUser.getColumnModel().getColumnCount() > 0) {
               tblListUser.getColumnModel().getColumn(0).setResizable(false);
          }

          btnPrivateChat.setText("Chat riêng");
          btnPrivateChat.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPrivateChatActionPerformed(evt);
               }
          });

          txtAreaChat.setColumns(20);
          txtAreaChat.setRows(5);
          jScrollPane3.setViewportView(txtAreaChat);

          jButton2.setText("Thoát");
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
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addGap(18, 18, 18)
                              .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(12, 12, 12)
                              .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addComponent(jScrollPane3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(btnPrivateChat)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                         .addComponent(jScrollPane3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1)
                         .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jButton1)
                         .addComponent(btnPrivateChat)
                         .addComponent(jButton2))
                    .addGap(48, 48, 48))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btnPrivateChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivateChatActionPerformed
	  // TODO add your handling code here:
     }//GEN-LAST:event_btnPrivateChatActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	  // Nút gửi
	  this.pressSend();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
	  // TODO add your handling code here:
     }//GEN-LAST:event_txtMessageKeyTyped

     private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
	  // TODO add your handling code here:
     }//GEN-LAST:event_txtMessageActionPerformed

     private void txtMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyPressed
	  // TODO add your handling code here:
	  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
	       this.pressSend();
	  }
     }//GEN-LAST:event_txtMessageKeyPressed

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	  // TODO add your handling code here:
	  try {
	       // gửi thông báo đến server
	       Untilities.sendTo(new WinterTransporter(4, new GoodbyeClient(clientSessiton.getNickName())), InetAddress.getByName(clientSessiton.getHostName()), clientSessiton.getPortServer());
	  } catch (UnknownHostException ex) {
	       System.err.println("Lỗi tạo Inet: " + ex);
	  }
	  System.exit(0);
     }//GEN-LAST:event_jButton2ActionPerformed

     /**
      * Hàm thao tác trên JFrame
      *
      * @return 
      * @Author DongHo
      */
     public JTable getTblListUser() {
	  return tblListUser;
     }

     public JTextArea getTxtAreaChat() {
	  return txtAreaChat;
     }

     public void pressSend() {
	  if (!txtMessage.getText().trim().equals("")) {
	       try {
		    // gửi CommonMessage tới server
		    //txtAreaChat.append("Tôi: "+ txtMessage.getText().trim() + "\n");
		    Untilities.sendTo(
			    new WinterTransporter(2, new CommonMessage(clientSessiton.getNickName(), txtMessage.getText().trim())),
			    InetAddress.getByName(clientSessiton.getHostName()),
			    clientSessiton.getPortServer()
		    );
	       } catch (UnknownHostException ex) {
		    System.err.println("Lỗi tạo Inet: " + ex);
	       }
	       txtMessage.setText("");
	  } else {
	       txtMessage.setText("");
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
		    if ("Windows".equals(info.getName())) {
			 javax.swing.UIManager.setLookAndFeel(info.getClassName());
			 break;
		    }
	       }
	  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	       java.util.logging.Logger.getLogger(ClientChatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  }
	  //</editor-fold>
	  //</editor-fold>

	  //</editor-fold>
	  //</editor-fold>

	  /* Create and display the form */
	  java.awt.EventQueue.invokeLater(() -> {
	       new ClientChatUI(null).setVisible(true);
	  });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btnPrivateChat;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JScrollPane jScrollPane3;
     private javax.swing.JTable tblListUser;
     private javax.swing.JTextArea txtAreaChat;
     private javax.swing.JTextField txtMessage;
     // End of variables declaration//GEN-END:variables
}
