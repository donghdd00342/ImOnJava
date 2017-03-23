/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingform;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author DongHo
 */
public class Swing2Form {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
	  // JFrame
	  JFrame f = new JFrame("Mẫu chuẩn");
	  f.setBounds(0, 0, 690, 900);
	  f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	  // JPanel
	  JPanel p1 = new JPanel();
	  // trang trí p1
	  TitledBorder border1 = new TitledBorder("Tài khoản");
	  border1.setTitleJustification(TitledBorder.LEFT);
	  border1.setTitlePosition(TitledBorder.TOP);
	  p1.setBorder(border1);
	  p1.setBounds(60, 30, 570, 210);
	  f.add(p1);
	  // Label
	  JLabel lblAcc = new JLabel("Tài khoản");
	  lblAcc.setBounds(30, 30, 150, 30);
	  p1.add(lblAcc);
	  JLabel lblPass = new JLabel("Mật khẩu");
	  lblPass.setBounds(30, 90, 150, 30);
	  p1.add(lblPass);
	  JLabel lblConfirmPass = new JLabel("Xác nhận Mật khẩu");
	  lblConfirmPass.setBounds(30, 150, 150, 30);
	  p1.add(lblConfirmPass);
	  // field
	  JTextField txtAcc = new JTextField();
	  txtAcc.setBounds(200, 30, 300, 30);
	  p1.add(txtAcc);
	  JPasswordField txtPass = new JPasswordField();
	  txtPass.setBounds(200, 90, 300, 30);
	  p1.add(txtPass);
	  JPasswordField txtConfirmPass = new JPasswordField();
	  txtConfirmPass.setBounds(200, 150, 300, 30);
	  p1.add(txtConfirmPass);

	  // JPanel
	  JPanel p2 = new JPanel();
	  // trang trí p2
	  TitledBorder border2 = new TitledBorder("Thông tin chi tiết");
	  border2.setTitleJustification(TitledBorder.LEFT);
	  border2.setTitlePosition(TitledBorder.TOP);
	  p2.setBorder(border2);
	  p2.setBounds(60, 270, 570, 480);
	  f.add(p2);
	  // Lable
	  JLabel lblPhone = new JLabel("Số điện thoại");
	  lblPhone.setBounds(30, 30, 150, 30);
	  p2.add(lblPhone);
	  JLabel lblEmail = new JLabel("Hòm thư");
	  lblEmail.setBounds(30, 90, 150, 30);
	  p2.add(lblEmail);
	  JLabel lblGender = new JLabel("Giới tính");
	  lblGender.setBounds(30, 150, 150, 30);
	  p2.add(lblGender);
	  JLabel lblFav = new JLabel("Sở thích");
	  lblFav.setBounds(30, 210, 150, 30);
	  p2.add(lblFav);
	  JLabel lblNote = new JLabel("Ghi chú thêm");
	  lblNote.setBounds(30, 270, 150, 30);
	  p2.add(lblNote);
	  // Field
	  JTextField txtPhone = new JTextField();
	  txtPhone.setBounds(200, 30, 300, 30);
	  p2.add(txtPhone);
	  JTextField txtEmail = new JTextField();
	  txtEmail.setBounds(200, 90, 300, 30);
	  p2.add(txtEmail);
	  // Field - radio
	  JRadioButton r1 = new JRadioButton("Male");
	  r1.setBounds(200, 150, 100, 30);
	  p2.add(r1);
	  JRadioButton r2 = new JRadioButton("Female");
	  r2.setBounds(300, 150, 100, 30);
	  p2.add(r2);
	  JRadioButton r3 = new JRadioButton("Unknow");
	  r3.setBounds(400, 150, 100, 30);
	  p2.add(r3);
	  // group
	  ButtonGroup bg = new ButtonGroup();
	  bg.add(r1);
	  bg.add(r2);
	  bg.add(r3);
	  // comboBox
	  String fav[] = {"Âm nhạc", "Đọc sách", "Du lịch", "Chơi game", "Ăn uống"};
	  JComboBox cb = new JComboBox(fav);
	  cb.setBounds(200, 210, 300, 30);
	  p2.add(cb);
	  // text Area
	  JTextArea area = new JTextArea();
	  area.setBounds(200, 270, 300, 180);
	  p2.add(area);

	  // JButton
	  JButton btnSubmit = new JButton("Submit");
	  btnSubmit.setBounds(270, 780, 100, 30);
	  f.add(btnSubmit);
	  JButton btnReset = new JButton("Reset");
	  btnReset.setBounds(400, 780, 100, 30);
	  f.add(btnReset);

	  // layout
	  p1.setLayout(null);
	  p2.setLayout(null);
	  f.setLayout(null);
	  f.setVisible(true);

	  // BEGIN ACTION ==========================================================
	  btnReset.addActionListener((ActionEvent ae) -> {
//	       Untilities.reset(p1, p2);
	  });
	  btnSubmit.addActionListener((ActionEvent ae) -> {
	       
	  });
	  // END ACTION ==========================================================

     }
     
}
