/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.util.Scanner;

/**
 *
 * @author DongHo
 */
public class Lap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // BEGIN - Tự động ép kiểu
        int i = 10;
        double x = 3.6;
        double k;
        
        System.out.println("i = " + i);
        System.out.println("x = " + x);
        
        System.out.println("(float)i = " + (float)i);
        System.out.println("(int)x = " + (int)x);

        // Không ép được khác loại. VD: String <> int

        k = i + x;
        System.out.println("i + x = " + k);
        System.out.println("(int)(i + x) = " + (int)k);
        
        k = i * x;
        System.out.println("i * x = " + k);
        
        k = i - x;
        System.out.println("i - x = " + k);
        
        k = x - i;
        System.out.println("x - i = " + k);
        
        k = i / x;
        System.out.println("i / x = " + k);
        System.out.println("i / (int)x = " + (i/(int)x));
        
        k = x / i;
        System.out.println("x / i = " + k);
        // END - Tự động ép kiểu
    }
    
}
