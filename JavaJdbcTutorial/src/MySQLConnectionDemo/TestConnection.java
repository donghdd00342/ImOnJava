/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLConnectionDemo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author DongHo
 */
public class TestConnection {

    public static Connection getConnection() throws SQLException,
            ClassNotFoundException {
        // return về một Connection với thông tin trong class MySQLConnUtils
        return MySQLConnUtils.getMySQLConnection();
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     * @show: Kiểm tra kết nối với MySQL
     */
    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        System.out.println("Bắt đầu kết nối ... ");
        // Lấy ra đối tượng Connection kết nối vào database.
        Connection conn = TestConnection.getConnection();
        System.out.println("Get connection " + conn);
        System.out.println("Done!");
    }

}
