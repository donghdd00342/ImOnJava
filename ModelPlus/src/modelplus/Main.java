/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelplus;

import java.sql.SQLException;
import modelplus.entities.Admin;
import modelplus.entities.Product;
import modelplus.model.Model;

/**
 *
 * @author DongHo
 */
public class Main {

     /**
      * @param args the command line arguments
      * @throws java.sql.SQLException
      */
     public static void main(String[] args) throws SQLException {
	  // ----- Model.insert()
	  System.out.println("------- Thêm Admin & Product -------");
	  // Admins
	  Admin admin = new Admin("Ho Dong", 30, true);
//	  Model.insert("");
	  Model.insert(admin);

	  // Products
	  Product product = new Product("Bittis Hunter", "Hàng VN chất lượng cao", 100);
//	  Model.insert(product);
	  
	  // ----- Model.delete()
//	  System.out.println("------- Xóa Admin & Product -------");
//	  Model.delete(admin, 1);
//	  Model.delete(product, 1);
     }
     
}
