/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilap;

import java.util.Scanner;

/**
 *
 * @author DongHo
 */
public class Calculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "";
        String add = ""; // loại thừa ký tự đầu
        String temp;

        char choice = 'y';
        while (choice == 'y') {
            System.out.println("Nhap vao: ");
            temp = new Scanner(System.in).nextLine();
            // them vao chuoi
            input = input.concat(add + temp);
            add = "_"; // loại thừa ký tự đầu & không * cho Reg

            System.out.println("Ban co muon nhap tiep khong (y/n)?");
            choice = new Scanner(System.in).nextLine().toCharArray()[0];
        }

        String arr[] = input.split("_"); // không chấp nhận * cho Reg

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            try {
                sum = sum + Integer.valueOf(arr[i]).intValue();
            } catch (Exception e) {
                System.err.println("Một trong các số vừa nhập không phải dạng số (có ký tự)...");
                System.err.println("Kết thúc chương trình...");
                return;
            }
        }
        System.out.println("Kết quả tổng các số vửa nhập là: " + sum);
    }

}
