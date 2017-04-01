/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winterchat.entities;

/**
 *
 * @author DongHo
 */
public class WinterTransporter {
     private int typeOfMessage;
     private Object MessageObject;

     public WinterTransporter(int typeOfMessage, Object MessageObject) {
	  this.typeOfMessage = typeOfMessage;
	  this.MessageObject = MessageObject;
     }

     public int getTypeOfMessage() {
	  return typeOfMessage;
     }

     public void setTypeOfMessage(int typeOfMessage) {
	  this.typeOfMessage = typeOfMessage;
     }

     public Object getMessageObject() {
	  return MessageObject;
     }

     public void setMessageObject(Object MessageObject) {
	  this.MessageObject = MessageObject;
     }
     
}
