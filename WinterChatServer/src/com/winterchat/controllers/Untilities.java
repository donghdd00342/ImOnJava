/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.controllers;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Set;

/**
 * Class chứa các hàm static
 *
 * @author DongHo
 */
public class Untilities {

     private Untilities() {
     }

     public static void sendTo(Object o, InetAddress inetAddress, int desPort) {
	  try {
	       ByteArrayOutputStream byteStream = new ByteArrayOutputStream(5000);
	       try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(byteStream))) {
		    os.flush();
		    os.writeObject(o);
		    os.flush();
		    byte[] sendByte = byteStream.toByteArray();
		    DatagramPacket packet = new DatagramPacket(sendByte, sendByte.length, inetAddress, desPort);
		    // gửi Packet
		    DatagramSocket dgs = new DatagramSocket();
		    dgs.send(packet);
		    //System.out.println("Đã gửi packet...");
	       }
	  } catch (IOException e) {
	       System.err.println("Lỗi:  " + e);
	  }
     }
     public static String[] toArray(Set set) {
	  return null;
     }
}
