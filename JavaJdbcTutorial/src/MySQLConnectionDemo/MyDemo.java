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
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        String sql;
        int found = 0;

        // Nhập mã sinh viên để tìm sửa
        System.out.print("- Nhập MÃ SINH VIÊN để tìm sửa: ");
        String rollNo = new Scanner(System.in).nextLine();

        // III.3 Xem kết quả trả về (dữ liệu) với đối tượng ResultSet.
        sql = "SELECT * FROM students";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
        ResultSet rs = statement.executeQuery(sql);
        // Duyệt trên kết quả trả về.
        // Tìm trong cơ sở dữ liệu nếu tìm thấy thì dưng while
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
            String rollNoWhile = rs.getString("rollno");
            if (rollNo.equals(rollNoWhile)) {
                found = 1;
                break;
            }
        }
        // nếu tìm thấy thì hỏi nhập thông tin mới và xử lý
        if (found == 1) {
            // Nhập thông tin mới
            System.out.print("- Nhập MÃ SINH VIÊN mới: ");
            String newRollNo = new Scanner(System.in).nextLine();
            if (!"".equals(newRollNo)) {
                // Thực thi câu lệnh.        
                statement.executeUpdate("UPDATE students SET rollno='" + newRollNo + "' WHERE rollno='" + rollNo + "';");
                System.out.println("- Đã thay MÃ SINH VIÊN mới: " + newRollNo);
            }
            System.out.print("- Nhập HỌ TÊN MỚI mới: ");
            String newName = new Scanner(System.in).nextLine();
            if (!"".equals(newName)) {
                // Thực thi câu lệnh.        
                statement.executeUpdate("UPDATE students SET name='" + newName + "' WHERE rollno='" + rollNo + "';");
                System.out.println("- Đã thay HỌ TÊN mới: " + newName);
            }
            System.out.print("- Nhập SỐ ĐIỆN THOẠI mới: ");
            String newPhoneNumber = new Scanner(System.in).nextLine();
            if (!"".equals(newPhoneNumber)) {
                // Thực thi câu lệnh.        
                statement.executeUpdate("UPDATE students SET phonenumber='" + newPhoneNumber + "' WHERE rollno='" + rollNo + "';");
                System.out.println("- Đã thay SỐ ĐIỆN THOẠI mới: " + newPhoneNumber);
            }
        } else {
            // không tìm thấy thì thông báo cho người dùng biết
            System.out.println("Không tìm thấy sinh viên có mã số vừa nhập!");
        }

        // Đóng kết nối
        connection.close();

        MyDemo.continued();
    }

    public static void deleteStudent() throws ClassNotFoundException,
            SQLException {
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        String sql;
        int found = 0;
        String name = "";
        String phoneNumber = "";

        // Nhập mã sinh viên để tìm sửa
        System.out.print("- Nhập MÃ SINH VIÊN cần xóa: ");
        String rollNo = new Scanner(System.in).nextLine();
        System.out.print("");

        // III.3 Xem kết quả trả về (dữ liệu) với đối tượng ResultSet.
        sql = "SELECT * FROM students";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
        ResultSet rs = statement.executeQuery(sql);
        // Duyệt trên kết quả trả về.
        // Tìm trong cơ sở dữ liệu nếu tìm thấy thì dưng while
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
            String rollNoWhile = rs.getString("rollno");
            if (rollNo.equals(rollNoWhile)) {
                found = 1;
                name = rs.getString("name");
                phoneNumber = rs.getString("phonenumber");
                break;
            }
        }
        // nếu tìm thấy hiển thị và hỏi xóa
        if (found == 1) {
            // Xác nhận xóa
            System.out.println("----- ĐÃ TÌM THẤY SINH VIÊN ----- ");
            System.out.println("- Mã SV: " + rollNo);
            System.out.println("- Họ Tên SV: " + name);
            System.out.println("- Số ĐT SV: " + phoneNumber);
            System.out.println("----- Bạn có chắc là muốn xóa? y/n ");
            char del = new Scanner(System.in).nextLine().toCharArray()[0];
            if (del == 'y') {
                // Thực thi câu lệnh.
                statement.executeUpdate("DELETE FROM students WHERE rollno=" + rollNo + ";");
                System.out.println("- Đã xóa SINH VIÊN! " + rollNo);
            }
        } else {
            // không tìm thấy thì thông báo cho người dùng biết
            System.out.println("Không tìm thấy sinh viên có mã số vừa nhập!");
        }

        // Đóng kết nối
        connection.close();

        MyDemo.continued();
    }

    public static void searchStudent() throws ClassNotFoundException,
            SQLException {
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        String sql;
        int found = 0;
        String name = "";
        String phoneNumber = "";

        // Nhập mã sinh viên để tìm
        System.out.print("- Nhập MÃ SINH VIÊN cần tìm: ");
        String rollNo = new Scanner(System.in).nextLine();
        System.out.print("");

        // III.3 Xem kết quả trả về (dữ liệu) với đối tượng ResultSet.
        sql = "SELECT * FROM students";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
        ResultSet rs = statement.executeQuery(sql);
        // Duyệt trên kết quả trả về.
        // Tìm trong cơ sở dữ liệu nếu tìm thấy thì dưng while
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
            String rollNoWhile = rs.getString("rollno");
            if (rollNo.equals(rollNoWhile)) {
                found = 1;
                name = rs.getString("name");
                phoneNumber = rs.getString("phonenumber");
                System.out.println("----- ĐÃ TÌM THẤY SINH VIÊN ----- ");
                System.out.println("- Mã SV: " + rollNo);
                System.out.println("- Họ Tên SV: " + name);
                System.out.println("- Số ĐT SV: " + phoneNumber);
                System.out.println("----- Bạn có muốn tìm tiếp không? y/n ");
                char search = new Scanner(System.in).nextLine().toCharArray()[0];
                if (search == 'y') {
                    // reset found
                    found = 0;
                    // Nhập Mã SV khác để tìm
                    System.out.println("- Nhập MÃ SINH VIÊN khác cần tìm: ");
                    rollNo = new Scanner(System.in).nextLine();
                    // Nhảy về đâu
                    rs.first();
                } else {
                    break;
                }
            }
        }
        // nếu tìm thấy hiển thị và hỏi xóa
        if (found == 0) {
            // không tìm thấy thì thông báo cho người dùng biết
            System.out.println("Không tìm thấy sinh viên có mã số vừa nhập!");
        }

        // Đóng kết nối
        connection.close();

        MyDemo.continued();
    }

    public static void listStudent() throws ClassNotFoundException,
            SQLException {
        // I. Lấy ra đối tượng Connection kết nối vào DB.
        Connection connection = MySQLConnUtils.getMySQLConnection();

        // II. Tạo đối tượng Statement.
        Statement statement = connection.createStatement();

        // III. Khởi tạo một string để query
        String sql;
        int index = 0;

        // III.3 Xem kết quả trả về (dữ liệu) với đối tượng ResultSet.
        sql = "SELECT * FROM students";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
        ResultSet rs = statement.executeQuery(sql);
        // Duyệt trên kết quả trả về.
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
            String rollNo = rs.getString("rollno");
            String name = rs.getString("name");
            String phoneNumber = rs.getString("phonenumber");
            ++index;
            System.out.println("---------- STT: " + index + " ----------");
            System.out.println("Số hiệu:" + rollNo);
            System.out.println("Họ Tên:" + name);
            System.out.println("Số điện thoại:" + phoneNumber);
        }
        if (index == 0) {
            System.out.println("KHÔNG CÓ DỮ LIỆU...");
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
