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
import java.net.Socket;

/**
 *
 * @author DongHo
 */
public class ServerThreadSerializable extends Thread {

     private final Socket socket;

     public ServerThreadSerializable(Socket socket) {
	  this.socket = socket;
     }

     @Override
     public void run() {
	  try {
	       // đọc request từ client
	       ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
	       Message message = (Message) ois.readObject();
	       System.out.println(socket.getInetAddress() + " say: " + message);
	       // gửi trả lời client
	       ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
	       oos.writeObject(new Message("Server", "[you say: " + message+"]"));
	       System.out.println("Đã trả lời " + socket.getInetAddress());
	       System.out.println("Đã ngắt kết nối với " + socket.getInetAddress());
	  } catch (IOException | ClassNotFoundException ex) {
	       System.err.println("Lỗi: " + ex);
	  }
     }

}
