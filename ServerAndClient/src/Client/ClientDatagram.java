/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DongHo
 */
public class ClientDatagram {

     public void connect() {
	  try {
	       Socket socket = new Socket("localhost", 8888);
	       //-------------------Thông tin thêm----------------------------//
	       System.out.println("socket.getChannel() = " + socket.getChannel());
	       System.out.println("socket.getInetAddress() = " + socket.getInetAddress());
	       System.out.println("socket.getKeepAlive() = " + socket.getKeepAlive());
	       System.out.println("socket.getLocalAddress() = " + socket.getLocalAddress());
	       System.out.println("socket.getLocalPort() = " + socket.getLocalPort());
	       System.out.println("socket.getReuseAddress() = " + socket.getReuseAddress());
	       //------------------------------------------------------------//
	       // nhận packet
	       DatagramSocket dgs = new DatagramSocket(socket.getLocalPort()); // nhận qua socket
	       byte[] b = new byte[60000]; // nơi chứa dữ liệu
	       DatagramPacket inPacket = new DatagramPacket(b, b.length); // gói gữ liệu nhận
	       dgs.receive(inPacket); // chờ nhận dữ liệu
	       System.out.println(new String(inPacket.getData()));
	  } catch (IOException ex) {
	       Logger.getLogger(ClientDatagram.class.getName()).log(Level.SEVERE, null, ex);
	  }
     }

     public static void main(String[] args) {
	  new ClientDatagram().connect();
     }
}
