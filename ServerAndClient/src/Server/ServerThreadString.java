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
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class ServerThreadString extends Thread {

     private final Socket socket;

     public ServerThreadString(Socket socket) {
	  this.socket = socket;
     }

     @Override
     public void run() {
	  try {
	       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	       String request = br.readLine();
	       while (request != null) {
		    System.out.println("Client say: " + request);
		    // xử lý

		    // gửi trả lời cho client biết
		    PrintStream ps = new PrintStream(socket.getOutputStream());
		    ps.println("You say: [" + request + "]");
		    // đọc tiếp
		    if (!request.equalsIgnoreCase("stop")) {
			 request = br.readLine();
		    } else {
			 break;
		    }
	       }
	  } catch (IOException e) {
	       System.err.println("Lỗi: " + e);
	  }
     }

}
