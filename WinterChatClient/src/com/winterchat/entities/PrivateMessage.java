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
public class PrivateMessage implements Serializable {

     private String from;
     private String to;
     private String message;

     public PrivateMessage(String from, String to, String message) {
	  this.from = from;
	  this.to = to;
	  this.message = message;
     }

     public String getFrom() {
	  return from;
     }

     public void setFrom(String from) {
	  this.from = from;
     }

     public String getTo() {
	  return to;
     }

     public void setTo(String to) {
	  this.to = to;
     }

     public String getMessage() {
	  return message;
     }

     public void setMessage(String message) {
	  this.message = message;
     }

}
