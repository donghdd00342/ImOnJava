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
public class Product implements Table{

     public Product() {
     }
     
    private String name;
    private String description;
    private float price;

     public Product(String name, String description, float price) {
	  this.name = name;
	  this.description = description;
	  this.price = price;
     }

     @Override
     public String toString() {
	  return "Product{" + "name=" + name + ", description=" + description + ", price=" + price + '}';
     }

     @Override
     public String getTable() {
	  return GlobalConfig.getPRODUCTS_TABLE();
     }
    
}
