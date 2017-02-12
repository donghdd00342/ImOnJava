/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLConnectionDemo;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DongHo
 */
public class MyDemo {

    static int choice = 1;

    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        while (choice != 6) {
            System.out.println("--------- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN --------");
            System.out.println("1. Thêm mới Sinh Viên");
            System.out.println("2. Sửa Sinh Viên theo Mã Sinh Viên");
            System.out.println("3. Xóa Sinh Viên theo Mã Sinh Viên");
            System.out.println("4. Tìm kiếm Sinh Viên");
            System.out.println("5. Danh sách toàn bộ Sinh Viên");
            System.out.println("6. Thoát chương trình");
            System.out.println("--- Vui lòng chọn: ");
            choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- 1. Thêm mới Sinh Viên:");
                    MyDemo.addStudent();
                    break;
                case 2:
                    System.out.println("--- 2. Sửa Sinh Viên theo Mã Sinh Viên");
                    MyDemo.editStudent();
                    break;
                case 3:
                    System.out.println("--- 3. Xóa Sinh Viên theo Mã Sinh Viên");
                    MyDemo.deleteStudent();
                    break;
                case 4:
                    System.out.println("--- 4. Tìm kiếm Sinh Viên");
                    MyDemo.searchStudent();
                    break;
                case 5:
                    System.out.println("--- 5. Danh sách toàn bộ Sinh Viên");
                    MyDemo.listStudent();
                    break;
                case 6:
                    System.out.println("--------- KẾT THÚC --------");
                    break;
            }
        }
        System.out.println("--------- Xin chào tạm biệt --------");
    }

    public static void addStudent() throws ClassNotFoundException,
            SQLException {
        System.out.println("--- 1. addStudent");
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        String sql;
        char tt = 'y';

        while (tt == 'y') {
            System.out.print("- Nhập MÃ SINH VIÊN: ");
            String rollNo = new Scanner(System.in).nextLine();
            System.out.print("- Nhập HỌ TÊN: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("- Nhập SỐ ĐIỆN THOẠI: ");
            String phonenumber = new Scanner(System.in).nextLine();
            sql = "INSERT INTO students (rollno,name,phonenumber)"
                    + "VALUES ('" + rollNo + "', '" + name + "', '" + phonenumber + "');";
            // Thực thi câu lệnh.        
            statement.executeUpdate(sql);
            System.out.println("***** Thêm dữ liệu thành công *****");

            System.out.println("--- Bạn có muốn thêm tiếp không? y/n: ");
            tt = new Scanner(System.in).nextLine().toCharArray()[0];
        }

        MyDemo.continued();
    }

    public static void editStudent() throws ClassNotFoundException,
            SQLException {
        System.out.println("--- 2. editStudent");

        MyDemo.continued();
    }

    public static void deleteStudent() throws ClassNotFoundException,
            SQLException {
        System.out.println("--- 3. deleteStudent");

        MyDemo.continued();
    }

    public static void searchStudent() throws ClassNotFoundException,
            SQLException {
        System.out.println("--- 4. searchStudent");

        MyDemo.continued();
    }

    public static void listStudent() throws ClassNotFoundException,
            SQLException {
        System.out.println("--- 5. listStudent");
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        String sql;

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

        MyDemo.continued();
    }

    public static void continued() {
        System.out.println("--- Chọn [0] để quay về menu, chọn [6] để thoát: ");
        choice = new Scanner(System.in).nextInt();
    }
}
