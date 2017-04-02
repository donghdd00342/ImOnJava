/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.entities;

import java.io.Serializable;

/**
 *
 * @author DongHo
 */
public class HelloClient implements Serializable {

     private String nickName;
     private String[] listName;

     public HelloClient(String nickName, String[] listName) {
	  this.nickName = nickName;
	  this.listName = listName;
     }

     public String getNickName() {
	  return nickName;
     }

     public void setNickName(String nickName) {
	  this.nickName = nickName;
     }

     public String[] getListName() {
	  return listName;
     }

     public void setListName(String[] listName) {
	  this.listName = listName;
     }


}
