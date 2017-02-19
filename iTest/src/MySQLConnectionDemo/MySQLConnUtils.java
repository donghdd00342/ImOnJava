/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLConnectionDemo;

/**
 *
 * @author DongHo
 * @return: Đối tượng "Connection" kết nối với Database.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {

    /**
     * 
     * @return Object Connection
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "java_db";
        String userName = "root";
        String password = "";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    /**
     * 
     * @param hostName
     * @param dbName
     * @param userName
     * @param password
     * @return Object Connection
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Connection getMySQLConnection(String hostName, String dbName,
            String userName, String password) throws SQLException,
            ClassNotFoundException {
        // Khai báo class Driver cho DB MySQL
        // Việc này cần thiết với Java 5
        // Java6 trở lên tự động tìm kiếm Driver thích hợp.
        // Nếu dùng Java > 5, thì ko cần dòng này cũng được.
        // Class.forName("com.mysql.jdbc.Driver");

        // Cấu trúc URL Connection dành cho MySQL
        // Ví dụ: jdbc:mysql://localhost:3306/java_db
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}
