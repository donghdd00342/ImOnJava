/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import entities.Message;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	       Socket socket = ss.accept();
	       // bắt đầu kết nối với client
	       System.out.println("Kết nối thành công với [" + socket.getInetAddress() + "] ---------------");
	       // đọc request từ client
	       ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
	       Message message = (Message) ois.readObject();
	       System.out.println("Request from Client: "+ message);
	       // gửi trả lời client
	       ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
	       oos.writeObject(new Message("Trả lời từ server", "Tôi khỏe, còn bạn?"));
	       System.out.println("Tin nhắn đã gửi thành công!");
	  } catch (IOException | ClassNotFoundException ex) {
	       System.err.println("Lỗi: " + ex);
	  }

     }

     public static void main(String[] args) {
	  new ServerSerializable().start();
     }
}
