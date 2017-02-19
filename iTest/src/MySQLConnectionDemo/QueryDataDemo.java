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
        String sql;
        // III.1. Ví dụ tạo bảng
//        sql = "CREATE TABLE students ("
//            + "rollno VARCHAR(20) NOT NULL,"
//            + "name VARCHAR(255) NOT NULL,"
//            + "phonenumber VARCHAR(20));";
//        // Thực thi câu lệnh.
//        // executeUpdate(String) sử dụng cho các loại lệnh Create,Insert,Update,Delete...
//        statement.executeUpdate(sql);
//        System.out.println("Tạo bảng thành công");
        // III.2 Ví dụ Insert dữ liệu^
//        sql = "INSERT INTO students (rollno,name,phonenumber)"
//            + "VALUES ('HDD00342', 'HoDong', '0979586328');";
//        // Thực thi câu lệnh.        
//        statement.executeUpdate(sql);
//        System.out.println("Thêm dữ liệu thành công");
        // III.3 Xem kết quả trả về (dữ liệu) với đối tượng ResultSet.
        sql = "SELECT * FROM students";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
        ResultSet rs = statement.executeQuery(sql);
        // Duyệt trên kết quả trả về.
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
            String rollNo = rs.getString("rollno");
            String name = rs.getString("name");
            String phoneNumber = rs.getString("phonenumber");
            System.out.println("--------------------");
            System.out.println("Số hiệu:" + rollNo);
            System.out.println("Họ Tên:" + name);
            System.out.println("Số điện thoại:" + phoneNumber);
        }
        // Đóng kết nối
        connection.close();

    }

}
