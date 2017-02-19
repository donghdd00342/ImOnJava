/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import assignment.controller.StudentsController;
import assignment.untils.Untils;
import assignment.view.View;

/**
 * This is my first OOP Project
 * @author DongHo
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        while (true) {
            // hiển thị menu
            View.printMenu();
            // lấy lựa chọn của người dùng
            choice = Untils.getInt();
            switch (choice) {
                case 1:
                    System.out.println("|  1. Tạo mới sinh viên");
                    StudentsController.addStudent();
                    break;
                case 2:
                    System.out.println("|  2. Tìm và sửa sinh viên theo mã số");
                    StudentsController.editStudent();
                    break;
                case 3:
                    System.out.println("|  3. Tìm và xóa sinh viên theo mã số");
                    StudentsController.deleteStudent();
                    break;
                case 4:
                    System.out.println("|  4. Tìm thông tin sinh viên theo mã số");
                    StudentsController.searchStudent();
                    break;
                case 5:
                    System.out.println("|  5. Hiển thị danh sách sinh viên");
                    StudentsController.listStudent();
                    break;
                case 6:
                    System.out.println("|  6. Thoát chương trình.");
                    System.out.println("..........Tạm biệt..........");
                    break;
                default:
                    System.err.println("Vui lòng chỉ chọn từ 1 đến 6");
                    break;
            }
            if (choice == 6) {
                break;
            }

        }
    }

}
