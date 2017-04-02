/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.controllers;

import com.winterchat.entities.Client;
import com.winterchat.entities.GoodbyeClient;
import com.winterchat.entities.HelloClient;
import com.winterchat.entities.PrivateMessage;
import com.winterchat.entities.WinterTransporter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.util.Map;

/**
 *
 * @author DongHo
 */
public class ServerThread extends Thread {

     private final Map<String, Client> clientsMap;
     private final Socket socket;

     public ServerThread(Socket socket, Map<String, Client> clientsMap) {
	  this.socket = socket;
	  this.clientsMap = clientsMap;
     }

     @Override
     public void run() {
	  try {
	       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	       String request = br.readLine();
	       PrintStream ps = new PrintStream(socket.getOutputStream());
	       // xử lý
	       if (clientsMap.containsKey(request)) {
		    ps.println("Đã tồn tại NickName trong Room");
	       } else {
		    ps.println("ok");
		    // lưu Client vào Map
		    clientsMap.put(request, new Client(socket.getInetAddress(), socket.getPort()));
		    // chờ 1s
		    Thread.sleep(100);
		    // gửi Danh sách và thông báo đến các thành viên
		    Untilities.sendTo(new WinterTransporter(1, new HelloClient(request, Untilities.toArray(clientsMap.keySet()))), clientsMap);
		    // chờ UDP phía Server
		    System.out.println("chờ UDP...");
		    /////////////////////////////////////////////////////////////
		    byte[] recvBuf = new byte[5000];
		    DatagramPacket packet = new DatagramPacket(recvBuf, recvBuf.length);
		    DatagramSocket dgs = new DatagramSocket(socket.getLocalPort());
		    ByteArrayInputStream byteStream;
		    ObjectInputStream is;
		    WinterTransporter o;
		    while (true) {
			 System.out.println("Server bắt đầu chờ UDP tại đây!....");
			 dgs.receive(packet); // chờ nhận packet
			 byteStream = new ByteArrayInputStream(recvBuf);
			 is = new ObjectInputStream(new BufferedInputStream(byteStream));
			 o = (WinterTransporter) is.readObject();
			 is.close();
			 ///////////////////////////////////////////////////////
			 // xử lý WinterTransporter
			 switch (o.getTypeOfMessage()) {
			      case 2:
				   // gửi thông báo WinterTransporter đến mọi người
				   Untilities.sendTo(o, clientsMap);
				   break;
			      case 3:
				   PrivateMessage privateMessage = (PrivateMessage) o.getMessageObject();
				   // gửi tin nhắn cho người nhận
				   Untilities.sendTo(
					   o, 
					   clientsMap.get(privateMessage.getTo()).getInetAddressClient(), 
					   clientsMap.get(privateMessage.getTo()).getPortClient()
				   );
				   break;
			      case 4:
				   // cập nhật lại danh sách
				   GoodbyeClient goodbyeClient = (GoodbyeClient) o.getMessageObject();
				   clientsMap.remove(goodbyeClient.getNickName());
				   // gửi thông báo WinterTransporter đến mọi người
				   Untilities.sendTo(o, clientsMap);
				   System.out.println("Client gửi ms kiểu: " + o.getTypeOfMessage());
				   //break; // cần test lại trên mạng thật...
				   break;
			 }
			 ///////////////////////////////////////////////////////
		    }
		    /////////////////////////////////////////////////////////////
	       }
	  } catch (IOException | ClassNotFoundException | InterruptedException e) {
	       System.err.println("Lỗi: " + e);
	  }
	  System.out.println("Kết thúc Thread: " + socket.getInetAddress());
     }

}
