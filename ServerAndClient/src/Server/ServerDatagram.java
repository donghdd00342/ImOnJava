/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

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
public class ServerDatagram {

     public void start() {
	  InetAddress inetClientAddress = null;
	  int clientPort = 0;
	  try {
	       System.out.println("Bắt đầu khởi tạo server");
	       ServerSocket ss = new ServerSocket(8888);
	       System.out.println("Khởi tạo server thành công.");
	       int count = 0;
	       // chờ kết nối
	       Socket socket = ss.accept();
	       ++count;
	       inetClientAddress = socket.getInetAddress();
	       clientPort = socket.getPort();
	       System.out.println("[" + count + "] Bắt đầu kết nối với [" + inetClientAddress + "] trên cổng [" + clientPort + "]");
	       //----------------------------- Thông tin thêm ----------------//
	       System.out.println("socket.getChannel() = " + socket.getChannel());
	       System.out.println("socket.getKeepAlive() = " + socket.getKeepAlive());
	       System.out.println("socket.getLocalAddress() = " + socket.getLocalAddress());
	       System.out.println("socket.getLocalPort() = " + socket.getLocalPort());
	       System.out.println("socket.getLocalSocketAddress() = " + socket.getLocalSocketAddress());
	       //-------------------------------------------------------------//

	  } catch (IOException ex) {
	       Logger.getLogger(ServerDatagram.class.getName()).log(Level.SEVERE, null, ex);
	  }
	  // tạo một packet
	  System.out.println("Nhập tin gửi client: ");
	  String ms = new Scanner(System.in).nextLine();
	  byte[] msByte = ms.getBytes();
	  if ((inetClientAddress != null) && (clientPort != 0)) {
	       DatagramPacket dgp = new DatagramPacket(msByte, msByte.length, inetClientAddress, clientPort);
	       // gửi Packet đến cho client
	       DatagramSocket dgs;
	       try {
		    dgs = new DatagramSocket();
		    try {
			 dgs.send(dgp);
		    } catch (IOException ex) {
			 Logger.getLogger(ServerDatagram.class.getName()).log(Level.SEVERE, null, ex);
		    }
	       } catch (SocketException ex) {
		    Logger.getLogger(ServerDatagram.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       System.out.println("Đã gửi packet...");
	  }
     }

     public static void main(String[] args) {
	  new ServerDatagram().start();
     }
}
