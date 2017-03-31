/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class ServerString {

     public void start() {
	  try {
	       System.out.println("Khởi tạo server!");
	       ServerSocket ss = new ServerSocket(8888);
	       System.out.println("Server sẵn sàng......");
	       while (true) {
		    Socket socket = ss.accept();
		    // bắt đầu kết nối với client
		    System.out.println("Kết nối thành công với [" + socket.getInetAddress() + "]");
		    new ServerThreadString(socket).start();
	       }
	  } catch (IOException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }

     public static void main(String[] args) {
	  new ServerString().start();
     }
}
