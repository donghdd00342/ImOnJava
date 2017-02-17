/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author DongHo
 */
public class Algorithms {

    //////////////////////// kiểm tra một chuỗi Palindrome bằng Java (đảo ngược chuỗi không thay đổi)
//    public static void main(String[] args) {
//        String str;
//        System.out.println("Mời bạn nhập vào một chuỗi để kiểm tra: ");
//        str = new Scanner(System.in).nextLine();
//
//        int a = str.length() - 1;
//        int b = str.length() / 2;
//        boolean right = true;
//        for (int i = 0; i < b; i++) {
//            if (str.charAt(i) != str.charAt(a - i)) {
//                right = false;
//            }
//        }
//        if (right) {
//            System.out.println("Chuỗi CHÍNH LÀ là Palindrome!");
//        } else {
//            System.out.println("Chuỗi KHÔNG PHẢI là Palindrome!");
//        }
//    }
    ///////////////// kiểm tra 2 chuỗi nhập vào có phải là Anagrams của nhau không (cùng số lượng nhưng đảo vị trí các ký tự)
//    public static void main(String[] args) {
//        String input1, input2;
//        char[] arr1, arr2;
//
//        System.out.println("Nhập vào chuỗi thứ nhất: ");
//        input1 = new Scanner(System.in).nextLine();
//
//        System.out.println("Nhập vào chuỗi thứ hai: ");
//        input2 = new Scanner(System.in).nextLine();
//
//        boolean right = true;
//
//        // nếu độ dài khác nhau thì dừng luôn
//        int leng1 = input1.length();
//        int leng2 = input2.length();
//        if (leng1 != leng2) {
//            System.out.println("Không phải Anagrams!");
//            return;
//        }
//        // tạo 2 mảng
//        arr1 = new char[leng1];
//        arr2 = new char[leng2];
//
//        // gán giá trị cho 2 mảng
//        // arr1
//        for (int i = 0; i < leng1; i++) {
//            arr1[i] = input1.charAt(i);
//        }
//        // arr2
//        for (int i = 0; i < leng2; i++) {
//            arr2[i] = input2.charAt(i);
//        }
//
//        // Sắp 2 xếp mảng
//        char temp;
//        // arr1
//        for (int i = 0; i < leng1 - 1; i++) {
//            for (int j = i + 1; j < leng1; j++) {
//                if (arr1[i] > arr1[j]) {
//                    temp = arr1[i];
//                    arr1[i] = arr1[j];
//                    arr1[j] = temp;
//                }
//            }
//        }
//        // arr2
//        for (int i = 0; i < leng2 - 1; i++) {
//            for (int j = i + 1; j < leng2; j++) {
//                if (arr2[i] > arr2[j]) {
//                    temp = arr2[i];
//                    arr2[i] = arr2[j];
//                    arr2[j] = temp;
//                }
//            }
//        }
//        // so sánh xem có ký tự nào khác nhau giữa 2 mảng ko
//        for (int i = 0; i < leng1; i++) {
//            if (arr1[i] != arr2[i]) {
//                System.out.println("Không phải Anagrams!");
//                return;
//            }
//        }
//        // 
//        System.out.println("Hai chuỗi nhập vào là Anagrams!");
//    }
///////////////// đảo 2 số cho nhau
    static int a;
    static int b;

    public static void main(String[] args) {

        // Nhập vào từ người dùng
        while (true) {
            try {
                System.out.println("Nhập vào số a = ");
                a = new Scanner(System.in).nextInt();
                System.out.println("Nhập vào số b = ");
                b = new Scanner(System.in).nextInt();
                break;

            } catch (Exception e) {
                System.err.println("Vui lòng chỉ nhập số!");
                System.out.println("Nhập lại từ đầu....");
            }
        }
        System.out.printf("Trước khi đổi: a = %d, b = %d", a, b);
        System.out.println("");
        Algorithms ob = new Algorithms();
        Algorithms.swap(ob);
        System.out.printf("Sau khi đổi: a = %d, b = %d", a, b);
        System.out.println("");
        System.out.println("Kết thúc chương trình...");
    }

    public static void swap(Algorithms ob) {
        int temp;
        temp = ob.a;
        ob.a = ob.b;
        ob.b = temp;

    }

} // END - class Algorithms
