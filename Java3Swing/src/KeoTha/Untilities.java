/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeoTha;

import java.awt.Component;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author DongHo
 */
public class Untilities {

     /**
      * reset
      *
      * @param p1
      * @param p2
      */
     public static void reset(JPanel p1, JPanel p2) {
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
     }

     public static void showMessage(String ms) {
	  JOptionPane.showMessageDialog(null, ms);
     }

     public static String getSelectedButtonText(ButtonGroup buttonGroup) {
	  for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	       AbstractButton button = buttons.nextElement();

	       if (button.isSelected()) {
		    return button.getText();
	       }
	  }

	  return null;
     }
}
