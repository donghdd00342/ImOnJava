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
public class ServerSerializable {

     public void start() {
	  try {
	       System.out.println("Khởi tạo server!");
	       ServerSocket ss = new ServerSocket(8888);
	       System.out.println("Server sẵn sàng.........");
	       int count = 0;
	       while (true) {
		    Socket socket = ss.accept();
		    // bắt đầu kết nối với client
		    ++count;
		    System.out.println(count + " - Kết nối thành công với [" + socket.getInetAddress() + "]");

		    new ServerThreadSerializable(socket).start();
		    Thread.sleep(1000);
	       }
	  } catch (IOException | InterruptedException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }

     public static void main(String[] args) {
	  new ServerSerializable().start();
     }
}
