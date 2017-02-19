/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DongHo
 */
public class DAO {

    public static Connection getConnection() {
        String url = GlobalConfig.getCONNECTION_URL_PREFIX() + GlobalConfig.getHOST() + GlobalConfig.getDATABASE();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, GlobalConfig.getUSERNAME(), GlobalConfig.getPASSWORD());
        } catch (SQLException e) {
            System.err.println("Không thể kết nối.");
            System.err.println(e);
        }

        return conn;
    }

}
