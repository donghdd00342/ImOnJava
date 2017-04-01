/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.entities;

import java.net.InetAddress;

/**
 *
 * @author DongHo
 */
public class Client {
     private InetAddress inetAddressClient;
     private int portClient;

     public Client(InetAddress inetAddressClient, int portClient) {
	  this.inetAddressClient = inetAddressClient;
	  this.portClient = portClient;
     }

     public InetAddress getInetAddressClient() {
	  return inetAddressClient;
     }

     public void setInetAddressClient(InetAddress inetAddressClient) {
	  this.inetAddressClient = inetAddressClient;
     }

     public int getPortClient() {
	  return portClient;
     }

     public void setPortClient(int portClient) {
	  this.portClient = portClient;
     }
     
}
