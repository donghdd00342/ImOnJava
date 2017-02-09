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
        String temp;
        
        char choice = 'y';
        while(choice == 'y') {
            System.out.println("Nhap vao: ");
            temp = new Scanner(System.in).nextLine();
            // them vao chuoi
            input = input.concat("-"+temp);
            
            System.out.println("Ban co muon nhap tiep khong (y/n)?");
            choice = new Scanner(System.in).nextLine().toCharArray()[0];
        }
        
        String arr[] = input.split("-");
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + Integer.valueOf(arr[i]).intValue();;
        }
        System.out.println(String.format("Sum = %d", sum));
    }
    
}
