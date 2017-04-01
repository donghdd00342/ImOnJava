/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import entities.Message;
import entities.Untilities;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class ClientDatagramObject {

     public void connect() {
	  try {
	       System.out.println("Bắt đầu kết nối tới server......");
	       Socket socket = new Socket("localhost", 8888);
	       System.out.println("Kết nối tới server thành công!");

	       // chờ một phản hổi từ server
	       Message message = (Message) Untilities.recvObjFrom(socket);
	       System.out.println("Response from Server: " + message);

	  } catch (IOException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }

     public static void main(String[] args) {
	  new ClientDatagramObject().connect();
     }
}
