/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.views;

import com.winterchat.controllers.Untilities;
import com.winterchat.entities.ClientSession;
import com.winterchat.entities.PrivateMessage;
import com.winterchat.entities.WinterTransporter;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author DongHo
 */
public class PrivateChatUI extends javax.swing.JFrame {

     private final String toPerson;
     ClientSession clientSession;

     /**
      * Creates new form PrivateChatUI
      *
      * @param me
      * @param withPerson
      * @param clientSession
      */
     public PrivateChatUI(String me, String withPerson, ClientSession clientSession) {
	  initComponents();

	  this.toPerson = withPerson;
	  this.clientSession = clientSession;

	  setLocationRelativeTo(null);
	  txtAreaPrivateChat.setEditable(false);
	  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	  this.setTitle("Chát riêng với [" + withPerson + "]");
	  this.setVisible(true);
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jScrollPane1 = new javax.swing.JScrollPane();
          txtAreaPrivateChat = new javax.swing.JTextArea();
          txtMessagePrivate = new javax.swing.JTextField();
          jButton1 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          txtAreaPrivateChat.setColumns(20);
          txtAreaPrivateChat.setRows(5);
          jScrollPane1.setViewportView(txtAreaPrivateChat);

          txtMessagePrivate.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtMessagePrivateKeyPressed(evt);
               }
          });

          jButton1.setText("Gửi");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jScrollPane1)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(txtMessagePrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(1, 1, 1)
                              .addComponent(txtMessagePrivate))
                         .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	  // TODO add your handling code here:
	  pressSend();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void txtMessagePrivateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessagePrivateKeyPressed
	  // TODO add your handling code here:
	  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
	       pressSend();
	  }
     }//GEN-LAST:event_txtMessagePrivateKeyPressed

     /**
      * Hàm của ĐÔNG ở đây.
      */
     private void pressSend() {
	  String message = txtMessagePrivate.getText().trim();
	  if (!message.equals("")) {
	       txtAreaPrivateChat.append(" [" + clientSession.getNickName() + "(Bạn)] " + message + "\n");
	       txtMessagePrivate.setText("");
	       try {
		    // gửi PrivateMessage tới server
		    Untilities.sendTo(
			    new WinterTransporter(3, new PrivateMessage(clientSession.getNickName(), toPerson, message)),
			    InetAddress.getByName(clientSession.getHostName()),
			    clientSession.getPortServer()
		    );
	       } catch (UnknownHostException ex) {
		    System.err.println("Lỗi tạo Inet: " + ex);
	       }
	  } else {
	       txtMessagePrivate.setText("");
	  }
     }

     public JTextArea getTxtAreaPrivateChat() {
	  return txtAreaPrivateChat;
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
		    if ("Windowns".equals(info.getName())) {
			 javax.swing.UIManager.setLookAndFeel(info.getClassName());
			 break;
		    }
	       }
	  } catch (ClassNotFoundException ex) {
	       java.util.logging.Logger.getLogger(PrivateChatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  } catch (InstantiationException ex) {
	       java.util.logging.Logger.getLogger(PrivateChatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  } catch (IllegalAccessException ex) {
	       java.util.logging.Logger.getLogger(PrivateChatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	       java.util.logging.Logger.getLogger(PrivateChatUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	  }
	  //</editor-fold>

	  /* Create and display the form */
	  java.awt.EventQueue.invokeLater(new Runnable() {
	       public void run() {
		    new PrivateChatUI("Tôi", "Phúc", null).setVisible(true);
	       }
	  });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextArea txtAreaPrivateChat;
     private javax.swing.JTextField txtMessagePrivate;
     // End of variables declaration//GEN-END:variables
}