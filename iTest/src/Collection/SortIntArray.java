/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DongHo
 */
public class SortIntArray {

     public static void main(String[] args) {
	  // cho một mảng int
	  int[] arr = {9, 68, 14, 6, 5, 3, 2, 68, 36, 14, 1};
	  // yếu cầu sắp xếp mảng theo thứ tự tăng dần và loại bỏ phần tử trùng lặp (tạo thêm 2 mảng)
	  // 1. cách 1 dùng List
	  // sắp xếp
	  List<Integer> li = new ArrayList<>();
	  for (int i = 0; i < arr.length; i++) {
	       li.add(arr[i]);
	  }
	  // in
	  System.out.println("Trước khi sắp xếp -------------");
	  System.out.println(li);
	  System.out.println("Sau khi sắp xếp -------------");
	  Collections.sort(li);
	  System.out.println(li);
	  // loại bỏ trùng lặp
	  Set<Integer> li2 = new LinkedHashSet<Integer>(li);
	  System.out.println(li2);
	  // 2. cách 2 trâu bò
	  System.out.println("Cách 2: -------------- trâu bò");
	  // sắp xếp
	  int temp;
	  for (int i = 0; i < arr.length; i++) {
	       for (int j = i + 1; j < arr.length; j++) {
		    if (arr[i] > arr[j]) {
			      temp = arr[i];
			      arr[i] = arr[j];
			      arr[j] = temp;
		    }
	       }
	  }
	  System.out.println("In ra sau khi sắp xếp -----------");
	  System.out.print("[");
	  for (int i = 0; i < arr.length; i++) {
	       if (i != 0) {
		    System.out.print(", ");
	       }
	       System.out.print(arr[i]);
	  }
	  System.out.print("]");
	  // loại bỏ trùng lặp
	  // duyệt từng phần tử mảng để tìm trùng lặp
	  int loop = 0;
	  int before = arr[0];
	  // tìm lặp
	  for (int i = 0; i < arr.length; i++) {
	       if (arr[i] == before) {
		    loop++;
	       }else{
		    before = arr[i];
	       }
	  }
	  // khởi tạo một mảng mới
	  loop--; //phải trừ đi 1 vì điều kiện ban đầu khởi tạo before
	  int[] c = new int[arr.length - loop]; // tạo một mảng mới (kết quả)
	  c[0] = arr[0];
	  before = arr[0]; // đặt lại giá trị của before
	  int j = 0; // index của c
	  for (int i = 0; i < arr.length; i++) {
	       // kiểm tra nếu phần tử hiện tại ko trùng với phần tử phía trước nó thì gán vào một mảng khác
	       if (arr[i] != before) {
		    c[j] = arr[i];
		    before = arr[i];
		    j++; // gán xong phải tăng biến index của c
	       }
	  }
	  // in ra sau mảng mới
	  System.out.println("");
	  System.out.print("[");
	  for (int i = 0; i < c.length; i++) {
	       if (i != 0) {
		    System.out.print(", ");
	       }
	       System.out.print(c[i]);
	  }
	  System.out.println("]");
     }
}

//compile-single:
//run-single:
//Trước khi sắp xếp -------------
//[9, 68, 14, 6, 5, 3, 2, 68, 36, 14, 1]
//Sau khi sắp xếp -------------
//[1, 2, 3, 5, 6, 9, 14, 14, 36, 68, 68]
//[1, 2, 3, 5, 6, 9, 14, 36, 68]
//Cách 2: -------------- trâu bò
//In ra sau khi sắp xếp -----------
//[1, 2, 3, 5, 6, 9, 14, 14, 36, 68, 68]
//[2, 3, 5, 6, 9, 14, 36, 68, 0]
//BUILD SUCCESSFUL (total time: 0 seconds)