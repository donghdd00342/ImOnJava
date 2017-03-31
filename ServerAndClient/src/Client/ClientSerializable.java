/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import entities.Message;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class ClientSerializable {

     public void connect() {
	  try {
	       System.out.println("Bắt đầu kết nối tới server......");
	       Socket socket = new Socket("localhost", 8888);
	       System.out.println("Kết nối tới server thành công!");
	       // gửi request lên server
	       ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
	       oos.writeObject(new Message("Chào hỏi", "Hôm nay bạn thế nào?"));
	       System.out.println("Tin nhắn đã gửi thành công!");
	       // chờ phản hổi từ server
	       ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
	       Message message = (Message) ois.readObject();
	       System.out.println("Response from Server: "+ message);
	  } catch (IOException | ClassNotFoundException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }

     public static void main(String[] args) {
	  new ClientSerializable().connect();
     }
}
