/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class Server {

     public void start() {
	  try {
	       System.out.println("Khởi tạo server!");
	       ServerSocket ss = new ServerSocket(8888);
	       System.out.println("Server sẵn sàng......");
	       Socket socket = ss.accept();
	       // bắt đầu kết nối với client
	       System.out.println("Kết nối thành công với [" + socket.getInetAddress() + "]");
	       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	       String request = br.readLine();
	       while (request != null) {
		    System.out.println("Client say: " + request);
		    // xử lý

		    // gửi trả lời cho client biết
		    PrintStream ps = new PrintStream(socket.getOutputStream());
		    ps.println("You say: [" + request + "]");
		    // đọc tiếp
		    request = br.readLine();
	       }
	  } catch (IOException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }

     public static void main(String[] args) {
	  new Server().start();
     }
}
