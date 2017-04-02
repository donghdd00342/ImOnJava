/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.entities;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author DongHo
 */
public class ClientSession {
     private String nickName;
     private String hostName;
     private int portServer;
     private InetAddress clientInetAddress;
     private int portClient;
     
     private ArrayList listUser;
     private HashMap listPrivateChatPerson;

     public ClientSession(String nickName, String hostName, int portServer, InetAddress clientInetAddress, int portClient) {
	  this.nickName = nickName;
	  this.hostName = hostName;
	  this.portServer = portServer;
	  this.clientInetAddress = clientInetAddress;
	  this.portClient = portClient;
     }

     public HashMap getListPrivateChatPerson() {
	  return listPrivateChatPerson;
     }

     public void setListPrivateChatPerson(HashMap listPrivateChatPerson) {
	  this.listPrivateChatPerson = listPrivateChatPerson;
     }

     public ArrayList getListUser() {
	  return listUser;
     }

     public void setListUser(ArrayList listUser) {
	  this.listUser = listUser;
     }

     public String getNickName() {
	  return nickName;
     }

     public void setNickName(String nickName) {
	  this.nickName = nickName;
     }

     public String getHostName() {
	  return hostName;
     }

     public void setHostName(String hostName) {
	  this.hostName = hostName;
     }

     public int getPortServer() {
	  return portServer;
     }

     public void setPortServer(int portServer) {
	  this.portServer = portServer;
     }

     public InetAddress getClientInetAddress() {
	  return clientInetAddress;
     }

     public void setClientInetAddress(InetAddress clientInetAddress) {
	  this.clientInetAddress = clientInetAddress;
     }

     public int getPortClient() {
	  return portClient;
     }

     public void setPortClient(int portClient) {
	  this.portClient = portClient;
     }
     
}
