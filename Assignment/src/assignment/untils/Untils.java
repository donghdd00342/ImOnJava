/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates.
 * and open the template in the editor.
 */
package assignment.untils;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Class này chứa các tiện ích nhập số, ký tự, chuỗi... từ người dùng
 *
 * @author DongHo
 */
public class Untils {

    // Scanner scanInput = new Scanner(System.in); // warning!!!...
    /**
     * Hàm này trả về một số mà người dùng nhập từ bàn phím
     *
     * @return int
     */
    public static int getInt() {
        int inputInt = 0;
        // Scanner scanInput = new Scanner(System.in); // warning!!!...
        while (true) {
            try {
                inputInt = new Scanner(System.in).nextInt();
                break;

            } catch (Exception e) {
                System.err.print("Vui lòng chỉ nhập số! ");

            }
        }

        return inputInt;
    }

    /**
     * Hàm này trả về một chuỗi mà người dùng nhập vào từ bàn phím
     *
     * @return String
     */
    public static String getString() {
        return new Scanner(System.in).nextLine();
    }
    /**
     * Hàm này trả về một chuỗi có độ dài tối thiểu @param ký tự
     * @param leng
     * @return String
     */
    public static String getString(int leng) {
        String inputString;
        while (true) {
            inputString = new Scanner(System.in).nextLine();
            if (inputString.length() < leng) {
                System.err.printf("Vui lòng nhập lại tối thiểu %d ký tự! ", leng);
            } else {
                break;
            }
        }
        return inputString;
    }

    /**
     * Hàm này trả về một ký tự mà người dùng nhập từ bàn phím
     *
     * @return char
     */
    public static char getChar() {
        String input;
        while (true) {
            input = new Scanner(System.in).nextLine();
            if (input.length() != 1) {
                System.err.print("Vui lòng nhập định dạng chỉ một ký tự! ");
            } else {
                break;
            }
        }
        return input.charAt(0);
    }

}
