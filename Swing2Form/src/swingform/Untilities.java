/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingform;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author DongHo
 */
class Untilities {
     
     public static void submit() {
	  
     }

     public static void reset(JPanel p1,JPanel p2) {
	  for (Component com : p1.getComponents()) {
	       if ((com instanceof JTextField) || (com instanceof JTextArea)) {
		    ((JTextComponent) com).setText("");
	       }
	  }
	  for (Component com : p2.getComponents()) {
	       if ((com instanceof JTextField) || (com instanceof JTextArea)) {
		    ((JTextComponent) com).setText("");
	       }
	  }
//	  JOptionPane.showMessageDialog(p1, "");
     }
}
