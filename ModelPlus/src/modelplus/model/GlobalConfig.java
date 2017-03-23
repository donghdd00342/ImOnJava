/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelplus.model;

/**
 *
 * @author DongHo
 */
public class GlobalConfig {

     // Cấu hình tên bảng cho Model
     private static final String ADMINS_TABLE = "admins";
     private static final String PRODUCTS_TABLE = "products";

     public static String getADMINS_TABLE() {
	  return ADMINS_TABLE;
     }

     public static String getPRODUCTS_TABLE() {
	  return PRODUCTS_TABLE;
     }
     // .......... Cấu hình MySQL ở đây .............
     private static final String CONNECTION_URL_PREFIX = "jdbc:mysql://";
     private static final String HOST = "localhost:3306/";
     private static final String DATABASE = "modelplus";
     private static final String USERNAME = "root";
     private static final String PASSWORD = "";

     public static String getCONNECTION_URL_PREFIX() {
	  return CONNECTION_URL_PREFIX;

     }

     public static String getHOST() {
	  return HOST;
     }

     public static String getDATABASE() {
	  return DATABASE;
     }

     public static String getUSERNAME() {
	  return USERNAME;

     }

     public static String getPASSWORD() {
	  return PASSWORD;
     }

}
