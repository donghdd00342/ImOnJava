/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaConnectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello World.
 *
 * @author DongHo
 */
public class DAO {
    
    public static Connection connectNow() throws SQLException {
        String url = GlobalConfig.getCONNECTION_URL_PREFIX() + GlobalConfig.getHOST() + GlobalConfig.getDATABASE();
        Connection conn = DriverManager.getConnection(url, GlobalConfig.getUSERNAME(), GlobalConfig.getPASSWORD());
        return conn;
    }
    
    public static void main(String[] args) throws SQLException {
        System.out.println("Bắt đầu kết nối ...");
        Connection conn;
        String sql = "";
        // Chèn dữ liệu vào bảng
        String id = "123";
        String name = "Ten Sinh Vien";
//        sql = "INSERT INTO students (masv, name)"
//                + "VALUES ('"+id+"', '"+name+"');";
        sql = "SELECT * FROM students;";
        
        try {
// 1. Tạo đối tượng Connection với thông tin kết nối ở class trước.
            conn = DAO.connectNow();
            System.out.println("KẾT NỐI THÀNH CÔNG: " + conn);
// 2. Tạo một đối tượng Statement từ đối tượng Connection ở bước 1 với phương thức [. .createStatement()]
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
// 3. Tạo một String để truyền tham số query (chính là câu lệnh SQL thông thường)
// 4. Sử dụng method [.executeUpdate(String sql) return void] của Statement để thực hiện query các lệnh SQL như: Create, Insert, Update, Delete...
            while (rs.next()) {                
                id = rs.getString("masv");
                name = rs.getString("name");
                // In ra màn hình
                System.out.println("-------------------------");
                System.out.println("MÃ SV: "+ id);
                System.out.println("Tên: "+ name);
            }
            
        } catch (SQLException e) {
            System.err.println("Không thể kết nối db. " + e.getMessage());
        }
//Tạo đối tượng ResultSet là đại diện cho bản ghi được lấy về do thực hiện truy vấn với method [.executeQuery(String sql) return record]
//Sử dụng while và .next() để di chuyển con trỏ sang bản ghi kết tiếp .first() để nhảy về đầu
//Sử dụng .getString(String <column>) để lấy đối tượng String ở <column>
//Đóng kết nối java với MySQL: .close(); [connection.close();]

    }
}
