/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class Client {

     public void connect() {
	  try {
	       Socket socket = new Socket("localhost", 8888);
	       System.out.println("Kết nối tới server thành công!");
	       PrintStream ps = new PrintStream(socket.getOutputStream());
	       // gửi dữ liệu lên server
	       ps.println("Xin chao server!");

	       // chờ server phản hồi
	       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	       String response = br.readLine();
	       if (response != null) {
		    System.out.println("Server say: " + response);
	       }
	  } catch (IOException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }
     public static void main(String[] args) {
	  new Client().connect();
     }
}
