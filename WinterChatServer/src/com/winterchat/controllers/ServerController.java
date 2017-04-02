/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.controllers;

import com.winterchat.entities.Client;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DongHo
 */
public class ServerController {

     public static void start() {
	  // tạo HashMap lưu thông tin các kết nối
	  Map<String, Client> clientsMap = new HashMap<>();
	  // khởi tạo server
	  try {
	       System.out.println("Khởi tạo server!");
	       ServerSocket ss = new ServerSocket(8888);
	       System.out.println("Server sẵn sàng......");
	       // chờ đợi mọi kết nối
	       int count = 0; // đếm kết nối
	       while (true) {
		    Socket socket = ss.accept();
		    // bắt đầu kết nối với client
		    ++count;
		    System.out.println("[" + count + "]. Kết nối thành công với [" + socket.getInetAddress() + "]");
		    // đẩy sang Thread xử lý
		    new ServerThread(socket, clientsMap).start();
	       }
	  } catch (IOException ex) {
	       System.err.println("Lỗi: " + ex);
	  }
     }
}
