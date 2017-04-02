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
public class CommonMessage implements Serializable {
     private String nickName;
     private String message;

     public CommonMessage(String nickName, String message) {
	  this.nickName = nickName;
	  this.message = message;
     }

     public String getNickName() {
	  return nickName;
     }

     public void setNickName(String nickName) {
	  this.nickName = nickName;
     }

     public String getMessage() {
	  return message;
     }

     public void setMessage(String message) {
	  this.message = message;
     }
     
}
