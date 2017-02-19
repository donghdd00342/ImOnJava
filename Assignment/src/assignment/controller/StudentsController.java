/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.controller;

import assignment.untils.Untils;
import assignment.view.View;
import java.util.Scanner;

/**
 * Class này chứa các hàm thực hiện nhiệm vụ trong menu
 * @author DongHo
 */
public class StudentsController {

//    |  1. Tạo mới sinh viên                  |
    /**
     * Hàm này thực hiện nhiệm vụ thêm mới sinh viên vào cơ sở dữ liệu
     * Dữ liệu được nhập vào từ người dùng
     */
    public static void addStudent() {
        String masv;
        String name;
        boolean continueBoolean = true;
        while (continueBoolean) {
            System.out.println("Nhập vào mã số sinh viên: ");
            masv = Untils.getString(3);

            System.out.println("Nhập vào tên sinh viên: ");
            name = Untils.getString(3);

            System.out.println("... chèn dữ liệu vào bảng...");

            continueBoolean = View.continueBoolean();
        }

    }
//    |  2. Tìm và sửa sinh viên theo mã số    |
    /**
     * Hàm này thực hiện nhiệm vụ sửa sinh viên theo mã số
     * Người dùng sẽ nhập vào mã số sinh viên để tìm sửa
     */
    public static void editStudent() {
        String masv;
        System.out.println("Nhập mã số SV muốn sửa: ");
        masv = Untils.getString(3);

        System.out.println("Nhập vào mã số sinh viên: ");
        System.out.println("Nhập vào tên sinh viên: ");

    }
//    |  3. Tìm và xóa sinh viên theo mã số    |
    /**
     * Hàm này thực hiện nhiệm vụ xóa sinh viên theo mã số
     * Người dùng sẽ nhập vào mã số sinh viên để tìm xóa
     */
    public static void deleteStudent() {
        System.out.println("Nhập mã số SV muốn sửa: ");

    }
//    |  4. Tìm thông tin sinh viên theo mã số |
    /**
     * Hàm này thực hiện nhiệm vụ tìm kiếm thông tin sinh viên
     * Người dùng sẽ nhập vào mã số sinh viên muốn tìm
     * Nếu tìm thấy chương trình sẽ in ra thông tin.
     */
    public static void searchStudent() {
        System.out.println("Nhập mã số SV muốn tìm: ");

    }
//    |  5. Hiển thị danh sách sinh viên       |
    /**
     * Hàm này thực hiện nhiệm vụ hiển thị toàn bộ danh sách sinh viên lấy trong CSDL
     */
    public static void listStudent() {

    }

}
