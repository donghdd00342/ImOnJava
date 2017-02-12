/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQLConnectionDemo;

import java.util.Scanner;

/**
 *
 * @author DongHo
 */
public class MyDemo {
    
    static int choice = 1;

    public static void main(String[] args) {
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

    public static void addStudent() {
        System.out.println("--- 1. addStudent");
        MyDemo.continued();

    }

    public static void editStudent() {
        System.out.println("--- 2. editStudent");
        MyDemo.continued();

    }

    public static void deleteStudent() {
        System.out.println("--- 3. deleteStudent");
        MyDemo.continued();

    }

    public static void searchStudent() {
        System.out.println("--- 4. searchStudent");
        MyDemo.continued();

    }

    public static void listStudent() {
        System.out.println("--- 5. listStudent");
        MyDemo.continued();

    }
    
    public static void continued() {
        System.out.println("--- Chọn [0] để quay về menu, chọn [6] để thoát: ");
        choice = new Scanner(System.in).nextInt();
    }
}
