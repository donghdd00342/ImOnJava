/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import entities.Message;
import entities.Untilities;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DongHo
 */
public class ServerDatagramObject {

     public void start() {
	  InetAddress hostName = null;
	  int clientPort = 0;
	  try {
	       System.out.println("Bắt đầu khởi tạo server");
	       ServerSocket ss = new ServerSocket(8888);
	       System.out.println("Khởi tạo server thành công.");
	       int count = 0;
	       // chờ kết nối
	       Socket socket = ss.accept();
	       ++count;
	       hostName = socket.getInetAddress();
	       clientPort = socket.getPort();
	       System.out.println("[" + count + "] Bắt đầu kết nối với [" + hostName + "] trên cổng [" + clientPort + "]");

	       // tạo một packet
	       System.out.println("Nhập tin gửi client: ");
	       String ms = new Scanner(System.in).nextLine();
	       // gửi object cho client
	       Untilities.sendTo(new Message("Xin chào", ms), hostName, clientPort);
	       System.out.println("Đã gửi tin...");

	  } catch (IOException ex) {
	       Logger.getLogger(ServerDatagram.class.getName()).log(Level.SEVERE, null, ex);
	  }
     }

     public static void main(String[] args) {
	  new ServerDatagramObject().start();
     }
}
