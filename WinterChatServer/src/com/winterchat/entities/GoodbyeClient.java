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
public class GoodbyeClient implements Serializable {

     private String nickName;

     public GoodbyeClient(String nickName) {
	  this.nickName = nickName;
     }

     public String getNickName() {
	  return nickName;
     }

     public void setNickName(String nickName) {
	  this.nickName = nickName;
     }

}
