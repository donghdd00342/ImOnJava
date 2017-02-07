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
        /*/ BEGIN - Tự động ép kiểu
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
        // END - Tự động ép kiểu */
        // ??? for (int i = 1,  j = 100;  i <= 100, j > 0;  i = i+1, j = j-1) {System.out.println(i + j);}
        /* int total = 0;
        for (int square=1, grains = 1; square <= 64; square++) {
          grains *= 2;
          if (grains <= 0) {
            System.out.println("Error: Overflow");
            break;
          }
          total += grains;
          System.out.print(total + "\t  ");
          if (square % 4 == 0) System.out.println();
        } 
        System.out.println("All done!"); */
        
        // khởi tạo > kiểm tra điều kiện > thực thi > tăng biến đếm > kiểm tra điều kiện > thực thi...
        /* iloop: for (int i=1; i < 3; i++) {
            for (int j=1; j < 4; j++) {
              if (j == 2) break iloop;
              System.out.println(i + ", " + j);
            }
        }*/
        /*
        int[] arrInt = new int[6];
        
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;
        arrInt[4] = 5;
        arrInt[5] = 6;
        
        for (int i = 0; i < arrInt.length; i++) {
            int j = arrInt[i];
            System.out.println("arrInt["+i+"]"+" = "+arrInt[i]);
        }        
        /////////////////////////////////
        
        float[] squares;
        squares = new float[101];

        for (int i=0; i <= 100; i++) {
           squares[i] = i*i;
        }
        for (int i = 0; i < squares.length; i++) {
            float square = squares[i];
            System.out.println("squares["+i+"] = "+squares[i]);            
        }
        ///////////////////////////////////*/
        int arr1[] = { 0, 1, 2, 3, 4, 5 };
        int arr2[] = { 5, 10, 20, 30, 40, 50 };
        // copy 2 số từ mảng 1 bắt đầu từ vị trí 0 vào mảng 2
        System.arraycopy(arr1, 0, arr2, 3, 2);
        System.out.print("array2 = "); // In không xuống dòng
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");
        System.out.print(arr2[5] + " ");
        ///////////////////////////////////////
        
        // Ma trận với đường chéo = 1.0        
        double[][] id = new double[4][4];        
        System.out.println();
        for (int row=0; row < 4; row++) {
          for (int col=0; col < 4; col++) {
            if (row != col) {
              id[row][col]=0.0;
            }
            else {
              id[row][col] = 1.0;
            }
            System.out.print(id[row][col] + " ");
          }
            System.out.println();
        }
        
    } // END - main
    
} // END - class
