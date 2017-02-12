/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLConnectionDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import MySQLConnectionDemo.MySQLConnUtils;

/**
 *
 * @author DongHo
 */
public class QueryDataDemo {

    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        // III.1. Ví dụ tạo bảng
        String sql;
        sql = "create table STUDENTS ("
            + "   ID integer not null,"
            + "   NAME varchar(255) not null,"
            + "   PHONENUMBER varchar(20) not null);";
        // Thực thi câu lệnh.
        // executeUpdate(String) sử dụng cho các loại lệnh Create,Insert,Update,Delete...
        int row = statement.executeUpdate(sql);
        System.err.println("Tạo bảng thành công");
        // III.2 Ví dụ Insert dữ liệu
    }

}
