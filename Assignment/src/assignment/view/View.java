/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.view;

import java.util.Scanner;

/**
 *
 * @author DongHo
 */
public class View {

    /**
     * Chương trình hiển thị danh sách menu để người dùng lựa chọn
     * Chỉ hiện menu và không có tương tác khác
     * không có giá trị trả về
     *
     */
    public static void printMenu() {
        System.out.println("------------------------------------------");
        System.out.printf("%s%-5s%-35s%s\n", "|", "", "CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN", "|");
        System.out.println("------------------------------------------");
        System.out.printf("%s%-2s%-38s%s\n", "|", "", "1. Tạo mới sinh viên", "|");
        System.out.printf("%s%-2s%-38s%s\n", "|", "", "2. Tìm và sửa sinh viên theo mã số", "|");
        System.out.printf("%s%-2s%-38s%s\n", "|", "", "3. Tìm và xóa sinh viên theo mã số", "|");
        System.out.printf("%s%-2s%-38s%s\n", "|", "", "4. Tìm thông tin sinh viên theo mã số", "|");
        System.out.printf("%s%-2s%-38s%s\n", "|", "", "5. Hiển thị danh sách sinh viên", "|");
        System.out.printf("%s%-2s%-38s%s\n", "|", "", "6. Thoát chương trình.", "|");
        System.out.println("------------------------------------------");
        System.out.print("- Hãy chọn hành động của bạn (1,2...6): ");
    }

    /**
     * Hàm này hiện ra câu hỏi "Bạn có muốn tiếp tục không? (y/n)" và trả về [(y)? true : false]
     * @return boolean
     */
    public static boolean continueBoolean() {
        String choice = "";
        boolean loop = true;

        while (true) {
            System.out.println("Bạn có muốn tiếp tục không? (y/n): ");
            choice = new Scanner(System.in).nextLine();
            if (!"yYnN".contains(choice)) {
                System.err.println("Vui lòng chỉ nhập 'y' hoặc 'n'");
            } else {
                break;
            }
        }
        
        return "yY".contains(choice);
    }
}
