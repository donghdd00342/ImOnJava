/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasecurity;

import java.security.MessageDigest;

/**
 *
 * @author DongHo
 */
public class PasswordHandle {

     public static void main(String[] args) {
	  try {
	       String password = "abcD1234";

	       MessageDigest md = MessageDigest.getInstance("MD5");
	       byte[] afterDigest = md.digest(password.getBytes());

	       StringBuffer sb = new StringBuffer();
	       for (int i = 0; i < afterDigest.length; i++) {
		    sb.append(Integer.toHexString(0xff & afterDigest[i]));
	       }
	       System.out.println(sb.toString());
	  } catch (Exception e) {
	       e.printStackTrace();
	  }
     }
}
