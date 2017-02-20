/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.model;

/**
 * Class này chứa các thông tin cấu hình chung về MySQL....
 * @author DongHo
 */
public class GlobalConfig {
    
    private static final String CONNECTION_URL_PREFIX = "jdbc:mysql://";
    private static final String HOST = "localhost:3306/";
    private static final String DATABASE = "c1608l";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    /**
     * Bảng "students"
     * Gồm 3 cột: "id, masv, name"
     * "id": INT(10), AUTO_INCREMENT, PRIMARY KEY
     * "masv": VARCHAR(10), UNIQUE
     * "name": VACHAR(20), NOT NULL
     * @return 
     */
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
