/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeoTha;

/**
 *
 * @author tuana
 */
public class GlobalConfig {

    private static final String CONNECTION_URL_PREFIX = "jdbc:mysql://";
    private static final String HOST = "localhost:3306/";
    private static final String DATABASE = "swingdangky";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private static final String USER_TABLE = "users";

     public static String getUSER_TABLE() {
	  return USER_TABLE;
     }    

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
