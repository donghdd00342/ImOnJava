/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.controllers;

import com.winterchat.entities.Client;
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
		    // chờ UDP phía Server
		    System.out.println("chờ UDP...");
		    /////////////////////////////////////////////////////////////
		    byte[] recvBuf = new byte[5000];
		    DatagramPacket packet = new DatagramPacket(recvBuf, recvBuf.length);
		    DatagramSocket dgs = new DatagramSocket(socket.getLocalPort());
		    ByteArrayInputStream byteStream;
		    ObjectInputStream is;
		    Object o;
		    System.out.println("Server bắt đầu chờ UDP tại đây!....");
		    while (true) {
			 dgs.receive(packet); // chờ nhận packet
			 byteStream = new ByteArrayInputStream(recvBuf);
			 is = new ObjectInputStream(new BufferedInputStream(byteStream));
			 o = is.readObject();
			 // xử lý Object
			 is.close();
		    }
		    /////////////////////////////////////////////////////////////
	       }
	  } catch (IOException | ClassNotFoundException e) {
	       System.err.println("Lỗi: " + e);
	  }
	  System.out.println("Kết thúc Thread: " + socket.getInetAddress());
     }

}
