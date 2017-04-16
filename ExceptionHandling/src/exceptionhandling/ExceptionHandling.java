/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author DongHo
 */
public class ExceptionHandling {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
	  try {
	       // ... do-somthing: BadExecution
	       throw new DBExeption.BadExecution("Không thể thực thi");
	  } catch (Exception e) {
	       System.err.println(e); // exceptionhandling.DBExeption$BadExecution: Không thể thực thi
	  }
     }

}
