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
	  
     }
}
