/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.model;

import assignment.view.View;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DongHo
 */
public class StudentModel {

    /**
     * Hàm này hiển thị toàn bộ sinh viên trong cơ sở dữ liệu
     *
     * @param num
     * @return
     */
    public static int all(int num) {
        ResultSet rs;
        int count = 0;
        String string;
        Student student = new Student();
        if (num < 0) {
            string = "SELECT * FROM students";

        } else {
            string = "SELECT * FROM students LIMIT " + num;
        }

        try {
            rs = DAO.getConnection().createStatement().executeQuery(string);
            while (rs.next()) {
                System.out.println("------------------------------------------");
                student.setMasv(rs.getString("masv"));
                student.setName(rs.getString("name"));
                View.printStudent(student);
                ++count;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi: " + ex);
            return 0;
        }

        return count;
    }

    /**
     * Hàm này thêm một đối tượng Student vào bảng students
     *
     * @param student
     * @return boolean
     */
    public static boolean save(Student student) {
        String string = "INSERT INTO students (masv, name)"
                + "VALUES ('" + student.getMasv() + "', '" + student.getName() + "');";
        try {
            DAO.getConnection().createStatement().execute(string);
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return false;
        }
    }

    /**
     * Hàm này lưu sinh viên (sửa sinh viên) có id = @id lưu thành công thì trả
     * về true, còn không thì false
     *
     * @param student
     * @param id
     * @return boolean
     */
    public static boolean save(Student student, int id) {
        String string = "UPDATE students "
                + "SET masv = '" + student.getMasv() + "', name = '" + student.getName() + "'"
                + "WHERE id ='" + id + "';";
        try {
            DAO.getConnection().createStatement().execute(string);
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return false;
        }
    }

    /**
     * Hàm này tìm và trả về id của sinh viên có mã số @masv truyền vào Nếu tìm
     * thấy thì trả về id, không tìm thấy thì trả về 0 null
     *
     * @param masv
     * @return int
     */
    public static int find(String masv) {
        ResultSet rs;
        int id = 0;
        String string = "SELECT * FROM students WHERE masv = '" + masv + "';";
        try {
            rs = DAO.getConnection().createStatement().executeQuery(string);
            if (rs.next()) {
                id = rs.getInt("id");
            } else {
                System.err.println("Không tìm thấy sinh viên có mã số " + masv);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return 0;
        }
        return id;
    }

    /**
     * Hàm này trả về đối tượng sinh viên tương ứng với @masv truyền vào
     *
     * @param masv
     * @return Student
     */
    public static Student get(String masv) {
        Student student = new Student();

        ResultSet rs;
        String string = "SELECT * FROM students WHERE masv = '" + masv + "';";
        try {
            rs = DAO.getConnection().createStatement().executeQuery(string);
            if (rs.next()) {
                student.setMasv(rs.getString("masv"));
                student.setName(rs.getString("name"));
            } else {
                System.err.println("Không tìm thấy sinh viên có mã số: " + masv);
                return null;
            }

        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return null;
        }

        return student;
    }

    /**
     * Hàm này xóa sinh viên có @id được truyền vào
     *
     * @param id
     * @return Student
     */
    public static Student destroy(int id) {
        Student student = new Student();

        ResultSet rs;
        String string = "SELECT * FROM students WHERE id = '" + id + "';";
        try {
            rs = DAO.getConnection().createStatement().executeQuery(string);
            if (rs.next()) {
                student.setMasv(rs.getString("masv"));
                student.setName(rs.getString("name"));
            } else {
                System.err.println("Không tìm thấy sinh viên có ID = " + id);
                return null;
            }

            DAO.getConnection().createStatement().execute("DELETE FROM students WHERE id='" + id + "';");

        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return null;
        }

        return student;
    }

}
