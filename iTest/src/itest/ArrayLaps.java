/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itest;

/**
 *
 * @author DongHo
 */
import java.util.Arrays;
import java.util.Scanner;

class main {

    // tìm min, max của mảng
    // min
    private static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // max
    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // in mảng với message
    private static void printArr(String message, int[] arr) {
        System.out.println("----------- " + message + " -----------");
        System.out.print("[length = " + arr.length + "]: ");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);

        }
        System.out.println();

    }

    // chèn một phần tử vào mảng
    private static int[] insertElement(int[] arr, int element, int index) {
        int leng = arr.length;
        // tạo mảng mới
        int[] newArray = new int[leng + 1];
        // coppy phần trước
        System.arraycopy(arr, 0, newArray, 0, index);
        // gán tại index
        newArray[index] = element;
        // coppy phần còn lại
        System.arraycopy(arr, index, newArray, index + 1, leng - index);

        return newArray;
    }

    // đảo mảng
    private static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            newArray[j] = arr[i];
        }
        return newArray;
    }

    ////////////////////////////////////////////// Hàm chạy test
    public static void main(String[] args) {
        int[] arrInt = {1, 15, 12, 36, 32, 21, 12, 4, 57, 5, 6, 2, 8, 5, 8};
        // in trước khi xếp
        printArr("Trước khi sắp xếp", arrInt);

        // sắp xếp
        Arrays.sort(arrInt);
        // in ra sau khi sắp xếp
        printArr("Sau khi sắp xếp", arrInt);
        // min
        System.out.println("Số nhỏ nhất trong mảng = " + min(arrInt));
        System.out.println("Số lớn nhất trong mảng = " + max(arrInt));
        System.out.print("... nhấn một phím bất kỳ để tiếp tục");
        new Scanner(System.in).nextLine();
        // đảo mảng
        printArr("Đảo mảng sau khi sắp xếp", reverseArray(arrInt));

        String ch;
        int num;
        int index;

        // tìm kiếm
        while (true) {
            System.out.print("Nhập vào số muốn tìm kiếm: ");
            num = new Scanner(System.in).nextInt();
            // tìm
            index = Arrays.binarySearch(arrInt, num);
            if (index >= 0) {
                System.out.printf("Tìm thấy (%d) tại vị trí [%d]\n", num, index);
            } else {
                System.out.printf("Không tìm thấy (%d)\n", num);
            }
            // tìm tiếp?
            System.out.println("Bạn muốn tìm tiếp? ");
            ch = new Scanner(System.in).nextLine();
            if ("nN".contains(ch)) {
                break;
            }
        }
        // chèn
        while (true) {
            System.out.print("Nhập vào số muốn chèn: ");
            num = new Scanner(System.in).nextInt();
            System.out.print("Bạn muốn chèn vào vị trí nào? (bắt đầu từ 0) ");
            index = new Scanner(System.in).nextInt();
            printArr("Sau khi chèn (" + num + ") vào vị trí (" + index + ")", insertElement(arrInt, num, index));
            // Chèn tiếp?
            System.out.println("Bạn muốn chèn tiếp? ");
            ch = new Scanner(System.in).nextLine();
            if ("nN".contains(ch)) {
                break;
            }
        }

    }
}
