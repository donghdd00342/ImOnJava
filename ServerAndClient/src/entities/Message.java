/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author DongHo
 */
public class Message implements Serializable {

     private final String title;
     private final String body;

     public Message(String title, String body) {
	  this.title = title;
	  this.body = body;
     }

     public String getTitle() {
	  return title;
     }

     public String getBody() {
	  return body;
     }

     @Override
     public String toString() {
	  return "Message{" + "title=" + title + ", body=" + body + '}';
     }

}
