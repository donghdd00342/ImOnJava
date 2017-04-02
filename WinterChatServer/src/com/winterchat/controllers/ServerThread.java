/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.controllers;

import com.winterchat.entities.Client;
import com.winterchat.entities.HelloClient;
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
		    Thread.sleep(1000);
		    // gửi Danh sách và thông báo đến các thành viên
		    // to-do....
		    clientsMap.forEach((t, u) -> {
			 Untilities.sendTo(
				 new WinterTransporter(1, new HelloClient(t, Untilities.toArray(clientsMap.keySet()))),
				 u.getInetAddressClient(),
				 u.getPortClient()
			 );
		    });
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
			 if (o.getTypeOfMessage() == 4) {
			      // gửi thông báo WinterTransporter đến mọi người
			      for (Map.Entry<String, Client> entry : clientsMap.entrySet()) {
				   Client value = entry.getValue();
				   Untilities.sendTo(o, value.getInetAddressClient(), value.getPortClient());
			      }
			      System.out.println("Client gửi ms kiểu: " + o.getTypeOfMessage());
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
