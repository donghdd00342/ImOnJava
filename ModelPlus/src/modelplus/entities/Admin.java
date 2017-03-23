/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelplus.entities;

import modelplus.model.GlobalConfig;
import modelplus.model.Table;

/**
 *
 * @author DongHo
 */
public class Admin implements Table{

     public Admin() {
     }
     
    private String name;
    private int age;
    private boolean status;

     public Admin(String name, int age, boolean status) {
	  this.name = name;
	  this.age = age;
	  this.status = status;
     }

     @Override
     public String toString() {
	  return "Admin{" + "name=" + name + ", age=" + age + ", status=" + status + '}';
     }

     @Override
     public String getTable() {
	  return GlobalConfig.getADMINS_TABLE();
     }
     
}
