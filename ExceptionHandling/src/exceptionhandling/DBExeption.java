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
/**
 * Tạo một abstract chung để các Exception riêng lẻ Extends
 *
 * @author DongHo
 */
abstract class CoreException extends Exception {

     // Message mô tả lỗi
     private final String message;

     public CoreException(String msg) {
	  this.message = msg;
     }

     // chia sẻ Message ra ngoài
     @Override
     public String getMessage() {
	  return message;
     }
}

public class DBExeption {

     // SQL execution error
     public static class BadExecution extends CoreException {

	  public BadExecution(String msg) {
	       super(msg);
	  }
     }

     // No data exist
     public static class NoData extends CoreException {

	  public NoData(String msg) {
	       super(msg);
	  }
     }

     //Invalid parameters error
     public static class InvalidParam extends CoreException {

	  public InvalidParam(String msg) {
	       super(msg);
	  }
     }
}
