/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeoTha;

import javax.swing.JOptionPane;

/**
 *
 * @author DongHo
 */
public class Validates {
     public static boolean email(String email) {
	  return email.matches("\\A([^@\\s]+)@((?:[-a-z0-9]+\\.)+[a-z]{2,})\\z");
     }
     
     public static boolean isEmpty(String str) {
	  return str.isEmpty();
     }
     
     public static boolean confirm(String str1, String str2) {
	  return str1.equals(str2);
     }
}
