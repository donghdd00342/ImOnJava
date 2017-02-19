/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DongHo
 */
public class StudentModel {

    public static boolean save(Student student) {
        Statement statement;
        try {
            statement = DAO.getConnection().createStatement();
        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return false;
        }
        String string = "INSERT INTO students (masv, name)"
                + "VALUES ('" + student.getMasv() + "', '" + student.getName() + "');";
        try {
            statement.execute(string);
        } catch (SQLException ex) {
            //Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Có lỗi xảy ra: " + ex);
            return false;
        }

        return true;
    }

}
